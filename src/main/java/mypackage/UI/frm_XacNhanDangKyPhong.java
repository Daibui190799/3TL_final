/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mypackage.UI;

import com.qlks3tl.DAO.KhachHangDAO;
import com.qlks3tl.DAO.PhieuDangKiDAO;
import com.qlks3tl.DAO.PhongDAO;
import com.qlks3tl.Model.PhieuDangKi;
import com.qlks3tl.Model.Phong;
import com.qlks3tl.utils.MsgBox;
import java.util.Date;
import static mypackage.UI.frm_ChitietPhong.date;

/**
 *
 * @author Acer
 */
public class frm_XacNhanDangKyPhong extends javax.swing.JFrame {

    /**
     * Creates new form frm_XacNhanDangKyPhong
     */
    public frm_XacNhanDangKyPhong() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txt_XacnhanDatPhong_TenKH = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_XacnhanDatPhong_GioRa = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        lbl_frmDatPhong_GiaNgay = new javax.swing.JLabel();
        lbl_frmDatPhong_GiaGio = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_XacnhanDatPhong_SoNgay = new javax.swing.JLabel();
        lbl_frmDatPhong_TongTien = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txt_XacnhanDatPhong_GioVao = new com.toedter.calendar.JDateChooser();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txt_XacnhanDatPhong_SDT = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_XacnhanDatPhong_CMND = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_XacnhanDatPhong_mapdk = new javax.swing.JTextField();
        txt_XacnhanDatPhong_SoPHong = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btn_XacNhanDatPhong_DongY = new javax.swing.JButton();
        btn_XacNhanDatPhong_huybo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(99, 99, 198));
        jLabel7.setText("XÁC NHẬN ĐẶT PHÒNG");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel7);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(99, 99, 198));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tên KH");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(99, 99, 198));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Số Phòng");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(99, 99, 198));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Giờ Trả Phòng");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(99, 99, 198));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Giá Phòng");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        lbl_frmDatPhong_GiaNgay.setBackground(new java.awt.Color(255, 255, 255));
        lbl_frmDatPhong_GiaNgay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_frmDatPhong_GiaNgay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_frmDatPhong_GiaNgay.setText("Giá Ngày");
        lbl_frmDatPhong_GiaNgay.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        lbl_frmDatPhong_GiaGio.setBackground(new java.awt.Color(255, 255, 255));
        lbl_frmDatPhong_GiaGio.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_frmDatPhong_GiaGio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_frmDatPhong_GiaGio.setText("Giá Giờ");
        lbl_frmDatPhong_GiaGio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(99, 99, 198));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Số Ngày");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        txt_XacnhanDatPhong_SoNgay.setBackground(new java.awt.Color(255, 255, 255));
        txt_XacnhanDatPhong_SoNgay.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_XacnhanDatPhong_SoNgay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_XacnhanDatPhong_SoNgay.setText("Số Lượng");
        txt_XacnhanDatPhong_SoNgay.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        lbl_frmDatPhong_TongTien.setBackground(new java.awt.Color(255, 255, 255));
        lbl_frmDatPhong_TongTien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_frmDatPhong_TongTien.setForeground(new java.awt.Color(255, 0, 0));
        lbl_frmDatPhong_TongTien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_frmDatPhong_TongTien.setText("Tổng Tiền Phòng");
        lbl_frmDatPhong_TongTien.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(99, 99, 198));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Giờ Nhận Phòng");
        jLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(99, 99, 198));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("SĐT");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(99, 99, 198));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Tổng Tiền Phòng");
        jLabel20.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(99, 99, 198));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("CMND");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(99, 99, 198));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Mã Phiếu Đặt Phòng");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(28, 28, 28)
                            .addComponent(txt_XacnhanDatPhong_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(28, 28, 28)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_XacnhanDatPhong_CMND, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                .addComponent(txt_XacnhanDatPhong_SDT, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                .addComponent(txt_XacnhanDatPhong_SoPHong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_XacnhanDatPhong_mapdk))
                        .addComponent(txt_XacnhanDatPhong_GioVao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(88, 88, 88)
                            .addComponent(txt_XacnhanDatPhong_GioRa, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(58, 58, 58)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txt_XacnhanDatPhong_SoNgay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_frmDatPhong_GiaNgay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_frmDatPhong_GiaGio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))
                    .addComponent(lbl_frmDatPhong_TongTien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addComponent(jSeparator2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_frmDatPhong_GiaNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_frmDatPhong_GiaGio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_XacnhanDatPhong_SoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbl_frmDatPhong_TongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_XacnhanDatPhong_mapdk)
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_XacnhanDatPhong_TenKH)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_XacnhanDatPhong_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txt_XacnhanDatPhong_CMND, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_XacnhanDatPhong_SoPHong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_XacnhanDatPhong_GioVao, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_XacnhanDatPhong_GioRa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_XacNhanDatPhong_DongY.setBackground(new java.awt.Color(99, 99, 198));
        btn_XacNhanDatPhong_DongY.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_XacNhanDatPhong_DongY.setForeground(new java.awt.Color(255, 255, 255));
        btn_XacNhanDatPhong_DongY.setText("XÁC NHẬN");
        btn_XacNhanDatPhong_DongY.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_XacNhanDatPhong_DongY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XacNhanDatPhong_DongYActionPerformed(evt);
            }
        });

        btn_XacNhanDatPhong_huybo.setBackground(new java.awt.Color(249, 32, 1));
        btn_XacNhanDatPhong_huybo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_XacNhanDatPhong_huybo.setForeground(new java.awt.Color(255, 255, 255));
        btn_XacNhanDatPhong_huybo.setText("HỦY BỎ");
        btn_XacNhanDatPhong_huybo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_XacNhanDatPhong_huybo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XacNhanDatPhong_huyboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_XacNhanDatPhong_DongY, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_XacNhanDatPhong_huybo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_XacNhanDatPhong_huybo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_XacNhanDatPhong_DongY, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_XacNhanDatPhong_DongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XacNhanDatPhong_DongYActionPerformed
        // TODO add your handling code here:

        update();


    }//GEN-LAST:event_btn_XacNhanDatPhong_DongYActionPerformed

    private void btn_XacNhanDatPhong_huyboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XacNhanDatPhong_huyboActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_XacNhanDatPhong_huyboActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_XacNhanDangKyPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_XacNhanDangKyPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_XacNhanDangKyPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_XacNhanDangKyPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_XacNhanDangKyPhong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_XacNhanDatPhong_DongY;
    private javax.swing.JButton btn_XacNhanDatPhong_huybo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_frmDatPhong_GiaGio;
    private javax.swing.JLabel lbl_frmDatPhong_GiaNgay;
    private javax.swing.JLabel lbl_frmDatPhong_TongTien;
    private javax.swing.JTextField txt_XacnhanDatPhong_CMND;
    private com.toedter.calendar.JDateChooser txt_XacnhanDatPhong_GioRa;
    private com.toedter.calendar.JDateChooser txt_XacnhanDatPhong_GioVao;
    private javax.swing.JTextField txt_XacnhanDatPhong_SDT;
    private javax.swing.JLabel txt_XacnhanDatPhong_SoNgay;
    private javax.swing.JTextField txt_XacnhanDatPhong_SoPHong;
    private javax.swing.JTextField txt_XacnhanDatPhong_TenKH;
    private javax.swing.JTextField txt_XacnhanDatPhong_mapdk;
    // End of variables declaration//GEN-END:variables

    void init() {
        setLocationRelativeTo(null);
    }
    KhachHangDAO khdao = new KhachHangDAO();

    PhieuDangKiDAO pdkdao = new PhieuDangKiDAO();
    PhongDAO phdao1 = new PhongDAO();

    void setForm(Phong nv, PhieuDangKi pdk1) {
        txt_XacnhanDatPhong_SoPHong.setText(nv.getSoPhong());
        txt_XacnhanDatPhong_mapdk.setText(pdk1.getMaPDK() + "");
        txt_XacnhanDatPhong_mapdk.setEnabled(false);

        lbl_frmDatPhong_GiaGio.setText(String.valueOf(nv.getGiaPhong_Gio()) + "/H");
        lbl_frmDatPhong_GiaNgay.setText(String.valueOf(nv.getGiaPhong_Ngay()) + "/N");
        txt_XacnhanDatPhong_TenKH.setText((khdao.selectebyID(pdk1.getTenKH())).getTenKH());
        txt_XacnhanDatPhong_SDT.setText((khdao.selectebyID(pdk1.getTenKH())).getSDT());
        txt_XacnhanDatPhong_CMND.setText(pdk1.getTenKH());
        txt_XacnhanDatPhong_GioVao.setDate(pdk1.getNgayDK());
        txt_XacnhanDatPhong_GioRa.setDate(pdk1.getNgayTra());

        txt_XacnhanDatPhong_SoNgay.setText((pdk1.getSoNgay() / 24) + "");
        double tongsogio = Double.parseDouble(txt_XacnhanDatPhong_SoNgay.getText()) * 24;
        double songay = tongsogio / 24;

        double tongtien;
        tongtien = (tongsogio) * phdao1.selectebyID(pdk1.getSoPhong()).getGiaPhong_Ngay();
        if (tongsogio > 4) {
            tongtien = (songay + 1) * phdao1.selectebyID(pdk1.getSoPhong()).getGiaPhong_Ngay();
        } else {
            tongtien = (tongsogio) * phdao1.selectebyID(pdk1.getSoPhong()).getGiaPhong_Gio() + songay * (phdao1.selectebyID(pdk1.getSoPhong()).getGiaPhong_Ngay());
        }
        lbl_frmDatPhong_TongTien.setText(String.valueOf(tongtien) + "00");

    }

    void update() {

        try {
            Phong ph = phdao1.selectebyID(txt_XacnhanDatPhong_SoPHong.getText());
            PhieuDangKi pdk3 = pdkdao.selectebyID(txt_XacnhanDatPhong_mapdk.getText());
            
            if (ph.getTrangthai() == null) {
                
                System.out.println("1111" + ph.getSoPhong() + ph.getTrangthai());
                 ph.setTrangthai("inUSE");
                 phdao1.update(ph);
                
                 pdk3.setTinhTrangCho(0);
                 pdkdao.update(pdk3);
                
                 
                 

                MsgBox.alert(this, "Mở Phòng thành công");
            }
            else 
                {
                    MsgBox.alert(this, "Mở Phòng thất bại, Kiểm tra tình trạng phòng, Phòng vẫn còn đang sử dụng ");
                }
                
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Mở phòng thất bại");
        }

    }
}