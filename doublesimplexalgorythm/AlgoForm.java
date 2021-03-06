/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package doublesimplexalgorythm;
import javax.swing.JOptionPane;

/**
 *
 * @author Mini_Mole
 */
public class AlgoForm extends javax.swing.JFrame {
    DoubleSimplex DS;
    /**
     * Creates new form AlgoForm
     */
    public AlgoForm() {
        initComponents();
        DS = new DoubleSimplex();
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
        Formulas = new javax.swing.JTextArea();
        Calc = new javax.swing.JButton();
        xField = new javax.swing.JTextField();
        yField = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Solution = new javax.swing.JTextArea();
        Save = new javax.swing.JButton();
        Load = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Formulas.setColumns(20);
        Formulas.setRows(5);
        jScrollPane1.setViewportView(Formulas);

        Calc.setText("Calculate!");
        Calc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcActionPerformed(evt);
            }
        });

        xField.setText("Rows");
        xField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xFieldMouseExited(evt);
            }
        });
        xField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xFieldActionPerformed(evt);
            }
        });

        yField.setText("Columns");
        yField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yFieldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yFieldMouseExited(evt);
            }
        });
        yField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yFieldActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setText("x");
        jTextField3.setBorder(null);
        jTextField3.setEnabled(false);
        jTextField3.setFocusable(false);
        jTextField3.setVerifyInputWhenFocusTarget(false);

        Solution.setColumns(20);
        Solution.setRows(5);
        jScrollPane2.setViewportView(Solution);

        Save.setText("Save");

        Load.setText("Load");

        jTextField1.setText("Equation");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTextField1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTextField1MouseExited(evt);
            }
        });

        jTextField2.setText("# vars");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(yField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 51, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(xField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(jTextField1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(Calc)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(Load))
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 157, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(Save)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 156, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(13, 13, 13)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(xField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(yField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jScrollPane2)
                    .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Calc)
                    .add(Save)
                    .add(Load))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcActionPerformed
        try{
        DS.Calculate(Formulas.getText(),jTextField1.getText(),Integer.parseInt(xField.getText()),Integer.parseInt(yField.getText()),Integer.parseInt(jTextField2.getText()));
        }catch(Exception E){
            JOptionPane.showMessageDialog(null, "Check the rows, columns and # vars boxes for input errors! ", "Error!", JOptionPane.ERROR_MESSAGE);
        }//end try/catch
        Solution.setText(DS.toString());
    }//GEN-LAST:event_CalcActionPerformed

    private void xFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xFieldActionPerformed

    private void yFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yFieldActionPerformed

    private void yFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yFieldMouseEntered
        if(this.yField.getText().equals("Columns"))
            this.yField.setText("");
    }//GEN-LAST:event_yFieldMouseEntered

    private void yFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yFieldMouseExited
        if(this.yField.getText().equals(""))
            this.yField.setText("Columns");
        
    }//GEN-LAST:event_yFieldMouseExited

    private void xFieldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xFieldMouseEntered
        if(this.xField.getText().equals("Rows"))
            this.xField.setText("");
    }//GEN-LAST:event_xFieldMouseEntered

    private void xFieldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xFieldMouseExited
        if(this.xField.getText().equals(""))
            this.xField.setText("Rows");
    }//GEN-LAST:event_xFieldMouseExited

    private void jTextField1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseEntered
        if(this.jTextField1.getText().equals("Equation"))
            this.jTextField1.setText("");
    }//GEN-LAST:event_jTextField1MouseEntered

    private void jTextField1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseExited
    if(this.jTextField1.getText().equals(""))
            this.jTextField1.setText("Equation");
    }//GEN-LAST:event_jTextField1MouseExited

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(AlgoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlgoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlgoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlgoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlgoForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calc;
    private javax.swing.JTextArea Formulas;
    private javax.swing.JButton Load;
    private javax.swing.JButton Save;
    private javax.swing.JTextArea Solution;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField xField;
    private javax.swing.JTextField yField;
    // End of variables declaration//GEN-END:variables
}
