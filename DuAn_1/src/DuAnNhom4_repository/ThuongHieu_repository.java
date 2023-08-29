/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_repository;


import DuAnNhom4_model.ThuongHieu;
import DuAnNhom4_utility.JDBC_Helper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class ThuongHieu_repository {
    public static List<ThuongHieu> getAll() {
        List<ThuongHieu> listLoaiSP = new ArrayList();
        ResultSet rs;
        String sql = "Select * from THUONGHIEU ";

        rs = JDBC_Helper.selectTongQuat(sql);
        try {
            while (rs.next()) {
                String ID = rs.getString(1);
                String MA = rs.getString(2);
                String TEN = rs.getString(3);
                ThuongHieu S = new ThuongHieu(ID, MA, TEN);
                listLoaiSP.add(S);
            }
            return listLoaiSP;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public static ThuongHieu getLoaiSPbymaloai(String maloai) {
        ThuongHieu loaisp = new ThuongHieu();
        ResultSet rs;
        String sql = "Select Id, Ma, Ten from ThuongHieu where Ten = ?   ";

        rs = JDBC_Helper.selectTongQuat(sql, maloai);
        try {
            while (rs.next()) {
                String ID = rs.getString(1);
                String MA = rs.getString(2);
                String TEN = rs.getString(3);
                loaisp= new ThuongHieu(ID, MA, TEN);

            }
            return loaisp;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
            //Logger.getLogger(GiangVien_Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        public static int them(ThuongHieu loaisp) {
        String sql = "insert into THUONGHIEU(Ma, Ten) values(?,?)";
        return JDBC_Helper.updateTongQuat(sql, loaisp.getMA(), loaisp.getTEN());
    }

    public static int sua(ThuongHieu loaisp) {
        String sql = "update THUONGHIEU set Ten = ? where Ma=? ";
        return JDBC_Helper.updateTongQuat(sql, loaisp.getTEN(), loaisp.getMA());
    }
      public static void main(String[] args) {
        // check các chức năng tại đây
        List<ThuongHieu> listCheck = new ArrayList<>();
        listCheck = getAll();
        for (ThuongHieu x : listCheck) {
            System.out.println(x.toString());
        }
        // check các chức năng tiếp theo    
    }
}
