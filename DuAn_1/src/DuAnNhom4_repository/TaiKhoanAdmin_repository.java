/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_model.TaikhoanAdmin;
import DuAnNhom4_utility.JDBC_Helper;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class TaiKhoanAdmin_repository {

    public static List<TaikhoanAdmin> getAllNV() {
        List<TaikhoanAdmin> listNV = new ArrayList();
        ResultSet rs;
        String sql = "select * from TAIKHOANADMIN";
        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String ID = rs.getString(1);
                String TENTK = rs.getString(2);
                String MATKHAU = rs.getString(3);

                TaikhoanAdmin nv = new TaikhoanAdmin(ID, TENTK, MATKHAU);
                listNV.add(nv);
            }
            return listNV;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static TaikhoanAdmin getUSERByID(String TEN) {
        TaikhoanAdmin TK = null;
        ResultSet rs;
        String sql = "Select * from [TAIKHOANADMIN] where [TENTK] = ?";
        rs = JDBC_Helper.selectTongQuat(sql, TEN);
        try {
            while (rs.next()) {
                String ID = rs.getString(1);
                String TENTK = rs.getString(2);
                String MATKHAU = rs.getString(3);

                TK = new TaikhoanAdmin(ID, TENTK, MATKHAU);

            }
            return TK;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(Sach_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static boolean checkLogin(String USERNAME, String PASSWORD) {
        TaikhoanAdmin us = getUSERByID(USERNAME);
        if (us != null) {
            if (us.getMATKHAU().equals(PASSWORD)) {
                return true;
            }
        }
        return false;
    }
}
