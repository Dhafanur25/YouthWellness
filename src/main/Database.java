package main;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Database implements BD{
    private static final String pEmail = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/konseling_online";
    private static final Pattern pattern = Pattern.compile(pEmail);
    private static final String defaults = "C:/Users/dhafa/Downloads/Java Codes/YouthWellness/src/Background/img/imgEmpty.jpg";
    private static final String defExp = "-                                                                                            ";
    private static final String def = "-                                                       ";
    private static Database instance;
    private int IDAccUser;
    private int IDAccKon;

    public static String getDefaults() {
        return defaults;
    }

    public static String getDef() {
        return def;
    }

    public static String getDefExp() {
        return defExp;
    }
    
    public int getIDAccKon() {
        return IDAccKon;
    }

    public int getIDAccUser() {
        return IDAccUser;
    }
    
    public void setIDAccKon(int IDAccKon) {
        this.IDAccKon = IDAccKon;
    }

    public void setIDAccUser(int IDAccUser) {
        this.IDAccUser = IDAccUser;
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
    
    public static boolean validateEmail(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    public int loginDB(String EU, String pass){
        int cek = -1; //Jika Username atau Email salah
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");
            //Cek untuk akun konselor dulu
            String sql = "SELECT ID, Email, Password FROM konseling_online.konselor"
                    + " WHERE Email=?;";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, EU);
            ResultSet resultSet = st.executeQuery();
            
            if (resultSet.next()) {
                if (resultSet.getString("Password").equals(pass)){
                    cek = 1; //Jika Username/Email dan password benar dan masuknya akun konselor
                    setIDAccKon(resultSet.getInt("ID"));
                }else{
                    cek = 0; //Jika password salah
                }
            }else{
                sql = "SELECT ID, Email, Username, Password FROM konseling_online.user"
                    + " WHERE Email=? OR Username=?;";
                st = con.prepareStatement(sql);
                st.setString(1, EU);
                st.setString(2, EU);
                resultSet = st.executeQuery();
                if (resultSet.next()) {
                    if (resultSet.getString("Password").equals(pass)){
                        cek = 2; //Jika Username/Email dan password benar dan masuknya akun user
                        setIDAccUser(resultSet.getInt("ID"));
                    }else{
                        cek = 0; //Jika password salah
                    }
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cek;
    }
    
    public boolean cekDB(String table, String column,String x){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");
  
            String sql = "SELECT " + column + " FROM konseling_online."+ table
                    + " WHERE " + column +"=?;";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, x);
            ResultSet resultSet = st.executeQuery();
            
            // Check if the result set has any rows
            if (resultSet.next()) {
                return true;
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean DeleteScheduleDB(int ID_JKon){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");
  
            String sql = "DELETE FROM konseling_online.jadwal_konseling WHERE id_jadwal_konseling=?;";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, ID_JKon);
            st.executeUpdate(); 
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean updateDB(String nama, String email, String uName, 
                   String pass, String phone, String address, String bio, String pp){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");
 
            String sql = "UPDATE konseling_online.user "
                    + "SET Nama_Lengkap=?, Email=?, "
                    + "Username=?, Password=?, "
                    + "No_Telp=?, Alamat=?, "
                    + "Bio=?, Profile_Pic_Path=? "
                    + "WHERE ID=?;";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, nama);
            st.setString(2, email);
            st.setString(3, uName);
            st.setString(4, pass);
            st.setString(5, phone);
            st.setString(6, address);
            st.setString(7, bio);
            st.setString(8, pp);
            st.setInt(9, IDAccUser);
            st.executeUpdate(); 
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }  
        return false;
    }
    public boolean updatePassDB(int ID, String pass){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");
 
            String sql = "UPDATE konseling_online.user "
                    + "SET Password=? "
                    + "WHERE ID=?;";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, pass);
            st.setInt(2, ID);
            st.executeUpdate(); 
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }  
        return false;
    }
    public boolean insertRegDB(String nama, String email, 
        String uName, String pass){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");

            if (!cekDB("user", "Email", email) && 
                !cekDB("user", "Username", uName)){
                String sql = "INSERT INTO konseling_online.user"
                        + " (Nama_Lengkap, Email, Username, Password) "
                        + "VALUES (?, ?, ?, ?);";
                PreparedStatement st = con.prepareStatement(sql);
                st.setString(1, nama);
                st.setString(2, email);
                st.setString(3, uName);
                st.setString(4, pass);
                st.executeUpdate();     
                return true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean insertJadDB(int idk, int idh, int idw){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");

            int id_jk = 0;
            String sql = "SELECT id_jadwal_konselor FROM konseling_online.jadwal_konselor WHERE "
                    + "id_konselor=? AND "
                    + "id_hari=? AND "
                    + "id_waktu=?;";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, idk);
            st.setInt(2, idh);
            st.setInt(3, idw);
            ResultSet resultSet = st.executeQuery();
            
            if(resultSet.next()){
                id_jk = resultSet.getInt("id_jadwal_konselor");
                if (!cekDB("jadwal_konseling", "id_jadwal_konseling", Integer.toString(id_jk))){
                    sql = "INSERT INTO konseling_online.jadwal_konseling "
                        + "(id_jadwal_konselor, id_user) "
                        + "VALUES (?, ?);";
                    st = con.prepareStatement(sql);
                    st.setInt(1, id_jk);
                    st.setInt(2, IDAccUser);
                    st.executeUpdate(); 
                    return true;
                }
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public boolean insertFBDB(String isi){ 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");
            
            String sql = "INSERT INTO konseling_online.feedback"
                    + " (id_user, isi_feedback) "
                    + "VALUES (?, ?);";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, IDAccUser);
            st.setString(2, isi);
            st.executeUpdate();     
            return true;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    public ResultSet getDB(String table, String column, String EU){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");
  
            String sql = "SELECT * FROM konseling_online." + table
                    + " WHERE "+ column +"=?;";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, EU);
            ResultSet resultSet = st.executeQuery();
            
            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public ResultSet getJadwalDB(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");
  
            String sql = "SELECT A.id_jadwal_konseling as Schedule_ID,"
            + "F.Nama_Lengkap as Nama_Konselor, "
            + "D.Hari, E.Waktu, C.Nama_Lengkap as Nama_user, "
            + "F.link_Meet as Meeting_Link "
            + "FROM (konseling_online.jadwal_konseling as A) "
            + "JOIN (konseling_online.jadwal_konselor as B) ON B.id_jadwal_konselor = A.id_jadwal_konselor "
            + "JOIN (konseling_online.`user` as C) ON C.ID = A.id_user "
            + "JOIN (konseling_online.hari_konseling as D) ON D.id = B.id_hari "
            + "JOIN (konseling_online.waktu_konseling as E) ON E.id = B.id_waktu "
            + "JOIN (konseling_online.konselor as F) ON F.ID = B.id_konselor "
            + "WHERE A.id_user = ? ORDER BY A.id_jadwal_konseling;";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, IDAccUser);
            ResultSet resultSet = st.executeQuery();
            
            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public ResultSet getJadwalKonDB(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");
  
            String sql = "SELECT ROW_NUMBER () OVER (ORDER BY B.id_jadwal_konselor) AS No,"
            + "C.Nama_Lengkap as Nama_User, "
            + "D.Hari, E.Waktu, "
            + "F.link_Meet as Meeting_Link "
            + "FROM (konseling_online.jadwal_konseling as A) "
            + "JOIN (konseling_online.jadwal_konselor as B) ON B.id_jadwal_konselor = A.id_jadwal_konselor "
            + "JOIN (konseling_online.`user` as C) ON C.ID = A.id_user "
            + "JOIN (konseling_online.hari_konseling as D) ON D.id = B.id_hari "
            + "JOIN (konseling_online.waktu_konseling as E) ON E.id = B.id_waktu "
            + "JOIN (konseling_online.konselor as F) ON F.ID = B.id_konselor "
            + "WHERE F.ID = ?;";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, IDAccKon);
            ResultSet resultSet = st.executeQuery();
            
            return resultSet;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public ResultSet getHariDB(int ID){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");
  
            String sql = "SELECT DISTINCT Hari FROM (konseling_online.konselor as A) "
                    + "join (konseling_online.jadwal_konselor as B) on A.ID = B.id_konselor "
                    + "join (konseling_online.hari_konseling as C) on C.id=B.id_hari "
                    + "join (konseling_online.waktu_konseling as D) on D.id=B.id_waktu "
                    + "Where A.ID=?;";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, ID);
            ResultSet resultSet = st.executeQuery();
            
            return resultSet;  
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public ResultSet getWaktuDB(int ID, String hari){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(JDBC_URL, "root", "12345678");
  
            String sql = "SELECT Waktu FROM (konseling_online.konselor as A) "
                    + "join (konseling_online.jadwal_konselor as B) on A.ID = B.id_konselor "
                    + "join (konseling_online.hari_konseling as C) on C.id=B.id_hari "
                    + "join (konseling_online.waktu_konseling as D) on D.id=B.id_waktu "
                    + "Where A.ID=? AND Hari=?;";

            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, ID);
            st.setString(2, hari);
            ResultSet resultSet = st.executeQuery();
            
            return resultSet;  
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
