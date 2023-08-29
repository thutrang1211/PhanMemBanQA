/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_viewmodel;

/**
 *
 * @author TRAN VAN DUONG
 */
public class vKhachHang {
    String Ten;

    public vKhachHang() {
    }

    public vKhachHang(String Ten) {
        this.Ten = Ten;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    @Override
    public String toString() {
        return "vKhachHang{" + "Ten=" + Ten + '}';
    }
    
}
