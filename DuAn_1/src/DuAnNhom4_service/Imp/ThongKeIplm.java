/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DuAnNhom4_service.Imp;

import DuAnNhom4_repository.ThongKeRepository;
import DuAnNhom4_service.ThongKeService;
import DuAnNhom4_viewmodel.vThongKe;
import java.util.List;

/**
 *
 * @author TRAN VAN DUONG
 */
public class ThongKeIplm implements ThongKeService {

    private ThongKeRepository tk = new ThongKeRepository();

    @Override
    public List<vThongKe> getByThongKe() {
        return tk.getListByThongKe();
    }

    @Override
    public List<vThongKe> getByThongKeNam() {
        return  tk.getListByThongKeNam();
    }

    @Override
    public List<vThongKe> getListByThongKeNgay() {
        return tk.getListByThongKeNgay();
    }

    @Override
    public List<vThongKe> getListByThongKeThang() {
        return  tk.getListByThongKeThang();
    }

}
