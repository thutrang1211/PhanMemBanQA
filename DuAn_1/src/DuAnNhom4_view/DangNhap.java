/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package DuAnNhom4_view;


import DuAnNhom4_repository.NhanVien_repository;
import DuAnNhom4_repository.TaiKhoanAdmin_repository;
import DuAnNhom4_utility.JDBC_Helper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Dell
 */
public class DangNhap extends javax.swing.JFrame {

 

    public DangNhap() {
        initComponents();
        setLocationRelativeTo(null);

    }

    public boolean checkAll() {
        if (txtTK.getText().isEmpty() || txtMK.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập tên đăng nhập hay mật khẩu");
            return false;
        }
        return true;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTK = new javax.swing.JTextField();
        txtMK = new javax.swing.JPasswordField();
        btnDn = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        pnlCopyright = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rdoNv = new javax.swing.JRadioButton();
        rdoAmin = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");

        jLabel1.setText("Mật khẩu :");

        jLabel2.setText("Tài khoản :");

        txtTK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTKKeyPressed(evt);
            }
        });

        txtMK.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtMK.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMKKeyPressed(evt);
            }
        });

        btnDn.setBackground(new java.awt.Color(102, 102, 102));
        btnDn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnDn.setForeground(new java.awt.Color(255, 255, 255));
        btnDn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log-in.png"))); // NOI18N
        btnDn.setText("Đăng nhập");
        btnDn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDnActionPerformed(evt);
            }
        });

        btnHuy.setBackground(new java.awt.Color(102, 102, 102));
        btnHuy.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHuy.setForeground(new java.awt.Color(255, 255, 255));
        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/multiply.png"))); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Dope Store");

        pnlCopyright.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));

        jLabel3.setText("Liên hệ admin để được cấp quyền truy cập cao hơn");

        javax.swing.GroupLayout pnlCopyrightLayout = new javax.swing.GroupLayout(pnlCopyright);
        pnlCopyright.setLayout(pnlCopyrightLayout);
        pnlCopyrightLayout.setHorizontalGroup(
            pnlCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCopyrightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlCopyrightLayout.setVerticalGroup(
            pnlCopyrightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCopyrightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        buttonGroup1.add(rdoNv);
        rdoNv.setText("Nhân Viên");
        rdoNv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNvActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoAmin);
        rdoAmin.setText("Admin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(122, 122, 122))
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMK)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnDn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(rdoAmin)
                                        .addGap(55, 55, 55)
                                        .addComponent(rdoNv))
                                    .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtTK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMK, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNv)
                    .addComponent(rdoAmin))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnHuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCopyright, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDnActionPerformed

        if (checkAll()) {
            String USERNAME = txtTK.getText();
            String PASSWORD = new String(txtMK.getPassword());
            if (rdoAmin.isSelected()) {
                TaiKhoanAdmin_repository us = new TaiKhoanAdmin_repository();
                if (us.checkLogin(USERNAME, PASSWORD)) {
                    ViewQuanLy dg = new ViewQuanLy();
                    dg.setVisible(true);
                    this.dispose();
                    JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                }
            }
            if (rdoNv.isSelected()) {
                if (checkAll()) {
                    NhanVien_repository us = new NhanVien_repository();
                    if (us.checkLogin(USERNAME, PASSWORD)) {                     
                        ViewNhanVien dg = new ViewNhanVien();
                        dg.setVisible(true); 
                        this.dispose();
                        JOptionPane.showMessageDialog(this, "Đăng nhập thành công");
                    } else {
                        JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu không đúng");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnDnActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        txtMK.setText("");
        txtTK.setText("");
    }//GEN-LAST:event_btnHuyActionPerformed

    private void txtTKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTKKeyPressed

    }//GEN-LAST:event_txtTKKeyPressed

    private void txtMKKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMKKeyPressed

    }//GEN-LAST:event_txtMKKeyPressed

    private void rdoNvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNvActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDn;
    private javax.swing.JButton btnHuy;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pnlCopyright;
    private javax.swing.JRadioButton rdoAmin;
    private javax.swing.JRadioButton rdoNv;
    private javax.swing.JPasswordField txtMK;
    private javax.swing.JTextField txtTK;
    // End of variables declaration//GEN-END:variables
}
