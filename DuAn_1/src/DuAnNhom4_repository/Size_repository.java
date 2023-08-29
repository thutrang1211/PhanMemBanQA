/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;


import DuAnNhom4_model.Size;
import DuAnNhom4_utility.JDBC_Helper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Size_repository {
     public static List<Size> getAllSize() {
        List<Size> listLoaiSP = new ArrayList();
        ResultSet rs;
        String sql = "Select * from Size ";

        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String ID = rs.getString(1);
                String MASIZE = rs.getString(2);
                String TENSIZE = rs.getString(3);
                Size S = new Size(ID, MASIZE, TENSIZE);
                listLoaiSP.add(S);
            }
            return listLoaiSP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public static Size getLoaiSPbymaloai(String maloai) {
        Size loaisp = new Size();
        ResultSet rs;
        String sql = "Select Id, Ma, Ten from size where Ten = ?   ";

        rs = JDBC_Helper.selectTongQuat(sql, maloai);
        try {
            while (rs.next()) {
                String ID = rs.getString(1);
                String MASIZE = rs.getString(2);
                String TENSIZE = rs.getString(3);
                loaisp = new Size(ID, MASIZE, TENSIZE);

            }
            return loaisp;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public static int them(Size loaisp) {
        String sql = "insert into SIZE(Ma, Ten) values(?,?)";
        return JDBC_Helper.updateTongQuat(sql, loaisp.getMASIZE(), loaisp.getTENSIZE());
    }

    public static int sua(Size loaisp) {
        String sql = "update SIZE set Ten = ? where Ma=? ";
        return JDBC_Helper.updateTongQuat(sql, loaisp.getTENSIZE(), loaisp.getMASIZE());
    }
      public static void main(String[] args) {
        // check các chức năng tại đây
        List<Size> listCheck = new ArrayList<>();
        listCheck = getAllSize();
        for (Size x : listCheck) {
            System.out.println(x.toString());
        }
        // check các chức năng tiếp theo    
    }
}
