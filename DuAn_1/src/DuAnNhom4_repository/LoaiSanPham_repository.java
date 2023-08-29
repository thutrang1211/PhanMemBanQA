/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_model.LoaiSanPham;
import DuAnNhom4_utility.JDBC_Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class LoaiSanPham_repository {
     public static List<LoaiSanPham> getAllLoaiSP() {
        List<LoaiSanPham> listLoaiSP = new ArrayList();
        ResultSet rs;
        String sql = "Select Id, Ma, Ten from LoaiSanPham ";

        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String idsp = rs.getString(1);
                String masp = rs.getString(2);
                String tensp = rs.getString(3);
                LoaiSanPham loaisp = new LoaiSanPham(idsp, masp, tensp);
                listLoaiSP.add(loaisp);
            }
            return listLoaiSP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public static LoaiSanPham getLSPByID(String IDLSP) {
        LoaiSanPham LSP = null;
        ResultSet rs;
        String sql = "select * from LOAISANPHAM WHERE LOAISANPHAM.ID=?";
        rs = JDBC_Helper.selectTongQuat(sql, IDLSP);
        try {
            while (rs.next()) {
                String ID = rs.getString(1);
                String MA = rs.getString(2);
                String TEN = rs.getString(3);
                LSP = new LoaiSanPham(ID, MA, TEN);

            }
            return LSP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(Sach_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public static LoaiSanPham getLoaiSPbymaloai(String maloai) {
        LoaiSanPham loaisp = new LoaiSanPham();
        ResultSet rs;
        String sql = "Select Id, Ma, Ten from LoaiSanPham where Ten = ?   ";

        rs = JDBC_Helper.selectTongQuat(sql, maloai);
        try {
            while (rs.next()) {
                String idsp = rs.getString(1);
                String masp = rs.getString(2);
                String tensp = rs.getString(3);
                loaisp = new LoaiSanPham(idsp, masp, tensp);

            }
            return loaisp;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int themLoaiSanPham(LoaiSanPham loaisp) {
        String sql = "insert into LoaiSanPham(Ma, Ten) values(?,?)";
        return JDBC_Helper.updateTongQuat(sql, loaisp.getMaLoai(), loaisp.getTenLoai());
    }

    public static int suaLoaiSanPham(LoaiSanPham loaisp) {
        String sql = "update LoaiSanPham set Ten = ? where Ma=? ";
        return JDBC_Helper.updateTongQuat(sql, loaisp.getTenLoai(), loaisp.getMaLoai());
    }

    public static void main(String[] args) {
        // check các chức năng tại đây
        List<LoaiSanPham> listCheck = new ArrayList<>();
        listCheck = getAllLoaiSP();
        for (LoaiSanPham x : listCheck) {
            System.out.println(x.toString());
        }
        // check các chức năng tiếp theo    
    }
}
