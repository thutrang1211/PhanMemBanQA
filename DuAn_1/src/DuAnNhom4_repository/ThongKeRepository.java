/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_utility.JDBC_Helper;
import DuAnNhom4_viewmodel.vThongKe;
import java.math.BigDecimal;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.sql.*;

/**
 *
 * @author TRAN VAN DUONG
 */
public class ThongKeRepository {

    public List<vThongKe> getALL() {
        try {
            Connection con = DBContext.getConnect();
            String query = " select distinct NGAYTAOHOADON from HOADONMUAHANG  ";

            List<vThongKe> list = new ArrayList<>();
            PreparedStatement ps = con.prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vThongKe thongKe = new vThongKe();
                thongKe.setNgayTaoHoaDon(rs.getString(1));
                list.add(thongKe);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<vThongKe> getListByThongKe() {
        try {
            Connection con = DBContext.getConnect();
            String query = "select TENSP,SIZE.TEN,MAUSAC.TEN, sum(HOADONCHITIET.SOLUONG) ,COUNT(day(HOADONMUAHANG.NGAYTAOHOADON))\n"
                    + "from HOADONMUAHANG join HOADONCHITIET on HOADONMUAHANG.ID = HOADONCHITIET.IDHOADONMUAHANG\n"
                    + "join SANPHAM on HOADONCHITIET.IDSP = SANPHAM.Id \n"
                    + "  JOIN SIZE ON SANPHAM.IDSIZE = SIZE.ID \n"
                    + "	join MAUSAC ON SANPHAM.IDMAUSAC = MAUSAC.ID\n"
                    + " GROUP BY TENSP,SIZE.TEN,MAUSAC.TEN";
            List<vThongKe> list = new ArrayList<>();
            PreparedStatement ps = con.prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vThongKe thongKe = new vThongKe();
                thongKe.setTenSp(rs.getString(1));
                thongKe.setTensize(rs.getString(2));
                thongKe.setMausac(rs.getString(3));
                thongKe.setSoLuong(rs.getInt(4));
                thongKe.setNgayTaoHoaDon(rs.getString(5));
                list.add(thongKe);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<vThongKe> getListByThongKe2() {
        try {
            Connection con = DBContext.getConnect();
            String query = "select TENSP,SIZE.TEN,MAUSAC.TEN, sum(HOADONCHITIET.SOLUONG) , CONCAT((HOADONMUAHANG.NGAYTAOHOADON), '')\n"
                    + " from HOADONMUAHANG join HOADONCHITIET on HOADONMUAHANG.ID = HOADONCHITIET.IDHOADONMUAHANG\n"
                    + "   join SANPHAM on HOADONCHITIET.IDSP = SANPHAM.Id \n"
                    + "	JOIN SIZE ON SANPHAM.IDSIZE = SIZE.ID  \n"
                    + "	join MAUSAC ON SANPHAM.IDMAUSAC = MAUSAC.ID\n"
                    + "	GROUP BY TENSP,SIZE.TEN,HOADONMUAHANG.NGAYTAOHOADON,MAUSAC.TEN";

            List<vThongKe> list = new ArrayList<>();
            PreparedStatement ps = con.prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vThongKe thongKe = new vThongKe();
                thongKe.setTenSp(rs.getString(1));
                thongKe.setTensize(rs.getString(2));
                thongKe.setMausac(rs.getString(3));
                thongKe.setSoLuong(rs.getInt(4));
                thongKe.setNgayTaoHoaDon(rs.getString(5));
                list.add(thongKe);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<vThongKe> getListByThongKe3() {

        try {
            Connection con = DBContext.getConnect();
            String query = "select TENSP,SIZE.TEN, sum(HOADONCHITIET.SOLUONG) , CONCAT((HOADONMUAHANG.NGAYTAOHOADON), '')\n"
                    + " from HOADONMUAHANG join HOADONCHITIET on HOADONMUAHANG.ID = HOADONCHITIET.IDHOADONMUAHANG\n"
                    + "join SANPHAM on HOADONCHITIET.IDSP = SANPHAM.Id \n"
                    + "JOIN SIZE ON SANPHAM.IDSIZE = SIZE.ID Where NGAYTAOHOADON =? \n"
                    + "GROUP BY TENSP,SIZE.TEN,HOADONMUAHANG.NGAYTAOHOADON";

            List<vThongKe> list = new ArrayList<>();
            PreparedStatement ps = con.prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vThongKe thongKe = new vThongKe();
                thongKe.setTenSp(rs.getString(1));
                thongKe.setTensize(rs.getString(2));
                thongKe.setSoLuong(rs.getInt(3));
                thongKe.setNgayTaoHoaDon(rs.getString(4));
                list.add(thongKe);
            }
            return list;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<vThongKe> getBYNgay(String Ngay) {
        List<vThongKe> list = new ArrayList<>();
        ResultSet rs;
//        String sql1 = "Select * from SINHVIEN where SINHVIEN.MASV=?";
        String query = "select TENSP,SIZE.TEN,mausac.ten, sum(HOADONCHITIET.SOLUONG) , CONCAT((HOADONMUAHANG.NGAYTAOHOADON), '')\n"
                + " from HOADONMUAHANG join HOADONCHITIET on HOADONMUAHANG.ID = HOADONCHITIET.IDHOADONMUAHANG\n"
                + "join SANPHAM on HOADONCHITIET.IDSP = SANPHAM.Id \n"
                + "join MAUSAC ON SANPHAM.IDMAUSAC = MAUSAC.ID\n"
                + "JOIN SIZE ON SANPHAM.IDSIZE = SIZE.ID Where NGAYTAOHOADON =? \n"
                + "GROUP BY TENSP,SIZE.TEN,HOADONMUAHANG.NGAYTAOHOADON,mausac.ten";
        rs = JDBC_Helper.selectTongQuat(query, Ngay);
        try {
            while (rs.next()) {
                String tensp = rs.getString(1);
                String size = rs.getString(2);
                String mausac = rs.getString(3);
                int Soluong = rs.getInt(4);
                String Ngaytaohoadon = rs.getString(5);
                vThongKe tkk = new vThongKe(tensp, size, mausac, Soluong, Ngaytaohoadon);
                list.add(tkk);
            }
            return (ArrayList<vThongKe>) list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(Sach_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<vThongKe> getBYNgaya(String Ngay) {
        List<vThongKe> list = new ArrayList<>();
        ResultSet rs;
//        String sql1 = "Select * from SINHVIEN where SINHVIEN.MASV=?";
        String query = "select TENSP,SIZE.TEN,MAUSAC.TEN, sum(HOADONCHITIET.SOLUONG) ,COUNT(day(HOADONMUAHANG.NGAYTAOHOADON))\n"
                + "from HOADONMUAHANG join HOADONCHITIET on HOADONMUAHANG.ID = HOADONCHITIET.IDHOADONMUAHANG\n"
                + "join SANPHAM on HOADONCHITIET.IDSP = SANPHAM.Id \n"
                + "  JOIN SIZE ON SANPHAM.IDSIZE = SIZE.ID \n"
                + "  join MAUSAC ON SANPHAM.IDMAUSAC = MAUSAC.ID where NGAYTAOHOADON =? \n"
                + " GROUP BY TENSP,SIZE.TEN,mausac.ten";
        rs = JDBC_Helper.selectTongQuat(query, Ngay);
        try {
            while (rs.next()) {
                String tensp = rs.getString(1);
                String size = rs.getString(2);
                String mausac = rs.getString(3);
                int Soluong = rs.getInt(4);
                String Ngaytaohoadon = rs.getString(5);
                vThongKe tkk = new vThongKe(tensp, size, mausac, Soluong, Ngaytaohoadon);
                list.add(tkk);
            }
            return (ArrayList<vThongKe>) list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(Sach_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<vThongKe> getBYNgay1(String Ngay) {
        List<vThongKe> list = new ArrayList<>();
        ResultSet rs;
//        String sql1 = "Select * from SINHVIEN where SINHVIEN.MASV=?";
        String query = "	select Concat(NGAYTAOHOADON,''), sum(TONGTIEN) as Tong_tien from HOADONMUAHANG where NGAYTAOHOADON =?\n"
                + "                 	group by NGAYTAOHOADON";
        rs = JDBC_Helper.selectTongQuat(query, Ngay);
        try {
            while (rs.next()) {
                String Ngaytaohoadon = rs.getString(1);
                BigDecimal ThanhTien = rs.getBigDecimal(2);
                vThongKe tkk = new vThongKe(Ngaytaohoadon, ThanhTien);
                list.add(tkk);
            }
            return (ArrayList<vThongKe>) list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(Sach_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<vThongKe> getListByThongKeNam() {
        try {
            Connection con = DBContext.getConnect();
            String query = "SELECT CONCAT(YEAR(NGAYTAOHOADON), ''), SUM(TONGTIEN)\n"
                    + "FROM HOADONMUAHANG\n"
                    + "GROUP BY YEAR(NGAYTAOHOADON)";
            List<vThongKe> listThang = new ArrayList<>();
            PreparedStatement ps = con.prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vThongKe thongKeThang = new vThongKe();
                thongKeThang.setNgayTaoHoaDon(rs.getString(1));
                thongKeThang.setThanhTien(rs.getBigDecimal(2));
                listThang.add(thongKeThang);
            }
            return listThang;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<vThongKe> getListByThongKeNgay() {
        try {
            Connection con = DBContext.getConnect();
            String query = "	select Concat(NGAYTAOHOADON,''), sum(TONGTIEN) as Tong_tien from HOADONMUAHANG\n"
                    + "	group by NGAYTAOHOADON";
            List<vThongKe> listThang = new ArrayList<>();
            PreparedStatement ps = con.prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vThongKe thongKeThang = new vThongKe();
                thongKeThang.setNgayTaoHoaDon(rs.getString(1));
                thongKeThang.setThanhTien(rs.getBigDecimal(2));
                listThang.add(thongKeThang);
            }
            return listThang;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

//    public List<vThongKe> getLisTimAll(String ngayTaoHoaDon) {
//        try {
//            Connection con = DBContext1.getConnection();
//            String query = "select SANPHAM.TENSP, HOADONMUAHANG.NGAYTAOHOADON,HOADONMUAHANG.SOLUONG, SANPHAM.GIABAN,"
//                    + " HOADONMUAHANG.TONGTIEN from HOADONMUAHANG join HOADONCHITIET on HOADONMUAHANG.ID = "
//                    + "HOADONCHITIET.IDHOADONMUAHANG join SANPHAM ON HOADONCHITIET.IDSP = SANPHAM.Id";
//            List<vThongKe> listThang = new ArrayList<>();
//            PreparedStatement ps = con.prepareCall(query);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                vThongKe thongKe = new vThongKe();
//                thongKe.setTenSp(rs.getString(1));
//                thongKe.setNgayTaoHoaDon(rs.getString(2));
//                thongKe.setSoLuong(rs.getInt(3));
//                thongKe.setDonGia(rs.getBigDecimal(4));
//                thongKe.setThanhTien(rs.getBigDecimal(5));
//                listThang.add(thongKe);
//            }
//            return listThang;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
    public List<vThongKe> getListByThongKeThang() {
        try {
            Connection con = DBContext.getConnect();
            String query = "select concat(MONTH(NGAYTAOHOADON),'-',YEAR(NGAYTAOHOADON)), sum(TONGTIEN) from HOADONMUAHANG\n"
                    + "group by month(NGAYTAOHOADON), YEAR(NGAYTAOHOADON)";
            List<vThongKe> listThang = new ArrayList<>();
            PreparedStatement ps = con.prepareCall(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vThongKe thongKeThang = new vThongKe();
                thongKeThang.setNgayTaoHoaDon(rs.getString(1));
                thongKeThang.setThanhTien(rs.getBigDecimal(2));
                listThang.add(thongKeThang);
            }
            return listThang;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
