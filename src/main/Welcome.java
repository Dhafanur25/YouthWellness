/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author User
 */
public class Welcome extends javax.swing.JFrame {

    /**
     * Creates new form YouthWellness
     */
    public Welcome() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new Background.Background();
        mainPanel = new javax.swing.JPanel();
        TitleApp = new javax.swing.JLabel();
        labelSuccess = new javax.swing.JLabel();
        buttonMulaiK = new swing.RoundButton();
        buttonQuiz = new swing.RoundButton();
        link = new swing.Link4();
        rightSideProfilePic = new swing.RightSideProfilePic();
        buttonName = new swing.TransparentButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBlur(mainPanel);
        background.setPic("bgW.png");

        mainPanel.setOpaque(false);

        TitleApp.setBackground(new java.awt.Color(0, 0, 0));
        TitleApp.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        TitleApp.setForeground(new java.awt.Color(0, 0, 0));
        TitleApp.setText("YouthWellness");

        labelSuccess.setBackground(new java.awt.Color(0, 0, 0));
        labelSuccess.setFont(new java.awt.Font("Cambria Math", 0, 9)); // NOI18N
        labelSuccess.setForeground(new java.awt.Color(0, 0, 0));
        labelSuccess.setText("Nurturing Minds, Inspiring Futures: Empowering Student Success!");

        buttonMulaiK.setBackground(new java.awt.Color(102, 102, 102));
        buttonMulaiK.setForeground(new java.awt.Color(255, 255, 255));
        buttonMulaiK.setText("Mulai Konseling");
        buttonMulaiK.setBackgroundColor("#5271ff");
        buttonMulaiK.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonMulaiK.setMaximumSize(new java.awt.Dimension(151, 24));
        buttonMulaiK.setMinimumSize(new java.awt.Dimension(151, 24));
        buttonMulaiK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMulaiKActionPerformed(evt);
            }
        });

        buttonQuiz.setBackground(new java.awt.Color(102, 102, 102));
        buttonQuiz.setForeground(new java.awt.Color(255, 255, 255));
        buttonQuiz.setText("Quiz");
        buttonQuiz.setBackgroundColor("#5E17EB");
        buttonQuiz.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonQuizActionPerformed(evt);
            }
        });

        link.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                linkActionPerformed(evt);
            }
        });

        buttonName.setForeground(new java.awt.Color(0, 0, 0));
        buttonName.setText("Shinta Aiko");
        buttonName.setFont(new java.awt.Font("Cambria Math", 0, 18)); // NOI18N
        buttonName.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        buttonName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightSideProfilePicLayout = new javax.swing.GroupLayout(rightSideProfilePic);
        rightSideProfilePic.setLayout(rightSideProfilePicLayout);
        rightSideProfilePicLayout.setHorizontalGroup(
            rightSideProfilePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightSideProfilePicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(buttonName, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                .addContainerGap())
        );
        rightSideProfilePicLayout.setVerticalGroup(
            rightSideProfilePicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightSideProfilePicLayout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(buttonName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TitleApp, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                        .addComponent(rightSideProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(labelSuccess))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(buttonMulaiK, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(buttonQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TitleApp, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rightSideProfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelSuccess)
                .addGap(51, 51, 51)
                .addComponent(buttonMulaiK, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonQuiz, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(link, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMulaiKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMulaiKActionPerformed
        // TODO add your handling code here:
        dispose();
        LakukanKonseling x = new LakukanKonseling();
        x.setVisible(true);
    }//GEN-LAST:event_buttonMulaiKActionPerformed

    private void buttonQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonQuizActionPerformed
        // TODO add your handling code here:
        try {
            // Specify the URL you want to open
            URI uri = new URI("https://github.com/Dhafanur25/TugasBesarRPL");

            // Check if the Desktop class is supported (works on Windows, Linux, and macOS)
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(uri);
            } else {
            // If Desktop is not supported, you can open the link in another way.
            // For example, you can use the ProcessBuilder to open the default web browser.
            }
        }catch (IOException | URISyntaxException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_buttonQuizActionPerformed

    private void linkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_linkActionPerformed
        // TODO add your handling code here:
        dispose();
        Feedback x = new Feedback();
        x.setVisible(true);
    }//GEN-LAST:event_linkActionPerformed

    private void buttonNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNameActionPerformed
        // TODO add your handling code here:
        dispose();
        BioMahasiswa x = new BioMahasiswa();
        x.setVisible(true);
    }//GEN-LAST:event_buttonNameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleApp;
    private Background.Background background;
    private swing.RoundButton buttonMulaiK;
    private swing.TransparentButton buttonName;
    private swing.RoundButton buttonQuiz;
    private javax.swing.JLabel labelSuccess;
    private swing.Link4 link;
    private javax.swing.JPanel mainPanel;
    private swing.RightSideProfilePic rightSideProfilePic;
    // End of variables declaration//GEN-END:variables
}
