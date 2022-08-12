/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mypackage.UI;

import com.qlks3tl.DAO.NhanVienDAO;
import com.qlks3tl.Model.NhanVien;
import com.qlks3tl.utils.Auth;
import com.qlks3tl.utils.MsgBox;
import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class pnl_NhanVien extends javax.swing.JPanel {

    /**
     * Creates new form pnl_NhanVien
     */
    public pnl_NhanVien() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txt_qlNV_TenNV = new javax.swing.JTextField();
        txt_qlNV_MaNV = new javax.swing.JTextField();
        txt_qlNV_sdt = new javax.swing.JTextField();
        rdo_qlNV_nam = new javax.swing.JRadioButton();
        rdp_qlNV_Nu = new javax.swing.JRadioButton();
        txt_qlNV_DOB = new com.toedter.calendar.JDateChooser();
        rdo_qlNV_nhanvien = new javax.swing.JRadioButton();
        rdo_qlNV_quanly = new javax.swing.JRadioButton();
        txt_qlNV_matkhau = new javax.swing.JTextField();
        txt_qlNV_Diachi = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_qlNV_them = new javax.swing.JButton();
        btn_qlNV_sua = new javax.swing.JButton();
        btn_qlNV_lammoi = new javax.swing.JButton();
        btn_qlNV_xoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_qlNV_QLNV = new javax.swing.JTable();

        setBackground(new java.awt.Color(150, 196, 200));
        setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 1, 1, new java.awt.Color(168, 222, 247)));
        setPreferredSize(new java.awt.Dimension(908, 683));

        jPanel1.setBackground(new java.awt.Color(150, 196, 200));

        jPanel2.setBackground(new java.awt.Color(150, 196, 200));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(99, 99, 198));
        jLabel7.setText("QUẢN LÝ NHÂN VIÊN");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jLabel7);

        jPanel3.setBackground(new java.awt.Color(150, 196, 200));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(99, 99, 198));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Mã Nhân Viên");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(99, 99, 198));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Tên Nhân Viên ");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(99, 99, 198));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Số Điện Thoại");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(99, 99, 198));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Mật Khẩu ");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(99, 99, 198));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("DOB");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(99, 99, 198));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Địa chỉ");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(150, 196, 200));

        txt_qlNV_MaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_qlNV_MaNVActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdo_qlNV_nam);
        rdo_qlNV_nam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdo_qlNV_nam.setSelected(true);
        rdo_qlNV_nam.setText("Nam");

        buttonGroup1.add(rdp_qlNV_Nu);
        rdp_qlNV_Nu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdp_qlNV_Nu.setText("Nữ");

        buttonGroup2.add(rdo_qlNV_nhanvien);
        rdo_qlNV_nhanvien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdo_qlNV_nhanvien.setSelected(true);
        rdo_qlNV_nhanvien.setText("Nhân Viên");

        buttonGroup2.add(rdo_qlNV_quanly);
        rdo_qlNV_quanly.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdo_qlNV_quanly.setText("Quản lý");
        rdo_qlNV_quanly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo_qlNV_quanlyActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(99, 99, 198));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Giới tính");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(99, 99, 198));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Chức vụ");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_qlNV_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_qlNV_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(rdp_qlNV_Nu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rdo_qlNV_nam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(rdo_qlNV_nhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdo_qlNV_quanly, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_qlNV_Diachi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(txt_qlNV_TenNV, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_qlNV_sdt, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_qlNV_matkhau, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(159, 159, 159))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdo_qlNV_nam, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_qlNV_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdp_qlNV_Nu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(txt_qlNV_MaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_qlNV_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txt_qlNV_DOB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(rdo_qlNV_nhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rdo_qlNV_quanly, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_qlNV_matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_qlNV_Diachi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_qlNV_them.setBackground(new java.awt.Color(99, 99, 198));
        btn_qlNV_them.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_qlNV_them.setForeground(new java.awt.Color(255, 255, 255));
        btn_qlNV_them.setText("THÊM");
        btn_qlNV_them.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_qlNV_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_qlNV_themActionPerformed(evt);
            }
        });

        btn_qlNV_sua.setBackground(new java.awt.Color(99, 99, 198));
        btn_qlNV_sua.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_qlNV_sua.setForeground(new java.awt.Color(255, 255, 255));
        btn_qlNV_sua.setText("SỬA");
        btn_qlNV_sua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_qlNV_sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_qlNV_suaActionPerformed(evt);
            }
        });

        btn_qlNV_lammoi.setBackground(new java.awt.Color(99, 99, 198));
        btn_qlNV_lammoi.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_qlNV_lammoi.setForeground(new java.awt.Color(255, 255, 255));
        btn_qlNV_lammoi.setText("LÀM MỚI");
        btn_qlNV_lammoi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_qlNV_lammoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_qlNV_lammoiActionPerformed(evt);
            }
        });

        btn_qlNV_xoa.setBackground(new java.awt.Color(99, 99, 198));
        btn_qlNV_xoa.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_qlNV_xoa.setForeground(new java.awt.Color(255, 255, 255));
        btn_qlNV_xoa.setText("XÓA");
        btn_qlNV_xoa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_qlNV_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_qlNV_xoaActionPerformed(evt);
            }
        });

        tbl_qlNV_QLNV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(168, 222, 247), 4));
        tbl_qlNV_QLNV.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbl_qlNV_QLNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên NV", "Địa chỉ", "DOB", "Giới tính", "Sdt", "Chức vụ", "Mật khẩu"
            }
        ));
        tbl_qlNV_QLNV.setGridColor(new java.awt.Color(150, 196, 200));
        tbl_qlNV_QLNV.setRowHeight(27);
        tbl_qlNV_QLNV.setRowMargin(2);
        tbl_qlNV_QLNV.setSelectionBackground(new java.awt.Color(150, 196, 200));
        tbl_qlNV_QLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_qlNV_QLNVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_qlNV_QLNV);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_qlNV_sua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_qlNV_them, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_qlNV_lammoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_qlNV_xoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 891, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btn_qlNV_them, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_qlNV_sua, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_qlNV_lammoi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(btn_qlNV_xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_qlNV_QLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_qlNV_QLNVMouseClicked
       if (evt.getClickCount() == 2) {
            this.row = tbl_qlNV_QLNV.getSelectedRow();
            this.edit();
        
        }

    }//GEN-LAST:event_tbl_qlNV_QLNVMouseClicked

    private void btn_qlNV_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_qlNV_themActionPerformed
        insert();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_qlNV_themActionPerformed

    private void btn_qlNV_suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_qlNV_suaActionPerformed
        update();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_qlNV_suaActionPerformed

    private void btn_qlNV_lammoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_qlNV_lammoiActionPerformed
        clearForm();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_qlNV_lammoiActionPerformed

    private void btn_qlNV_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_qlNV_xoaActionPerformed
        delete();        // TODO add your handling code here:
    }//GEN-LAST:event_btn_qlNV_xoaActionPerformed

    private void rdo_qlNV_quanlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo_qlNV_quanlyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdo_qlNV_quanlyActionPerformed

    private void txt_qlNV_MaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_qlNV_MaNVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_qlNV_MaNVActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_qlNV_lammoi;
    private javax.swing.JButton btn_qlNV_sua;
    private javax.swing.JButton btn_qlNV_them;
    private javax.swing.JButton btn_qlNV_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdo_qlNV_nam;
    private javax.swing.JRadioButton rdo_qlNV_nhanvien;
    private javax.swing.JRadioButton rdo_qlNV_quanly;
    private javax.swing.JRadioButton rdp_qlNV_Nu;
    private javax.swing.JTable tbl_qlNV_QLNV;
    private com.toedter.calendar.JDateChooser txt_qlNV_DOB;
    private javax.swing.JTextField txt_qlNV_Diachi;
    private javax.swing.JTextField txt_qlNV_MaNV;
    private javax.swing.JTextField txt_qlNV_TenNV;
    private javax.swing.JTextField txt_qlNV_matkhau;
    private javax.swing.JTextField txt_qlNV_sdt;
    // End of variables declaration//GEN-END:variables
 
    void init() {
        initComponents();
        designTable();
        this.fillTable();
        this.updateStatus();
        
    }
    int row = -1;
    NhanVienDAO dao = new NhanVienDAO();
    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tbl_qlNV_QLNV.getModel();
        model.setRowCount(0);
// xóa tất cả các hàng trên table 
        try {
            List<NhanVien> list = dao.selectAll(); // Lấy tất cả dữ liệu từ SQL 
            for (NhanVien nv : list) {
                Object[] row = {
                   
                    // theo thu tu Database
                    nv.getMaNV(), nv.getTenNV(), nv.getDchi(), nv.getDOB(),
                    nv.isgTinh() ? "Nam" : "Nữ",
                    nv.getSdt(),
                    nv.isChucVu() ? "Quản lý" : "Nhân Viên",
                    nv.getmKhau()
                };
                model.addRow(row);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }
    
    

    void setForm(NhanVien nv) {
        txt_qlNV_MaNV.setText(nv.getMaNV());
        txt_qlNV_TenNV.setText(nv.getTenNV());
        txt_qlNV_Diachi.setText(nv.getDchi());
        txt_qlNV_DOB.setDate(nv.getDOB());
        rdo_qlNV_nam.setSelected(nv.isgTinh());
        rdp_qlNV_Nu.setSelected(!nv.isgTinh());
        txt_qlNV_sdt.setText(nv.getSdt());
        rdo_qlNV_nhanvien.setSelected(nv.isChucVu());
        rdo_qlNV_quanly.setSelected(!nv.isChucVu());
        txt_qlNV_matkhau.setText(nv.getmKhau());
    }

    NhanVien getForm() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txt_qlNV_MaNV.getText());
        nv.setTenNV(txt_qlNV_TenNV.getText());
        nv.setDchi(txt_qlNV_Diachi.getText());
        nv.setDOB(txt_qlNV_DOB.getDate());
        nv.setgTinh(rdo_qlNV_nam.isSelected());
        nv.setSdt(txt_qlNV_sdt.getText());
        nv.setChucVu(rdo_qlNV_quanly.isSelected());
        nv.setmKhau(txt_qlNV_matkhau.getText());
        return nv;
    }

    void clearForm() {
        NhanVien nv = new NhanVien();
        this.setForm(nv);
        this.row = -1;
        this.updateStatus();
        fillTable();
    }

    void edit() {
        String MaNV = (String) tbl_qlNV_QLNV.getValueAt(this.row, 0);
        tbl_qlNV_QLNV.setRowSelectionInterval(row, row);
        NhanVien nv = dao.selectebyID(MaNV);
        this.setForm(nv);
        this.updateStatus();
    }

    void update() {
        if (kiemtra()) {
            NhanVien nv = getForm();

            try {
                dao.update(nv);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Cập nhật thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại");
            }
        }
    }

    void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa nhân viên");
        } else {
            String manv = txt_qlNV_MaNV.getText(); 
            if (manv.equals(Auth.user.getMaNV())) {
                MsgBox.alert(this, "Bạn không được xóa chính bạn");
            } else if (MsgBox.confirm(this, "Bạn thực sự muốn xóa nhân viên này")) {
                try {
                    dao.delete(manv);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại");
                }
            }
        }
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
 
        boolean first = (this.row == 0);
        boolean last = (this.row == (tbl_qlNV_QLNV.getRowCount() - 1));

        
        // Trạng thái form
        txt_qlNV_MaNV.setEditable(!edit);
        btn_qlNV_them.setEnabled(!edit);
        btn_qlNV_sua.setEnabled(edit);
        btn_qlNV_xoa.setEnabled(edit);
        // Trạng thái điều hướng 

    }

    void insert() {
        if (kiemtra()) {
            NhanVien nv = getForm();

            try {
                dao.insert(nv);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại");
            }
        }
    }

    boolean kiemtra() {
        NhanVien nv = this.getForm();
        Date dateNow=java.util.Calendar.getInstance().getTime();
        Date date = txt_qlNV_DOB.getDate();   
       
       
       
        double year = ((dateNow.getTime() - date.getTime())/(24*60*60*1000))/365;
        if (nv.getMaNV().equals("") || nv.getTenNV().equals("")
                || nv.getSdt().equals("") || nv.getmKhau().equals("")) {
            MsgBox.alert(this, "Vui lòng nhập đầy đủ thông tin nhân viên");
            return false;

        } else if (!nv.getSdt().matches("0[0-9\\s.-]{9,10}")) {
            MsgBox.alert(this, "Số điện thoại không đúng");
            return false;
        } else if (year < 18){
            MsgBox.alert(this, "Nhân viên chưa đủ 18 tuổi vui lòng kiểm tra lại!");
            return false;
        }
        return true;
    }
    void designTable() {        
        tbl_qlNV_QLNV.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 18));
        tbl_qlNV_QLNV.getTableHeader().setForeground(Color.BLACK);
       
      
    }
}
