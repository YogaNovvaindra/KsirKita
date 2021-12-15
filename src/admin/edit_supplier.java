/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import login.Config;

/**
 *
 * @author yogan
 */
public class edit_supplier extends javax.swing.JFrame {

    /**
     * Creates new form transaksi
     */
    public edit_supplier() {
        initComponents();
        load_table();
        kosong();
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
        jLabel8 = new javax.swing.JLabel();
        namaAdmin1 = new javax.swing.JLabel();
        txthp = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btn_delete = new javax.swing.JButton();
        btn_tambah = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        txtalamat = new javax.swing.JTextField();
        txtcari = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_edit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KasirKita ~ Edit Supplier");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setLayout(null);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/back_40px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1190, 60, 50, 50);

        namaAdmin1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        namaAdmin1.setForeground(new java.awt.Color(36, 36, 36));
        jPanel2.add(namaAdmin1);
        namaAdmin1.setBounds(70, 60, 160, 50);

        txthp.setBackground(new java.awt.Color(236, 236, 236));
        txthp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txthp.setForeground(new java.awt.Color(36, 36, 36));
        txthp.setBorder(null);
        txthp.setOpaque(false);
        txthp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthpKeyReleased(evt);
            }
        });
        jPanel2.add(txthp);
        txthp.setBounds(440, 290, 240, 30);

        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel18);
        jLabel18.setBounds(40, 400, 60, 50);

        jLabel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel19);
        jLabel19.setBounds(40, 180, 60, 50);

        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel20);
        jLabel20.setBounds(40, 250, 60, 50);

        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jLabel21);
        jLabel21.setBounds(40, 330, 60, 50);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/Logout_40px.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9);
        jLabel9.setBounds(220, 50, 40, 60);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(36, 36, 36));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/user_tag_25px.png"))); // NOI18N
        jLabel11.setText("ID Supplier");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(290, 140, 150, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(36, 36, 36));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/user_25px.png"))); // NOI18N
        jLabel12.setText("Nama Supplier");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(290, 190, 150, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(36, 36, 36));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/address_25px.png"))); // NOI18N
        jLabel13.setText("Alamat");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(290, 240, 150, 30);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(36, 36, 36));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/address_book_25px.png"))); // NOI18N
        jLabel14.setText("Telepon");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(290, 290, 150, 30);

        txtuser.setBackground(new java.awt.Color(236, 236, 236));
        txtuser.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtuser.setForeground(new java.awt.Color(36, 36, 36));
        txtuser.setBorder(null);
        txtuser.setOpaque(false);
        txtuser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtuserKeyReleased(evt);
            }
        });
        jPanel2.add(txtuser);
        txtuser.setBounds(440, 140, 240, 30);

        txtnama.setBackground(new java.awt.Color(236, 236, 236));
        txtnama.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtnama.setForeground(new java.awt.Color(36, 36, 36));
        txtnama.setBorder(null);
        txtnama.setOpaque(false);
        jPanel2.add(txtnama);
        txtnama.setBounds(440, 190, 240, 30);

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(720, 190, 490, 450);

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/trash_25px.png"))); // NOI18N
        btn_delete.setBorder(null);
        btn_delete.setBorderPainted(false);
        btn_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_delete.setOpaque(false);
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_delete);
        btn_delete.setBounds(620, 330, 60, 50);

        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/plus_math_25px.png"))); // NOI18N
        btn_tambah.setBorder(null);
        btn_tambah.setBorderPainted(false);
        btn_tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tambah.setOpaque(false);
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });
        jPanel2.add(btn_tambah);
        btn_tambah.setBounds(410, 330, 60, 50);

        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/clear_symbol_25px.png"))); // NOI18N
        btn_clear.setBorder(null);
        btn_clear.setBorderPainted(false);
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.setOpaque(false);
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel2.add(btn_clear);
        btn_clear.setBounds(550, 330, 60, 50);

        txtalamat.setBackground(new java.awt.Color(236, 236, 236));
        txtalamat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtalamat.setForeground(new java.awt.Color(36, 36, 36));
        txtalamat.setBorder(null);
        txtalamat.setOpaque(false);
        jPanel2.add(txtalamat);
        txtalamat.setBounds(440, 240, 240, 30);

        txtcari.setBackground(new java.awt.Color(236, 236, 236));
        txtcari.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtcari.setForeground(new java.awt.Color(36, 36, 36));
        txtcari.setBorder(null);
        txtcari.setOpaque(false);
        txtcari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcariActionPerformed(evt);
            }
        });
        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcariKeyPressed(evt);
            }
        });
        jPanel2.add(txtcari);
        txtcari.setBounds(930, 140, 260, 30);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 36, 36));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/search_25px.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(1190, 140, 30, 30);

        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/edit_25px.png"))); // NOI18N
        btn_edit.setBorder(null);
        btn_edit.setBorderPainted(false);
        btn_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_edit.setOpaque(false);
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel2.add(btn_edit);
        btn_edit.setBounds(480, 330, 60, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/sup_admin.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        if (txtuser.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "pilih dahulu data yang ingin dihapus");
        } else {
        try {
            String sql ="DELETE FROM supplier where id_supplier='"+txtuser.getText()+"'";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(this, "Data Supplier dengan ID "+txtuser.getText()+" berhasil dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        load_table();
        kosong();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        // TODO add your handling code here:
        if (txtuser.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Masukkan ID Supplier terlebih dahulu");
        } else { 
            String hp=txthp.getText();
        if (hp.matches("^[0-9]*") && hp.length()==12){
        
        try {
            String sql = "INSERT INTO supplier VALUES ('"+txtuser.getText()+"','"
                     +txtnama.getText()+"','"+txtalamat.getText()+"','"+
                    txthp.getText()+"')";         
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Supplier dengan ID "+txtuser.getText()+" berhasil disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } 
        load_table();
        kosong();
        } else {
            JOptionPane.showMessageDialog(null, "Nomor Telepon salah");
        }
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        kosong();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        admin.menu_admin namaAdmin = new admin.menu_admin();
        namaAdmin.nama_admin.setText(namaAdmin1.getText());
        namaAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin Keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new login.login().setVisible(true);
        } else if (response == JOptionPane.NO_OPTION) {
            
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        admin.edit_user namaAdmin = new admin.edit_user();
        namaAdmin.namaAdmin1.setText(namaAdmin1.getText());
        namaAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        admin.edit_barang namaAdmin = new admin.edit_barang();
        namaAdmin.namaAdmin1.setText(namaAdmin1.getText());
        namaAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        admin.riwayat_admin namaAdmin = new admin.riwayat_admin();
        namaAdmin.namaAdmin1.setText(namaAdmin1.getText());
        namaAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void txtcariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();
    
    model.addColumn("No");
    model.addColumn("ID Supplier");
    model.addColumn("Nama");
    model.addColumn("Alamat");
    model.addColumn("No. Hp");

    
    try {
        int no=1;
        String sql = "SELECT * from supplier where nama_supplier like '%" + txtcari.getText() + "%'"  ;
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while(res.next()){
            model.addRow (new Object[] {no++,res.getString(1),
                res.getString(2),res.getString(3),res.getString(4)
            });
        }
        jTable1.setModel(model);
    } catch (Exception e) {
        
    }
    tablestyle();
    }//GEN-LAST:event_txtcariKeyPressed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        if (txtuser.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "pilih dahulu data yang ingin diubah");
        } else { 
            String hp=txthp.getText();
        if (hp.matches("^[0-9]*") && hp.length()==12){
        try {
            String sql ="UPDATE supplier "
            + "SET nama_supplier = '"+txtnama.getText()+"', alamat_supplier = '"
            +txtalamat.getText()+"', telp_supplier = '"
            +txthp.getText()
            +"' WHERE supplier.id_supplier = '"+txtuser.getText()+"'";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Supplier dengan ID "+txtuser.getText()+" berhasil diubah");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data gagal " +e.getMessage());
        }
        load_table();
        kosong();
        } else {
            JOptionPane.showMessageDialog(null, "Nomor Telepon salah");
        }
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String id = jTable1.getValueAt(baris, 1).toString();
        txtuser.setText(id);
        txtuser.disable();
        if (jTable1.getValueAt(baris, 2)==null) {
            txtnama.setText("");
        } else {
            txtnama.setText(jTable1.getValueAt(baris, 2).toString());
        }
        if (jTable1.getValueAt(baris, 3)==null) {
            txtalamat.setText("");
        } else {
            txtalamat.setText(jTable1.getValueAt(baris, 3).toString());
        }
        if (jTable1.getValueAt(baris, 4)==null) {
            txthp.setText("");
        } else {
            txthp.setText(jTable1.getValueAt(baris, 4).toString());
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtcariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcariActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();
    
    model.addColumn("No");
    model.addColumn("ID Supplier");
    model.addColumn("Nama");
    model.addColumn("Alamat");
    model.addColumn("No. Hp");

    
    try {
        int no=1;
        String sql = "SELECT* from supplier where nama_supplier like '%" + txtcari.getText() + "%'"  ;
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while(res.next()){
            model.addRow (new Object[] {no++,res.getString(1),
                res.getString(2),res.getString(3),res.getString(4)
            });
        }
        jTable1.setModel(model);
    } catch (Exception e) {
        
    }
    }//GEN-LAST:event_txtcariActionPerformed

    private void txthpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthpKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txthpKeyReleased

    private void txtuserKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtuserKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserKeyReleased

    private void tablestyle() {
        JTableHeader style = jTable1.getTableHeader();
        jTable1.setRowHeight(25);
        TableColumn col=jTable1.getColumnModel().getColumn(0);
        col.setPreferredWidth(30);
        TableColumn col1=jTable1.getColumnModel().getColumn(1);
        col1.setPreferredWidth(100);
        TableColumn col2=jTable1.getColumnModel().getColumn(2);
        col2.setPreferredWidth(150);
        TableColumn col3=jTable1.getColumnModel().getColumn(3);
        col3.setPreferredWidth(150);
        TableColumn col4=jTable1.getColumnModel().getColumn(4);
        col4.setPreferredWidth(100);
    }
    private void load_table() {
    DefaultTableModel model = new DefaultTableModel();
    
    model.addColumn("No");
    model.addColumn("ID Supplier");
    model.addColumn("Nama");
    model.addColumn("Alamat");
    model.addColumn("No. Hp");

    
    try {
        int no=1;
        String sql = "SELECT * from supplier;";
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while(res.next()){
            model.addRow (new Object[] {no++,res.getString(1),
                res.getString(2),res.getString(3),res.getString(4)
            });
        }
        jTable1.setModel(model);
    } catch (Exception e) {
        
    }
    tablestyle();
} 
    
    private void kosong(){
    txtuser.enable();
    txtuser.setText(null);
    txtnama.setText(null);
    txtalamat.setText(null);
    txthp.setText(null);
    txtcari.setText(null);
    }
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
            java.util.logging.Logger.getLogger(edit_supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(edit_supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(edit_supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(edit_supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new edit_supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    public javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JLabel namaAdmin1;
    private javax.swing.JTextField txtalamat;
    private javax.swing.JTextField txtcari;
    private javax.swing.JTextField txthp;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
