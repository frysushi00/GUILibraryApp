package com.mycompany.projekakhirperpustakaan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import javax.swing.ImageIcon;
import java.net.URL;
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        uname_label.setText("adminPerpusTeknikUR");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void setButtonIcons() {
        dataBuku_btn.setIcon(loadImageIcon("book.png"));
        dataPeminjam_btn.setIcon(loadImageIcon("people.png"));
        dataPeminjaman_btn.setIcon(loadImageIcon("folder.png"));
    }
    private ImageIcon loadImageIcon(String iconName) {
    try {
        String path = "/com/mycompany/projekakhirperpustakaan/icon/" + iconName;
        URL imageUrl = getClass().getResource(path);
        if (imageUrl != null) {
            return new ImageIcon(imageUrl);
        } else {
            System.err.println("Image not found: " + path);
            return null;
        }
    } catch (Exception e) {
        System.err.println("Error loading image: " + e.getMessage());
        return null;
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dataBuku_btn = new javax.swing.JButton();
        uname_label = new javax.swing.JLabel();
        dataPeminjam_btn = new javax.swing.JButton();
        dataPeminjaman_btn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 127));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(106, 255, 127));
        jLabel1.setText("Halo, ");

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pilih Operasi yang Diinginkan !");

        dataBuku_btn.setBackground(new java.awt.Color(106, 255, 127));
        dataBuku_btn.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        dataBuku_btn.setForeground(new java.awt.Color(0, 0, 126));
        dataBuku_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\book.png")); // NOI18N
        dataBuku_btn.setText("Data Buku");
        dataBuku_btn.setIconTextGap(8);
        dataBuku_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataBuku_btnActionPerformed(evt);
            }
        });

        uname_label.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        uname_label.setForeground(new java.awt.Color(106, 255, 127));

        dataPeminjam_btn.setBackground(new java.awt.Color(106, 255, 127));
        dataPeminjam_btn.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        dataPeminjam_btn.setForeground(new java.awt.Color(0, 0, 126));
        dataPeminjam_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\people.png")); // NOI18N
        dataPeminjam_btn.setText("Data Anggota");
        dataPeminjam_btn.setIconTextGap(8);
        dataPeminjam_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPeminjam_btnActionPerformed(evt);
            }
        });

        dataPeminjaman_btn.setBackground(new java.awt.Color(106, 255, 127));
        dataPeminjaman_btn.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        dataPeminjaman_btn.setForeground(new java.awt.Color(0, 0, 126));
        dataPeminjaman_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\folder.png")); // NOI18N
        dataPeminjaman_btn.setText("Data Peminjaman");
        dataPeminjaman_btn.setIconTextGap(8);
        dataPeminjaman_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataPeminjaman_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dataPeminjam_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataPeminjaman_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dataBuku_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addComponent(uname_label, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uname_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addComponent(dataBuku_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(dataPeminjam_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(dataPeminjaman_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        jPanel2.setBackground(new java.awt.Color(106, 255, 127));

        jLabel6.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 126));
        jLabel6.setText("BERANDA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(147, 147, 147))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   
    private void dataBuku_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataBuku_btnActionPerformed
        dispose();
        setButtonIcons();
        PinjamBuku pj = new PinjamBuku();
        pj.setVisible(true);
        pj.pack();
        pj.setLocationRelativeTo(null);
        pj.setDefaultCloseOperation(pj.EXIT_ON_CLOSE);
    }//GEN-LAST:event_dataBuku_btnActionPerformed

    private void dataPeminjam_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPeminjam_btnActionPerformed
        dispose();
        setButtonIcons();
        DataPeminjam orang = new DataPeminjam();
        orang.setVisible(true);
        orang.pack();
        orang.setLocationRelativeTo(null);
        orang.setDefaultCloseOperation(orang.EXIT_ON_CLOSE);
    }//GEN-LAST:event_dataPeminjam_btnActionPerformed

    private void dataPeminjaman_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataPeminjaman_btnActionPerformed
        dispose();
        setButtonIcons();
        DataPeminjaman peminjaman = new DataPeminjaman();
        peminjaman.setVisible(true);
        peminjaman.pack();
        peminjaman.setLocationRelativeTo(null);
        peminjaman.setDefaultCloseOperation(peminjaman.EXIT_ON_CLOSE);
    }//GEN-LAST:event_dataPeminjaman_btnActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dataBuku_btn;
    private javax.swing.JButton dataPeminjam_btn;
    private javax.swing.JButton dataPeminjaman_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel uname_label;
    // End of variables declaration//GEN-END:variables
}
