/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_Repository;

import DuAnNhom4_Viewmodel.vHoaDonChiTiet;
import DuAnNhom4_utility.JDBC_Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author acer
 */
public class vHoaDonChiTiet_Repository {

    private vHoaDon_Repository vhdsv = new vHoaDon_Repository();

    public static List<vHoaDonChiTiet> getAllVHD() {
        List<vHoaDonChiTiet> listVHDCT = new ArrayList();
        ResultSet rs;

        String sql = "select HOADONMUAHANG.ID,HOADONMUAHANG.MAHD, SANPHAM.Id 'ID SP',SANPHAM.MASP,SANPHAM.TENSP, HOADONCHITIET.SoLuong,  SANPHAM.GIABAN, HOADONCHITIET.ThanhTien\n"
                + "from HOADONMUAHANG join HOADONCHITIET on HOADONMUAHANG.ID = HOADONCHITIET.IDHOADONMUAHANG\n"
                + "join SANPHAM on HOADONCHITIET.IDSP = SANPHAM.Id";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String idhdct = rs.getString(1);
                String mahd = rs.getString(2);
                String idSP = rs.getString(3);
                String maSP = rs.getString(4);
                String tensp = rs.getString(5);
                int soLuong = rs.getInt(6);
                int dongia = rs.getInt(7);
                int thanhTien = rs.getInt(8);
                vHoaDonChiTiet vhdct = new vHoaDonChiTiet(idhdct, mahd, idSP, maSP,tensp, soLuong, dongia, thanhTien);
                listVHDCT.add(vhdct);
            }
            return listVHDCT;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<vHoaDonChiTiet> getMaHDbyHoaDonCT(String maHD) {
        ArrayList<vHoaDonChiTiet> listVHDCT = new ArrayList();
        ResultSet rs;
        String sql = "select HOADONMUAHANG.ID,HOADONMUAHANG.MAHD, SANPHAM.Id 'ID SP',SANPHAM.MASP,SANPHAM.TENSP, HOADONCHITIET.SoLuong,  SANPHAM.GIABAN, HOADONCHITIET.ThanhTien\n"
                + "from HOADONMUAHANG join HOADONCHITIET on HOADONMUAHANG.ID = HOADONCHITIET.IDHOADONMUAHANG\n"
                + "join SANPHAM on HOADONCHITIET.IDSP = SANPHAM.Id\n"
                + "where HOADONMUAHANG.MAHD = ?";
        rs = JDBC_Helper.selectTongQuat(sql, maHD);
        try {
            while (rs.next()) {
                String idhdct = rs.getString(1);
                String mahd = rs.getString(2);
                String idSP = rs.getString(3);
                String maSP = rs.getString(4);
                String tensp = rs.getString(5);
                int soLuong = rs.getInt(6);
                int dongia = rs.getInt(7);
                int thanhTien = rs.getInt(8);
            
                vHoaDonChiTiet vhdct = new vHoaDonChiTiet(idhdct, mahd, idSP, maSP,tensp, soLuong, dongia, thanhTien);
                listVHDCT.add(vhdct);
            }
            return listVHDCT;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<vHoaDonChiTiet> getMaSPbyHoaDonCT(String maSanPham) {
        ArrayList<vHoaDonChiTiet> listVHDCT = new ArrayList();
        ResultSet rs;
        String sql = "select HOADONMUAHANG.ID,HOADONMUAHANG.MAHD, SANPHAM.Id 'ID SP',SANPHAM.MASP,SANPHAM.TENSP, HOADONCHITIET.SoLuong,  SANPHAM.GIABAN, HOADONCHITIET.ThanhTien\n"
                + "from HOADONMUAHANG join HOADONCHITIET on HOADONMUAHANG.ID = HOADONCHITIET.IDHOADONMUAHANG\n"
                + "join SANPHAM on HOADONCHITIET.IDSP = SANPHAM.Id"
                + "where SANPHAM.MASP = ?";
        rs = JDBC_Helper.selectTongQuat(sql, maSanPham);
        try {
            while (rs.next()) {
                String idhdct = rs.getString(1);
                String mahd = rs.getString(2);
                String idSP = rs.getString(3);
                String maSP = rs.getString(4);
                String tensp = rs.getString(5);
                int soLuong = rs.getInt(6);
                int dongia = rs.getInt(7);
                int thanhTien = rs.getInt(8);
                vHoaDonChiTiet vhdct = new vHoaDonChiTiet(idhdct, mahd, idSP, maSP,tensp, soLuong, dongia, thanhTien);
                listVHDCT.add(vhdct);
            }
            return listVHDCT;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int themHDCT(vHoaDonChiTiet vhd) {
        String sql = "INSERT INTO HOADONCHITIET(IDHOADONMUAHANG, IDSP, SoLuong,MASP, DonGia,ThanhTien) values(?, ?, ?, ?, ?, ?)";
        return JDBC_Helper.updateTongQuat(sql, vhd.getIdHoaDonMuaHang(), vhd.getIdSP(), vhd.getSoLuong(),vhd.getMaSP(), vhd.getDonGia(), vhd.getThanhTien());
    }

    public static int xoaHDCT(vHoaDonChiTiet vhd) {
        String sql = "DELETE FROM HOADONCHITIET WHERE IDHOADONMUAHANG = ?";
        return JDBC_Helper.updateTongQuat(sql, vhd.getIdHoaDonMuaHang());
    }

    public static int suaHDCT(vHoaDonChiTiet vhd) {
        String sql = "UPDATE HOADONCHITIET SET SoLuong = ?, DonGia = ?, ThanhTien = ?"
                + "WHERE IDHOADONMUAHANG =? AND IDSP = ?";
        return JDBC_Helper.updateTongQuat(sql, vhd.getSoLuong(), vhd.getDonGia(), vhd.getThanhTien(), vhd.getIdHoaDonMuaHang(), vhd.getIdSP());
    }

    public static void main(String[] args) {
        // check các chức năng tại đây
        List<vHoaDonChiTiet> listCheck = new ArrayList<>();
        listCheck = getAllVHD();
        for (vHoaDonChiTiet x : listCheck) {
            System.out.println(x.toString());
        }
    }

    public void addCTHoaDon(String IDSP, String maSP, String soLuong, String donGia, String thanhTien) {
        String idHD = vhdsv.getMaHoaDonMoiNhat();
        donGia = donGia.replace(",", "");
        thanhTien = thanhTien.replace(",", "");
        int sl = Integer.parseInt(soLuong);

        vHoaDonChiTiet cthd = new vHoaDonChiTiet();

        cthd.setIdHoaDonMuaHang(idHD);
        cthd.setIdSP(IDSP);
        cthd.setMaSP(maSP);
        cthd.setDonGia(Integer.parseInt(donGia));
        cthd.setSoLuong(sl);
        cthd.setThanhTien(Integer.parseInt(thanhTien));

        vHoaDonChiTiet_Repository.themHDCT(cthd);
    }
}
