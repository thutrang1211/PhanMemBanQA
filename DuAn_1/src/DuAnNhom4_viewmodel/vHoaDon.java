/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_Viewmodel;


import java.util.Date;

/**
 *
 * @author acer
 */
public class vHoaDon {
    private String idHD;
    private String maHD;
    private String idNV;
    private String maNV;
//    private String idKH;
//    private String maKH;
    private Date ngaytao;
    private int tongTien;

    public vHoaDon() {
    }

    public vHoaDon(String idHD, String maHD, String idNV, String maNV, Date ngaytao, int tongTien) {
        this.idHD = idHD;
        this.maHD = maHD;
        this.idNV = idNV;
        this.maNV = maNV;
        this.ngaytao = ngaytao;
        this.tongTien = tongTien;
    }

    public vHoaDon(String idhd, String mahd, Date ngayTao, int tongTien) {
 this.idHD = idhd;
        this.maHD = mahd;
       
        this.ngaytao = ngayTao;
        this.tongTien = tongTien;    }



    public String getIdHD() {
        return idHD;
    }

    public void setIdHD(String idHD) {
        this.idHD = idHD;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getIdNV() {
        return idNV;
    }

    public void setIdNV(String idNV) {
        this.idNV = idNV;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }


    public Date getNgaytao() {
        return ngaytao;
    }

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "vHoaDon{" + "idHD=" + idHD + ", maHD=" + maHD + ", idNV=" + idNV + ", maNV=" + maNV + ", ngaytao=" + ngaytao + ", tongTien=" + tongTien + '}';
    }


    
}
