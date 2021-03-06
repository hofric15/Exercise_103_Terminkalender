/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Terminkalender;

import javax.swing.JDialog;

/**
 *
 * @author Richard Hofmeister
 */
public class AppointmentGUI extends javax.swing.JFrame {

    /**
     * Creates new form AppointmentGUI
     */
    
    AppointmentModell apm = new AppointmentModell();
    AppointmentDlg dlg = new AppointmentDlg(this, true);
    
    public AppointmentGUI() {
        initComponents();
        jList1.setModel(apm);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        jMenuItem1.setText("hinzufügen");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onAdd(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setText("löschen");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onDelete(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setText("ändern");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onChange(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("termine");

        jList1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onAdd(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onAdd
        dlg.setVisible(true);
        Appointment apt = dlg.getApt();
        apm.add(apt);
    }//GEN-LAST:event_onAdd

    private void onDelete(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onDelete
        int index = jList1.getSelectedIndex();
        apm.remove(index);
    }//GEN-LAST:event_onDelete

    private void onChange(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onChange
        int index = jList1.getSelectedIndex();
        dlg.showAppointment((Appointment)apm.getElementAt(index));
        dlg.setVisible(true);   
        Appointment aptReturned = dlg.getApt();
        Appointment apt = (Appointment)apm.getElementAt(index);
        apm.change(apt, aptReturned);
    }//GEN-LAST:event_onChange

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
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<Appointment> jList1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
