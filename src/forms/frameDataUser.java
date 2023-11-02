/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;
import database.koneksi;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Asus
 */
public class frameDataUser extends javax.swing.JFrame {
    
    koneksi objekku;
    DefaultTableModel modelTabelDataUser;

    /**
     * Creates new form frameDataUser
     */
    public frameDataUser() {
        initComponents();
        this.setLocationRelativeTo(null);
        objekku = new koneksi();
        modelTabelDataUser = new DefaultTableModel();
        jTableDataUser.setModel(modelTabelDataUser);
        modelTabelDataUser.addColumn("ID User");
        modelTabelDataUser.addColumn("Username");
        modelTabelDataUser.addColumn("Password");
        modelTabelDataUser.addColumn("Hak Akses");
        modelTabelDataUser.addColumn("E-mail");
        modelTabelDataUser.addColumn("Aktif");
        loadTabelDataUser();
    }
    
    void loadTabelDataUser(){
        try {
            String sql = "SELECT * FROM tbl_datauser";
            PreparedStatement kueri = objekku.konekDB.prepareStatement(sql);
            ResultSet data = kueri.executeQuery();
            
            while (data.next()) {
                Object[] baris = new Object[6];
                baris[0] = data.getString("id_user");
                baris[1] = data.getString("username");
                baris[2] = data.getString("password");
                baris[3] = data.getString("hak_akses");
                baris[4] = data.getString("email");
                baris[5] = data.getString("aktif");
                
                modelTabelDataUser.addRow(baris);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIDUser = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtHakAkses = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAktif = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDataUser = new javax.swing.JTable();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Data User");

        jLabel2.setText("ID User");

        jLabel3.setText("Username");

        jLabel4.setText("Password");

        jLabel5.setText("Hak Akses");

        jLabel6.setText("E-mail");

        jLabel7.setText("Aktif");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jTableDataUser.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableDataUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableDataUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableDataUser);

        btnSimpan.setText("SIMPAN");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("UBAH");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAktif, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtHakAkses, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnSimpan)
                        .addGap(18, 18, 18)
                        .addComponent(btnUbah)
                        .addGap(18, 18, 18)
                        .addComponent(btnHapus)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAktif, txtEmail, txtHakAkses, txtIDUser, txtPassword, txtUsername});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtIDUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtHakAkses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtAktif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan)
                            .addComponent(btnUbah)
                            .addComponent(btnHapus))))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
        try {
            if (txtIDUser.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Id User Belum Diisi");
                txtIDUser.requestFocus();
            } else if 
               (txtUsername.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Username Belum Diisi");
                txtUsername.requestFocus();
            } else if 
               (txtPassword.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Password Belum Diisi");
                txtPassword.requestFocus();
            } else if 
               (txtHakAkses.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Hak Akses Belum Diisi");
                txtHakAkses.requestFocus();
            } else if 
               (txtEmail.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "E-mail Belum Diisi");
                txtEmail.requestFocus();
            } else if 
               (txtAktif.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Aktif Belum Diisi");
                txtAktif.requestFocus();
            } else {
                String sqlCari = "SELECT * FROM tbl_datauser WHERE id_user = ?";
                PreparedStatement cari = objekku.konekDB.prepareStatement(sqlCari);
                cari.setString(1, txtIDUser.getText());
                ResultSet hasil = cari.executeQuery();
                
                if (hasil.next()) {
                JOptionPane.showMessageDialog(this, "ID User Sudah Ada");
                txtUsername.setText(hasil.getString("username"));
                txtPassword.setText(hasil.getString("password"));
                txtHakAkses.setText(hasil.getString("hak_akses"));
                txtEmail.setText(hasil.getString("email"));
                txtAktif.setText(hasil.getString("aktif"));
                } else {
                
                String sqlSimpan = "INSERT INTO tbl_datauser VALUES (?,?,?,?,?,?)";
                PreparedStatement kueri = objekku.konekDB.prepareStatement(sqlSimpan);
                
                kueri.setString(1, txtIDUser.getText());
                kueri.setString(2, txtUsername.getText());
                kueri.setString(3, txtPassword.getText());
                kueri.setString(4, txtHakAkses.getText());
                kueri.setString(5, txtEmail.getText());
                kueri.setString(6, txtAktif.getText());
                
                kueri.executeUpdate();
                loadTabelDataUser();
                
                JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        } 
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
        try {
            String sqlUbah = "UPDATE tbl_datauser SET username=?, password=?, hak_akses=?, email=?, aktif=? WHERE id_user=?";
            
            PreparedStatement kueri = objekku.konekDB.prepareStatement(sqlUbah);
            
            kueri.setString(6, txtIDUser.getText());
            kueri.setString(1, txtUsername.getText());
            kueri.setString(2, txtPassword.getText());
            kueri.setString(3, txtHakAkses.getText());
            kueri.setString(4, txtEmail.getText());
            kueri.setString(5, txtAktif.getText());
            
            kueri.executeUpdate();
            loadTabelDataUser();
                
            JOptionPane.showMessageDialog(this, "Data Berhasil Diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            String sqlHapus = "DELETE FROM tbl_datauser WHERE id_user = ?";
            PreparedStatement kueri = objekku.konekDB.prepareStatement(sqlHapus);
        
            kueri.setString(1, txtIDUser.getText());
            
            kueri.executeUpdate();
            loadTabelDataUser();
            
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void jTableDataUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableDataUserMouseClicked
        // TODO add your handling code here:
        int i = jTableDataUser.getSelectedRow();
       
       String id_user = jTableDataUser.getValueAt(i, 0).toString();
       String username = jTableDataUser.getValueAt(i, 1).toString();
       String password = jTableDataUser.getValueAt(i, 2).toString();
       String hak_akses = jTableDataUser.getValueAt(i, 3).toString();
       String email = jTableDataUser.getValueAt(i, 4).toString();
       String aktif = jTableDataUser.getValueAt(i, 5).toString();
       
       txtIDUser.setText(id_user);
       txtUsername.setText(username);
       txtPassword.setText(password);
       txtHakAkses.setText(hak_akses);
       txtEmail.setText(email);
       txtAktif.setText(aktif);
    }//GEN-LAST:event_jTableDataUserMouseClicked

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
            java.util.logging.Logger.getLogger(frameDataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameDataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameDataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameDataUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameDataUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDataUser;
    private javax.swing.JTextField txtAktif;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtHakAkses;
    private javax.swing.JTextField txtIDUser;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
