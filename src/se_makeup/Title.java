/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_makeup;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Hammad
 */
public class Title extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    public Title() {
        initComponents();
        papersizeCB.removeAllItems();
        papersizeCB.addItem("a4paper");
        papersizeCB.addItem("letterpaper");
        papersizeCB.addItem("a5paper");
        papersizeCB.addItem("b5paper");
        papersizeCB.addItem("executivepaper");
        papersizeCB.addItem("legalpaper");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        movetothebodyB1 = new javax.swing.JButton();
        addtitleJL = new javax.swing.JLabel();
        addsubtitleJL = new javax.swing.JLabel();
        adddateJL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addtitleTF = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        addsubtitleTF = new javax.swing.JTextArea();
        adddateTF = new javax.swing.JTextField();
        movetothebodyB = new javax.swing.JButton();
        papersizeCB = new javax.swing.JComboBox<>();
        papersizeJL = new javax.swing.JLabel();
        addemailTF = new javax.swing.JTextField();
        addemailJL = new javax.swing.JLabel();
        addauthorTF = new javax.swing.JTextField();
        addauthorJL = new javax.swing.JLabel();
        exitB = new javax.swing.JButton();

        movetothebodyB1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        movetothebodyB1.setText("Move to the Body");
        movetothebodyB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movetothebodyB1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addtitleJL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addtitleJL.setText("Add Title");

        addsubtitleJL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addsubtitleJL.setText("Add Subtitle");

        adddateJL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        adddateJL.setText("Add Date");

        addtitleTF.setColumns(20);
        addtitleTF.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        addtitleTF.setRows(5);
        jScrollPane1.setViewportView(addtitleTF);

        addsubtitleTF.setColumns(20);
        addsubtitleTF.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        addsubtitleTF.setRows(5);
        jScrollPane3.setViewportView(addsubtitleTF);

        adddateTF.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        adddateTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adddateTFActionPerformed(evt);
            }
        });

        movetothebodyB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        movetothebodyB.setText("Move to the Body Section");
        movetothebodyB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movetothebodyBActionPerformed(evt);
            }
        });

        papersizeCB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        papersizeCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        papersizeCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                papersizeCBActionPerformed(evt);
            }
        });

        papersizeJL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        papersizeJL.setText("Paper Size");

        addemailTF.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addemailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addemailTFActionPerformed(evt);
            }
        });

        addemailJL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addemailJL.setText("Add Email");

        addauthorTF.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        addauthorTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addauthorTFActionPerformed(evt);
            }
        });

        addauthorJL.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addauthorJL.setText("Add Author");

        exitB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        exitB.setText("Exit");
        exitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(136, 136, 136)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(addemailJL)
                                        .addComponent(adddateJL)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(addtitleJL)
                                        .addComponent(addsubtitleJL)
                                        .addComponent(papersizeJL))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(papersizeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addauthorJL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addauthorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(movetothebodyB, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(addemailTF, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
                                .addComponent(adddateTF)))))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(addtitleJL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(papersizeCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(papersizeJL))
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(addsubtitleJL))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addauthorJL)
                            .addComponent(addauthorTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addemailJL)
                            .addComponent(addemailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adddateJL)
                            .addComponent(adddateTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(movetothebodyB, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adddateTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adddateTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adddateTFActionPerformed

    private void movetothebodyBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movetothebodyBActionPerformed
        // TODO add your handling code here:

        String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
        ///source for regex --> https://howtodoinjava.com/java/regex/java-regex-validate-email-address/

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(addemailTF.getText());
        if (matcher.matches() && !addtitleTF.getText().equals("") && !addsubtitleTF.getText().equals("")) {
            TextToLatex toLatex = new TextToLatex(String.valueOf(papersizeCB.getSelectedItem()));
            toLatex.setLatex(toLatex.initializeDoc());
            toLatex.appendToLatex(toLatex.titleAndSubtitleToTex(addtitleTF.getText(), addsubtitleTF.getText()));
            toLatex.appendToLatex(toLatex.authorAndMailToTex(addauthorTF.getText(), addemailTF.getText()));
            toLatex.appendToLatex(toLatex.dateToTex(adddateTF.getText()));
            toLatex.appendToLatex("\\begin{document}\n"
                    + "\\maketitle");
            //System.out.println(tex);
            setVisible(false);
            Body body = new Body();
            body.setVisible(true);
        } else {
            if (matcher.matches() != true) {
                JOptionPane.showMessageDialog(null, "Please add a valid email.");
            } else if (addtitleTF.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please add a Title.");
            } else {
                JOptionPane.showMessageDialog(null, "Please add a subitle.");
            }

        }
        /*
        if (matcher.matches()) {
            TextToLatex toLatex = new TextToLatex(String.valueOf(papersizeCB.getSelectedItem()));
            toLatex.setLatex(toLatex.initializeDoc());
            if(addtitleTF.getText().equals("") && addsubtitleTF.getText().equals("")){
            if (addtitleTF.getText().equals("")) {
                addtitleTF.setText(" ");
            } else if (addsubtitleTF.getText().equals("")) {
                addsubtitleTF.setText(" ");
            } 
            toLatex.appendToLatex(toLatex.titleAndSubtitleToTex(addtitleTF.getText(), addsubtitleTF.getText()));
            toLatex.appendToLatex(toLatex.authorAndMailToTex(addauthorTF.getText(), addemailTF.getText()));
            toLatex.appendToLatex(toLatex.dateToTex(adddateTF.getText()));
            toLatex.appendToLatex("\\begin{document}\n"
                    + "\\maketitle");
            }else{
                toLatex.appendToLatex(toLatex.titleAndSubtitleToTex(addtitleTF.getText(), addsubtitleTF.getText()));
            toLatex.appendToLatex(toLatex.authorAndMailToTex(addauthorTF.getText(), addemailTF.getText()));
            toLatex.appendToLatex(toLatex.dateToTex(adddateTF.getText()));
            toLatex.appendToLatex("\\begin{document}\n"
                    + "");
            }
            //System.out.println(tex);
            setVisible(false);
            Body body = new Body();
            body.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Please add a valid email.");
        }
         */

    }//GEN-LAST:event_movetothebodyBActionPerformed

    private void papersizeCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_papersizeCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_papersizeCBActionPerformed

    private void addemailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addemailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addemailTFActionPerformed

    private void addauthorTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addauthorTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addauthorTFActionPerformed

    private void movetothebodyB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movetothebodyB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_movetothebodyB1ActionPerformed

    private void exitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitBActionPerformed

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
            java.util.logging.Logger.getLogger(Title.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Title.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Title.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Title.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Title().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addauthorJL;
    private javax.swing.JTextField addauthorTF;
    private javax.swing.JLabel adddateJL;
    private javax.swing.JTextField adddateTF;
    private javax.swing.JLabel addemailJL;
    private javax.swing.JTextField addemailTF;
    private javax.swing.JLabel addsubtitleJL;
    private javax.swing.JTextArea addsubtitleTF;
    private javax.swing.JLabel addtitleJL;
    private javax.swing.JTextArea addtitleTF;
    private javax.swing.JButton exitB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton movetothebodyB;
    private javax.swing.JButton movetothebodyB1;
    private javax.swing.JComboBox<String> papersizeCB;
    private javax.swing.JLabel papersizeJL;
    // End of variables declaration//GEN-END:variables
}
