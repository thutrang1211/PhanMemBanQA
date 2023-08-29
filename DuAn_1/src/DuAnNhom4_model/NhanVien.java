/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_model;

import java.util.Date;

/**
 *
 * @author TRAN VAN DUONG
 */
public class NhanVien {

    String IDNhanVien;
    String MaNhanVien;
    String HoTen;
    String GioiTinh;
    Date NgaySinh;
    String DiaChi;
    String SoDienThoai;
    String TenTaiKhoan;
    String MatKhau;
    int TrangThai;
    String HinhAnh;
    String Email;

    public NhanVien() {
    }

    public NhanVien(String IDNhanVien, String MaNhanVien, String HoTen, String GioiTinh, Date NgaySinh, String DiaChi, String SoDienThoai, String TenTaiKhoan, String MatKhau, int TrangThai, String HinhAnh, String Email) {
        this.IDNhanVien = IDNhanVien;
        this.MaNhanVien = MaNhanVien;
        this.HoTen = HoTen;
        this.GioiTinh = GioiTinh;
        this.NgaySinh = NgaySinh;
        this.DiaChi = DiaChi;
        this.SoDienThoai = SoDienThoai;
        this.TenTaiKhoan = TenTaiKhoan;
        this.MatKhau = MatKhau;
        this.TrangThai = TrangThai;
        this.HinhAnh = HinhAnh;
        this.Email = Email;
    }

    public NhanVien(String ID, String TENTK, String MATKHAU) {
        this.IDNhanVien = ID;
        this.TenTaiKhoan = TENTK;
        this.MatKhau = MATKHAU;
    }

    

    public String getIDNhanVien() {
        return IDNhanVien;
    }

    public void setIDNhanVien(String IDNhanVien) {
        this.IDNhanVien = IDNhanVien;
    }

    public String getMaNhanVien() {
        return MaNhanVien;
    }

    public void setMaNhanVien(String MaNhanVien) {
        this.MaNhanVien = MaNhanVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public Date getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(Date NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
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

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "IDNhanVien=" + IDNhanVien + ", MaNhanVien=" + MaNhanVien + ", HoTen=" + HoTen + ", GioiTinh=" + GioiTinh + ", NgaySinh=" + NgaySinh + ", DiaChi=" + DiaChi + ", SoDienThoai=" + SoDienThoai + ", TenTaiKhoan=" + TenTaiKhoan + ", MatKhau=" + MatKhau + ", TrangThai=" + TrangThai + ", HinhAnh=" + HinhAnh + ", Email=" + Email + '}';
    }

}
