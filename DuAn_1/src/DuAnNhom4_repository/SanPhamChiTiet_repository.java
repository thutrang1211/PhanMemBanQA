/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_utility.JDBC_Helper;
import DuAnNhom4_viewmodel.SanPhamChiTiet;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class SanPhamChiTiet_repository {

    public static List<SanPhamChiTiet> getAll() {
        List<SanPhamChiTiet> list = new ArrayList();
        ResultSet rs;
        String sql = "SELECT  LOAISANPHAM.ID, LOAISANPHAM.MA,LOAISANPHAM.TEN,"
                + " MAUSAC.ID , MAUSAC.MA , MAUSAC.TEN, \n"
                + "SIZE.ID , SIZE.MA , SIZE.TEN ,\n"
                + "THUONGHIEU.ID , THUONGHIEU.MA , THUONGHIEU.TEN ,\n"
                + "SANPHAM.ID, MASP, TENSP, SOLUONG, HINHANH, CHATLIEU,GIANHAP,GIABAN \n"
                + "FROM SANPHAM INNER JOIN LOAISANPHAM ON SANPHAM.IDLOAISP=LOAISANPHAM.ID\n"
                + "RIGHT OUTER JOIN THUONGHIEU ON SANPHAM.IDTHUONGHIEU=THUONGHIEU.ID\n"
                + "RIGHT OUTER JOIN MAUSAC ON SANPHAM.IDMAUSAC=MAUSAC.ID \n"
                + "INNER JOIN SIZE ON SANPHAM.IDSIZE=SIZE.ID ";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {

                String IDLOAISP = rs.getString(1);
                String MALOAI = rs.getString(2);
                String TENLOAI = rs.getString(3);
                String IDMAUSAC = rs.getString(4);
                String MAMS = rs.getString(5);
                String TENMS = rs.getString(6);
                String IDSIZE = rs.getString(7);
                String MASIZE = rs.getString(8);
                String TENSIZE = rs.getString(9);
                String IDTHUONGHIEU = rs.getString(10);
                String MATHUONGHIEU = rs.getString(11);
                String TENTHUONGHIEU = rs.getString(12);
                String idsp = rs.getString(13);
                String masp = rs.getString(14);
                String tensp = rs.getString(15);
                int soluongsp = rs.getInt(16);
                String hinhanhsp = rs.getString(17);
                String chatLieu = rs.getString(18);
                BigDecimal gianhap = rs.getBigDecimal(19);
                BigDecimal giaban = rs.getBigDecimal(20);

                SanPhamChiTiet sp = new SanPhamChiTiet(IDLOAISP, MALOAI, TENLOAI, IDMAUSAC, MAMS, TENMS, IDSIZE, MASIZE, TENSIZE, IDTHUONGHIEU, MATHUONGHIEU, TENTHUONGHIEU, idsp, masp, soluongsp, tensp, hinhanhsp, chatLieu, gianhap, giaban);
                list.add(sp);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<SanPhamChiTiet> timKiemTen(String Ten) {
         List<SanPhamChiTiet> listSP = new ArrayList<>();
        ResultSet rs;

        String sql = "SELECT  LOAISANPHAM.ID, LOAISANPHAM.MA,LOAISANPHAM.TEN,"
                + " MAUSAC.ID , MAUSAC.MA , MAUSAC.TEN, \n"
                + "SIZE.ID , SIZE.MA , SIZE.TEN ,\n"
                + "THUONGHIEU.ID , THUONGHIEU.MA , THUONGHIEU.TEN ,\n"
                + "SANPHAM.ID, MASP, TENSP, SOLUONG, HINHANH, CHATLIEU,GIANHAP,GIABAN \n"
                + "FROM SANPHAM INNER JOIN LOAISANPHAM ON SANPHAM.IDLOAISP=LOAISANPHAM.ID\n"
                + "RIGHT OUTER JOIN THUONGHIEU ON SANPHAM.IDTHUONGHIEU=THUONGHIEU.ID\n"
                + "RIGHT OUTER JOIN MAUSAC ON SANPHAM.IDMAUSAC=MAUSAC.ID \n"
                + "INNER JOIN SIZE ON SANPHAM.IDSIZE=SIZE.ID \n"
                + "WHERE SANPHAM.TENSP LIKE N'%" + Ten + "%'";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String IDLOAISP = rs.getString(1);
                String MALOAI = rs.getString(2);
                String TENLOAI = rs.getString(3);
                String IDMAUSAC = rs.getString(4);
                String MAMS = rs.getString(5);
                String TENMS = rs.getString(6);
                String IDSIZE = rs.getString(7);
                String MASIZE = rs.getString(8);
                String TENSIZE = rs.getString(9);
                String IDTHUONGHIEU = rs.getString(10);
                String MATHUONGHIEU = rs.getString(11);
                String TENTHUONGHIEU = rs.getString(12);
                String idsp = rs.getString(13);
                String masp = rs.getString(14);
                String tensp = rs.getString(15);
                int soluongsp = rs.getInt(16);
                String hinhanhsp = rs.getString(17);
                String chatLieu = rs.getString(18);
                BigDecimal gianhap = rs.getBigDecimal(19);
                BigDecimal giaban = rs.getBigDecimal(20);

                SanPhamChiTiet sp = new SanPhamChiTiet(IDLOAISP, MALOAI, TENLOAI, IDMAUSAC, MAMS, TENMS, IDSIZE, MASIZE, TENSIZE, IDTHUONGHIEU, MATHUONGHIEU, TENTHUONGHIEU, idsp, masp, soluongsp, tensp, hinhanhsp, chatLieu, gianhap, giaban);
                listSP.add(sp);
            }
            return (ArrayList<SanPhamChiTiet>) listSP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static ArrayList<SanPhamChiTiet> timKiemMa(String MA) {
        List<SanPhamChiTiet> listSP = new ArrayList<>();
        ResultSet rs;

        String sql = "SELECT  LOAISANPHAM.ID, LOAISANPHAM.MA,LOAISANPHAM.TEN,"
                + " MAUSAC.ID , MAUSAC.MA , MAUSAC.TEN, \n"
                + "SIZE.ID , SIZE.MA , SIZE.TEN ,\n"
                + "THUONGHIEU.ID , THUONGHIEU.MA , THUONGHIEU.TEN ,\n"
                + "SANPHAM.ID, MASP, TENSP, SOLUONG, HINHANH, CHATLIEU,GIANHAP,GIABAN \n"
                + "FROM SANPHAM INNER JOIN LOAISANPHAM ON SANPHAM.IDLOAISP=LOAISANPHAM.ID\n"
                + "RIGHT OUTER JOIN THUONGHIEU ON SANPHAM.IDTHUONGHIEU=THUONGHIEU.ID\n"
                + "RIGHT OUTER JOIN MAUSAC ON SANPHAM.IDMAUSAC=MAUSAC.ID \n"
                + "INNER JOIN SIZE ON SANPHAM.IDSIZE=SIZE.ID \n"
                + "WHERE MASP LIKE N'%" + MA + "%'";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String IDLOAISP = rs.getString(1);
                String MALOAI = rs.getString(2);
                String TENLOAI = rs.getString(3);
                String IDMAUSAC = rs.getString(4);
                String MAMS = rs.getString(5);
                String TENMS = rs.getString(6);
                String IDSIZE = rs.getString(7);
                String MASIZE = rs.getString(8);
                String TENSIZE = rs.getString(9);
                String IDTHUONGHIEU = rs.getString(10);
                String MATHUONGHIEU = rs.getString(11);
                String TENTHUONGHIEU = rs.getString(12);
                String idsp = rs.getString(13);
                String masp = rs.getString(14);
                String tensp = rs.getString(15);
                int soluongsp = rs.getInt(16);
                String hinhanhsp = rs.getString(17);
                String chatLieu = rs.getString(18);
                BigDecimal gianhap = rs.getBigDecimal(19);
                BigDecimal giaban = rs.getBigDecimal(20);

                SanPhamChiTiet sp = new SanPhamChiTiet(IDLOAISP, MALOAI, TENLOAI, IDMAUSAC, MAMS, TENMS, IDSIZE, MASIZE, TENSIZE, IDTHUONGHIEU, MATHUONGHIEU, TENTHUONGHIEU, idsp, masp, soluongsp, tensp, hinhanhsp, chatLieu, gianhap, giaban);
                listSP.add(sp);
            }
            return (ArrayList<SanPhamChiTiet>) listSP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static SanPhamChiTiet getBYSIZE(String SIZE) {
        SanPhamChiTiet SP = null;
        ResultSet rs;
//        String sql1 = "Select * from SINHVIEN where SINHVIEN.MASV=?";
        String sql
                = """
                SELECT  LOAISANPHAM.ID, LOAISANPHAM.MA,LOAISANPHAM.TEN, MAUSAC.ID , MAUSAC.MA , MAUSAC.TEN, 
                SIZE.ID , SIZE.MA , SIZE.TEN ,
                THUONGHIEU.ID , THUONGHIEU.MA , THUONGHIEU.TEN ,
                SANPHAM.ID, MASP, TENSP, SOLUONG, HINHANH, CHATLIEU,GIANHAP,GIABAN 
                FROM SANPHAM INNER JOIN LOAISANPHAM ON SANPHAM.IDLOAISP=LOAISANPHAM.ID
                RIGHT OUTER JOIN THUONGHIEU ON SANPHAM.IDTHUONGHIEU=THUONGHIEU.ID
                RIGHT OUTER JOIN MAUSAC ON SANPHAM.IDMAUSAC=MAUSAC.ID 
                INNER JOIN SIZE ON SANPHAM.IDSIZE=SIZE.ID 
                WHERE SIZE.TEN=? """;
        rs = JDBC_Helper.selectTongQuat(sql, SIZE);
        try {
            while (rs.next()) {
                String IDLOAISP = rs.getString(1);
                String MALOAI = rs.getString(2);
                String TENLOAI = rs.getString(3);
                String IDMAUSAC = rs.getString(4);
                String MAMS = rs.getString(5);
                String TENMS = rs.getString(6);
                String IDSIZE = rs.getString(7);
                String MASIZE = rs.getString(8);
                String TENSIZE = rs.getString(9);
                String IDTHUONGHIEU = rs.getString(10);
                String MATHUONGHIEU = rs.getString(11);
                String TENTHUONGHIEU = rs.getString(12);
                String idsp = rs.getString(13);
                String masp = rs.getString(14);
                String tensp = rs.getString(15);
                int soluongsp = rs.getInt(16);
                String hinhanhsp = rs.getString(17);
                String chatLieu = rs.getString(18);
                BigDecimal gianhap = rs.getBigDecimal(19);
                BigDecimal giaban = rs.getBigDecimal(20);

                SP = new SanPhamChiTiet(IDLOAISP, MALOAI, TENLOAI, IDMAUSAC, MAMS, TENMS, IDSIZE, MASIZE, TENSIZE, IDTHUONGHIEU, MATHUONGHIEU, TENTHUONGHIEU, idsp, masp, soluongsp, tensp, hinhanhsp, chatLieu, gianhap, giaban);

            }
            return SP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(Sach_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static SanPhamChiTiet getBYMA(String MA) {
        SanPhamChiTiet SP = null;
        ResultSet rs;
//        String sql1 = "Select * from SINHVIEN where SINHVIEN.MASV=?";
        String sql
                = """
                SELECT  LOAISANPHAM.ID, LOAISANPHAM.MA,LOAISANPHAM.TEN, MAUSAC.ID , MAUSAC.MA , MAUSAC.TEN, 
                SIZE.ID , SIZE.MA , SIZE.TEN ,
                THUONGHIEU.ID , THUONGHIEU.MA , THUONGHIEU.TEN ,
                SANPHAM.ID, MASP, TENSP, SOLUONG, HINHANH, CHATLIEU,GIANHAP,GIABAN 
                FROM SANPHAM INNER JOIN LOAISANPHAM ON SANPHAM.IDLOAISP=LOAISANPHAM.ID
                RIGHT OUTER JOIN THUONGHIEU ON SANPHAM.IDTHUONGHIEU=THUONGHIEU.ID
                RIGHT OUTER JOIN MAUSAC ON SANPHAM.IDMAUSAC=MAUSAC.ID 
                INNER JOIN SIZE ON SANPHAM.IDSIZE=SIZE.ID 
                WHERE SANPHAM.MASP=? """;
        rs = JDBC_Helper.selectTongQuat(sql, MA);
        try {
            while (rs.next()) {
                String IDLOAISP = rs.getString(1);
                String MALOAI = rs.getString(2);
                String TENLOAI = rs.getString(3);
                String IDMAUSAC = rs.getString(4);
                String MAMS = rs.getString(5);
                String TENMS = rs.getString(6);
                String IDSIZE = rs.getString(7);
                String MASIZE = rs.getString(8);
                String TENSIZE = rs.getString(9);
                String IDTHUONGHIEU = rs.getString(10);
                String MATHUONGHIEU = rs.getString(11);
                String TENTHUONGHIEU = rs.getString(12);
                String idsp = rs.getString(13);
                String masp = rs.getString(14);
                String tensp = rs.getString(15);
                int soluongsp = rs.getInt(16);
                String hinhanhsp = rs.getString(17);
                String chatLieu = rs.getString(18);
                BigDecimal gianhap = rs.getBigDecimal(19);
                BigDecimal giaban = rs.getBigDecimal(20);

                SP = new SanPhamChiTiet(IDLOAISP, MALOAI, TENLOAI, IDMAUSAC, MAMS, TENMS, IDSIZE, MASIZE, TENSIZE, IDTHUONGHIEU, MATHUONGHIEU, TENTHUONGHIEU, idsp, masp, soluongsp, tensp, hinhanhsp, chatLieu, gianhap, giaban);

            }
            return SP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(Sach_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static SanPhamChiTiet getByTen(String TenSP, String Size, String Thuonghieu, String MauSac) {
        SanPhamChiTiet sp = null;
        ResultSet rs;
//        String sql1 = "Select * from SINHVIEN where SINHVIEN.MASV=?";
        String sql = """
                     SELECT LOAISANPHAM.ID, LOAISANPHAM.MA, LOAISANPHAM.TEN, MAUSAC.ID , MAUSAC.MA , MAUSAC.TEN, 
                     SIZE.ID , SIZE.MA , SIZE.TEN ,
                     THUONGHIEU.ID , THUONGHIEU.MA , THUONGHIEU.TEN ,
                     SANPHAM.ID, MASP, TENSP, SOLUONG, HINHANH, CHATLIEU,GIANHAP,GIABAN 
                     FROM SANPHAM INNER JOIN LOAISANPHAM ON SANPHAM.IDLOAISP=LOAISANPHAM.ID
                     RIGHT OUTER JOIN THUONGHIEU ON SANPHAM.IDTHUONGHIEU=THUONGHIEU.ID
                     RIGHT OUTER JOIN MAUSAC ON SANPHAM.IDMAUSAC=MAUSAC.ID 
                     INNER JOIN SIZE ON SANPHAM.IDSIZE=SIZE.ID 
                     WHERE SANPHAM.TENSP=? and SIZE.TEN=?  and THUONGHIEU.TEN=? and  MAUSAC.TEN=?  """;
        rs = JDBC_Helper.selectTongQuat(sql, TenSP, Size, Thuonghieu, MauSac);
        try {
            while (rs.next()) {
                String IDLOAISP = rs.getString(1);
                String MALOAI = rs.getString(2);
                String TENLOAI = rs.getString(3);
                String IDMAUSAC = rs.getString(4);
                String MAMS = rs.getString(5);
                String TENMS = rs.getString(6);
                String IDSIZE = rs.getString(7);
                String MASIZE = rs.getString(8);
                String TENSIZE = rs.getString(9);
                String IDTHUONGHIEU = rs.getString(10);
                String MATHUONGHIEU = rs.getString(11);
                String TENTHUONGHIEU = rs.getString(12);
                String idsp = rs.getString(13);
                String masp = rs.getString(14);
                String tensp = rs.getString(15);
                int soluongsp = rs.getInt(16);
                String hinhanhsp = rs.getString(17);
                String chatLieu = rs.getString(18);
                BigDecimal gianhap = rs.getBigDecimal(19);
                BigDecimal giaban = rs.getBigDecimal(20);

                sp = new SanPhamChiTiet(IDLOAISP, MALOAI, TENLOAI, IDMAUSAC, MAMS, TENMS, IDSIZE, MASIZE, TENSIZE, IDTHUONGHIEU, MATHUONGHIEU, TENTHUONGHIEU, idsp, masp, soluongsp, tensp, hinhanhsp, chatLieu, gianhap, giaban);
                
            }
            return sp;
        } catch (SQLException e) {
            return null;
            //Logger.getLogger(Sach_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static ArrayList<SanPhamChiTiet> getByTen1(String TenSP, String Size) {
        List<SanPhamChiTiet> listSP = new ArrayList<>();
        ResultSet rs;
//        String sql1 = "Select * from SINHVIEN where SINHVIEN.MASV=?";
        String sql = """
                     SELECT LOAISANPHAM.ID, LOAISANPHAM.MA, LOAISANPHAM.TEN, MAUSAC.ID , MAUSAC.MA , MAUSAC.TEN, 
                     SIZE.ID , SIZE.MA , SIZE.TEN ,
                     THUONGHIEU.ID , THUONGHIEU.MA , THUONGHIEU.TEN ,
                     SANPHAM.ID, MASP, TENSP, SOLUONG, HINHANH, CHATLIEU,GIANHAP,GIABAN 
                     FROM SANPHAM INNER JOIN LOAISANPHAM ON SANPHAM.IDLOAISP=LOAISANPHAM.ID
                     RIGHT OUTER JOIN THUONGHIEU ON SANPHAM.IDTHUONGHIEU=THUONGHIEU.ID
                     RIGHT OUTER JOIN MAUSAC ON SANPHAM.IDMAUSAC=MAUSAC.ID 
                     INNER JOIN SIZE ON SANPHAM.IDSIZE=SIZE.ID 
                     WHERE SANPHAM.TENSP=? and SIZE.TEN=?  """;
        rs = JDBC_Helper.selectTongQuat(sql, TenSP, Size);
        try {
            while (rs.next()) {
                String IDLOAISP = rs.getString(1);
                String MALOAI = rs.getString(2);
                String TENLOAI = rs.getString(3);
                String IDMAUSAC = rs.getString(4);
                String MAMS = rs.getString(5);
                String TENMS = rs.getString(6);
                String IDSIZE = rs.getString(7);
                String MASIZE = rs.getString(8);
                String TENSIZE = rs.getString(9);
                String IDTHUONGHIEU = rs.getString(10);
                String MATHUONGHIEU = rs.getString(11);
                String TENTHUONGHIEU = rs.getString(12);
                String idsp = rs.getString(13);
                String masp = rs.getString(14);
                String tensp = rs.getString(15);
                int soluongsp = rs.getInt(16);
                String hinhanhsp = rs.getString(17);
                String chatLieu = rs.getString(18);
                BigDecimal gianhap = rs.getBigDecimal(19);
                BigDecimal giaban = rs.getBigDecimal(20);

                SanPhamChiTiet sp = new SanPhamChiTiet(IDLOAISP, MALOAI, TENLOAI, IDMAUSAC, MAMS, TENMS, IDSIZE, MASIZE, TENSIZE, IDTHUONGHIEU, MATHUONGHIEU, TENTHUONGHIEU, idsp, masp, soluongsp, tensp, hinhanhsp, chatLieu, gianhap, giaban);
                listSP.add(sp);
            }
            return (ArrayList<SanPhamChiTiet>) listSP;
        } catch (SQLException e) {
            return null;
            //Logger.getLogger(Sach_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int THEMSPCT(SanPhamChiTiet SPCT) {
        String sql = "insert into SANPHAM(IDLOAISP ,IDMAUSAC,IDSIZE,IDTHUONGHIEU,MASP, TENSP, SOLUONG, HINHANH, CHATLIEU,GIANHAP,GIABAN) values(?,?,?,?,?,?,?,?,?,?,?)";
        return JDBC_Helper.updateTongQuat(sql,
                SPCT.getIDLOAISP(),
                SPCT.getIDMAUSAC(),
                SPCT.getIDSIZE(),
                SPCT.getIDTHUONGHIEU(),
                SPCT.getMASP(),
                SPCT.getTENSP(),
                SPCT.getSOLUONG(),
                SPCT.getHINHANH(),
                SPCT.getCHATLIEU(),
                SPCT.getGIANHAP(),
                SPCT.getGIABAN());
    }

    public static int SUASPCT(SanPhamChiTiet SPCT) {
        String sql = "update  SANPHAM set TENSP=?,SOLUONG=?,HINHANH=?,CHATLIEU=?,GIANHAP=?,GIABAN=? where MASP=? ";
        return JDBC_Helper.updateTongQuat(sql, SPCT.getTENSP(),
                SPCT.getSOLUONG(), SPCT.getHINHANH(), SPCT.getCHATLIEU(), SPCT.getGIANHAP(), SPCT.getGIABAN());

    }

    public static int capNhatSoLuongSP(String masp, int soLuongMat) {
        SanPhamChiTiet sp = getBYMA(masp);
        int soLuong = sp.getSOLUONG();
        sp.setSOLUONG(soLuong + soLuongMat);

        String sql = "UPDATE SANPHAM SET SOLUONG = ? WHERE MASP= ?";
        return JDBC_Helper.updateTongQuat(sql, sp.getSOLUONG(), sp.getMASP());

    }
    ArrayList<SanPhamChiTiet> listSanPham = null;

    public ArrayList<SanPhamChiTiet> getSanPhamTheoLoai(String idloaisp) {
        if (!idloaisp.trim().equals("")) {
            ArrayList<SanPhamChiTiet> listVSP = new ArrayList<>();
            try {
                //  int maLoai = Integer.parseInt(ma);

                for (SanPhamChiTiet sp : listSanPham) {
                    if (sp.getIDLOAISP() == idloaisp) {
                        listVSP.add(sp);
                    }
                }
                return listVSP;
            } catch (Exception e) {
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<SanPhamChiTiet> ListCheck = new ArrayList<>();
        ListCheck = getAll();
        for (SanPhamChiTiet CTSP : ListCheck) {
            System.out.println(CTSP.toString());
        }
    }
}
