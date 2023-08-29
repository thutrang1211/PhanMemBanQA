/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_model;

/**
 *
 * @author Dell
 */
public class TaikhoanAdmin {
     private String ID, TENTK,MATKHAU;

    public TaikhoanAdmin() {
    }

    public TaikhoanAdmin(String ID, String TENTK, String MATKHAU) {
        this.ID = ID;
        this.TENTK = TENTK;
        this.MATKHAU = MATKHAU;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getTENTK() {
        return TENTK;
    }

    public void setTENTK(String TENTK) {
        this.TENTK = TENTK;
    }

    public String getMATKHAU() {
        return MATKHAU;
    }

    public void setMATKHAU(String MATKHAU) {
        this.MATKHAU = MATKHAU;
    }

    @Override
    public String toString() {
        return "TaiKhoanAdmin{" + "ID=" + ID + ", TENTK=" + TENTK + ", MATKHAU=" + MATKHAU + '}';
    }
    
}
