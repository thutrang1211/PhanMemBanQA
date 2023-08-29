/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_utility;

import DuAnNhom4_repository.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dell
 */
public class JDBC_Helper {
     public static ResultSet selectTongQuat(String sql, Object... params) {
        PreparedStatement pstm=null;
        ResultSet rs=null;
        Connection con=null;
        
        try {
            con= DBContext.getConnect();
            pstm = con.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {
                pstm.setObject(i+1, params[i]);
            }
            rs = pstm.executeQuery();
            return rs;

        } catch (SQLException ex) {
            ex.printStackTrace();
            close(con, pstm,rs);
            return null;
            //Logger.getLogger(Khoa_ripository.class.getName()).log(Level.SEVERE, null, ex);
        }

    }   
 public static void  close(Connection con, PreparedStatement pstm){
     
     try {
         pstm.close();
         con.close();
     } catch (SQLException ex) {
         ex.printStackTrace();
         //Logger.getLogger(JDBC_Helper.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static void  close(Connection con, PreparedStatement pstm, ResultSet rs){
     
     try {
         rs.close();
         close(con, pstm);
     } catch (SQLException ex) {
         ex.printStackTrace();
         //Logger.getLogger(JDBC_Helper.class.getName()).log(Level.SEVERE, null, ex);
     }
 }
 public static int updateTongQuat(String sql, Object...params){  
         PreparedStatement pstm=null;
         Connection con=null ;
     try {
         con=DBContext.getConnect();
         pstm=con.prepareStatement(sql);
         for(int i=0;i<params.length; i++){
            pstm.setObject(i+1, params[i]);
         }
         return pstm.executeUpdate();
     } catch (SQLException ex) {
        
         ex.printStackTrace();
         return 0;
         //Logger.getLogger(JDBC_Helper.class.getName()).log(Level.SEVERE, null, ex);
     }
     finally{
         close(con, pstm);
     }
        
     } 
}
