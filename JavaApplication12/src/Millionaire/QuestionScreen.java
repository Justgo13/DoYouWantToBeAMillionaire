/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Millionaire;

import java.awt.Color;

/**
 *
 * @author ocdsb
 */
public class QuestionScreen extends javax.swing.JFrame {

    /**
     * Creates new form mainScreen
     */
    public QuestionScreen() {
        initComponents();
        // sets text

        ButtonA.setText("Choice A");
        ButtonB.setText("Choice B");
        ButtonC.setText("Choice C");
        ButtonD.setText("Choice D");
        //sets colour
        ButtonA.setForeground(Color.black);
        ButtonB.setForeground(Color.black);
        ButtonC.setForeground(Color.black);
        ButtonD.setForeground(Color.black);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Lifeline1 = new javax.swing.JButton();
        Lifeline2 = new javax.swing.JButton();
        ButtonB = new javax.swing.JButton();
        ButtonA = new javax.swing.JButton();
        ButtonD = new javax.swing.JButton();
        ButtonC = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(51, 204, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(933, 536));
        jPanel2.setName(""); // NOI18N
        jPanel2.setLayout(null);

        Lifeline1.setBackground(new java.awt.Color(78, 73, 231));
        Lifeline1.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        Lifeline1.setForeground(new java.awt.Color(255, 255, 255));
        Lifeline1.setText("50:50");
        Lifeline1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Lifeline1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Lifeline1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Lifeline1MouseExited(evt);
            }
        });
        Lifeline1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lifeline1ActionPerformed(evt);
            }
        });
        jPanel2.add(Lifeline1);
        Lifeline1.setBounds(10, 10, 100, 42);

        Lifeline2.setBackground(new java.awt.Color(78, 73, 231));
        Lifeline2.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 14)); // NOI18N
        Lifeline2.setForeground(new java.awt.Color(255, 255, 255));
        Lifeline2.setText("50%");
        Lifeline2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Lifeline2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Lifeline2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Lifeline2MouseExited(evt);
            }
        });
        Lifeline2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lifeline2ActionPerformed(evt);
            }
        });
        jPanel2.add(Lifeline2);
        Lifeline2.setBounds(810, 10, 100, 41);

        ButtonB.setBackground(new java.awt.Color(78, 73, 231));
        ButtonB.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        ButtonB.setForeground(new java.awt.Color(255, 255, 255));
        ButtonB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        ButtonB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonBMouseExited(evt);
            }
        });
        ButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonB);
        ButtonB.setBounds(510, 380, 250, 77);

        ButtonA.setBackground(new java.awt.Color(78, 73, 231));
        ButtonA.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        ButtonA.setForeground(new java.awt.Color(255, 255, 255));
        ButtonA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        ButtonA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonAMouseExited(evt);
            }
        });
        ButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonA);
        ButtonA.setBounds(170, 380, 250, 77);

        ButtonD.setBackground(new java.awt.Color(78, 73, 231));
        ButtonD.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        ButtonD.setForeground(new java.awt.Color(255, 255, 255));
        ButtonD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        ButtonD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonDMouseExited(evt);
            }
        });
        ButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonD);
        ButtonD.setBounds(510, 510, 250, 82);

        ButtonC.setBackground(new java.awt.Color(78, 73, 231));
        ButtonC.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        ButtonC.setForeground(new java.awt.Color(255, 255, 255));
        ButtonC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        ButtonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ButtonCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ButtonCMouseExited(evt);
            }
        });
        ButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCActionPerformed(evt);
            }
        });
        jPanel2.add(ButtonC);
        ButtonC.setBounds(170, 510, 250, 82);

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("30");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(440, 470, 50, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/timerCircle.png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(420, 430, 100, 100);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/questionBox.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(130, 260, 690, 120);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/logo.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(330, 10, 250, 250);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCActionPerformed

    private void ButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonDActionPerformed

    private void ButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonAActionPerformed

    private void ButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonBActionPerformed

    private void Lifeline1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lifeline1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lifeline1ActionPerformed

    private void Lifeline2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lifeline2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lifeline2ActionPerformed

    private void ButtonAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAMouseEntered
        ButtonA.setBackground(Color.GREEN);
    }//GEN-LAST:event_ButtonAMouseEntered

    private void ButtonAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonAMouseExited
        Color myColour = new Color(78,73,231);
        ButtonA.setBackground(myColour);
    }//GEN-LAST:event_ButtonAMouseExited

    private void ButtonBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBMouseEntered
        ButtonB.setBackground(Color.GREEN);
    }//GEN-LAST:event_ButtonBMouseEntered

    private void ButtonBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonBMouseExited
        Color myColour = new Color(78,73,231);
        ButtonB.setBackground(myColour);
    }//GEN-LAST:event_ButtonBMouseExited

    private void ButtonCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCMouseEntered
        ButtonC.setBackground(Color.GREEN);
    }//GEN-LAST:event_ButtonCMouseEntered

    private void ButtonCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonCMouseExited
        Color myColour = new Color(78,73,231);
        ButtonC.setBackground(myColour);
    }//GEN-LAST:event_ButtonCMouseExited

    private void ButtonDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDMouseEntered
        ButtonD.setBackground(Color.GREEN);
    }//GEN-LAST:event_ButtonDMouseEntered

    private void ButtonDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ButtonDMouseExited
        Color myColour = new Color(78,73,231);
        ButtonD.setBackground(myColour);
    }//GEN-LAST:event_ButtonDMouseExited

    private void Lifeline1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lifeline1MouseEntered
        Lifeline1.setBackground(Color.BLUE);
    }//GEN-LAST:event_Lifeline1MouseEntered

    private void Lifeline1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lifeline1MouseExited
        Color myColour = new Color(78,73,231);
        Lifeline1.setBackground(myColour);
    }//GEN-LAST:event_Lifeline1MouseExited

    private void Lifeline2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lifeline2MouseEntered
        Lifeline2.setBackground(Color.BLUE);
    }//GEN-LAST:event_Lifeline2MouseEntered

    private void Lifeline2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lifeline2MouseExited
        Color myColour = new Color(78,73,231);
        Lifeline2.setBackground(myColour);
    }//GEN-LAST:event_Lifeline2MouseExited

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
            java.util.logging.Logger.getLogger(QuestionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionScreen().setVisible(true);
                          
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonA;
    private javax.swing.JButton ButtonB;
    private javax.swing.JButton ButtonC;
    private javax.swing.JButton ButtonD;
    private javax.swing.JButton Lifeline1;
    private javax.swing.JButton Lifeline2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
