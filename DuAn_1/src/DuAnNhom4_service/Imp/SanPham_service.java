/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_service.Imp;

import DuAnNhom4_model.SanPham;
import DuAnNhom4_repository.SanPham_repository;
import java.util.List;

/**
 *
 * @author Dell
 */
public class SanPham_service {
      public static List<SanPham> getAllSP() {
        return SanPham_repository.getAllSP();
    }

//    public static SanPham getLoaiSPbyMa(String ma) {
//        return SanPham_repository.getSPbymaSP(ma);
//    }
}
