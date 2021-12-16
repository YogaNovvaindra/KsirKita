/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import login.Config;

/**
 *
 * @author yogan
 */
public class Statistik extends javax.swing.JFrame {

    /**
     * Creates new form transaksi
     */
    public Statistik() {
        initComponents();
        load_table();
        txtcaritrans.setVisible(false);
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
        btn_phone = new javax.swing.JButton();
        uangjml = new javax.swing.JLabel();
        transjml = new javax.swing.JLabel();
        tipisjml = new javax.swing.JLabel();
        barangjml = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namakasir = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtcaritrans = new javax.swing.JTextField();
        txtcaribrg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        kd_bar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KasirKita ~ Statistik");
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setResizable(false);

        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setLayout(null);

        btn_phone.setBackground(new java.awt.Color(255, 255, 255));
        btn_phone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_phone.setForeground(new java.awt.Color(36, 36, 36));
        btn_phone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/phone_25px.png"))); // NOI18N
        btn_phone.setBorder(null);
        btn_phone.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_phone.setOpaque(false);
        btn_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_phoneActionPerformed(evt);
            }
        });
        jPanel2.add(btn_phone);
        btn_phone.setBounds(320, 130, 60, 40);

        uangjml.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        uangjml.setForeground(new java.awt.Color(72, 72, 72));
        uangjml.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        uangjml.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                uangjmlAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        uangjml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uangjmlMouseClicked(evt);
            }
        });
        jPanel2.add(uangjml);
        uangjml.setBounds(920, 320, 200, 50);

        transjml.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        transjml.setForeground(new java.awt.Color(72, 72, 72));
        transjml.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        transjml.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                transjmlAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        transjml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transjmlMouseClicked(evt);
            }
        });
        jPanel2.add(transjml);
        transjml.setBounds(920, 180, 100, 60);

        tipisjml.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        tipisjml.setForeground(new java.awt.Color(72, 72, 72));
        tipisjml.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tipisjml.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tipisjmlAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tipisjml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tipisjmlMouseClicked(evt);
            }
        });
        jPanel2.add(tipisjml);
        tipisjml.setBounds(920, 580, 140, 60);

        barangjml.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        barangjml.setForeground(new java.awt.Color(72, 72, 72));
        barangjml.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barangjml.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                barangjmlAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        barangjml.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                barangjmlMouseClicked(evt);
            }
        });
        jPanel2.add(barangjml);
        barangjml.setBounds(920, 450, 120, 60);

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(72, 72, 72));
        jLabel15.setText("Stok Barang Menipis");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(920, 540, 220, 26);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 75)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(33, 146, 51));
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/error_75px.png"))); // NOI18N
        jPanel2.add(jLabel16);
        jLabel16.setBounds(1110, 570, 80, 70);

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(72, 72, 72));
        jLabel12.setText("Jumlah Barang");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(920, 410, 200, 26);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 75)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(33, 146, 51));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/new_product_75px.png"))); // NOI18N
        jPanel2.add(jLabel13);
        jLabel13.setBounds(1110, 440, 80, 70);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(72, 72, 72));
        jLabel6.setText("Pendapatan Hari ini");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(920, 270, 200, 26);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 75)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(33, 146, 51));
        jLabel10.setText("$");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(1130, 290, 60, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/checkout_75px.png"))); // NOI18N
        jPanel2.add(jLabel4);
        jLabel4.setBounds(1110, 180, 70, 60);

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(72, 72, 72));
        jLabel2.setText("Transaksi Hari ini");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(920, 140, 180, 26);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/back_40px.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8);
        jLabel8.setBounds(1190, 60, 50, 50);

        namakasir.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        namakasir.setForeground(new java.awt.Color(36, 36, 36));
        namakasir.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                namakasirAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel2.add(namakasir);
        namakasir.setBounds(70, 60, 140, 50);

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
        jLabel9.setBounds(220, 60, 40, 50);

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
        jScrollPane1.setBounds(320, 180, 540, 470);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(36, 36, 36));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/search_25px.png"))); // NOI18N
        jPanel2.add(jLabel7);
        jLabel7.setBounds(830, 140, 30, 30);

        txtcaritrans.setBackground(new java.awt.Color(236, 236, 236));
        txtcaritrans.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtcaritrans.setForeground(new java.awt.Color(36, 36, 36));
        txtcaritrans.setBorder(null);
        txtcaritrans.setOpaque(false);
        txtcaritrans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcaritransKeyPressed(evt);
            }
        });
        jPanel2.add(txtcaritrans);
        txtcaritrans.setBounds(580, 140, 250, 30);

        txtcaribrg.setBackground(new java.awt.Color(236, 236, 236));
        txtcaribrg.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtcaribrg.setForeground(new java.awt.Color(36, 36, 36));
        txtcaribrg.setBorder(null);
        txtcaribrg.setOpaque(false);
        txtcaribrg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcaribrgKeyPressed(evt);
            }
        });
        jPanel2.add(txtcaribrg);
        txtcaribrg.setBounds(580, 140, 250, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/transaksibg.png"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(870, 80, 360, 233);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/lababg.png"))); // NOI18N
        jPanel2.add(jLabel5);
        jLabel5.setBounds(870, 210, 360, 233);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/barangbg.png"))); // NOI18N
        jPanel2.add(jLabel11);
        jLabel11.setBounds(870, 350, 360, 233);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/minbg.png"))); // NOI18N
        jPanel2.add(jLabel14);
        jLabel14.setBounds(870, 480, 360, 233);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/picture/statistik.png"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 1280, 720);
        jPanel2.add(kd_bar);
        kd_bar.setBounds(390, 160, 100, 20);

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

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        kasir.menu_kasir nama= new kasir.menu_kasir();
        nama.nama_kasir.setText(namakasir.getText());
         
        nama.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
//        this.setVisible(false);
        int response = JOptionPane.showConfirmDialog(this, "Apakah anda yakin ingin Keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new login.login().setVisible(true);
        } else if (response == JOptionPane.NO_OPTION) {
            
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        // TODO add your handling code here:
        kasir.transaksi nama= new kasir.transaksi();
        nama.namakasir.setText(namakasir.getText());
         
        nama.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        kasir.edit_barang nama= new kasir.edit_barang();
        nama.namakasir.setText(namakasir.getText());
         
        nama.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        // TODO add your handling code here:
        kasir.riwayat nama= new kasir.riwayat();
        nama.namakasir.setText(namakasir.getText());
         
        nama.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void txtcaribrgKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcaribrgKeyPressed
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();
    
        model.addColumn("No");
        model.addColumn("Kode Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Jumlah");
        model.addColumn("Satuan");
        model.addColumn("Harga Jual");
        model.addColumn("Harga Beli");
        model.addColumn("ID Supplier");

    
    try {
        int no=1;
        String sql = "SELECT * from barang join supplier on barang.id_sup = supplier.id_supplier "
                + "where nama_barang like '%" + txtcaribrg.getText() + "%'"  ;
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while(res.next()){
      model.addRow (new Object[] {no++,res.getString(1),
                res.getString(2),res.getString(3),res.getString(4),
                this.formatRupiah(res.getInt(5)).replace(",00", ""),this.formatRupiah(res.getInt(6)).replace(",00", "")
                    ,res.getString(7),res.getString(8)

            });
        }
        jTable1.setModel(model);
    } catch (Exception e) {
        
    }
    tablestyle();
    }//GEN-LAST:event_txtcaribrgKeyPressed

    private void namakasirAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_namakasirAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_namakasirAncestorAdded

    private void barangjmlAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_barangjmlAncestorAdded
        // TODO add your handling code here:
        try { 
            String sql = "SELECT count(id_barang) as total from barang ;";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            rs.next();
            barangjml.setText(rs.getString("total"));

            } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_barangjmlAncestorAdded

    private void tipisjmlAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tipisjmlAncestorAdded
        // TODO add your handling code here:
        try { 
            String sql = "SELECT count(id_barang) as total from barang "
                    + "where jumlah<5 ;";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            rs.next();
            tipisjml.setText(rs.getString("total"));

            } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tipisjmlAncestorAdded

    private void uangjmlAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_uangjmlAncestorAdded
        // TODO add your handling code here:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime tanggal = LocalDateTime.now();
        String a = (dtf.format(tanggal));
        try { 
            String sql = "SELECT sum(total_bayar) as total from tranksaksi "
                    + "where tanggal_tranksaksi='"+a+"' ;";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            rs.next();
            uangjml.setText(this.formatRupiah((int) rs.getDouble("total")).replace(",00", ""));

            } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_uangjmlAncestorAdded

    private void transjmlAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_transjmlAncestorAdded
        // TODO add your handling code here:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime tanggal = LocalDateTime.now();
        String a = (dtf.format(tanggal));
        try { 
            String sql = "SELECT count(id_tranksaksi) as total from tranksaksi "
                    + "where tanggal_tranksaksi='"+a+"' ;";
            java.sql.Connection conn=(Connection)Config.configDB();
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery(sql);
            rs.next();
            transjml.setText(rs.getString("total"));

            } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_transjmlAncestorAdded

    private void tipisjmlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tipisjmlMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel();
    jTable1.getColumnModel().getColumn(1).setPreferredWidth(5);
    
    model.addColumn("No");
    model.addColumn("Kode Barang");
    model.addColumn("Nama Barang");
    model.addColumn("Jumlah");
    model.addColumn("Satuan");
    
    try {
        int no=1;
        String sql = "select id_barang, nama_barang, jumlah, id_satuan from barang join supplier on barang.id_sup = supplier.id_supplier "
                + "where jumlah<5 ;";
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
    txtcaribrg.setVisible(true);
    txtcaritrans.setVisible(false);
    }//GEN-LAST:event_tipisjmlMouseClicked

    private void barangjmlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barangjmlMouseClicked
        // TODO add your handling code here:
        load_table();
        txtcaribrg.setVisible(true);
        txtcaritrans.setVisible(false);
    }//GEN-LAST:event_barangjmlMouseClicked

    private void transjmlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transjmlMouseClicked
        // TODO add your handling code here:
    load_table1();
    txtcaribrg.setVisible(false);
    txtcaritrans.setVisible(true);
    }//GEN-LAST:event_transjmlMouseClicked

    private void uangjmlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uangjmlMouseClicked
        // TODO add your handling code here:
        load_table1();
        txtcaribrg.setVisible(false);
        txtcaritrans.setVisible(true);
    }//GEN-LAST:event_uangjmlMouseClicked

    private void btn_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_phoneActionPerformed
        // TODO add your handling code here:
        if (kd_bar.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "SIlahkan pilih barang terlebih dahulu");
        } else {
        
        try {
                String sql ="select supplier.nama_supplier, supplier.telp_supplier from barang join supplier on barang.id_sup = supplier.id_supplier"
                        + " where barang.id_barang='"+kd_bar.getText()+"';";
                java.sql.Connection conn=(Connection)Config.configDB();
                java.sql.PreparedStatement pst=conn.prepareStatement(sql);
                java.sql.ResultSet rs = pst.executeQuery(sql);
                rs.next();
                String a=rs.getString("supplier.nama_supplier");
                String b=rs.getString("supplier.telp_supplier");
                
                JOptionPane.showMessageDialog(this, "Supplier "+a+", Telepon "+b);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_btn_phoneActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int baris = jTable1.rowAtPoint(evt.getPoint());
        String id = jTable1.getValueAt(baris, 1).toString();
        kd_bar.setText(id);
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtcaritransKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcaritransKeyPressed
        // TODO add your handling code here:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime tanggal = LocalDateTime.now();
        String a = (dtf.format(tanggal));
        DefaultTableModel model = new DefaultTableModel();
    
    model.addColumn("No");
    model.addColumn("No. Transaksi");
    model.addColumn("Tanggal");
    model.addColumn("Jam");
    model.addColumn("Total Bayar");
    model.addColumn("Kasir");
    model.addColumn("Pelanggan");

    
    try {
        int no=1;
        String sql = "SELECT * from tranksaksi "
                + "where tanggal_tranksaksi='"+a+"' && nama_pembeli LIKE '%"+txtcaritrans.getText()+"%' ;";
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while(res.next()){
            model.addRow (new Object[] {no++,res.getString(1),
                res.getString(2),res.getString(3), this.formatRupiah(res.getInt(4)).replace(",00", ""),
                res.getString(7),res.getString(8)
            });
        }
        jTable1.setModel(model);
    } catch (Exception e) {
        
    }
    tablestyle1();
    btn_phone.setVisible(false);
    }//GEN-LAST:event_txtcaritransKeyPressed
    private void tablestyle() {
        JTableHeader style = jTable1.getTableHeader();
        jTable1.setRowHeight(25);
        TableColumn col=jTable1.getColumnModel().getColumn(0);
        col.setPreferredWidth(50);
        TableColumn col1=jTable1.getColumnModel().getColumn(1);
        col1.setPreferredWidth(100);
        TableColumn col2=jTable1.getColumnModel().getColumn(2);
        col2.setPreferredWidth(150);
        TableColumn col3=jTable1.getColumnModel().getColumn(3);
        col3.setPreferredWidth(74);
        TableColumn col4=jTable1.getColumnModel().getColumn(4);
        col4.setPreferredWidth(50);

        
    }
    private void tablestyle1() {
        JTableHeader style = jTable1.getTableHeader();
        jTable1.setRowHeight(25);
        TableColumn col=jTable1.getColumnModel().getColumn(0);
        col.setPreferredWidth(50);
        TableColumn col1=jTable1.getColumnModel().getColumn(1);
        col1.setPreferredWidth(150);
        TableColumn col2=jTable1.getColumnModel().getColumn(2);
        col2.setPreferredWidth(150);
        TableColumn col3=jTable1.getColumnModel().getColumn(3);
        col3.setPreferredWidth(100);
        TableColumn col4=jTable1.getColumnModel().getColumn(4);
        col4.setPreferredWidth(150);
        TableColumn col5=jTable1.getColumnModel().getColumn(5);
        col5.setPreferredWidth(150);
        TableColumn col6=jTable1.getColumnModel().getColumn(6);
        col6.setPreferredWidth(150);
    }
    public void load_table() {
    DefaultTableModel model = new DefaultTableModel();
    jTable1.getColumnModel().getColumn(1).setPreferredWidth(5);
    
    model.addColumn("No");
    model.addColumn("Kode Barang");
    model.addColumn("Nama Barang");
    model.addColumn("Jumlah");
    model.addColumn("Satuan");
    
    try {
        int no=1;
        String sql = "select id_barang, nama_barang, jumlah, id_satuan from barang join supplier on barang.id_sup = supplier.id_supplier";
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
    btn_phone.setVisible(true);
}
    private void load_table1() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime tanggal = LocalDateTime.now();
        String a = (dtf.format(tanggal));
        DefaultTableModel model = new DefaultTableModel();
    
    model.addColumn("No");
    model.addColumn("No. Transaksi");
    model.addColumn("Tanggal");
    model.addColumn("Jam");
    model.addColumn("Total Bayar");
    model.addColumn("Kasir");
    model.addColumn("Pelanggan");

    
    try {
        int no=1;
        String sql = "SELECT * from tranksaksi "
                + "where tanggal_tranksaksi='"+a+"' ;";
        java.sql.Connection conn=(Connection)Config.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while(res.next()){
            model.addRow (new Object[] {no++,res.getString(1),
                res.getString(2),res.getString(3), this.formatRupiah(res.getInt(4)).replace(",00", ""),
                res.getString(7),res.getString(8)
            });
        }
        jTable1.setModel(model);
    } catch (Exception e) {
        
    }
    tablestyle1();
    btn_phone.setVisible(false);
    }
      private String formatRupiah(int value){
      DecimalFormat formater = (DecimalFormat) DecimalFormat.getCurrencyInstance();
      DecimalFormatSymbols simbol = formater.getDecimalFormatSymbols();
      
      simbol.setCurrencySymbol("Rp. ");
      simbol.setMonetaryDecimalSeparator(',');// belakang sendiri pada format rupiah
      simbol.setGroupingSeparator('.');
      formater.setDecimalFormatSymbols(simbol);
      return formater.format(value);
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
            java.util.logging.Logger.getLogger(Statistik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Statistik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Statistik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Statistik.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new Statistik().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel barangjml;
    private javax.swing.JButton btn_phone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    public javax.swing.JLabel jLabel18;
    public javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JLabel kd_bar;
    public javax.swing.JLabel namakasir;
    private javax.swing.JLabel tipisjml;
    private javax.swing.JLabel transjml;
    private javax.swing.JTextField txtcaribrg;
    private javax.swing.JTextField txtcaritrans;
    private javax.swing.JLabel uangjml;
    // End of variables declaration//GEN-END:variables
}
