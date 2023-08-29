/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Click;

import DuAnNhom4_model.NhanVien;
import DuAnNhom4_repository.NhanVien_repository;
import DuAnNhom4_view.HoaDon;
import DuAnNhom4_view.QuanLyKhuyenMai;
import DuAnNhom4_view.QuanLyNhanVien;
import DuAnNhom4_view.QuanLySanPham;
import DuAnNhom4_view.ThongKe;
import DuAnNhom4_view.TrangChu;
import DuAnNhom4_view.ViewBanHang;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class ChuyenMaQL {

    private final JPanel root;
    private String kinSelected = "";
    private List<AutoClick> listClick = null;

    public ChuyenMaQL(JPanel jpnRoot) {
        this.root = jpnRoot;
    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kinSelected = "TrangChu";

        jpnItem.setBackground(new Color(102, 102, 102));
        jlbItem.setBackground(new Color(102, 102, 102));

        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChu());
        root.validate();
        root.repaint();
    }

    public void setEvent(List<AutoClick> listClick) {
        this.listClick = listClick;

        for (AutoClick item : listClick) {
            item.getJlb().addMouseListener(new LabeEvent(item.getKind(), item.getJpn(), item.getJlb()));
//            item.getJlb().addMouseListener(new LabeEvent("QuanLyNhanVien", item.getJpn(), item.getJlb()));

        }
    }

    class LabeEvent implements MouseListener {

        private JPanel node;
        private final String kind;

        private final JPanel jpnItem;
        private final JLabel jlbItem;

        public LabeEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
       
        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChu":
                    node = new TrangChu();
                    break;
                case "QuanLyNhanVien":
                    node = new QuanLyNhanVien();
                    break;
                case "QuanLySanPham":
                    node = new QuanLySanPham();
                    break;
                case "BanHang":
                    node = new ViewBanHang();
                    break;
                case "QuanLyKhuyenMai":
                    node = new QuanLyKhuyenMai();
                    break;
                case "ThongKe":
                    node = new ThongKe();
                    break;
                default:
                    node = new HoaDon();
                    break;
            }

            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackgruoud(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kinSelected = kind;
            jpnItem.setBackground(new Color(102, 102, 102));
            jlbItem.setBackground(new Color(102, 102, 102));

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(new Color(102, 102, 102));
            jlbItem.setBackground(new Color(102, 102, 102));

        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kinSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(153, 153, 153));
                jlbItem.setBackground(new Color(153, 153, 153));

            }
        }

        private void setChangeBackgruoud(String kind) {
            for (AutoClick item : listClick) {
                if (item.getKind().equalsIgnoreCase(kind)) {
                    jpnItem.setBackground(new Color(102, 102, 102));
                    jlbItem.setBackground(new Color(102, 102, 102));
                } else {
                    jpnItem.setBackground(new Color(102, 102, 102));
                    jlbItem.setBackground(new Color(102, 102, 102));
                }
            }
        }
    }
}
