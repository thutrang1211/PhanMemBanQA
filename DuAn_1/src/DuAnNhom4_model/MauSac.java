/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_model;

/**
 *
 * @author Dell
 */
public class MauSac {

    private String ID, MAMS, TENMAU;

    public MauSac(String ID, String MAMS, String TENMAU) {
        this.ID = ID;
        this.MAMS = MAMS;
        this.TENMAU = TENMAU;
    }

    public MauSac() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMAMS() {
        return MAMS;
    }

    public void setMAMS(String MAMS) {
        this.MAMS = MAMS;
    }

    public String getTENMAU() {
        return TENMAU;
    }

    public void setTENMAU(String TENMAU) {
        this.TENMAU = TENMAU;
    }

    @Override
    public String toString() {
        return "MauSac{" + "ID=" + ID + ", MAMS=" + MAMS + ", TENMAU=" + TENMAU + '}';
    }
}
