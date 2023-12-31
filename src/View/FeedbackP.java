package View;

import Controller.FController;
import swing.LabelArea;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

public class FeedbackP extends javax.swing.JPanel {
    private javax.swing.JPanel cards;
    private CardLayout cardLayout;
    
    private FController FC = new FController();
    
    public FeedbackP(javax.swing.JPanel cards, CardLayout cardLayout){
        this.cards = cards;
        this.cardLayout = cardLayout;
        initComponents();
        repaint();
    }
    
    // Getter Methods
    public LabelArea getC1() {
        return c1;
    }

    public LabelArea getC2() {
        return c2;
    }

    public LabelArea getC3() {
        return c3;
    }

    public LabelArea getC4() {
        return c4;
    }

    public LabelArea getC5() {
        return c5;
    }
    
    // Layout Method
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background6 = new Background.Background();
        mainPanel6 = new javax.swing.JPanel();
        TitleFB = new javax.swing.JLabel();
        labelWriteFB = new javax.swing.JLabel();
        labelTopFB = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        c1 = new swing.LabelArea();
        c2 = new swing.LabelArea();
        c3 = new swing.LabelArea();
        c4 = new swing.LabelArea();
        c5 = new swing.LabelArea();
        buttonFeedback = new swing.RoundButton();
        buttonPrev = new swing.RoundButton();
        buttonNext = new swing.RoundButton();
        isiFB = new javax.swing.JTextArea();
        link1 = new swing.Link();

        setPreferredSize(new java.awt.Dimension(700, 453));

        background6.setBlur(mainPanel6);
        background6.setPic("bgFB.png");
        background6.setPreferredSize(new java.awt.Dimension(700, 453));

        mainPanel6.setOpaque(false);

        TitleFB.setBackground(new java.awt.Color(0, 0, 0));
        TitleFB.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        TitleFB.setForeground(new java.awt.Color(0, 0, 0));
        TitleFB.setText("Feedback");

        labelWriteFB.setBackground(new java.awt.Color(0, 0, 0));
        labelWriteFB.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelWriteFB.setForeground(new java.awt.Color(0, 0, 0));
        labelWriteFB.setText("Write Feedback");

        labelTopFB.setBackground(new java.awt.Color(0, 0, 0));
        labelTopFB.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        labelTopFB.setForeground(new java.awt.Color(0, 0, 0));
        labelTopFB.setText("Your Top Feedback");

        cardPanel.setOpaque(false);
        cardPanel.setLayout(new java.awt.CardLayout());

        c1.setColumns(20);
        c1.setRows(5);
        c1.setText("Hello");
        cardPanel.add(c1, "c1");

        c2.setColumns(20);
        c2.setRows(5);
        c2.setText("Konselor Baik");
        cardPanel.add(c2, "c2");

        c3.setColumns(20);
        c3.setRows(5);
        c3.setText("Aplikasi Bagus");
        c3.setToolTipText("");
        cardPanel.add(c3, "c3");

        c4.setColumns(20);
        c4.setRows(5);
        c4.setText("gwenchana");
        cardPanel.add(c4, "c4");

        c5.setColumns(20);
        c5.setRows(5);
        c5.setText("seru");
        c5.setToolTipText("");
        cardPanel.add(c5, "c5");

        buttonFeedback.setBackground(new java.awt.Color(102, 102, 102));
        buttonFeedback.setForeground(new java.awt.Color(255, 255, 255));
        buttonFeedback.setText("Send Feedback");
        buttonFeedback.setBackgroundColor("#5E17EB");
        buttonFeedback.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonFeedback.setMaximumSize(new java.awt.Dimension(151, 24));
        buttonFeedback.setMinimumSize(new java.awt.Dimension(151, 24));
        buttonFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFeedbackActionPerformed(evt);
            }
        });

        buttonPrev.setBackground(new java.awt.Color(102, 102, 102));
        buttonPrev.setForeground(new java.awt.Color(255, 255, 255));
        buttonPrev.setText("<html><font color='white'>&#9664</font></html>");
        buttonPrev.setBackgroundColor("#5271ff");
        buttonPrev.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonPrev.setMaximumSize(new java.awt.Dimension(151, 24));
        buttonPrev.setMinimumSize(new java.awt.Dimension(151, 24));
        buttonPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPrevActionPerformed(evt);
            }
        });

        buttonNext.setBackground(new java.awt.Color(102, 102, 102));
        buttonNext.setForeground(new java.awt.Color(255, 255, 255));
        buttonNext.setText("<html><font color='white'>&#9654;</font></html>");
        buttonNext.setBackgroundColor("#5271ff");
        buttonNext.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        buttonNext.setMaximumSize(new java.awt.Dimension(151, 24));
        buttonNext.setMinimumSize(new java.awt.Dimension(151, 24));
        buttonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNextActionPerformed(evt);
            }
        });

        isiFB.setBackground(new java.awt.Color(217, 217, 217));
        isiFB.setColumns(20);
        isiFB.setForeground(new java.awt.Color(0, 0, 0));
        isiFB.setRows(5);

        link1.setText("<html><font color='purple'>&#9664; HOME</font></html>");
        link1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        link1.setState1("<html><font color='purple'>&#9664; HOME</font></html>");
        link1.setState2("<html><font color='blue'>&#9664; HOME</font></html>");
        link1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                link1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanel6Layout = new javax.swing.GroupLayout(mainPanel6);
        mainPanel6.setLayout(mainPanel6Layout);
        mainPanel6Layout.setHorizontalGroup(
            mainPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mainPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel6Layout.createSequentialGroup()
                        .addComponent(link1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainPanel6Layout.createSequentialGroup()
                        .addComponent(TitleFB)
                        .addContainerGap(463, Short.MAX_VALUE))
                    .addGroup(mainPanel6Layout.createSequentialGroup()
                        .addGroup(mainPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                            .addComponent(labelWriteFB)
                            .addComponent(isiFB, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addGroup(mainPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel6Layout.createSequentialGroup()
                                .addGroup(mainPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelTopFB))
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel6Layout.createSequentialGroup()
                                .addComponent(buttonPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))))))
        );
        mainPanel6Layout.setVerticalGroup(
            mainPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(TitleFB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(mainPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel6Layout.createSequentialGroup()
                        .addComponent(labelWriteFB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(isiFB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel6Layout.createSequentialGroup()
                        .addComponent(labelTopFB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(mainPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonNext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67)
                .addComponent(link1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout background6Layout = new javax.swing.GroupLayout(background6);
        background6.setLayout(background6Layout);
        background6Layout.setHorizontalGroup(
            background6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        background6Layout.setVerticalGroup(
            background6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Event Methods
    private void buttonFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFeedbackActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Post Feedback permanently?", "Feedback", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        LabelArea[] cList = {c1, c2, c3, c4, c5};
        if (result == JOptionPane.OK_OPTION){
            FC.doFB(this, isiFB, cList);
        }
    }//GEN-LAST:event_buttonFeedbackActionPerformed

    private void buttonPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPrevActionPerformed
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardLayout.previous(cardPanel);
    }//GEN-LAST:event_buttonPrevActionPerformed

    private void buttonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNextActionPerformed
        CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
        cardLayout.next(cardPanel);
    }//GEN-LAST:event_buttonNextActionPerformed

    private void link1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_link1ActionPerformed
        isiFB.setText("");
        cardLayout.show(cards, "WelcomeC");
    }//GEN-LAST:event_link1ActionPerformed
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleFB;
    private Background.Background background6;
    private swing.RoundButton buttonFeedback;
    private swing.RoundButton buttonNext;
    private swing.RoundButton buttonPrev;
    private swing.LabelArea c1;
    private swing.LabelArea c2;
    private swing.LabelArea c3;
    private swing.LabelArea c4;
    private swing.LabelArea c5;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JTextArea isiFB;
    private javax.swing.JLabel labelTopFB;
    private javax.swing.JLabel labelWriteFB;
    private swing.Link link1;
    private javax.swing.JPanel mainPanel6;
    // End of variables declaration//GEN-END:variables
}
