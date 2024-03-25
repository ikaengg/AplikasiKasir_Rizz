/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package appkasir_ujikom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author OWNER
 */
public class FormLaporanTrans extends javax.swing.JFrame {
Connection konek;
PreparedStatement pst;
ResultSet rst;
String tanggal,tanggal2,sql;
    /**
     * Creates new form FormLaporanTrans
     */
    public FormLaporanTrans() {
        initComponents();
        konek = Koneksi.koneksidb();
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
        jTextField1 = new javax.swing.JTextField();
        SebelumTgl = new com.toedter.calendar.JDateChooser();
        DariTgl = new com.toedter.calendar.JDateChooser();
        SetelahTgl = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDataProduk = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        SesudahTgl = new com.toedter.calendar.JDateChooser();
        btnCari = new javax.swing.JButton();
        btnCarii = new javax.swing.JButton();
        btnCariii = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLapTrans = new javax.swing.JTable();
        btnKeluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Laporan Transaksi");
        getContentPane().setLayout(null);
        getContentPane().add(SebelumTgl);
        SebelumTgl.setBounds(130, 20, 120, 22);
        getContentPane().add(DariTgl);
        DariTgl.setBounds(130, 50, 120, 22);
        getContentPane().add(SetelahTgl);
        SetelahTgl.setBounds(130, 80, 120, 22);

        jLabel3.setText("Before Date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 20, 61, 16);

        tblDataProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DetailID", "ProdukID", "Harga", "JumlahProduk", "Subtotal"
            }
        ));
        tblDataProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataProdukMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDataProduk);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(50, 280, 452, 110);

        jLabel4.setText("Take On");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 50, 50, 16);

        jLabel5.setText("After Date");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 80, 53, 16);

        jLabel6.setText("S/D");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(280, 50, 20, 16);
        getContentPane().add(SesudahTgl);
        SesudahTgl.setBounds(310, 50, 110, 22);

        btnCari.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\icons8-search-15.png")); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari);
        btnCari.setBounds(440, 20, 72, 23);

        btnCarii.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\icons8-search-15.png")); // NOI18N
        btnCarii.setText("Cari");
        btnCarii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariiActionPerformed(evt);
            }
        });
        getContentPane().add(btnCarii);
        btnCarii.setBounds(440, 50, 72, 23);

        btnCariii.setIcon(new javax.swing.ImageIcon("C:\\Users\\OWNER\\Downloads\\icons8-search-15.png")); // NOI18N
        btnCariii.setText("Cari");
        btnCariii.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariiiActionPerformed(evt);
            }
        });
        getContentPane().add(btnCariii);
        btnCariii.setBounds(440, 80, 72, 23);

        tblLapTrans.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PenjualanID", "DetailID", "TanggalPenjualan", "JamPenjualan", "TotalHarga"
            }
        ));
        tblLapTrans.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLapTransMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblLapTrans);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(50, 150, 452, 110);

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        getContentPane().add(btnKeluar);
        btnKeluar.setBounds(440, 110, 70, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Desktop - 1 (7).png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 560, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
try {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    tanggal = format.format(SebelumTgl.getDate());
    sql = "select * from Penjualan where TanggalPenjualan < '"+tanggal+"' ";
    pst = konek.prepareStatement(sql) ;
    rst = pst.executeQuery();
    tblLapTrans.setModel (DbUtils.resultSetToTableModel(rst));
} catch (Exception e) {
    JOptionPane.showMessageDialog(null,"Data Tidak Tampil");
}
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnCariiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariiActionPerformed
try {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    tanggal = format.format(DariTgl.getDate());
    tanggal = format.format(SesudahTgl.getDate());
    sql = "select * from Penjualan where TanggalPenjualan between '"+tanggal+"' and '"+tanggal2+"' ";
    pst = konek.prepareStatement(sql) ;
    rst = pst.executeQuery();
    tblLapTrans.setModel (DbUtils.resultSetToTableModel(rst));
} catch (Exception e) {
    JOptionPane.showMessageDialog(null,"Data Tidak Tampil");
}
    }//GEN-LAST:event_btnCariiActionPerformed

    private void btnCariiiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariiiActionPerformed
try {
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    tanggal = format.format(SetelahTgl.getDate());
    sql = "select * from Penjualan where TanggalPenjualan > '"+tanggal+"' ";
    pst = konek.prepareStatement(sql) ;
    rst = pst.executeQuery();
    tblLapTrans.setModel (DbUtils.resultSetToTableModel(rst));
} catch (Exception e) {
    JOptionPane.showMessageDialog(null,"Data Tidak Tampil");
}
    }//GEN-LAST:event_btnCariiiActionPerformed

    private void tblLapTransMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLapTransMouseClicked
try{
    int row = tblLapTrans.getSelectedRow();
    String tabelKlik = (tblLapTrans.getModel().getValueAt(row, 1).toString());
    String sql = "select * from detailpenjualan where DetailId";
    pst = konek.prepareStatement(sql);
    pst.setString(1, tabelKlik);
    rst = pst.executeQuery();
    tblDataProduk.setModel(DbUtils.resultSetToTableModel(rst));
}catch (Exception e){
    JOptionPane.showMessageDialog(null, e);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_tblLapTransMouseClicked

    private void tblDataProdukMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataProdukMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblDataProdukMouseClicked

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(FormLaporanTrans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLaporanTrans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLaporanTrans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLaporanTrans.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLaporanTrans().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DariTgl;
    private com.toedter.calendar.JDateChooser SebelumTgl;
    private com.toedter.calendar.JDateChooser SesudahTgl;
    private com.toedter.calendar.JDateChooser SetelahTgl;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnCarii;
    private javax.swing.JButton btnCariii;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblDataProduk;
    private javax.swing.JTable tblLapTrans;
    // End of variables declaration//GEN-END:variables
}