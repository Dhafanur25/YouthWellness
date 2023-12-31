package View;

import Controller.CPController;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChangeProfileP extends JPanel{
    private JPanel cards;
    private CardLayout cardLayout;
       
    private BioUserP BioUserC;
    private WelcomeP WelcomeC;
    private CPController CPC = new CPController();
    
    public ChangeProfileP(JPanel cards, CardLayout cardLayout, BioUserP BioUserC, WelcomeP WelcomeC){
        this.BioUserC = BioUserC;
        this.WelcomeC = WelcomeC;
        this.cards = cards;
        this.cardLayout = cardLayout;
        initComponents();
    }   
    
    // Layout Method
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background8 = new Background.Background();
        mainPanel8 = new javax.swing.JPanel();
        TitleCP = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelPhone = new javax.swing.JLabel();
        labelAddress = new javax.swing.JLabel();
        labelBio = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        isiNameCP = new swing.RoundTextField();
        isiEmailCP = new swing.RoundTextField();
        isiPhoneCP = new swing.RoundTextField();
        isiAddressCP = new swing.RoundTextField();
        isiBioCP = new swing.RoundTextArea();
        buttonSaveChanges = new swing.RoundButton();
        buttonChangeProfilePhoto = new swing.RoundButton();
        isiPassCP = new swing.RoundTextField();
        isiUNameCP = new swing.RoundTextField();
        labelUName = new javax.swing.JLabel();
        linkCP = new swing.Link();

        setPreferredSize(new java.awt.Dimension(700, 453));

        background8.setPic("bgUP.png");
        background8.setPreferredSize(new java.awt.Dimension(700, 453));

        mainPanel8.setOpaque(false);

        TitleCP.setBackground(new java.awt.Color(0, 0, 0));
        TitleCP.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        TitleCP.setForeground(new java.awt.Color(0, 0, 0));
        TitleCP.setText("Change Profile");

        labelName.setBackground(new java.awt.Color(0, 0, 0));
        labelName.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelName.setForeground(new java.awt.Color(0, 0, 0));
        labelName.setText("Full Name");

        labelEmail.setBackground(new java.awt.Color(0, 0, 0));
        labelEmail.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(0, 0, 0));
        labelEmail.setText("Email");

        labelPhone.setBackground(new java.awt.Color(0, 0, 0));
        labelPhone.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelPhone.setForeground(new java.awt.Color(0, 0, 0));
        labelPhone.setText("Phone");

        labelAddress.setBackground(new java.awt.Color(0, 0, 0));
        labelAddress.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelAddress.setForeground(new java.awt.Color(0, 0, 0));
        labelAddress.setText("Address");

        labelBio.setBackground(new java.awt.Color(0, 0, 0));
        labelBio.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelBio.setForeground(new java.awt.Color(0, 0, 0));
        labelBio.setText("Bio");

        labelPass.setBackground(new java.awt.Color(0, 0, 0));
        labelPass.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelPass.setForeground(new java.awt.Color(0, 0, 0));
        labelPass.setText("Password");

        isiBioCP.setColumns(20);
        isiBioCP.setRows(5);

        buttonSaveChanges.setBackground(new java.awt.Color(102, 102, 102));
        buttonSaveChanges.setForeground(new java.awt.Color(255, 255, 255));
        buttonSaveChanges.setText("Save Changes");
        buttonSaveChanges.setBackgroundColor("#5E17EB");
        buttonSaveChanges.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveChangesActionPerformed(evt);
            }
        });

        buttonChangeProfilePhoto.setBackground(new java.awt.Color(102, 102, 102));
        buttonChangeProfilePhoto.setForeground(new java.awt.Color(255, 255, 255));
        buttonChangeProfilePhoto.setText("Change Profile Photo");
        buttonChangeProfilePhoto.setBackgroundColor("#5271ff");
        buttonChangeProfilePhoto.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonChangeProfilePhoto.setMaximumSize(new java.awt.Dimension(151, 24));
        buttonChangeProfilePhoto.setMinimumSize(new java.awt.Dimension(151, 24));
        buttonChangeProfilePhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonChangeProfilePhotoActionPerformed(evt);
            }
        });

        labelUName.setBackground(new java.awt.Color(0, 0, 0));
        labelUName.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelUName.setForeground(new java.awt.Color(0, 0, 0));
        labelUName.setText("Username");

        linkCP.setText("<html><font color='red'>&#9664; CANCEL</font></html>");
        linkCP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        linkCP.setState1("<html><font color='red'>&#9664; CANCEL</font></html>");
        linkCP.setState2("<html><font color='blue'>&#9664; CANCEL</font></html>");
        linkCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkCPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanel8Layout = new javax.swing.GroupLayout(mainPanel8);
        mainPanel8.setLayout(mainPanel8Layout);
        mainPanel8Layout.setHorizontalGroup(
            mainPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel8Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(mainPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel8Layout.createSequentialGroup()
                        .addComponent(linkCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPanel8Layout.createSequentialGroup()
                        .addGroup(mainPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelEmail)
                            .addComponent(TitleCP)
                            .addComponent(labelName)
                            .addComponent(labelAddress)
                            .addComponent(labelPhone)
                            .addComponent(isiNameCP, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(isiEmailCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(isiPhoneCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(isiAddressCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelUName)
                            .addComponent(isiUNameCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(71, 71, 71)
                        .addGroup(mainPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isiBioCP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(isiPassCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonChangeProfilePhoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(mainPanel8Layout.createSequentialGroup()
                                .addGroup(mainPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelBio)
                                    .addComponent(labelPass))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(buttonSaveChanges, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38))))
        );
        mainPanel8Layout.setVerticalGroup(
            mainPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel8Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(TitleCP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainPanel8Layout.createSequentialGroup()
                        .addGroup(mainPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelName)
                            .addComponent(labelBio))
                        .addGap(7, 7, 7)
                        .addComponent(isiNameCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isiEmailCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(isiBioCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(mainPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel8Layout.createSequentialGroup()
                        .addComponent(labelPhone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isiPhoneCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel8Layout.createSequentialGroup()
                        .addComponent(labelPass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isiPassCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addComponent(labelAddress)
                .addGap(3, 3, 3)
                .addGroup(mainPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonChangeProfilePhoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isiAddressCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(mainPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel8Layout.createSequentialGroup()
                        .addComponent(buttonSaveChanges, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanel8Layout.createSequentialGroup()
                        .addComponent(labelUName)
                        .addGap(3, 3, 3)
                        .addComponent(isiUNameCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(linkCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );

        javax.swing.GroupLayout background8Layout = new javax.swing.GroupLayout(background8);
        background8.setLayout(background8Layout);
        background8Layout.setHorizontalGroup(
            background8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background8Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(mainPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        background8Layout.setVerticalGroup(
            background8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background8Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(mainPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    // Event Methods
    private void buttonSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveChangesActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Set new profile?", "Change Profile", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (result == JOptionPane.OK_OPTION){
            CPC.doCP(this, cards, cardLayout,
                     BioUserC, WelcomeC, isiEmailCP, 
                     isiUNameCP, isiPassCP, isiNameCP, 
                     isiPhoneCP, isiAddressCP, isiBioCP);
        }
    }//GEN-LAST:event_buttonSaveChangesActionPerformed

    private void buttonChangeProfilePhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonChangeProfilePhotoActionPerformed
        CPC.doFileChooser(this);
    }//GEN-LAST:event_buttonChangeProfilePhotoActionPerformed
    private void linkCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkCPActionPerformed
        // Panggil backFunc
        CPC.backFunc(cards, cardLayout, isiEmailCP, 
                     isiUNameCP, isiPassCP, isiNameCP, 
                     isiPhoneCP, isiAddressCP, isiBioCP);
    }//GEN-LAST:event_linkCPActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleCP;
    private Background.Background background8;
    private swing.RoundButton buttonChangeProfilePhoto;
    private swing.RoundButton buttonSaveChanges;
    private swing.RoundTextField isiAddressCP;
    private swing.RoundTextArea isiBioCP;
    private swing.RoundTextField isiEmailCP;
    private swing.RoundTextField isiNameCP;
    private swing.RoundTextField isiPassCP;
    private swing.RoundTextField isiPhoneCP;
    private swing.RoundTextField isiUNameCP;
    private javax.swing.JLabel labelAddress;
    private javax.swing.JLabel labelBio;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelPhone;
    private javax.swing.JLabel labelUName;
    private swing.Link linkCP;
    private javax.swing.JPanel mainPanel8;
    // End of variables declaration//GEN-END:variables
}
