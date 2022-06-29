/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ConstrollerMenuEdit;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author LOTUS COMPUTER
 */
public class FormManajemenMenu extends javax.swing.JFrame {
    ConstrollerMenuEdit ce;
    /**
     * Creates new form FormManajemenMenu
     */
    public FormManajemenMenu() {
        initComponents();
        
        txtId.setEditable(false);
        txtId.setEnabled(false);
        
        ce = new ConstrollerMenuEdit(this);
        ce.isiTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnPerbarui = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtHarga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEdit = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(594, 537));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit menu");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 6, -1, -1));

        txtId.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 47, 154, -1));

        jLabel2.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 52, 32, -1));

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 92, -1, -1));

        jLabel4.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Stok");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 133, -1, -1));

        txtStok.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 128, 154, -1));

        txtNama.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 87, 154, -1));

        btnHapus.setBackground(new java.awt.Color(255, 0, 51));
        btnHapus.setFont(new java.awt.Font("Adobe Hebrew", 3, 14)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(255, 255, 255));
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 96, -1));

        btnTambah.setBackground(new java.awt.Color(0, 102, 255));
        btnTambah.setFont(new java.awt.Font("Adobe Hebrew", 3, 14)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 96, -1));

        btnPerbarui.setBackground(new java.awt.Color(0, 204, 0));
        btnPerbarui.setFont(new java.awt.Font("Adobe Hebrew", 3, 14)); // NOI18N
        btnPerbarui.setForeground(new java.awt.Color(255, 255, 255));
        btnPerbarui.setText("Perbarui");
        btnPerbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerbaruiActionPerformed(evt);
            }
        });
        getContentPane().add(btnPerbarui, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 96, -1));

        btnBatal.setBackground(new java.awt.Color(255, 51, 102));
        btnBatal.setFont(new java.awt.Font("Adobe Hebrew", 3, 14)); // NOI18N
        btnBatal.setForeground(new java.awt.Color(255, 255, 255));
        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });
        getContentPane().add(btnBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 96, -1));

        jLabel5.setFont(new java.awt.Font("Trajan Pro", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Harga");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 174, -1, -1));

        txtHarga.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 169, 154, -1));

        tblEdit.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEditMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEdit);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 210, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wallpaperbetter.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        ce.delete();
        ce.isiTable();
        ce.reset();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        ce.insert();
        ce.isiTable();
        ce.reset();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnPerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerbaruiActionPerformed
        // TODO add your handling code here:
        ce.update();
        ce.isiTable();
        ce.reset();
    }//GEN-LAST:event_btnPerbaruiActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        FormMenu fm = new FormMenu();
        fm.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void tblEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEditMouseClicked
        // TODO add your handling code here:
        ce.isiField(tblEdit.getSelectedRow());
    }//GEN-LAST:event_tblEditMouseClicked

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
            java.util.logging.Logger.getLogger(FormManajemenMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormManajemenMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormManajemenMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormManajemenMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormManajemenMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnPerbarui;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEdit;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnBatal() {
        return btnBatal;
    }

    public void setBtnBatal(JButton btnBatal) {
        this.btnBatal = btnBatal;
    }

    public JButton getBtnHapus() {
        return btnHapus;
    }

    public void setBtnHapus(JButton btnHapus) {
        this.btnHapus = btnHapus;
    }

    public JButton getBtnPerbarui() {
        return btnPerbarui;
    }

    public void setBtnPerbarui(JButton btnPerbarui) {
        this.btnPerbarui = btnPerbarui;
    }

    public JButton getBtnTambah() {
        return btnTambah;
    }

    public void setBtnTambah(JButton btnTambah) {
        this.btnTambah = btnTambah;
    }

    public JTable getTblEdit() {
        return tblEdit;
    }

    public void setTblEdit(JTable tblEdit) {
        this.tblEdit = tblEdit;
    }

    public JTextField getTxtHarga() {
        return txtHarga;
    }

    public void setTxtHarga(JTextField txtHarga) {
        this.txtHarga = txtHarga;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public void setTxtNama(JTextField txtNama) {
        this.txtNama = txtNama;
    }

    public JTextField getTxtStok() {
        return txtStok;
    }

    public void setTxtStok(JTextField txtStok) {
        this.txtStok = txtStok;
    }


}
