package DuAnNhom4_view;

import DuAnNhom4_Repository.vHoaDonChiTiet_Repository;
import DuAnNhom4_Repository.vHoaDon_Repository;
import DuAnNhom4_Viewmodel.vHoaDon;
import DuAnNhom4_Viewmodel.vHoaDonChiTiet;
import DuAnNhom4_model.KhuyenMai;
import DuAnNhom4_repository.KhuyenMai_repository;
import DuAnNhom4_repository.SanPhamChiTiet_repository;
import DuAnNhom4_viewmodel.SanPhamChiTiet;
import MyCostom.MyDialog;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.JDialog;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class XuatHoaDonGUI extends JDialog {

    private vHoaDon_Repository hoadonBUS = new vHoaDon_Repository();
    private vHoaDonChiTiet_Repository ctHoaDonBUS = new vHoaDonChiTiet_Repository();
    //private DlgTimKhach timKhachUI = new DlgTimKhach();
    private TimKhuyenMai timMaUI;

    public XuatHoaDonGUI() {
        checkBanHang = false;
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setModal(true);
        //Image icon = Toolkit.getDefaultToolkit().getImage("image/ManagerUI/icon-app.png");
        // this.setIconImage(icon);
//        customEvents();
    }

    private ArrayList<Vector> dsGioHang;
    private int tongTien;
    private String nhanVien;
    // private LocalDate localDate = LocalDate.now();
    private Date date = java.sql.Date.valueOf(LocalDate.now());

    public XuatHoaDonGUI(ArrayList<Vector> dsGioHang, int tongTien, Object nhanVien) {
        this();
        this.tongTien = tongTien;
        this.dsGioHang = dsGioHang;
        this.nhanVien = (String) nhanVien;
        DecimalFormat dcf = new DecimalFormat("###,###");
        txtTongTien.setText(dcf.format(tongTien));
    }

//    private void customEvents() {
//
//        txtMaGiam.getDocument().addDocumentListener(new DocumentListener() {
//            public void changedUpdate(DocumentEvent e) {
//                checkKhachMa();
//            }
//
//            public void removeUpdate(DocumentEvent e) {
//                checkKhachMa();
//            }
//
//            public void insertUpdate(DocumentEvent e) {
//                checkKhachMa();
//            }
//        });
//    }
    private void checkKhachMa() {
//        if (txtMaGiam.getText().equalsIgnoreCase("")) {
//            btnThanhToan.setEnabled(false);
//        } else {
//            btnThanhToan.setEnabled(true);
//        }
    }

    private void xuLyHienThiHoaDon() {
        txtHoaDon.setContentType("text/html");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        DecimalFormat dcf = new DecimalFormat("###,### VND");

        String hd = "<style> "
                + "table {"
                + "border: 1px solid;"
                + "border-bottom: none"
                + "}"
                + "tr {"
                + "border-bottom: 1px solid;"
                + "}"
                + "td {"
                + "padding: 8px;"
                + "} "
                + "th {"
                + "font-size:16pt"
                + "}"
                + "</style>";
        hd += "<h1 style='text-align:center;'>HOÁ ĐƠN THANH TOÁN</h1>";
        hd += "Nhân viên: " + nhanVien + "<br/>";
        hd += "Ngày lập: " + dtf.format(now) + "<br/>";
        //  hd += "Khách hàng: " + txtTenKhach.getText() + "<br/>";
        hd += "<div style='text-align:center;'>==========================================</div><br/>";
        hd += "<div style='text-align:center'>";
        hd += "<table style='max-width:100%'>";
        hd += "<tr>"
                + "<th>Mã SP</th>"
                + "<th>Tên SP</th>"
                + "<th>Số lượng</th>"
                + "<th>Size</th>"
                + "<th>Đơn giá</th>"
                + "<th>Thành tiền</th>"
                + "</tr>";
        for (Vector vec : dsGioHang) {
            hd += "<tr>";
            hd += "<td style='text-align:center;'>" + vec.get(1) + "</td>";
            hd += "<td style='text-align:left;'>" + vec.get(2) + "</td>";
            hd += "<td style='text-align:center;'>" + vec.get(3) + "</td>";
            hd += "<td style='text-align:center;'>" + vec.get(4) + "</td>";
            hd += "<td style='text-align:center;'>" + vec.get(5) + "</td>";
            hd += "<td style='text-align:center;'>" + vec.get(6) + "</td>";

            hd += "</tr>";
        }
        hd += "<tr>";
        hd += "<td style='text-align:center;'>" + "</td>";
        hd += "<td style='text-align:left;'>" + "</td>";
        hd += "<td style='text-align:center;'>" + "</td>";
        hd += "<td style='text-align:center;'>" + "</td>";
        hd += "<td style='text-align:center;font-weight:bold'>Tổng cộng</td>";
        hd += "<td style='text-align:center;'>" + dcf.format(tongTien) + "</td>";
        hd += "</tr>";
//        if (timMaUI.maGiamTimDuoc != null) {
//            // lấy phần trăm giảm
//            // percent = ;
//             int percent = 0;
//            // lấy phần trăm giảm
//            percent = timMaUI.maGiamTimDuoc.getPhantramgiam();
//            if (tongTien >= timMaUI.maGiamTimDuoc.getDieukien()) {
//                tongTien = tongTien - (tongTien * percent / 100);
//            } else {
//                new MyDialog("Không đủ điều kiện nhận ưu đãi!", MyDialog.ERROR_DIALOG);
//                btnTimMaGiam.setEnabled(true);
//                return;
//            }
//        }
        int row = 0;
        KhuyenMai km = KhuyenMai_repository.getAllKM().get(row);

        km.getDieukien();
        int percent = km.getPhantramgiam();
        Date q = new Date();
        if (km.getNgayBatDau().before(q) && km.getNgayKetThuc().after(q)) {
            if (tongTien >= km.getDieukien()) {
                tongTien = tongTien - (tongTien * percent / 100);
            }
        }
        hd += "<tr>";
        hd += "<td style='text-align:center;'>" + "</td>";
        hd += "<td style='text-align:left;'>" + "</td>";
        hd += "<td style='text-align:center;'>" + "</td>";
        hd += "<td style='text-align:center;'>" + "</td>";
        hd += "<td style='text-align:center;font-weight:bold'>Khuyến mãi</td>";
        hd += "<td style='text-align:center;'>" + km.getPhantramgiam() + "%" + "</td>";
        hd += "</tr>";
        hd += "<tr>";
        hd += "<td style='text-align:center;'>" + "</td>";
        hd += "<td style='text-align:left;'>" + "</td>";
        hd += "<td style='text-align:center;'>" + "</td>";
        hd += "<td style='text-align:center;'>" + "</td>";
        hd += "<td style='text-align:center;font-weight:bold'>Thành tiền</td>";
        hd += "<td style='text-align:center;'>" + dcf.format(tongTien) + "</td>";
        hd += "</tr>";
        hd += "</table>";
        hd += "</div>";
        hd += "<div style='text-align:center;'>==========================================</div><br/>";
        txtHoaDon.setText(hd);
        txtTongTien.setText(dcf.format(tongTien));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtHoaDon = new javax.swing.JEditorPane();
        jLabel4 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Chi tiết hoá đơn");
        jPanel1.add(jLabel1);

        txtHoaDon.setEditable(false);
        jScrollPane1.setViewportView(txtHoaDon);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Tổng tiền");

        txtTongTien.setEditable(false);
        txtTongTien.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clipboard.png"))); // NOI18N
        jButton2.setText("In hóa đơn ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buy.png"))); // NOI18N
        jButton1.setText("Thanh toán");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        xuLyHienThiHoaDon();
//        btnInHoaDon.setEnabled(true);

        hoadonBUS.luuHoaDon(nhanVien, date, tongTien);

        for (Vector vec : dsGioHang) {
            String idSP = vec.get(0) + "";
            String maSP = vec.get(1) + "";
            String soLuong = vec.get(3) + "";
            String donGia = vec.get(5) + "";
            String thanhTien = vec.get(6) + "";
            ctHoaDonBUS.addCTHoaDon(idSP, maSP, soLuong, donGia, thanhTien);
        }
        checkBanHang = true;

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            if (!txtHoaDon.getText().equals("")) {
                txtHoaDon.print();
                this.dispose();
            }
        } catch (PrinterException ex) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static boolean checkBanHang = false;

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {
        checkBanHang = false;
//        if (txtTenKhach.getText().equals("")) {
//            new MyDialog("Xin chọn khách hàng", MyDialog.ERROR_DIALOG);
//            return;
//        }
//        if (txtMaGiam.getText().equals("")) {
//            new MyDialog("Xin chọn mã giảm", MyDialog.ERROR_DIALOG);
//            return;
//        }
        xuLyHienThiHoaDon();
//        btnInHoaDon.setEnabled(true);

        hoadonBUS.luuHoaDon(nhanVien, date, tongTien);

        for (Vector vec : dsGioHang) {
            String idSP = vec.get(0) + "";
            String maSP = vec.get(1) + "";
            String soLuong = vec.get(3) + "";
            String donGia = vec.get(5) + "";
            String thanhTien = vec.get(6) + "";
            ctHoaDonBUS.addCTHoaDon(idSP, maSP, soLuong, donGia, thanhTien);
        }
//        btnThanhToan.setEnabled(false);
//        btnTimMaGiam.setEnabled(false);
        //  btnTimKhach.setEnabled(false);
        checkBanHang = true;
    }

    private void btnInHoaDonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            if (!txtHoaDon.getText().equals("")) {
                txtHoaDon.print();
                this.dispose();
            }
        } catch (PrinterException ex) {
        }
    }

//    private void btnTimKhachActionPerformed(java.awt.event.ActionEvent evt) {
//        timKhachUI.setVisible(true);
//        if (timKhachUI.khachHangTimDuoc != null) {
//            txtTenKhach.setText(timKhachUI.khachHangTimDuoc.getMaKH() + " - " + timKhachUI.khachHangTimDuoc.getHo() + " " + timKhachUI.khachHangTimDuoc.getTen());
//        }
//    }
//    private void btnTimMaGiamActionPerformed(java.awt.event.ActionEvent evt) {
//        timMaUI = new TimKhuyenMai(tongTien);
//        timMaUI.setVisible(true);
//        if (timMaUI.maGiamTimDuoc != null) {
//            txtMaGiam.setText(timMaUI.maGiamTimDuoc.getMaKhuyenMai() + " - " + timMaUI.maGiamTimDuoc.getTenKhuyenMai());
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JEditorPane txtHoaDon;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
