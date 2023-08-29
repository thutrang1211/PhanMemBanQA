/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Click;

import DuAnNhom4_repository.ThongKeRepository;
import DuAnNhom4_service.Imp.ThongKeIplm;
import DuAnNhom4_service.ThongKeService;
import DuAnNhom4_viewmodel.vThongKe;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.List;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author TRAN VAN DUONG
 */
public class ThongKeController {

    ThongKeService thongKeService = null;
    ThongKeRepository tk ;
    public ThongKeController() {
        thongKeService = new ThongKeIplm();
    }

    public void setDateToChartNgay(JPanel jpnItem) {
        List<vThongKe> listItem = thongKeService.getListByThongKeNgay();
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        for (vThongKe thongKe : listItem) {
            categoryDataset.addValue(thongKe.getThanhTien(), "Tổng tiền", thongKe.getNgayTaoHoaDon());
        }
        JFreeChart chart = ChartFactory.createStackedBarChart("Thống kê doanh thu ngày", "Tổng tiền", "Doanh thu ngày", categoryDataset, PlotOrientation.VERTICAL, true, true, true);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 300));
//        chartPanel.setPreferredSize(new Dimension(jpnItem.getHeight(), 300));
        jpnItem.removeAll();;
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }

    public void setDateToChartThang(JPanel jpnItem) {
        List<vThongKe> listItem = thongKeService.getByThongKeNam();
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        for (vThongKe thongKe : listItem) {
            categoryDataset.addValue(thongKe.getThanhTien(), "Tổng tiền", thongKe.getNgayTaoHoaDon());
        }
        JFreeChart chart = ChartFactory.createBarChart("Thống kê doanh thu năm", "Doanh thu tổng", "Giá tiền", categoryDataset, PlotOrientation.VERTICAL, true, true, true);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 300));
        jpnItem.removeAll();;
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }

    public void setDateToChartNam(JPanel jpnItem) {
        List<vThongKe> listItem = thongKeService.getListByThongKeThang();
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        for (vThongKe thongKe : listItem) {
            categoryDataset.addValue(thongKe.getThanhTien(), "Doanh thu tổng", thongKe.getNgayTaoHoaDon());
        }
        JFreeChart chart = ChartFactory.createMultiplePieChart3D("Thống kê doanh thu tháng", categoryDataset, org.jfree.chart.util.TableOrder.BY_ROW, true, true, true);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 300));
        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }

    public void setDateToChartSoLuongBan(JPanel jpnItem) {
        List<vThongKe> listItem = thongKeService.getByThongKe();
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        for (vThongKe thongKe : listItem) {
            categoryDataset.addValue(thongKe.getSoLuong(), "Số Lượng", thongKe.getTenSp() + ",size:" + thongKe.getTensize()+",mausac:"+thongKe.getMausac());
        }
        JFreeChart chart = ChartFactory.createStackedBarChart("Thống kê theo từng sản phẩm", "Sản phẩm", "Số lượng bán ra", categoryDataset, PlotOrientation.VERTICAL, true, true, true);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 300));
        chartPanel.setPreferredSize(new Dimension(jpnItem.getHeight(), 300));
        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
     public void setDateToChartSoLuongBan1(JPanel jpnItem, String Ngay) {
        List<vThongKe> listItem = tk.getBYNgaya(Ngay);
        DefaultCategoryDataset categoryDataset = new DefaultCategoryDataset();
        for (vThongKe thongKe : listItem) {
            categoryDataset.addValue(thongKe.getSoLuong(), "Số Lượng", thongKe.getTenSp() + ",size:" + thongKe.getTensize()+",mausac:"+thongKe.getMausac());
        }
        JFreeChart chart = ChartFactory.createStackedBarChart("Thống kê theo từng sản phẩm", "Sản phẩm", "Số lượng bán ra", categoryDataset, PlotOrientation.VERTICAL, true, true, true);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 300));
        chartPanel.setPreferredSize(new Dimension(jpnItem.getHeight(), 300));
        jpnItem.removeAll();
        jpnItem.setLayout(new CardLayout());
        jpnItem.add(chartPanel);
        jpnItem.validate();
        jpnItem.repaint();
    }
}
