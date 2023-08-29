/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_model.KhuyenMai;
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
public class KhuyenMai_repository {
        public static List<KhuyenMai> getAllKM() {
        List<KhuyenMai> list = new ArrayList();
        ResultSet rs;
        String sql = "select ID, MA, TENKM, NGAYBATDAU, NGAYKETTHUC, TrangThai, phantramgiam, dieukien from KHUYENMAI";

        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String idkhuyenmai = rs.getString(1);
                String makhuyenmai = rs.getString(2);
                String tenkhuyenmai = rs.getString(3);
                Date ngaybatdau = rs.getDate(4);
                Date ngayketthuc = rs.getDate(5);
                int trangThai = rs.getInt(6);
                int phantramgiam = rs.getInt(7);
                int dieukien = rs.getInt(8);
                KhuyenMai km = new KhuyenMai(idkhuyenmai, makhuyenmai, tenkhuyenmai, ngaybatdau, ngayketthuc, trangThai, phantramgiam, dieukien);
                list.add(km);
            }
            return list;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static KhuyenMai getKmbyMakm(String makm) {
        KhuyenMai km = new KhuyenMai();
        ResultSet rs;
        String sql = "select ID, MA, TENKM, NGAYBATDAU, NGAYKETTHUC, TrangThai, , phantramgiam, dieukien\n"
                + "from KHUYENMAI"
                + "where MA = ? ";

        rs = JDBC_Helper.selectTongQuat(sql, makm);
        try {
            while (rs.next()) {
                String idkhuyenmai = rs.getString(1);
                String makhuyenmai = rs.getString(2);
                String tenkhuyenmai = rs.getString(3);
                Date ngaybatdau = rs.getDate(4);
                Date ngayketthuc = rs.getDate(5);
                int trangThai = rs.getInt(6);
                int phantramgiam = rs.getInt(7);
                int dieukien = rs.getInt(8);
                km = new KhuyenMai(idkhuyenmai, makhuyenmai, tenkhuyenmai, ngaybatdau, ngayketthuc, trangThai, phantramgiam, dieukien);

            }
            return km;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int them(KhuyenMai km) {
        String sql = "insert into KhuyenMai( MA, TENKM, NGAYBATDAU, NGAYKETTHUC, phantramgiam, dieukien) values(?, ?, ?, ?, ?, ?)";
        return JDBC_Helper.updateTongQuat(sql, km.getMaKhuyenMai(), km.getTenKhuyenMai(), km.getNgayBatDau(), km.getNgayKetThuc(), km.getPhantramgiam(), km.getDieukien());
    }

    public static int sưa(KhuyenMai km) {
        String sql = "update  KhuyenMai set  TENKM = ?, NGAYBATDAU = ?, NGAYKETTHUC = ?, phantramgiam = ?, dieukien = ? where MA = ?";
        return JDBC_Helper.updateTongQuat(sql, km.getTenKhuyenMai(), km.getNgayBatDau(), km.getNgayKetThuc(), km.getPhantramgiam(), km.getDieukien(), km.getMaKhuyenMai());
    }

    public static void main(String[] args) {
        // check các chức năng tại đây
        List<KhuyenMai> listCheck = new ArrayList<>();
        listCheck = getAllKM();
        for (KhuyenMai x : listCheck) {
            System.out.println(x.toString());
        }
        // check các chức năng tiếp theo    
    }
}
