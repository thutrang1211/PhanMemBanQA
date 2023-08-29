/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DuAnNhom4_service;

import DuAnNhom4_viewmodel.vThongKe;
import java.util.List;

/**
 *
 * @author TRAN VAN DUONG
 */
public interface ThongKeService {
    List<vThongKe> getByThongKe();
    List<vThongKe> getByThongKeNam();
    List<vThongKe> getListByThongKeNgay();
    List<vThongKe> getListByThongKeThang();
}
