package Panel;

import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import main.Database;

/**
 *
 * @author dhafa
 */
public class RegisterP extends JPanel {

    /**
     * Creates new form RegisterP
     */
    private JPanel cards;
    private CardLayout cardLayout;
    private Database database = Database.getInstance();

    public RegisterP(JPanel cards, CardLayout cardLayout){
        this.cards = cards;
        this.cardLayout = cardLayout;
        initComponents();
        repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background2 = new Background.BackgroundRL();
        mainPanel2 = new javax.swing.JPanel();
        labelRegis = new javax.swing.JLabel();
        isiNameR = new swing.CoolTextField();
        isiEmailR = new swing.CoolTextField();
        isiUsernameR = new swing.CoolTextField();
        isiPasswordR = new swing.CoolTextField();
        checR = new swing.CoolCheckBox();
        buttonRegis = new swing.CoolButton();
        link2 = new swing.Link();

        background2.setBlur(mainPanel2);
        background2.setPreferredSize(new java.awt.Dimension(700, 453));

        mainPanel2.setOpaque(false);

        labelRegis.setBackground(new java.awt.Color(0, 0, 0));
        labelRegis.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        labelRegis.setForeground(new java.awt.Color(255, 255, 255));
        labelRegis.setText("Register Account");

        isiNameR.setHint("Full Name");

        isiEmailR.setHint("Email");

        isiUsernameR.setHint("Username");

        isiPasswordR.setHint("Password");

        checR.setText("Agree to terms and conditions");

        buttonRegis.setBackground(new java.awt.Color(255, 255, 255));
        buttonRegis.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegis.setText("Register");
        buttonRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegisActionPerformed(evt);
            }
        });

        link2.setText("<html><font color='white'>Already have an account? <font color='white'>Log in</font></font></html>");
        link2.setState1("<html><font color='white'>Already have an account? <font color='white'>Log in</font></font></html>");
        link2.setState2("<html><font color='white'>Already have an account? <font color='#3dabf5'>Log in</font></font></html>");
        link2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                link2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanel2Layout = new javax.swing.GroupLayout(mainPanel2);
        mainPanel2.setLayout(mainPanel2Layout);
        mainPanel2Layout.setHorizontalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createSequentialGroup()
                        .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(isiEmailR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(isiPasswordR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(isiUsernameR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createSequentialGroup()
                                .addComponent(isiNameR, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel2Layout.createSequentialGroup()
                        .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(buttonRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(checR, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133))))
            .addGroup(mainPanel2Layout.createSequentialGroup()
                .addGroup(mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(labelRegis))
                    .addGroup(mainPanel2Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(link2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainPanel2Layout.setVerticalGroup(
            mainPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(labelRegis)
                .addGap(18, 18, 18)
                .addComponent(isiNameR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isiEmailR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isiUsernameR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isiPasswordR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(checR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(link2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout background2Layout = new javax.swing.GroupLayout(background2);
        background2.setLayout(background2Layout);
        background2Layout.setHorizontalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(mainPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );
        background2Layout.setVerticalGroup(
            background2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(mainPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegisActionPerformed
        // TODO add your handling code here:
        QSalah x = new QSalah();
        String nama = isiNameR.getText().trim();
        String email = isiEmailR.getText().trim();
        String uName = isiUsernameR.getText().trim();
        String pass = isiPasswordR.getText().trim();
        
        if (checR.isSelected() && 
            !nama.equals("") &&
            database.validateEmail(email) && 
            !uName.equals("")&& 
            !pass.equals("")&&
            pass.length() >= 5) {
            // Insert to database
            if(database.insertRegDB(nama, email, uName, pass)){
                
                // Reset fields
                JTextField[] textFields = {isiNameR, isiPasswordR, isiEmailR, isiUsernameR};
                for (JTextField textField : textFields) {
                    textField.setText("");
                }
                checR.setSelected(false);

                cardLayout.show(cards, "LoginC");
            }else{
               x.getLabelSure().setText("Email/Username has been taken!");
               x.setVisible(true); 
            }
            
            
        }else if(nama.equals("") ||
            email.equals("")     || 
            uName.equals("")  || 
            pass.equals("")){
            
            x.getLabelSure().setText("Field cannot be empty!");
            x.setVisible(true);    
        }else if(pass.length() <5){
            
            x.getLabelSure().setText("Password must be 5 or more!");
            x.setVisible(true);    
        }else if(!database.validateEmail(email)){
            
            x.getLabelSure().setText("Use a valid email!");
            x.setVisible(true);
        }else if (!checR.isSelected()){
            
            x.getLabelSure().setText("Please agree to terms and condition!");
            x.setVisible(true);
        }  
    }//GEN-LAST:event_buttonRegisActionPerformed

    private void link2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_link2ActionPerformed
        // TODO add your handling code here:
        JTextField[] textFields = {isiNameR, isiPasswordR, isiEmailR, isiUsernameR};

        for (JTextField textField : textFields) {
            textField.setText("");
        }
        checR.setSelected(false);
        cardLayout.show(cards, "LoginC");
    }//GEN-LAST:event_link2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Background.BackgroundRL background2;
    private swing.CoolButton buttonRegis;
    private swing.CoolCheckBox checR;
    private swing.CoolTextField isiEmailR;
    private swing.CoolTextField isiNameR;
    private swing.CoolTextField isiPasswordR;
    private swing.CoolTextField isiUsernameR;
    private javax.swing.JLabel labelRegis;
    private swing.Link link2;
    private javax.swing.JPanel mainPanel2;
    // End of variables declaration//GEN-END:variables
}
