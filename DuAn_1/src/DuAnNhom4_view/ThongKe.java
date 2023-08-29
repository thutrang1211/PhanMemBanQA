/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package DuAnNhom4_view;

import Click.ThongKeController;
import DuAnNhom4_repository.ThongKeRepository;
import DuAnNhom4_service.Imp.ThongKeIplm;
import DuAnNhom4_service.ThongKeService;
import DuAnNhom4_viewmodel.vThongKe;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ThongKe extends javax.swing.JPanel {

    private ThongKeService thongKeService = new ThongKeIplm();
    private ThongKeRepository tk = new ThongKeRepository();
    private DefaultTableModel dtm = new DefaultTableModel();
    private DefaultTableModel dtm4 = new DefaultTableModel();
    private DefaultTableModel dtm1 = new DefaultTableModel();
    private DefaultTableModel dtm2 = new DefaultTableModel();
    private DefaultTableModel dtm3 = new DefaultTableModel();

    public ThongKe() {
        initComponents();
        ThongKeController controller = new ThongKeController();
        controller.setDateToChartSoLuongBan(pnSoLuongBan1);
        controller.setDateToChartNgay(pnNgay1);
        controller.setDateToChartThang(pnNam1);
        controller.setDateToChartNam(pnThang1);
        showNam(thongKeService.getByThongKeNam());
        showNgay(thongKeService.getListByThongKeNgay());
        showThang(thongKeService.getListByThongKeThang());
        showSp(thongKeService.getByThongKe());
        addNgay(tk.getALL());
        addNgay1(tk.getALL());
        showAll(tk.getListByThongKe());

    }

    public void showNgay(List<vThongKe> listNgay) {
        dtm.setRowCount(0);
        dtm = (DefaultTableModel) tbNgay1.getModel();
        for (vThongKe thongKe : listNgay) {
            dtm.addRow(new Object[]{thongKe.getNgayTaoHoaDon(), thongKe.getThanhTien()});
        }
    }

    public void showThang(List<vThongKe> listThang) {
        dtm1.setRowCount(0);
        dtm1 = (DefaultTableModel) tbThang1.getModel();
        for (vThongKe thongKe : listThang) {
            dtm1.addRow(new Object[]{thongKe.getNgayTaoHoaDon(), thongKe.getThanhTien()});
        }
    }

    public void showNam(List<vThongKe> listNam) {
        dtm2.setRowCount(0);
        dtm2 = (DefaultTableModel) tbNam2.getModel();
        for (vThongKe thongKe : listNam) {
            dtm2.addRow(new Object[]{thongKe.getNgayTaoHoaDon(), thongKe.getThanhTien()});
        }
    }

    public void showSp(List<vThongKe> listSP) {
        listSP = tk.getListByThongKe2();
        dtm3.setRowCount(0);
        dtm3 = (DefaultTableModel) tbSanPham1.getModel();
        for (vThongKe thongKe : listSP) {
            dtm3.addRow(new Object[]{thongKe.getTenSp(), thongKe.getSoLuong(), thongKe.getTensize(), thongKe.getMausac(), thongKe.getNgayTaoHoaDon()});
        }
    }

    public void addNgay(List<vThongKe> listtk) {
        listtk = tk.getALL();
        for (int i = 0; i < listtk.size(); i++) {
           
            cboNgay1.addItem(listtk.get(i).getNgayTaoHoaDon().toString());
        }

    }

    public void addNgay1(List<vThongKe> listtk) {
        listtk = tk.getALL();
        for (int i = 0; i < listtk.size(); i++) {
            cboNgay2.addItem(listtk.get(i).getNgayTaoHoaDon().toString());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        pnSoLuongBan1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tbSanPham1 = new javax.swing.JTable();
        cboNgay1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        pnNgay1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbNgay1 = new javax.swing.JTable();
        btnTimkim = new javax.swing.JButton();
        cboNgay2 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        pnNam1 = new javax.swing.JPanel();
        pnThang1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbThang1 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbNam2 = new javax.swing.JTable();

        pnSoLuongBan1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnSoLuongBan1Layout = new javax.swing.GroupLayout(pnSoLuongBan1);
        pnSoLuongBan1.setLayout(pnSoLuongBan1Layout);
        pnSoLuongBan1Layout.setHorizontalGroup(
            pnSoLuongBan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnSoLuongBan1Layout.setVerticalGroup(
            pnSoLuongBan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 422, Short.MAX_VALUE)
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Thống kê sản phẩm bán ra"));

        tbSanPham1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbSanPham1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên sản phẩm", "Số lượng bán ra", "Size", "Màu sắc", "Ngày "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbSanPham1.setRowHeight(25);
        tbSanPham1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSanPham1MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tbSanPham1);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        cboNgay1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNgay1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Tìm kiếm sản phẩm bán ra theo ngày");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Tìm kiếm ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(cboNgay1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jButton1)))
                .addContainerGap(651, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnSoLuongBan1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnSoLuongBan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNgay1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Biểu đồ số lượng sản phẩm bán ra", jPanel8);

        pnNgay1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnNgay1Layout = new javax.swing.GroupLayout(pnNgay1);
        pnNgay1.setLayout(pnNgay1Layout);
        pnNgay1Layout.setHorizontalGroup(
            pnNgay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnNgay1Layout.setVerticalGroup(
            pnNgay1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 345, Short.MAX_VALUE)
        );

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Thống kê ngày"));

        tbNgay1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbNgay1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ngày", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbNgay1.setRowHeight(25);
        tbNgay1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNgay1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbNgay1);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1047, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnTimkim.setBackground(new java.awt.Color(102, 102, 102));
        btnTimkim.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnTimkim.setForeground(new java.awt.Color(255, 255, 255));
        btnTimkim.setText("Tìm kiếm ");
        btnTimkim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkimActionPerformed(evt);
            }
        });

        cboNgay2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboNgay2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNgay2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Tìm kiếm sản phẩm bán ra theo ngày");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnNgay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(cboNgay2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(btnTimkim)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnNgay1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNgay2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkim))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Biểu đô thống kê doanh thu theo ngày", jPanel7);

        pnNam1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnNam1Layout = new javax.swing.GroupLayout(pnNam1);
        pnNam1.setLayout(pnNam1Layout);
        pnNam1Layout.setHorizontalGroup(
            pnNam1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        pnNam1Layout.setVerticalGroup(
            pnNam1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnThang1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnThang1Layout = new javax.swing.GroupLayout(pnThang1);
        pnThang1.setLayout(pnThang1Layout);
        pnThang1Layout.setHorizontalGroup(
            pnThang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnThang1Layout.setVerticalGroup(
            pnThang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder("Thống kê tháng"));

        tbThang1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbThang1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tháng", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbThang1.setRowHeight(25);
        tbThang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbThang1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbThang1);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbNam2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbNam2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Năm", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbNam2.setRowHeight(25);
        tbNam2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNam2MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbNam2);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnNam1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnThang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnThang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnNam1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Biểu đồ thống kê theo từng tháng và năm  ", jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbSanPham1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSanPham1MouseClicked
        showSp(thongKeService.getByThongKe());
    }//GEN-LAST:event_tbSanPham1MouseClicked

    private void cboNgay1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNgay1ActionPerformed
           
    }//GEN-LAST:event_cboNgay1ActionPerformed

    private void tbNgay1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNgay1MouseClicked
        showNgay(thongKeService.getListByThongKeNgay());
    }//GEN-LAST:event_tbNgay1MouseClicked

    private void tbThang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbThang1MouseClicked
        showThang(thongKeService.getListByThongKeThang());
    }//GEN-LAST:event_tbThang1MouseClicked

    private void tbNam2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNam2MouseClicked
        showNam(thongKeService.getByThongKeNam());
    }//GEN-LAST:event_tbNam2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String timkiem = cboNgay1.getSelectedItem().toString();
        ThongKeController controller = new ThongKeController();

        if (timkiem != null) {
            showSanPham(timkiem);
            controller.setDateToChartSoLuongBan1(pnSoLuongBan1, timkiem);
        }
//        else if(timkiem.equalsIgnoreCase("All")){
//            showSanPham(timkiem);
//            controller.setDateToChartSoLuongBan1(pnSoLuongBan1, timkiem);
//        }
        else  {
            showSp(tk.getListByThongKe());
           
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnTimkimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkimActionPerformed
        String timkiem1 = cboNgay2.getSelectedItem().toString();

        if (timkiem1 != null) {
            show1(timkiem1);

        } else {
            showNgay(tk.getALL());
        }
    }//GEN-LAST:event_btnTimkimActionPerformed

    private void cboNgay2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNgay2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboNgay2ActionPerformed
    public void showSanPham(String Ngay) {
        ArrayList<vThongKe> t = tk.getBYNgay(Ngay);
        dtm3.setRowCount(0);
        dtm3 = (DefaultTableModel) tbSanPham1.getModel();
        for (vThongKe thongKe : t) {
            dtm3.addRow(new Object[]{thongKe.getTenSp(), thongKe.getSoLuong(), thongKe.getTensize(), thongKe.getMausac(), thongKe.getNgayTaoHoaDon()});
        }
    }

    public void show1(String Ngay) {
        ArrayList<vThongKe> t = tk.getBYNgay1(Ngay);
        dtm3.setRowCount(0);
        dtm3 = (DefaultTableModel) tbNgay1.getModel();
        for (vThongKe thongKe : t) {
            dtm3.addRow(new Object[]{thongKe.getNgayTaoHoaDon(), thongKe.getThanhTien()});
        }
    }

    public void showAll(List<vThongKe> list) {
        dtm4.setRowCount(0);
        dtm4 = (DefaultTableModel) tbSanPham1.getModel();
        for (vThongKe thongKe : list) {
            dtm4.addRow(new Object[]{thongKe.getTenSp(), thongKe.getSoLuong(), thongKe.getTensize(), thongKe.getMausac(), thongKe.getNgayTaoHoaDon()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTimkim;
    private javax.swing.JComboBox<String> cboNgay1;
    private javax.swing.JComboBox<String> cboNgay2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnNam1;
    private javax.swing.JPanel pnNgay1;
    private javax.swing.JPanel pnSoLuongBan1;
    private javax.swing.JPanel pnThang1;
    private javax.swing.JTable tbNam2;
    private javax.swing.JTable tbNgay1;
    private javax.swing.JTable tbSanPham1;
    private javax.swing.JTable tbThang1;
    // End of variables declaration//GEN-END:variables
}
