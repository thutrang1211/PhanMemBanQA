/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;


import DuAnNhom4_model.QuanLiTaiKhoan;
import DuAnNhom4_utility.JDBC_Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class QuanLyTaiKhoan_repository {
    public static List<QuanLiTaiKhoan> getAll() {
        List<QuanLiTaiKhoan> listLoaiSP = new ArrayList();
        ResultSet rs;
        String sql = "select*from QUANLYTAIKHOAN";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
               
                String IDNV = rs.getString(1);
                String TENTK = rs.getString(2);
                String MATKHAU = rs.getString(3);
                int TrangThai = rs.getInt(4);
                QuanLiTaiKhoan ql = new QuanLiTaiKhoan(IDNV, TENTK, MATKHAU, TrangThai);

                listLoaiSP.add(ql);
            }
            return listLoaiSP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     public static int them(QuanLiTaiKhoan nv) {
        String sql = "insert into QUANLYTAIKHOAN(IDNV,TENTK,MATKHAU,TRANGTHAI) values(?, ?, ?, ?)";
        return JDBC_Helper.updateTongQuat(sql, nv.getIDNV(), nv.getTenTaiKhoan(), nv.getMatKhau(), nv.getTrangThai());
     }
    public static void main(String[] args) {
        // check các chức năng tại đây
        List<QuanLiTaiKhoan> listCheck = new ArrayList<>();
        listCheck = getAll();
        for (QuanLiTaiKhoan x : listCheck) {
            System.out.println(x.toString());
        }
        // check các chức năng tiếp theo    
    }
}
