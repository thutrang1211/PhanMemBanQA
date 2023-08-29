/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DuAnNhom4_view;

import DuAnNhom4_model.LoaiSanPham;
import DuAnNhom4_model.MauSac;
import DuAnNhom4_model.NhanVien;
import DuAnNhom4_model.Size;
import DuAnNhom4_model.ThuongHieu;
import DuAnNhom4_repository.LoaiSanPham_repository;
import DuAnNhom4_repository.MauSac_repository;
import DuAnNhom4_repository.NhanVien_repository;
import DuAnNhom4_repository.SanPhamChiTiet_repository;
import DuAnNhom4_repository.Size_repository;
import DuAnNhom4_repository.ThuongHieu_repository;
import DuAnNhom4_service.Imp.LoaiSanPham_sevrice;
import DuAnNhom4_viewmodel.SanPhamChiTiet;
import MyCostom.MyDialog;
import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Dell
 */
public class ViewBanHang extends javax.swing.JPanel implements Runnable, ThreadFactory {

    private WebcamPanel panel = null;
    private Webcam webcam = null;
    private static final long serialVersionUID = 6441489157408381878L;
    private Executor executor = Executors.newSingleThreadExecutor(this);

    List<SanPhamChiTiet> listvSP;
    DefaultTableModel mol;
    List<LoaiSanPham> listLoaiSP;
    // SimpleDateFormat formatter = new SimpleDateFormat(pattern);
    int index;
    String strHinhAnh = null;
    SanPhamChiTiet_repository vspsv = new SanPhamChiTiet_repository();
//vSanPham_repository SP2 = new vSanPham_repository();
    private ThuongHieu_repository th;
    private MauSac_repository ms;
    private Size_repository s;
    private LoaiSanPham_repository l;

    public ViewBanHang() {
        initComponents();
      
        loadDataTableSanPhamBan();
        loadDataComboboxLoaiBanSP();
        loadDataComboboxNhanVienBan();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtDonGia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        spnSoLuong = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        cboNhanVien = new javax.swing.JComboBox<>();
        cboLoaiSP = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMaSP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtIDSP = new javax.swing.JTextField();
        lblHinhAnhSP = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenSP1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnXuatHoaDon = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSanPhamView = new javax.swing.JTable();
        btnXoaSP = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblGioHang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtTimKiemten = new javax.swing.JTextField();
        btnThemVaoGio = new javax.swing.JButton();
        pnCam = new javax.swing.JPanel();
        txtTiemKiem = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtDonGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Số lượng ");

        spnSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Nhân viên");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Size");

        txtSize.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cboNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNhanVienActionPerformed(evt);
            }
        });

        cboLoaiSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboLoaiSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLoaiSPActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Loại SP");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Mã SP");

        txtMaSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tên SP");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Đơn giá");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("ID SP");

        txtIDSP.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lblHinhAnhSP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHinhAnhSP.setToolTipText("");
        lblHinhAnhSP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblHinhAnhSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhAnhSPMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Chi tiết sản phẩm");

        txtTenSP1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Số lượng mua ");

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(58, 58, 58))
                                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(spnSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtIDSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtTenSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblHinhAnhSP, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHinhAnhSP, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboLoaiSP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIDSP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenSP1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 350, 590));

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnXuatHoaDon.setBackground(new java.awt.Color(102, 102, 102));
        btnXuatHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXuatHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        btnXuatHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clipboard.png"))); // NOI18N
        btnXuatHoaDon.setText("Xuất hóa đơn");
        btnXuatHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatHoaDonActionPerformed(evt);
            }
        });

        tblSanPhamView.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblSanPhamView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID SP", "Mã SP", "Tên Sản Phẩm", "Số lượng", "Size", "Màu Sắc", "Chất liệu", "Đơn giá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSanPhamView.setRowHeight(30);
        tblSanPhamView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSanPhamViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSanPhamView);

        btnXoaSP.setBackground(new java.awt.Color(102, 102, 102));
        btnXoaSP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXoaSP.setForeground(new java.awt.Color(255, 255, 255));
        btnXoaSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/unemployment.png"))); // NOI18N
        btnXoaSP.setText("Xóa ");
        btnXoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSPActionPerformed(evt);
            }
        });

        tblGioHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblGioHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID SP", "Mã SP", "Tên SP", "Số lượng", "Size", "Đơn giá", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblGioHang.setRowHeight(30);
        jScrollPane2.setViewportView(tblGioHang);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Giỏ hàng");

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Tìm kiếm theo tên ");

        txtTimKiemten.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimKiemtenKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemtenKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(txtTimKiemten, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTimKiemten, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoaSP)
                .addGap(18, 18, 18)
                .addComponent(btnXuatHoaDon)
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaSP)
                    .addComponent(btnXuatHoaDon))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 590));

        btnThemVaoGio.setBackground(new java.awt.Color(102, 102, 102));
        btnThemVaoGio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThemVaoGio.setForeground(new java.awt.Color(255, 255, 255));
        btnThemVaoGio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empty-cart.png"))); // NOI18N
        btnThemVaoGio.setText("Thêm vào giỏ");
        btnThemVaoGio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoGioActionPerformed(evt);
            }
        });
        add(btnThemVaoGio, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 600, 180, 60));

        pnCam.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(230, 230, 230)));
        pnCam.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(pnCam, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 50, 260, 260));

        txtTiemKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTiemKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTiemKiemKeyPressed(evt);
            }
        });
        add(txtTiemKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 340, 190, 31));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 340, -1, 40));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/scan.png"))); // NOI18N
        jButton1.setText("Quét mã ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 390, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void cboNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNhanVienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNhanVienActionPerformed

    private void cboLoaiSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLoaiSPActionPerformed
        loadDataComboboxLoaiBanSP();
    }//GEN-LAST:event_cboLoaiSPActionPerformed

    private void lblHinhAnhSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhAnhSPMouseClicked

    }//GEN-LAST:event_lblHinhAnhSPMouseClicked

    private void btnThemVaoGioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoGioActionPerformed
        xuLyThemVaoGioHang();
    }//GEN-LAST:event_btnThemVaoGioActionPerformed

    private void btnXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSPActionPerformed
        xuLyXoaSPGioHang();
    }//GEN-LAST:event_btnXoaSPActionPerformed

    private void btnXuatHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatHoaDonActionPerformed
        xuLyXuatHoaDonBanHang();
    }//GEN-LAST:event_btnXuatHoaDonActionPerformed

    private void tblSanPhamViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSanPhamViewMouseClicked
        xuLyClickTblBanHang();
    }//GEN-LAST:event_tblSanPhamViewMouseClicked

    private void txtTiemKiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTiemKiemKeyPressed
        ArrayList<SanPhamChiTiet> listTim = (ArrayList<SanPhamChiTiet>) vspsv.timKiemMa(txtTiemKiem.getText());
        fillToTable(listTim);
        showDetail(listTim);
    }//GEN-LAST:event_txtTiemKiemKeyPressed
    private void fillToTable(ArrayList<SanPhamChiTiet> listVsp) {
        mol = (DefaultTableModel) tblSanPhamView.getModel();
        mol.setRowCount(0);
        for (int i = 0; i < listVsp.size(); i++) {
            Object[] data = new Object[]{listVsp.get(i).getID(), listVsp.get(i).getMASP(), listVsp.get(i).getTENSP(), listVsp.get(i).getSOLUONG(), listVsp.get(i).getTENSIZE(), listVsp.get(i).getTENMS(), listVsp.get(i).getCHATLIEU(),
                listVsp.get(i).getGIABAN(), listVsp.get(i).getHINHANH()};
            mol.addRow(data);
        }
    }


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        iniWebCam();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTimKiemtenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemtenKeyPressed
        ArrayList<SanPhamChiTiet> listTim1 = (ArrayList<SanPhamChiTiet>) vspsv.timKiemTen(txtTimKiemten.getText());
        fillToTable(listTim1);
    }//GEN-LAST:event_txtTimKiemtenKeyPressed

    private void txtTimKiemtenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemtenKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimKiemtenKeyReleased

    private void showDetail(ArrayList<SanPhamChiTiet> listVsp) {
        int row= 0;
//        SanPhamChiTiet dh = SanPhamChiTiet_repository.getAll().get(row);
        SanPhamChiTiet dh = listVsp.get(row);
        txtIDSP.setText(dh.getID());
        txtDonGia.setText(dh.getGIABAN() + "");
        txtTenSP1.setText(dh.getTENSP());
        txtSize.setText(dh.getTENSIZE());
        txtMaSP.setText(dh.getMASP());
        txtSoLuong.setText(dh.getSOLUONG() + "");
        if (dh.getHINHANH().equalsIgnoreCase("No Avatar")) {
            lblHinhAnhSP.setText("No Avatar");
            lblHinhAnhSP.setIcon(null);
        } else {
            lblHinhAnhSP.setText("");
            ImageIcon imgIcon = new ImageIcon(getClass().getResource("/img/" + dh.getHINHANH()));
            Image img = imgIcon.getImage();
            int width = lblHinhAnhSP.getWidth();
            int height = lblHinhAnhSP.getHeight();
            img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            lblHinhAnhSP.setIcon(imgIcon);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThemVaoGio;
    private javax.swing.JButton btnXoaSP;
    private javax.swing.JButton btnXuatHoaDon;
    private javax.swing.JComboBox<String> cboLoaiSP;
    private javax.swing.JComboBox<String> cboNhanVien;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHinhAnhSP;
    private javax.swing.JPanel pnCam;
    private javax.swing.JSpinner spnSoLuong;
    private javax.swing.JTable tblGioHang;
    private javax.swing.JTable tblSanPhamView;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtIDSP;
    private javax.swing.JTextField txtMaSP;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSP1;
    private javax.swing.JTextField txtTiemKiem;
    private javax.swing.JTextField txtTimKiemten;
    // End of variables declaration//GEN-END:variables

    DecimalFormat dcf = new DecimalFormat("###,###");

    private void loadDataComboboxLoaiBanSP() {
        cboLoaiSP.removeAllItems();
        cboLoaiSP.addItem("0 - Chọn loại - ID");
        ArrayList<LoaiSanPham> dsl = (ArrayList<LoaiSanPham>) LoaiSanPham_repository.getAllLoaiSP();

        for (LoaiSanPham loai : dsl) {
            if (!loai.getTenLoai().equalsIgnoreCase("Nguyên liệu")) {
                cboLoaiSP.addItem(loai.getMaLoai() + " - " + loai.getTenLoai() + " - " + loai.getIDLoaiSanPham());
            }
        }
    }

    private void loadDataComboboxNhanVienBan() {
        cboNhanVien.removeAllItems();
        ArrayList<NhanVien> dsnv = (ArrayList<NhanVien>) NhanVien_repository.getAllNV();
        if (dsnv != null) {
            for (NhanVien nv : dsnv) {
                cboNhanVien.addItem(nv.getMaNhanVien() + " - " + nv.getHoTen() + " - " + nv.getIDNhanVien());
            }
        }

//        for (int i = 0; i < cboNhanVien.getItemCount(); i++) {
//            String[] cmbValue = cboNhanVien.getItemAt(i).split(" - ");
//            if (cmbValue[0].equals(DangNhapBUS.taiKhoanLogin.getMaNhanVien() + "")) {
//                cmbNhanVienBan.setSelectedIndex(i);
//                break;
//            }
//        }
    }

    private void xuLyThemVaoGioHang() {

        int row = tblSanPhamView.getSelectedRow();
        mol = (DefaultTableModel) tblGioHang.getModel();
        //  mol.setRowCount(0);
        SanPhamChiTiet sp = SanPhamChiTiet_repository.getAll().get(row);
        if (row < 0) {
            return;
        }
        String idsp = txtIDSP.getText();
        String ma = txtMaSP.getText();
        String ten = txtTenSP1.getText();
        String donGia = txtDonGia.getText();
        String size = txtSize.getText();

        int soLuong = Integer.parseInt(spnSoLuong.getValue() + "");
        int soLuongConLai = Integer.parseInt(tblSanPhamView.getValueAt(tblSanPhamView.getSelectedRow(), 3) + "");

        if (soLuong > soLuongConLai || soLuongConLai <= 0) {
            new MyDialog("Sản phẩm đã hết hàng", MyDialog.ERROR_DIALOG);
            return;
        }
        txtTenSP1.setText("");
        txtMaSP.setText("");
        txtIDSP.setText("");
        txtTiemKiem.setText("");
        txtDonGia.setText("");
        txtSize.setText("");
        spnSoLuong.setValue(0);
        txtSoLuong.setText("");
        if (ma.trim().equalsIgnoreCase("")) {
            return;
        }
        //int key = Integer.parseInt(ma);
        for (int i = 0; i < tblGioHang.getRowCount(); i++) {
            String maTbl = (String) tblGioHang.getValueAt(i, 1);
            if (maTbl.equalsIgnoreCase(ma)) {
                int soLuongAdd = Integer.parseInt(tblGioHang.getValueAt(i, 3) + "");
                soLuongAdd += soLuong;
                donGia = donGia.replace(",", "");
                BigDecimal donGiaSP = new BigDecimal(donGia);
                BigDecimal tongTien = donGiaSP.multiply(new BigDecimal(soLuong));

                tblGioHang.setValueAt(soLuongAdd, i, 3);
                tblGioHang.setValueAt(dcf.format(tongTien.intValue()), i, 6);

                // cập nhật lại số lượng trong db
                SanPhamChiTiet_repository.capNhatSoLuongSP(ma, -soLuongAdd);
                SanPhamChiTiet_repository.getAll();
                loadDataTableSanPhamBan();
                return;
            }
        }

        Vector vec = new Vector();
        vec.add(idsp);
        vec.add(ma);
        vec.add(ten);

        vec.add(soLuong);
        vec.add(size);
        vec.add(donGia);
        donGia = donGia.replace(",", "");
        BigDecimal donGiaSP = BigDecimal.valueOf(Double.parseDouble(donGia));
        BigDecimal tongTien = donGiaSP.multiply(new BigDecimal(soLuong));
        vec.add(dcf.format(tongTien));

        // cập nhật lại số lượng trong db
        SanPhamChiTiet_repository.capNhatSoLuongSP(ma, -soLuong);
        SanPhamChiTiet_repository.getAll();
        loadDataComboboxLoaiBanSP();
        mol.addRow(vec);
    }

    private void loadDataTableSanPhamBan() {
        mol = (DefaultTableModel) tblSanPhamView.getModel();
        mol.setRowCount(0);
        ArrayList<SanPhamChiTiet> dssp = null;

        if (cboLoaiSP.getItemCount() > 0) {
            String loai = cboLoaiSP.getSelectedItem() + "";
            String loaiArr[] = loai.split("-");
            String loaiSP = loaiArr[0].trim();
            if (loaiSP.equals("0")) {
                dssp = (ArrayList<SanPhamChiTiet>) vspsv.getAll();
            } else {
                dssp = vspsv.getSanPhamTheoLoai(loaiSP);
            }
        } else {
            dssp = (ArrayList<SanPhamChiTiet>) vspsv.getAll();
        }
        for (SanPhamChiTiet sp : dssp) {
            Vector vec = new Vector();
            vec.add(sp.getID());
            vec.add(sp.getMASP());
            vec.add(sp.getTENSP());
            vec.add(dcf.format(sp.getSOLUONG()));
            vec.add(sp.getTENSIZE());
            vec.add(sp.getTENMS());
            vec.add(sp.getCHATLIEU());
            vec.add(sp.getGIABAN());
            vec.add(sp.getHINHANH());

            mol.addRow(vec);
        }
    }

    private void xuLyClickTblBanHang() {

        int row = tblSanPhamView.getSelectedRow();
//         SanPhamChiTiet vsp = SanPhamChiTiet_repository.getAll().get(row);
        SanPhamChiTiet sp = SanPhamChiTiet_repository.getAll().get(row);
        if (row > -1) {
            String idsp = tblSanPhamView.getValueAt(row, 0) + "";
            String ma = tblSanPhamView.getValueAt(row, 1) + "";
            String ten = tblSanPhamView.getValueAt(row, 2) + "";
            String SOLUONG = tblSanPhamView.getValueAt(row, 3) + "";
            String size = tblSanPhamView.getValueAt(row, 4) + "";
            //String mauSac = tblSanPhamView.getValueAt(row, 4) + "";
//            String hinhanh = tblSanPhamView.getValueAt(row, 8) + "";
//            String TenLoai = (String) tblSanPhamView.getValueAt(row, 5);
            String donGia = tblSanPhamView.getValueAt(row, 7) + "";
            // String anh = tblSanPhamView.getValueAt(row, 5) + "";
            int soLuong = Integer.parseInt(tblSanPhamView.getValueAt(row, 3) + "");
            if (soLuong < 1) {
                MyDialog dlg = new MyDialog("Sản phẩm đã hết hàng", MyDialog.ERROR_DIALOG);
                return;
            }

            SpinnerNumberModel modeSpinner = new SpinnerNumberModel(1, 1, soLuong, 1);
            spnSoLuong.setModel(modeSpinner);
            JFormattedTextField txtSpinner = ((JSpinner.NumberEditor) spnSoLuong.getEditor()).getTextField();
            ((NumberFormatter) txtSpinner.getFormatter()).setAllowsInvalid(false);
            txtSpinner.setEditable(false);
            txtSpinner.setHorizontalAlignment(JTextField.LEFT);

//            cboLoaiSP.setSelectedItem(TenLoai);
            txtMaSP.setText(ma);
            txtIDSP.setText(idsp);
            txtTenSP1.setText(ten);
//            txtTiemKiem.setText(ten);
            txtDonGia.setText(donGia);
            txtSize.setText(size);
            txtSoLuong.setText(SOLUONG);
            if (sp.getHINHANH().equalsIgnoreCase("No Avatar")) {
                lblHinhAnhSP.setText("No Avatar");
                lblHinhAnhSP.setIcon(null);
            } else {
                lblHinhAnhSP.setText("");
                ImageIcon imgIcon = new ImageIcon(getClass().getResource("/img/" + sp.getHINHANH()));
                Image img = imgIcon.getImage();
                int width = lblHinhAnhSP.getWidth();
                int height = lblHinhAnhSP.getHeight();
                img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
                lblHinhAnhSP.setIcon(imgIcon);
            }
        }
    }

    private void loadAnh(String anh) {
        lblHinhAnhSP.setIcon(getAnhSP(anh));
    }

    File fileAnhSP;

    private ImageIcon getAnhSP(String src) {
        src = src.trim().equals("") ? "default.png" : src;
        //Xử lý ảnh
        BufferedImage img = null;
        File fileImg = new File("img/" + src);

        if (!fileImg.exists()) {
            src = "default.png";
            fileImg = new File("img/" + src);
        }

        try {
            img = ImageIO.read(fileImg);
            fileAnhSP = new File("img/" + src);
        } catch (IOException e) {
            fileAnhSP = new File("img/default.png");
        }

        if (img != null) {
            Image dimg = img.getScaledInstance(202, 227, Image.SCALE_SMOOTH);

            return new ImageIcon(dimg);
        }
        return null;
    }

    private void xuLyXoaSPGioHang() {
        int row = tblGioHang.getSelectedRow();
        mol = (DefaultTableModel) tblGioHang.getModel();
        mol.removeRow(row);
        //if (row > -1) {
        String ma = (String) tblGioHang.getValueAt(row, 1);
        int soLuong = Integer.parseInt(tblGioHang.getValueAt(row, 3) + "");
        vspsv.capNhatSoLuongSP(ma, soLuong);
        loadDataTableSanPhamBan();

        //}
    }

    private void xuLyXoaSPGioHang(int row) {
        if (row > -1) {
            String ma = (String) tblGioHang.getValueAt(row, 1);
            int soLuong = Integer.parseInt(tblGioHang.getValueAt(row, 3) + "");
            vspsv.capNhatSoLuongSP(ma, soLuong);
            loadDataTableSanPhamBan();
        }
    }

    private void xuLyClickTblGioHang() {
        int row = tblGioHang.getSelectedRow();
        if (row < 0) {
            return;
        }
        String id = tblGioHang.getValueAt(row, 0) + "";
        //loadAnh(vspsv.);
    }

    private void xuLyXuatHoaDonBanHang() {
        ArrayList<Vector> dsGioHang = new ArrayList<>();
        mol = (DefaultTableModel) tblGioHang.getModel();
        int row = tblGioHang.getRowCount();
        if (row == 0) {
            return;
        }
        int tongTien = 0;
        for (int i = 0; i < row; i++) {
            Vector vec = new Vector();
            vec.add(tblGioHang.getValueAt(i, 0));
            vec.add(tblGioHang.getValueAt(i, 1));
            vec.add(tblGioHang.getValueAt(i, 2));
            vec.add(tblGioHang.getValueAt(i, 3));
            vec.add(tblGioHang.getValueAt(i, 4));
            vec.add(tblGioHang.getValueAt(i, 5));
            vec.add(tblGioHang.getValueAt(i, 6));
            tongTien += Integer.parseInt((tblGioHang.getValueAt(i, 6) + "").replace(",", ""));
            dsGioHang.add(vec);
        }

        XuatHoaDonGUI hoaDonUI = new XuatHoaDonGUI(dsGioHang, tongTien, cboNhanVien.getSelectedItem());
        hoaDonUI.setVisible(true);
        if (hoaDonUI.checkBanHang) {
            mol.setRowCount(0);
        }
    }

    public void xuLyThoat() {
        int row = tblGioHang.getRowCount();
        if (row > 0) {
            for (int i = 0; i < row; i++) {
                xuLyXoaSPGioHang(i);
            }
        }
    }

    private void iniWebCam() {
        Dimension size = WebcamResolution.QVGA.getSize();
        webcam = Webcam.getWebcams().get(0);
        webcam.setViewSize(size);
        panel = new WebcamPanel(webcam);
        panel.setPreferredSize(size);
        panel.setFPSDisplayed(true);
        pnCam.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 240));

        executor.execute(this);

    }
    SanPhamChiTiet v = new SanPhamChiTiet();

    @Override
    public void run() {
        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Result result = null;
            BufferedImage image = null;
            if (webcam.isOpen()) {
                if ((image = webcam.getImage()) == null) {
                    continue;
                }
            }
            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));

            try {
                result = new MultiFormatReader().decode(bitmap);
            } catch (NotFoundException e) {
            }
            if (result != null) {
                txtTiemKiem.setText(result.getText());
            }
        } while (true);

    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, "My Thread");
        t.setDaemon(true);
        return t;
    }

    private void xuLyClickTblBanHang1(ArrayList<SanPhamChiTiet> listVsp) {
        int row = tblSanPhamView.getSelectedRow();
        if (row > -1) {
            String idsp = tblSanPhamView.getValueAt(row, 0) + "";
            String ma = tblSanPhamView.getValueAt(row, 1) + "";
            String ten = tblSanPhamView.getValueAt(row, 2) + "";
            String SOLUONG = tblSanPhamView.getValueAt(row, 3) + "";
            String size = tblSanPhamView.getValueAt(row, 4) + "";
            //String mauSac = tblSanPhamView.getValueAt(row, 4) + "";
            String hinhanh = tblSanPhamView.getValueAt(row, 8) + "";
            String donGia = tblSanPhamView.getValueAt(row, 7) + "";
            // String anh = tblSanPhamView.getValueAt(row, 5) + "";
            int soLuong = Integer.parseInt(tblSanPhamView.getValueAt(row, 3) + "");
            if (soLuong < 1) {
                MyDialog dlg = new MyDialog("Sản phẩm đã hết hàng", MyDialog.ERROR_DIALOG);
                return;
            }

            SpinnerNumberModel modeSpinner = new SpinnerNumberModel(1, 1, soLuong, 1);
            spnSoLuong.setModel(modeSpinner);
            JFormattedTextField txtSpinner = ((JSpinner.NumberEditor) spnSoLuong.getEditor()).getTextField();
            ((NumberFormatter) txtSpinner.getFormatter()).setAllowsInvalid(false);
            txtSpinner.setEditable(false);
            txtSpinner.setHorizontalAlignment(JTextField.LEFT);

            txtMaSP.setText(ma);
            txtIDSP.setText(idsp);
            txtTenSP1.setText(ten);
//            txtTiemKiem.setText(ten);
            txtDonGia.setText(donGia);
            txtSize.setText(size);
            txtSoLuong.setText(SOLUONG);
            ImageIcon imgIcon = new ImageIcon(getClass().getResource("/img/" + hinhanh));
            Image img = imgIcon.getImage();
            int width = lblHinhAnhSP.getWidth();
            int height = lblHinhAnhSP.getHeight();
            img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            lblHinhAnhSP.setIcon(imgIcon);
        }
    }

}
