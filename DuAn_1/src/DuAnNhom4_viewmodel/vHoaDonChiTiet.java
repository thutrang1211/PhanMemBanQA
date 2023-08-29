/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_Viewmodel;



/**
 *
 * @author acer
 */
public class vHoaDonChiTiet {

    private String idHoaDonMuaHang;
    private String maHD;
    private String idSP;
    private String maSP;
    private String tensp;
    private int soLuong;
    private int donGia;
    private int thanhTien;

    public vHoaDonChiTiet() {
    }

    public vHoaDonChiTiet(String idHoaDonMuaHang, String maHD, String idSP, String maSP,String tensp, int soLuong, int donGia, int thanhTien) {
        this.idHoaDonMuaHang = idHoaDonMuaHang;
        this.maHD = maHD;
        this.idSP = idSP;
        this.maSP = maSP;
        this.tensp =tensp;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.thanhTien = thanhTien;
    }

    public String getIdHoaDonMuaHang() {
        return idHoaDonMuaHang;
    }

    public void setIdHoaDonMuaHang(String idHoaDonMuaHang) {
        this.idHoaDonMuaHang = idHoaDonMuaHang;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getIdSP() {
        return idSP;
    }

    public void setIdSP(String idSP) {
        this.idSP = idSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getThanhTien() {
        return thanhTien;
    }

    public void setThanhTien(int thanhTien) {
        this.thanhTien = thanhTien;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    @Override
    public String toString() {
        return "vHoaDonChiTiet{" + "idHoaDonMuaHang=" + idHoaDonMuaHang + ", maHD=" + maHD + ", idSP=" + idSP + ", maSP=" + maSP + ", tensp=" + tensp + ", soLuong=" + soLuong + ", donGia=" + donGia + ", thanhTien=" + thanhTien + '}';
    }

  

    
}
