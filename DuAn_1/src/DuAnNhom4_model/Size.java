/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_model;

/**
 *
 * @author Dell
 */
public class Size {
    private String ID, MASIZE, TENSIZE;

    public Size() {
    }

    public Size(String ID, String MASIZE, String TENSIZE) {
        this.ID = ID;
        this.MASIZE = MASIZE;
        this.TENSIZE = TENSIZE;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
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

    @Override
    public String toString() {
        return "Size{" + "ID=" + ID + ", MASIZE=" + MASIZE + ", TENSIZE=" + TENSIZE + '}';
    }
    
}
