/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_viewmodel;

import java.math.BigDecimal;

/**
 *
 * @author Dell
 */
public class SanPhamChiTiet {

    private String ID;
    private String IDLOAISP;
    private String TENLOAI;
    private String MALOAI;
    private String IDMAUSAC;
    private String TENMS;
    private String MAMS;
    private String IDSIZE;
    private String MASIZE;
    private String TENSIZE;
    private String IDTHUONGHIEU;
    private String TENTHUONGHIEU;
    private String MATHUONGHIEU;
    private String MASP;
    private String TENSP;
    private int SOLUONG;
    private String HINHANH;
    private String CHATLIEU;
    private BigDecimal GIANHAP, GIABAN;

    public SanPhamChiTiet() {
    }

    public SanPhamChiTiet(String ID, String IDLOAISP, String TENLOAI, String MALOAI, String IDMAUSAC, String TENMS, String MAMS, String IDSIZE, String MASIZE, String TENSIZE, String IDTHUONGHIEU, String TENTHUONGHIEU, String MATHUONGHIEU, String MASP, String TENSP, int SOLUONG, String HINHANH, String CHATLIEU, BigDecimal GIANHAP, BigDecimal GIABAN) {
        this.ID = ID;
        this.IDLOAISP = IDLOAISP;
        this.TENLOAI = TENLOAI;
        this.MALOAI = MALOAI;
        this.IDMAUSAC = IDMAUSAC;
        this.TENMS = TENMS;
        this.MAMS = MAMS;
        this.IDSIZE = IDSIZE;
        this.MASIZE = MASIZE;
        this.TENSIZE = TENSIZE;
        this.IDTHUONGHIEU = IDTHUONGHIEU;
        this.TENTHUONGHIEU = TENTHUONGHIEU;
        this.MATHUONGHIEU = MATHUONGHIEU;
        this.MASP = MASP;
        this.TENSP = TENSP;
        this.SOLUONG = SOLUONG;
        this.HINHANH = HINHANH;
        this.CHATLIEU = CHATLIEU;
        this.GIANHAP = GIANHAP;
        this.GIABAN = GIABAN;
    }

    public SanPhamChiTiet(String IDLOAISP, String MALOAI, String TENLOAI, String IDMAUSAC, String MAMS, String TENMS, String IDSIZE, String MASIZE, String TENSIZE, String IDTHUONGHIEU, String MATHUONGHIEU, String TENTHUONGHIEU, String ID, String MASP, int SOLUONG, String TENSP, String HINHANH, String CHATLIEU, BigDecimal GIANHAP, BigDecimal GIABAN) {

        this.IDLOAISP = IDLOAISP;
        this.TENLOAI = TENLOAI;
        this.MALOAI = MALOAI;
        this.IDMAUSAC = IDMAUSAC;
        this.TENMS = TENMS;
        this.MAMS = MAMS;
        this.IDSIZE = IDSIZE;
        this.MASIZE = MASIZE;
        this.TENSIZE = TENSIZE;
        this.IDTHUONGHIEU = IDTHUONGHIEU;
        this.TENTHUONGHIEU = TENTHUONGHIEU;
        this.MATHUONGHIEU = MATHUONGHIEU;
        this.ID = ID;
        this.MASP = MASP;
        this.TENSP = TENSP;
        this.SOLUONG = SOLUONG;
        this.HINHANH = HINHANH;
        this.CHATLIEU = CHATLIEU;
        this.GIANHAP = GIANHAP;
        this.GIABAN = GIABAN;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getIDLOAISP() {
        return IDLOAISP;
    }

    public void setIDLOAISP(String IDLOAISP) {
        this.IDLOAISP = IDLOAISP;
    }

    public String getTENLOAI() {
        return TENLOAI;
    }

    public void setTENLOAI(String TENLOAI) {
        this.TENLOAI = TENLOAI;
    }

    public String getMALOAI() {
        return MALOAI;
    }

    public void setMALOAI(String MALOAI) {
        this.MALOAI = MALOAI;
    }

    public String getIDMAUSAC() {
        return IDMAUSAC;
    }

    public void setIDMAUSAC(String IDMAUSAC) {
        this.IDMAUSAC = IDMAUSAC;
    }

    public String getTENMS() {
        return TENMS;
    }

    public void setTENMS(String TENMS) {
        this.TENMS = TENMS;
    }

    public String getMAMS() {
        return MAMS;
    }

    public void setMAMS(String MAMS) {
        this.MAMS = MAMS;
    }

    public String getIDSIZE() {
        return IDSIZE;
    }

    public void setIDSIZE(String IDSIZE) {
        this.IDSIZE = IDSIZE;
    }

    public String getMASIZE() {
        return MASIZE;
    }

    public void setMASIZE(String MASIZE) {
        this.MASIZE = MASIZE;
    }

    public String getTENSIZE() {
        return TENSIZE;
    }

    public void setTENSIZE(String TENSIZE) {
        this.TENSIZE = TENSIZE;
    }

    public String getIDTHUONGHIEU() {
        return IDTHUONGHIEU;
    }

    public void setIDTHUONGHIEU(String IDTHUONGHIEU) {
        this.IDTHUONGHIEU = IDTHUONGHIEU;
    }

    public String getTENTHUONGHIEU() {
        return TENTHUONGHIEU;
    }

    public void setTENTHUONGHIEU(String TENTHUONGHIEU) {
        this.TENTHUONGHIEU = TENTHUONGHIEU;
    }

    public String getMATHUONGHIEU() {
        return MATHUONGHIEU;
    }

    public void setMATHUONGHIEU(String MATHUONGHIEU) {
        this.MATHUONGHIEU = MATHUONGHIEU;
    }

    public String getMASP() {
        return MASP;
    }

    public void setMASP(String MASP) {
        this.MASP = MASP;
    }

    public String getTENSP() {
        return TENSP;
    }

    public void setTENSP(String TENSP) {
        this.TENSP = TENSP;
    }

    public int getSOLUONG() {
        return SOLUONG;
    }

    public void setSOLUONG(int SOLUONG) {
        this.SOLUONG = SOLUONG;
    }

    public String getHINHANH() {
        return HINHANH;
    }

    public void setHINHANH(String HINHANH) {
        this.HINHANH = HINHANH;
    }

    public String getCHATLIEU() {
        return CHATLIEU;
    }

    public void setCHATLIEU(String CHATLIEU) {
        this.CHATLIEU = CHATLIEU;
    }

    public BigDecimal getGIANHAP() {
        return GIANHAP;
    }

    public void setGIANHAP(BigDecimal GIANHAP) {
        this.GIANHAP = GIANHAP;
    }

    public BigDecimal getGIABAN() {
        return GIABAN;
    }

    public void setGIABAN(BigDecimal GIABAN) {
        this.GIABAN = GIABAN;
    }

    public String TrangThai() {
//        int SoLuong = 0;
        if (SOLUONG > 1) {
            return "Đang bán";
        } else {
            return "Hết hàng ";
        }
    }

    public String toString1() {
        return  ID + "-" + IDLOAISP + "-" + TENLOAI;
    }

    @Override
    public String toString() {
        return "SanPhamChiTiet{" + "ID=" + ID + ", IDLOAISP=" + IDLOAISP + ", TENLOAI=" + TENLOAI + ", MALOAI=" + MALOAI + ", IDMAUSAC=" + IDMAUSAC + ", IDTHUONGHIEU=" + IDTHUONGHIEU + ", TENMS=" + TENMS + ", MAMS=" + MAMS + ", IDSIZE=" + IDSIZE + ", MASIZE=" + MASIZE + ", TENSIZE=" + TENSIZE + ", TENTHUONGHIEU=" + TENTHUONGHIEU + ", MATHUONGHIEU=" + MATHUONGHIEU + ", MASP=" + MASP + ", TENSP=" + TENSP + ", SOLUONG=" + SOLUONG + ", HINHANH=" + HINHANH + ", CHATLIEU=" + CHATLIEU + ", GIANHAP=" + GIANHAP + ", GIABAN=" + GIABAN + '}';
    }

}
