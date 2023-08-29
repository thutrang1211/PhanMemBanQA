/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_model;

/**
 *
 * @author Dell
 */
public class ThuongHieu {
     private String ID, MA, TEN;

    public ThuongHieu() {
    }

    public ThuongHieu(String ID, String MA, String TEN) {
        this.ID = ID;
        this.MA = MA;
        this.TEN = TEN;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMA() {
        return MA;
    }

    public void setMA(String MA) {
        this.MA = MA;
    }

    public String getTEN() {
        return TEN;
    }

    public void setTEN(String TEN) {
        this.TEN = TEN;
    }

    @Override
    public String toString() {
        return "ThuongHieu{" + "ID=" + ID + ", MA=" + MA + ", TEN=" + TEN + '}';
    }
    
}
