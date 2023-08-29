/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_viewmodel;

import DuAnNhom4_model.SanPham;
import DuAnNhom4_view.HoaDon;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author TRAN VAN DUONG
 */
public class vThongKe {

    HoaDon hoaDonMuaHang;
    SanPham sanPham;
    String ngayThanhToan;
    String ngayTaoHoaDon;
    BigDecimal DonGia;
    int soLuong;
    String tenSp;
    BigDecimal ThanhTien;
    String tensize;
    String mausac;

    public vThongKe() {
    }

    public vThongKe(HoaDon hoaDonMuaHang, SanPham sanPham, String ngayThanhToan, String ngayTaoHoaDon, BigDecimal DonGia, int soLuong, String tenSp, BigDecimal ThanhTien, String tensize) {
        this.hoaDonMuaHang = hoaDonMuaHang;
        this.sanPham = sanPham;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayTaoHoaDon = ngayTaoHoaDon;
        this.DonGia = DonGia;
        this.soLuong = soLuong;
        this.tenSp = tenSp;
        this.ThanhTien = ThanhTien;
        this.tensize = tensize;
    }

    public vThongKe(HoaDon hoaDonMuaHang, SanPham sanPham, String ngayThanhToan, String ngayTaoHoaDon, BigDecimal DonGia, int soLuong, String tenSp, BigDecimal ThanhTien, String tensize, String mausac) {
        this.hoaDonMuaHang = hoaDonMuaHang;
        this.sanPham = sanPham;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayTaoHoaDon = ngayTaoHoaDon;
        this.DonGia = DonGia;
        this.soLuong = soLuong;
        this.tenSp = tenSp;
        this.ThanhTien = ThanhTien;
        this.tensize = tensize;
        this.mausac = mausac;
    }

    public vThongKe(HoaDon hoaDonMuaHang, SanPham sanPham, String ngayThanhToan, String ngayTaoHoaDon, BigDecimal DonGia, int soLuong, String tenSp, BigDecimal ThanhTien) {
        this.hoaDonMuaHang = hoaDonMuaHang;
        this.sanPham = sanPham;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayTaoHoaDon = ngayTaoHoaDon;
        this.DonGia = DonGia;
        this.soLuong = soLuong;
        this.tenSp = tenSp;
        this.ThanhTien = ThanhTien;
    }

    public vThongKe(String Ngaytaohoadon, BigDecimal ThanhTien) {
        this.ngayTaoHoaDon = Ngaytaohoadon;
        this.ThanhTien = ThanhTien;
    }

    public vThongKe(String tensp, String size, String mausac, int Soluong, String Ngaytaohoadon) {
        this.tensize = size;
        this.ngayTaoHoaDon = Ngaytaohoadon;
        this.soLuong = Soluong;
        this.mausac = mausac;
        this.tenSp = tensp;
    }

    public HoaDon getHoaDonMuaHang() {
        return hoaDonMuaHang;
    }

    public void setHoaDonMuaHang(HoaDon hoaDonMuaHang) {
        this.hoaDonMuaHang = hoaDonMuaHang;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public void setSanPham(SanPham sanPham) {
        this.sanPham = sanPham;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public String getNgayTaoHoaDon() {
        return ngayTaoHoaDon;
    }

    public void setNgayTaoHoaDon(String ngayTaoHoaDon) {
        this.ngayTaoHoaDon = ngayTaoHoaDon;
    }

    public BigDecimal getDonGia() {
        return DonGia;
    }

    public void setDonGia(BigDecimal DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public BigDecimal getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(BigDecimal ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public String getTensize() {
        return tensize;
    }

    public void setTensize(String tensize) {
        this.tensize = tensize;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    @Override
    public String toString() {
        return "vThongKe{" + "hoaDonMuaHang=" + hoaDonMuaHang + ", sanPham=" + sanPham + ", ngayThanhToan=" + ngayThanhToan + ", ngayTaoHoaDon=" + ngayTaoHoaDon + ", DonGia=" + DonGia + ", soLuong=" + soLuong + ", tenSp=" + tenSp + ", ThanhTien=" + ThanhTien + ", tensize=" + tensize + ", mausac=" + mausac + '}';
    }

   
}
