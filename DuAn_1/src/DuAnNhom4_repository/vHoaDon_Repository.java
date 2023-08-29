/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_Repository;

import DuAnNhom4_Viewmodel.vHoaDon;
import java.util.List;
import DuAnNhom4_utility.JDBC_Helper;
import MyCostom.MyDialog;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author acer
 */
public class vHoaDon_Repository {

    String pattern = "yyyy//MM//dd";
    SimpleDateFormat formatter = new SimpleDateFormat(pattern);
    ArrayList<vHoaDon> listHoaDon;
//    private vHoaDon_Repository vhd = new vHoaDon_Repository();
public static List<vHoaDon> getHD() {
        List<vHoaDon> listVHD = new ArrayList();
        ResultSet rs;

        String sql = "select HOADONMUAHANG.ID, MAHD,NGAYTAOHOADON, TONGTIEN\n"
                + "from HOADONMUAHANG ";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String idhd = rs.getString(1);
                String mahd = rs.getString(2);
                Date ngayTao = rs.getDate(3);
                int tongTien = rs.getInt(4);
                vHoaDon vhd = new vHoaDon(idhd, mahd, ngayTao, tongTien);
                listVHD.add(vhd);
            }
            return listVHD;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static List<vHoaDon> getAllVHD() {
        List<vHoaDon> listVHD = new ArrayList();
        ResultSet rs;

        String sql = "select HOADONMUAHANG.ID 'ID HOA DON', MAHD, NHANVIEN.ID 'ID NV', MANV, NGAYTAOHOADON,TONGTIEN\n"
                + "from KHUYENMAI join HOADONMUAHANG on KHUYENMAI.ID = HOADONMUAHANG.IDKM\n"
                + "join NHANVIEN on HOADONMUAHANG.IDNV = NHANVIEN.ID";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String idhd = rs.getString(1);
                String mahd = rs.getString(2);
                String idnv = rs.getString(3);
                String manv = rs.getString(4);
                Date ngayTao = rs.getDate(5);
                int tongTien = rs.getInt(6);
                vHoaDon vhd = new vHoaDon(idhd, mahd, idnv, manv, ngayTao, tongTien);
                listVHD.add(vhd);
            }
            return listVHD;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static vHoaDon getMabyHoaDOn(String maHD) {
        vHoaDon vhd = new vHoaDon();
        ResultSet rs;
        String sql = "select HOADONMUAHANG.ID 'ID HOA DON', MAHD, NHANVIEN.ID 'ID NV', MANV, NGAYTAOHOADON,TONGTIEN\n"
                + "from KHUYENMAI join HOADONMUAHANG on KHUYENMAI.ID = HOADONMUAHANG.IDKM\n"
                + "join NHANVIEN on HOADONMUAHANG.IDNV = NHANVIEN.ID"
                + "where MAHD = ?";
        rs = JDBC_Helper.selectTongQuat(sql, maHD);
        try {
            while (rs.next()) {
                String idhd = rs.getString(1);
                String mahd = rs.getString(2);
                String idnv = rs.getString(3);
                String manv = rs.getString(4);
                Date ngayTao = rs.getDate(5);
                int tongTien = rs.getInt(6);
                vhd = new vHoaDon(idhd, mahd, idnv, manv, ngayTao, tongTien);
            }
            return vhd;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int themHD(vHoaDon vhd) {
        String sql = "insert into HOADONMUAHANG(IDNV, NGAYTAOHOADON, TONGTIEN) values( ?, ?, ?)";
        return JDBC_Helper.updateTongQuat(sql, vhd.getIdNV(), vhd.getNgaytao(), vhd.getTongTien());
    }

    public String getMaHoaDonMoiNhat() {
        try {
            ResultSet rs;
            String sql = "SELECT TOP 1 ID FROM HOADONMUAHANG ORDER BY MAHD DESC";
            rs = JDBC_Helper.selectTongQuat(sql);
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<vHoaDon> getListHoaDon(java.sql.Date dateMin, java.sql.Date dateMax) {
        ArrayList<vHoaDon> listVHD = new ArrayList();
        ResultSet rs;
        String sql = "SELECT * FROM HOADONMUAHANG WHERE NGAYTAOHOADON BETWEEN CAST(? AS DATE) AND CAST(? AS DATE)";
        rs = JDBC_Helper.selectTongQuat(sql, dateMin, dateMax);
        try {
            while (rs.next()) {
                String idhd = rs.getString(1);
                String mahd = rs.getString(2);
                String idnv = rs.getString(3);
                String manv = rs.getString(4);
                Date ngayTao = rs.getDate(5);
                int tongTien = rs.getInt(6);
                vHoaDon vhd = new vHoaDon(idhd, mahd, idnv, manv, ngayTao, tongTien);
                listVHD.add(vhd);
            }
            return listVHD;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        // check các chức năng tại đây
        List<vHoaDon> listCheck = new ArrayList<>();
        listCheck = getAllVHD();
        for (vHoaDon x : listCheck) {
            System.out.println(x.toString());
        }
    }

    public ArrayList<vHoaDon> getListHoaDonTheoGia(String min, String max) {
        try {

            int minPrice = Integer.parseInt(min);
            int maxPrice = Integer.parseInt(max);
            ArrayList<vHoaDon> dshd = new ArrayList<>();
            for (vHoaDon hd : listHoaDon) {
                if (hd.getTongTien() > minPrice && hd.getTongTien() < maxPrice) {
                    dshd.add(hd);
                }
            }
            return dshd;
        } catch (Exception e) {
            new MyDialog("Hãy nhập khoảng giá hợp lệ", MyDialog.ERROR_DIALOG);
        }
        return null;
    }

    public ArrayList<vHoaDon> getListHoaDonTheoNgay(String min, String max) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Date minDate = sdf.parse(min);
            Date maxDate = sdf.parse(max);

            java.sql.Date dateMin = new java.sql.Date(minDate.getTime());
            java.sql.Date dateMax = new java.sql.Date(maxDate.getTime());

           getListHoaDon(dateMin, dateMax);
//            return dshd;
        } catch (Exception e) {
            new MyDialog("Hãy nhập khoảng ngày hợp lệ!", MyDialog.ERROR_DIALOG);
        }
        return null;
    }

    public void luuHoaDon(String nhanVien, Date ngaylap, int tongTien) {
        vHoaDon hd = new vHoaDon();
        String[] arrNV = nhanVien.split(" - ");
        String maNV = arrNV[1];
        hd.setMaNV(maNV);
        hd.setNgaytao(ngaylap);
        hd.setTongTien(tongTien);

        vHoaDon_Repository.themHD(hd);
    }

   


}
