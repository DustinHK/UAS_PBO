/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package crud;

import DB.MyConnection;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author lenovo
 */
public class crudJFrame extends javax.swing.JFrame {

    /**
     * Creates new form crudJFrame
     */
    public crudJFrame() {
        initComponents();
        loadData();
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
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbvision = new javax.swing.JComboBox<>();
        cbregion = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbweapon = new javax.swing.JComboBox<>();
        rdlaki = new javax.swing.JRadioButton();
        rdperempuan = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        simpan = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        hapus = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        ubah = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        txtidKarakter = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtIdkarakter = new javax.swing.JLabel();
        txtidkarakter = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/icons8-genshin-impact-144.png"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("GENSHIN IMPACT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap(491, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 209, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nama Karakter");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 37, -1, -1));

        jLabel2.setText("Region");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 77, -1, -1));

        cbvision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Anemo", "Geo", "Electro", "Dendro", "Hydro", "Pyro", "Cryo" }));
        jPanel2.add(cbvision, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 114, 178, -1));

        cbregion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mondstat", "Liyue", "Inazuma", "Sumeru", "Fontaine", "Natlan", "Zneznhaya" }));
        jPanel2.add(cbregion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 74, 178, -1));

        jLabel4.setText("Vision");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 117, -1, -1));

        jLabel5.setText("Gender");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 36, -1, -1));

        jLabel7.setText("Weapon");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(355, 76, -1, -1));

        cbweapon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sword", "Bow", "Claymore", "Polearm", "Catalysts" }));
        jPanel2.add(cbweapon, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 73, 212, -1));

        rdlaki.setText("Male");
        rdlaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdlakiActionPerformed(evt);
            }
        });
        jPanel2.add(rdlaki, new org.netbeans.lib.awtextra.AbsoluteConstraints(425, 34, -1, -1));

        rdperempuan.setText("Female");
        rdperempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdperempuanActionPerformed(evt);
            }
        });
        jPanel2.add(rdperempuan, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 34, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 204, -1, -1));

        simpan.setBackground(new java.awt.Color(153, 153, 153));
        simpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                simpanMouseClicked(evt);
            }
        });
        simpan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud/icons8-plus-50.png"))); // NOI18N
        simpan.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 50));

        jPanel2.add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 70, 50));

        hapus.setBackground(new java.awt.Color(153, 153, 153));
        hapus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusMouseClicked(evt);
            }
        });
        hapus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud/icons8-delete-key-50.png"))); // NOI18N
        hapus.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, -1));

        jPanel2.add(hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 70, 50));

        ubah.setBackground(new java.awt.Color(153, 153, 153));
        ubah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ubahMouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/crud/icons8-update-64.png"))); // NOI18N

        javax.swing.GroupLayout ubahLayout = new javax.swing.GroupLayout(ubah);
        ubah.setLayout(ubahLayout);
        ubahLayout.setHorizontalGroup(
            ubahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ubahLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(84, 84, 84)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ubahLayout.setVerticalGroup(
            ubahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ubahLayout.createSequentialGroup()
                .addGroup(ubahLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 60, 70));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Region", "Vision", "Gender", "Weapon", "IDchar"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 640, 340));

        txtidKarakter.setForeground(new java.awt.Color(255, 255, 255));
        txtidKarakter.setCaretColor(new java.awt.Color(255, 255, 255));
        txtidKarakter.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtidKarakter.setFocusable(false);
        txtidKarakter.setSelectionColor(new java.awt.Color(255, 255, 255));
        txtidKarakter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidKarakterActionPerformed(evt);
            }
        });
        jPanel2.add(txtidKarakter, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 0, 20, -1));
        jPanel2.add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 34, 178, -1));
        jPanel2.add(txtIdkarakter, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 30, -1, -1));
        jPanel2.add(txtidkarakter, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, -1, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        jLabel11.setText("Kembali");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 840, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdperempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdperempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdperempuanActionPerformed

    private void rdlakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdlakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdlakiActionPerformed

    private void simpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simpanMouseClicked
        // TODO add your handling code here:
    String nama = txtnama.getText();
    String region = (String) cbregion.getSelectedItem();
    String vision = (String) cbvision.getSelectedItem();
    String weapon = (String) cbweapon.getSelectedItem();
    String gender = rdlaki.isSelected() ? "Laki-laki" : "Perempuan";
    String idkarakter = txtidKarakter.getText(); // Ini adalah field tersembunyi atau tidak terlihat oleh user

    Connection con = MyConnection.getConnection();
    
    try {
        if (idkarakter.isEmpty()) {
            String query = "INSERT INTO karakter (nama, region, vision, gender, weapon) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = con.prepareStatement(query)) {
                pst.setString(1, nama);
                pst.setString(2, region);
                pst.setString(3, vision);
                pst.setString(4, gender);
                pst.setString(5, weapon);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            }
        } else {
            String query = "UPDATE karakter SET nama = ?, region = ?, vision = ?, gender = ?, weapon = ? WHERE idKarakter = ?";
            try (PreparedStatement pst = con.prepareStatement(query)) {
                pst.setString(1, nama);
                pst.setString(2, region);
                pst.setString(3, vision);
                pst.setString(4, gender);
                pst.setString(5, weapon);
                pst.setInt(6, Integer.parseInt(idkarakter));
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
            }
        }
        loadData();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data!");
    }
    }//GEN-LAST:event_simpanMouseClicked

    private void hapusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusMouseClicked
        // TODO add your handling code here:
         int row = jTable2.getSelectedRow();
    if (row == -1) {
        JOptionPane.showMessageDialog(this, "Pilih data yang akan dihapus!");
        return;
    }

    int idkarakter = (int) jTable2.getValueAt(row, 5); // Asumsi ID ada di kolom ke-6

    Connection con = MyConnection.getConnection();
    String query = "DELETE FROM karakter WHERE idKarakter = ?";
    try (PreparedStatement pst = con.prepareStatement(query)) {
        pst.setInt(1, idkarakter);
        pst.executeUpdate();
        JOptionPane.showMessageDialog(this, "Data berhasil dihapus!");
        loadData();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menghapus data!");
    }
    }//GEN-LAST:event_hapusMouseClicked

    private void ubahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubahMouseClicked
        // TODO add your handling code here:
         String nama = txtnama.getText();
    String region = (String) cbregion.getSelectedItem();
    String vision = (String) cbvision.getSelectedItem();
    String weapon = (String) cbweapon.getSelectedItem();
    String gender = rdlaki.isSelected() ? "Laki-laki" : "Perempuan";
    String idKarakter = txtidKarakter.getText(); // Ini adalah field tersembunyi atau tidak terlihat oleh user

    Connection con = MyConnection.getConnection();
    
    try {
        if (idKarakter.isEmpty()) {
            String query = "INSERT INTO karakter (nama, region, vision, gender, weapon) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = con.prepareStatement(query)) {
                pst.setString(1, nama);
                pst.setString(2, region);
                pst.setString(3, vision);
                pst.setString(4, gender);
                pst.setString(5, weapon);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            }
        } else {
            String query = "UPDATE karakter SET nama = ?, region = ?, vision = ?, gender = ?, weapon = ? WHERE idKarakter = ?";
            try (PreparedStatement pst = con.prepareStatement(query)) {
                pst.setString(1, nama);
                pst.setString(2, region);
                pst.setString(3, vision);
                pst.setString(4, gender);
                pst.setString(5, weapon);
                pst.setInt(6, Integer.parseInt(idKarakter));
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil diubah!");
            }
        }
        loadData();
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat menyimpan data!");
    }
    }//GEN-LAST:event_ubahMouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int row = jTable2.getSelectedRow();
    txtnama.setText(jTable2.getValueAt(row, 0).toString());
    cbregion.setSelectedItem(jTable2.getValueAt(row, 1).toString());
    cbvision.setSelectedItem(jTable2.getValueAt(row, 2).toString());
    if (jTable2.getValueAt(row, 3).toString().equals("Laki-laki")) {
        rdlaki.setSelected(true);
    } else {
        rdperempuan.setSelected(true);
    }
    cbweapon.setSelectedItem(jTable2.getValueAt(row, 4).toString());
    txtidKarakter.setText(jTable2.getValueAt(row, 5).toString());

         JOptionPane.showMessageDialog(this,  txtnama.getText());
    }//GEN-LAST:event_jTable2MouseClicked

    private void txtidKarakterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidKarakterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidKarakterActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        // TODO add your handling code here:
        HomeAD.HomeADJFrame obj = new HomeAD.HomeADJFrame();
        obj.show();
    }//GEN-LAST:event_jPanel5MouseClicked
private void loadData() {
    Connection con = MyConnection.getConnection();
    String query = "SELECT * FROM karakter";
    try (PreparedStatement pst = con.prepareStatement(query);
         ResultSet rs = pst.executeQuery()) {
        
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
        
        while (rs.next()) {
            Object[] row = {
                rs.getString("nama"),
                rs.getString("region"),
                rs.getString("vision"),
                rs.getString("gender"),
                rs.getString("weapon"),
                rs.getInt("idKarakter")
            };
            model.addRow(row);
        }
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat memuat data!");
    }
}
    /**
     * @e arguments
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
            java.util.logging.Logger.getLogger(crudJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(crudJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(crudJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(crudJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new crudJFrame().setVisible(true);
                
            }
        });
    }
  


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbregion;
    private javax.swing.JComboBox<String> cbvision;
    private javax.swing.JComboBox<String> cbweapon;
    private javax.swing.JPanel hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JRadioButton rdlaki;
    private javax.swing.JRadioButton rdperempuan;
    private javax.swing.JPanel simpan;
    private javax.swing.JLabel txtIdkarakter;
    private javax.swing.JTextField txtidKarakter;
    private javax.swing.JLabel txtidkarakter;
    private javax.swing.JTextField txtnama;
    private javax.swing.JPanel ubah;
    // End of variables declaration//GEN-END:variables
}
