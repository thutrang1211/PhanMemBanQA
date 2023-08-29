/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_model;

import java.math.BigDecimal;

/**
 *
 * @author Dell
 */
public class SanPham {
        private String IDSanPham;
    private String MaSanPham;
    private String TenSanPham;
    private int SoLuong;
    private String HinhAnh;
    private String ChatLieu;
    private BigDecimal GiaNhap;
    private BigDecimal GiaBan;

    public SanPham() {
    }

    public SanPham(String IDSanPham, String MaSanPham, String TenSanPham, int SoLuong, String HinhAnh, String ChatLieu, BigDecimal GiaNhap, BigDecimal GiaBan) {
        this.IDSanPham = IDSanPham;
        this.MaSanPham = MaSanPham;
        this.TenSanPham = TenSanPham;
        this.SoLuong = SoLuong;
        this.HinhAnh = HinhAnh;
        this.ChatLieu = ChatLieu;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
    }

    public String getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(String IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public String getMaSanPham() {
        return MaSanPham;
    }

    public void setMaSanPham(String MaSanPham) {
        this.MaSanPham = MaSanPham;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String TenSanPham) {
        this.TenSanPham = TenSanPham;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public String getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(String HinhAnh) {
        this.HinhAnh = HinhAnh;
    }

    public String getChatLieu() {
        return ChatLieu;
    }

    public void setChatLieu(String ChatLieu) {
        this.ChatLieu = ChatLieu;
    }

    public BigDecimal getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(BigDecimal GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public BigDecimal getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(BigDecimal GiaBan) {
        this.GiaBan = GiaBan;
    }

    @Override
    public String toString() {
        return "SanPham{" + "IDSanPham=" + IDSanPham + ", MaSanPham=" + MaSanPham + ", TenSanPham=" + TenSanPham + ", SoLuong=" + SoLuong + ", HinhAnh=" + HinhAnh + ", ChatLieu=" + ChatLieu + ", GiaNhap=" + GiaNhap + ", GiaBan=" + GiaBan + '}';
    }

}
