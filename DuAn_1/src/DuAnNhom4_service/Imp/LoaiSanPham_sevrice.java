/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_service.Imp;

import DuAnNhom4_model.LoaiSanPham;
import DuAnNhom4_repository.LoaiSanPham_repository;
import java.util.List;

/**
 *
 * @author Dell
 */
public class LoaiSanPham_sevrice {
    
    public static List<LoaiSanPham> getAllLoaiSP() {
        return LoaiSanPham_repository.getAllLoaiSP();
    }

    public static LoaiSanPham getLoaiSPbyMa(String maloai) {
        return LoaiSanPham_repository.getLoaiSPbymaloai(maloai);
    }

    public static int themLoaiSP(LoaiSanPham loaisp) {
        return LoaiSanPham_repository.themLoaiSanPham(loaisp);
    }

    public static int suaLoaiSP(LoaiSanPham loaisp) {
        return LoaiSanPham_repository.suaLoaiSanPham(loaisp);
    }
}
