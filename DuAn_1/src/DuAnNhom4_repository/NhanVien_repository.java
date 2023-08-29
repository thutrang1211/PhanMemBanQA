/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_model.NhanVien;
import DuAnNhom4_utility.JDBC_Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Dell
 */
public class NhanVien_repository {

    public static List<NhanVien> getAllNV() {
        List<NhanVien> listNV = new ArrayList();
        ResultSet rs;
        String sql = "select ID, MANV, HOTEN, GIOITINH, NgaySinh, DIACHI, SDT, TENTAIKHOAN, MATKHAU, TrangThai,HINHANH,EMAIL from NHANVIEN";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String idnv = rs.getString(1);
                String manv = rs.getString(2);
                String hotennv = rs.getString(3);
                String gioitinh = rs.getString(4);
                Date ngaysinh = rs.getDate(5);
                String diachi = rs.getString(6);
                String sdtnv = rs.getString(7);
                String tentaikhoan = rs.getString(8);
                String matkhau = rs.getString(9);
                int trangthai = rs.getInt(10);
                String HinhAnh = rs.getString(11);
                String Email = rs.getString(12);
                NhanVien nv = new NhanVien(idnv, manv, hotennv, gioitinh, ngaysinh, diachi, sdtnv, tentaikhoan, matkhau, trangthai, HinhAnh,Email);
                listNV.add(nv);
            }
            return listNV;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static NhanVien getNVbyma(String manhanvien) {
        NhanVien nv = new NhanVien();
        ResultSet rs;
        String sql = "select ID, MANV, HOTEN, GIOITINH, NgaySinh, DIACHI,EMAIL, SDT, TENTAIKHOAN, MATKHAU, TrangThai,HINHANH\n"
                + "from NHANVIEN"
                + "where MANV = ?";
        rs = JDBC_Helper.selectTongQuat(sql, manhanvien);
        try {
            while (rs.next()) {
                String idnv = rs.getString(1);
                String manv = rs.getString(2);
                String hotennv = rs.getString(3);
                String gioitinh = rs.getString(4);
                Date ngaysinh = rs.getDate(5);
                String diachi = rs.getString(6);
                String Email = rs.getString(7);
                String sdtnv = rs.getString(8);
                String tentaikhoan = rs.getString(9);
                String matkhau = rs.getString(10);
                int trangthai = rs.getInt(11);
                String HinhAnh = rs.getString(12);
                
                nv = new NhanVien(idnv, manv, hotennv, gioitinh, ngaysinh, diachi, sdtnv, tentaikhoan, matkhau, trangthai, HinhAnh,Email);
            }
            return nv;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int them(NhanVien nv) {
        String sql = "insert into NhanVien(MANV, HOTEN, GIOITINH, NgaySinh, DIACHI, SDT,EMAIL, TENTAIKHOAN, MATKHAU, TrangThai,HINHANH) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return JDBC_Helper.updateTongQuat(sql, nv.getMaNhanVien(), nv.getHoTen(), nv.getGioiTinh(), nv.getNgaySinh(), nv.getDiaChi(),
                nv.getSoDienThoai(),nv.getEmail(), nv.getTenTaiKhoan(), nv.getMatKhau(), nv.getTrangThai(), nv.getHinhAnh());
    }

    public static int sua(NhanVien nv) {
        String sql = "update NhanVien set HOTEN = ?, GIOITINH = ?, NgaySinh = ?, DIACHI = ?, EMAIL = ?,"
                + " SDT = ?, TENTAIKHOAN = ?, MATKHAU = ?, TrangThai = ?, HINHANH = ? where MANV=? ";
       return JDBC_Helper.updateTongQuat(sql, nv.getMaNhanVien(), nv.getHoTen(), nv.getGioiTinh(), nv.getNgaySinh(), nv.getDiaChi(), nv.getSoDienThoai(), nv.getTenTaiKhoan(), nv.getMatKhau(), nv.getTrangThai(), nv.getHinhAnh());
    }

    public static void main(String[] args) {
        // check các chức năng tại đây
        List<NhanVien> listCheck = new ArrayList<>();
        listCheck = getAllNV();
        for (NhanVien x : listCheck) {
            System.out.println(x.toString());
        }
    }
    
     public static NhanVien getUSERByID(String TEN) {
        NhanVien TK = null;
        ResultSet rs;
        String sql = "Select ID,TENTAIKHOAN,MATKHAU from NHANVIEN where TENTAIKHOAN = ?";
        rs = JDBC_Helper.selectTongQuat(sql, TEN);
        try {
            while (rs.next()) {
                String ID = rs.getString(1);
                String TENTK = rs.getString(2);
                String MATKHAU = rs.getString(3);

                TK = new NhanVien(ID, TENTK, MATKHAU);

            }
            return TK;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(Sach_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean checkLogin(String USERNAME, String PASSWORD) {
        NhanVien us = getUSERByID(USERNAME);
        if (us != null) {
            if (us.getMatKhau().equals(PASSWORD)) {
                return true;
            }
        }
        return false;
    }
}
