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
public class KhuyenMai {

    String IDKhuyenMai;
    String MaKhuyenMai;
    String TenKhuyenMai;
    Date NgayBatDau;
    Date NgayKetThuc;
    int TrangThai;
    int phantramgiam;
    int dieukien;

    public KhuyenMai() {
    }

    public KhuyenMai(String IDKhuyenMai, String MaKhuyenMai, String TenKhuyenMai, Date NgayBatDau, Date NgayKetThuc, int TrangThai, int phantramgiam, int dieukien) {
        this.IDKhuyenMai = IDKhuyenMai;
        this.MaKhuyenMai = MaKhuyenMai;
        this.TenKhuyenMai = TenKhuyenMai;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
        this.TrangThai = TrangThai;
        this.phantramgiam = phantramgiam;
        this.dieukien = dieukien;
    }

    public String getIDKhuyenMai() {
        return IDKhuyenMai;
    }

    public void setIDKhuyenMai(String IDKhuyenMai) {
        this.IDKhuyenMai = IDKhuyenMai;
    }

    public String getMaKhuyenMai() {
        return MaKhuyenMai;
    }

    public void setMaKhuyenMai(String MaKhuyenMai) {
        this.MaKhuyenMai = MaKhuyenMai;
    }

    public String getTenKhuyenMai() {
        return TenKhuyenMai;
    }

    public void setTenKhuyenMai(String TenKhuyenMai) {
        this.TenKhuyenMai = TenKhuyenMai;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    public int getPhantramgiam() {
        return phantramgiam;
    }

    public void setPhantramgiam(int phantramgiam) {
        this.phantramgiam = phantramgiam;
    }

    public int getDieukien() {
        return dieukien;
    }

    public void setDieukien(int dieukien) {
        this.dieukien = dieukien;
    }

    @Override
    public String toString() {
        return "KhuyenMai{" + "IDKhuyenMai=" + IDKhuyenMai + ", MaKhuyenMai=" + MaKhuyenMai + ", TenKhuyenMai=" + TenKhuyenMai + ", NgayBatDau=" + NgayBatDau + ", NgayKetThuc=" + NgayKetThuc + ", TrangThai=" + TrangThai + ", phantramgiam=" + phantramgiam + ", dieukien=" + dieukien + '}';
    }

}
