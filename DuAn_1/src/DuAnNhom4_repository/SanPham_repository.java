/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_model.SanPham;
import DuAnNhom4_utility.JDBC_Helper;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Dell
 */
public class SanPham_repository {

     public static List<SanPham> getAllSP() {
        List<SanPham> listLoaiSP = new ArrayList();
        ResultSet rs;
        String sql = "select ID, MASP, TENSP, SOLUONG, HINHANH, CHATLIEU,GIANHAP,GIABAN from SANPHAM";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String idsp = rs.getString(1);
                String masp = rs.getString(2);
                String tensp = rs.getString(3);
                int soluongsp = rs.getInt(4);
                String hinhanhsp = rs.getString(5);              
                String chatLieu = rs.getString(6);
                BigDecimal gianhap = rs.getBigDecimal(7);
                BigDecimal giaban = rs.getBigDecimal(8);
                SanPham sp = new SanPham(idsp, masp, tensp, soluongsp, hinhanhsp, chatLieu, gianhap, giaban);

                listLoaiSP.add(sp);
            }
            return listLoaiSP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
//    public static SanPham getSPbymaSP(String ma) {
//        SanPham sp = new SanPham();
//        ResultSet rs;
//        String sql = "select SANPHAM.Id, LOAISANPHAM.ID,  MASP, TENSP, SOLUONG, HINHANH, SIZE, MAUSAC, CHATLIEU, GIANHAP, GIABAN\n"
//                + "from SANPHAM join LOAISANPHAM on SANPHAM.IDLOAISP = LOAISANPHAM.ID\n"
//                + "where MASP = ?  ";
//
//        rs = JDBC_Helper.selectTongQuat(sql, ma);
//        try {
//            while (rs.next()) {
//                String idsp = rs.getString(1);
//                String idloaisp = rs.getString(2);
//                String masp = rs.getString(3);
//                String tensp = rs.getString(4);
//                int soluongsp = rs.getInt(5);
//                String hinhanhsp = rs.getString(5);
//                String size = rs.getString(7);
//                String mausacsp = rs.getString(8);
//                String chatLieu = rs.getString(9);
//                BigDecimal gianhap = rs.getBigDecimal(10);
//                BigDecimal giaban = rs.getBigDecimal(11);
//                int TrangThai = rs.getInt(12);
//                sp = new SanPham(idsp, idloaisp, masp, tensp, soluongsp, hinhanhsp, size, mausacsp, chatLieu, gianhap, giaban, TrangThai);
//            }
//            return sp;
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//            return null;
//            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//  public static int themKH(KhachHang KH) {
//        String sql = "insert into KHACHHANG(HOTEN,GIOITINH,NGAYSINH,SDT,DIACHI,THANHPHO,QUOCGIA,TENTAIKHOAN,MATKHAU,NHAPLAIMK,HINHANH) values(?,?,?,?,?,?,?,?,?,?,?)";
//        return JDBC_Helper.updateTongQuat(sql, KH.getHoTen(), KH.getGioiTinh(),
//                KH.getNgaySinh(),KH.getSoDienThoai(), KH.getDiaChi(), KH.getThanhPho(), KH.getQuocGia(), KH.getTenTaiKhoan(), KH.getMatKhau(), KH.getNhapLaiMatKhau(), KH.getHinhAnh());
//
//    }
    public static void main(String[] args) {
        // check các chức năng tại đây
        List<SanPham> listCheck = new ArrayList<>();
        listCheck = getAllSP();
        for (SanPham x : listCheck) {
            System.out.println(x.toString());
        }
        // check các chức năng tiếp theo    
    }
}
