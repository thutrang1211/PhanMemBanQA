/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;

import DuAnNhom4_model.MauSac;
import DuAnNhom4_utility.JDBC_Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class MauSac_repository {
      public static List<MauSac> getAll() {
        List<MauSac> listLoaiSP = new ArrayList();
        ResultSet rs;
        String sql = "Select * from MAUSAC ";

        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String ID = rs.getString(1);
                String MA = rs.getString(2);
                String TEN = rs.getString(3);
                MauSac S = new MauSac(ID, MA, TEN);
                listLoaiSP.add(S);
            }
            return listLoaiSP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public static MauSac getLoaiSPbymaloai(String maloai) {
        MauSac loaisp = new MauSac();
        ResultSet rs;
        String sql = "Select Id, Ma, Ten from mausac  where Ten = ?   ";

        rs = JDBC_Helper.selectTongQuat(sql, maloai);
        try {
            while (rs.next()) {
                 String ID = rs.getString(1);
                String MA = rs.getString(2);
                String TEN = rs.getString(3);
                 loaisp = new MauSac(ID, MA, TEN);

            }
            return loaisp;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public static int them(MauSac loaisp) {
        String sql = "insert into MauSac(Ma, Ten) values(?,?)";
        return JDBC_Helper.updateTongQuat(sql, loaisp.getMAMS(), loaisp.getTENMAU());
    }

    public static int sua(MauSac loaisp) {
        String sql = "update MauSac set Ten = ? where Ma=? ";
        return JDBC_Helper.updateTongQuat(sql, loaisp.getTENMAU(), loaisp.getMAMS());
    }
      public static void main(String[] args) {
        // check các chức năng tại đây
        List<MauSac> listCheck = new ArrayList<>();
        listCheck = getAll();
        for (MauSac x : listCheck) {
            System.out.println(x.toString());
        }
        // check các chức năng tiếp theo    
    }
}
