/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_model;

/**
 *
 * @author TRAN VAN DUONG
 */
public class QuanLiTaiKhoan {

    String IDNV;
    String TenTaiKhoan;
    String MatKhau;
    int TrangThai;

    public QuanLiTaiKhoan() {
    }

    public QuanLiTaiKhoan(String IDNV, String TenTaiKhoan, String MatKhau, int TrangThai) {
        this.IDNV = IDNV;
        this.TenTaiKhoan = TenTaiKhoan;
        this.MatKhau = MatKhau;
        this.TrangThai = TrangThai;
    }

    public String getIDNV() {
        return IDNV;
    }

    public void setIDNV(String IDNV) {
        this.IDNV = IDNV;
    }

    public String getTenTaiKhoan() {
        return TenTaiKhoan;
    }

    public void setTenTaiKhoan(String TenTaiKhoan) {
        this.TenTaiKhoan = TenTaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "QuanLiTaiKhoan{" + "IDNV=" + IDNV + ", TenTaiKhoan=" + TenTaiKhoan + ", MatKhau=" + MatKhau + ", TrangThai=" + TrangThai + '}';
    }

   
}
