/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se_makeup;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hammad
 */
public class Body extends javax.swing.JFrame {

    TextToLatex texttolatex = new TextToLatex();

    /**
     * Creates new form Body
     */
    public Body() {
        initComponents();
        latexcodeTF.setText(texttolatex.getLatex());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        latexcodeTF = new javax.swing.JTextArea();
        latexcodeJL = new javax.swing.JLabel();
        addsectionJL = new javax.swing.JLabel();
        addsubsectionJL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        addsectionTF = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        addsubsectionTF = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        addtextTF = new javax.swing.JTextArea();
        addtextJL = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        addpathTF = new javax.swing.JTextArea();
        addpathJL = new javax.swing.JLabel();
        addlistJL = new javax.swing.JLabel();
        addcodeJL = new javax.swing.JLabel();
        addlistB = new javax.swing.JButton();
        addcodeB = new javax.swing.JButton();
        addsectionB = new javax.swing.JButton();
        addsubsectionB = new javax.swing.JButton();
        addtextB = new javax.swing.JButton();
        addpathB = new javax.swing.JButton();
        finishcodeB = new javax.swing.JButton();
        addlinkB = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        addlinkTF = new javax.swing.JTextArea();
        addlinkJL = new javax.swing.JLabel();
        restartB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        latexcodeTF.setColumns(20);
        latexcodeTF.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        latexcodeTF.setRows(5);
        jScrollPane1.setViewportView(latexcodeTF);

        latexcodeJL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        latexcodeJL.setText("Latex Code ");

        addsectionJL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addsectionJL.setText("Add Section");

        addsubsectionJL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addsubsectionJL.setText("Add Subsection");

        addsectionTF.setColumns(20);
        addsectionTF.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        addsectionTF.setRows(5);
        jScrollPane2.setViewportView(addsectionTF);

        addsubsectionTF.setColumns(20);
        addsubsectionTF.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        addsubsectionTF.setRows(5);
        jScrollPane3.setViewportView(addsubsectionTF);

        addtextTF.setColumns(20);
        addtextTF.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        addtextTF.setRows(5);
        jScrollPane4.setViewportView(addtextTF);

        addtextJL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addtextJL.setText("Add Text");

        addpathTF.setColumns(20);
        addpathTF.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        addpathTF.setRows(5);
        jScrollPane5.setViewportView(addpathTF);

        addpathJL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addpathJL.setText("Add Path");

        addlistJL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addlistJL.setText("To add a list, click here");

        addcodeJL.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addcodeJL.setText("To add code, click here");

        addlistB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addlistB.setText("Add List");
        addlistB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addlistBActionPerformed(evt);
            }
        });

        addcodeB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addcodeB.setText("Add Code");
        addcodeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcodeBActionPerformed(evt);
            }
        });

        addsectionB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addsectionB.setText("Add Section");
        addsectionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsectionBActionPerformed(evt);
            }
        });

        addsubsectionB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addsubsectionB.setText("Add Subsection");
        addsubsectionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsubsectionBActionPerformed(evt);
            }
        });

        addtextB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addtextB.setText("Add Text");
        addtextB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtextBActionPerformed(evt);
            }
        });

        addpathB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addpathB.setText("Add Path");
        addpathB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addpathBActionPerformed(evt);
            }
        });

        finishcodeB.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        finishcodeB.setText("Finish the Code");
        finishcodeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishcodeBActionPerformed(evt);
            }
        });

        addlinkB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addlinkB.setText("Add Link");
        addlinkB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addlinkBActionPerformed(evt);
            }
        });

        addlinkTF.setColumns(20);
        addlinkTF.setFont(new java.awt.Font("Monospaced", 0, 16)); // NOI18N
        addlinkTF.setRows(5);
        jScrollPane6.setViewportView(addlinkTF);

        addlinkJL.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addlinkJL.setText("Add Link");

        restartB.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        restartB.setText("Restart (Go back to Title Menu)");
        restartB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addcodeJL)
                            .addComponent(addlistJL))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addcodeB, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addlistB, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(addsectionJL)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addsectionB))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addtextJL)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addsubsectionJL)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addpathJL)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addsubsectionB)
                                    .addComponent(addtextB)
                                    .addComponent(addpathB)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addlinkJL)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addlinkB)
                                .addGap(50, 50, 50)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(finishcodeB)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(latexcodeJL)
                        .addGap(231, 231, 231))))
            .addGroup(layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(restartB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(latexcodeJL)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(finishcodeB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(addsectionJL)
                                .addGap(29, 29, 29))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(addsectionB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(addsubsectionJL))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(addsubsectionB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(addtextJL))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(addtextB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(addpathJL))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(addpathB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(addlinkJL))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(addlinkB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addlistJL)
                            .addComponent(addlistB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addcodeJL)
                            .addComponent(addcodeB, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)))
                .addComponent(restartB)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addlistBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addlistBActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        List lst = new List();
        lst.setVisible(true);
    }//GEN-LAST:event_addlistBActionPerformed

    private void addcodeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcodeBActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Code cd = new Code();
        cd.setVisible(true);
    }//GEN-LAST:event_addcodeBActionPerformed

    private void addsectionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsectionBActionPerformed
        // TODO add your handling code here:
        texttolatex.appendToLatex(texttolatex.sectionToTex(addsectionTF.getText()));
        latexcodeTF.setText(texttolatex.getLatex());
        addsectionTF.setText("");

    }//GEN-LAST:event_addsectionBActionPerformed

    private void addsubsectionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsubsectionBActionPerformed
        // TODO add your handling code here:
        texttolatex.appendToLatex(texttolatex.subsectionToTex(addsubsectionTF.getText()));
        latexcodeTF.setText(texttolatex.getLatex());
        addsubsectionTF.setText("");
    }//GEN-LAST:event_addsubsectionBActionPerformed

    private void addtextBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtextBActionPerformed
        // TODO add your handling code here:
        texttolatex.appendToLatex(texttolatex.textToTex(addtextTF.getText()));
        latexcodeTF.setText(texttolatex.getLatex());
        addtextTF.setText("");
    }//GEN-LAST:event_addtextBActionPerformed

    private void addpathBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addpathBActionPerformed
        // TODO add your handling code here:
        texttolatex.appendToLatex(texttolatex.pathToTex(addpathTF.getText()));
        latexcodeTF.setText(texttolatex.getLatex());
        addpathTF.setText("");

    }//GEN-LAST:event_addpathBActionPerformed

    private void finishcodeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishcodeBActionPerformed
        // TODO add your handling code here:
        texttolatex.appendToLatex("\n\\end{document}");
        latexcodeTF.setText(texttolatex.getLatex());
        try {
            File f = new File("path.txt");
            FileWriter text = new FileWriter("latex_code.txt");
            text.write(texttolatex.getLatex());
            text.close();
            FileWriter tex = new FileWriter("latex_code.tex");
            tex.write(texttolatex.getLatex());
            tex.close();
            String texInClip = texttolatex.getLatex();
            StringSelection stringSelection = new StringSelection(texInClip);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
            setVisible(false);
            JOptionPane.showMessageDialog(null, "Files Saved at\n" +f.getAbsolutePath()+"\nCode copied to your clipboard");
            Title ttl = new Title();
            ttl.setVisible(true);
        } catch (IOException ex) {
            System.out.println(ex);
        }


    }//GEN-LAST:event_finishcodeBActionPerformed

    private void addlinkBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addlinkBActionPerformed
        // TODO add your handling code here:
        texttolatex.appendToLatex(texttolatex.linkToTex(addlinkTF.getText()));
        latexcodeTF.setText(texttolatex.getLatex());
        addlinkTF.setText("");
    }//GEN-LAST:event_addlinkBActionPerformed

    private void restartBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartBActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Title t = new Title();
        t.setVisible(true);
    }//GEN-LAST:event_restartBActionPerformed

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
            java.util.logging.Logger.getLogger(Body.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Body.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Body.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Body.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Body().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcodeB;
    private javax.swing.JLabel addcodeJL;
    private javax.swing.JButton addlinkB;
    private javax.swing.JLabel addlinkJL;
    private javax.swing.JTextArea addlinkTF;
    private javax.swing.JButton addlistB;
    private javax.swing.JLabel addlistJL;
    private javax.swing.JButton addpathB;
    private javax.swing.JLabel addpathJL;
    private javax.swing.JTextArea addpathTF;
    private javax.swing.JButton addsectionB;
    private javax.swing.JLabel addsectionJL;
    private javax.swing.JTextArea addsectionTF;
    private javax.swing.JButton addsubsectionB;
    private javax.swing.JLabel addsubsectionJL;
    private javax.swing.JTextArea addsubsectionTF;
    private javax.swing.JButton addtextB;
    private javax.swing.JLabel addtextJL;
    private javax.swing.JTextArea addtextTF;
    private javax.swing.JButton finishcodeB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel latexcodeJL;
    private javax.swing.JTextArea latexcodeTF;
    private javax.swing.JButton restartB;
    // End of variables declaration//GEN-END:variables
}