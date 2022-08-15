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
import com.qlks3tl.utils.XDate;
import java.awt.Color;
import java.awt.Font;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Acer
 */
public class frm_PhieuDangKy extends javax.swing.JFrame {

    /**
     * Creates new form frm_PhieuDangKy
     */
    public frm_PhieuDangKy() {
        initComponents();
        init();
        fillComboBoxKhachHang();

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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_Phieudk_SoPhong = new javax.swing.JTextField();
        cbb_Phieudk_TenKH = new javax.swing.JComboBox<>();
        txt_Phieudk_Ngayvao = new com.toedter.calendar.JDateChooser();
        txt_Phieudk_Ngayra = new com.toedter.calendar.JDateChooser();
        txt_Phieudk_TenNV = new javax.swing.JTextField();
        btn_PhieuDK_xacnhan = new javax.swing.JButton();
        btn_Phieudk_huybo = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txt_Phieudk_LoaiPhong = new javax.swing.JTextField();
        txt_GioTra = new javax.swing.JTextField();
        txt_GioDK = new javax.swing.JTextField();
        btn_PhieuDK_DatPhong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(99, 99, 198));
        jLabel7.setText("PHIẾU ĐĂNG KÝ PHÒNG");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel7);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(99, 99, 198));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Số Phòng");
        jLabel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(99, 99, 198));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tên KH");
        jLabel9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(99, 99, 198));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Ngày Đăng Ký");
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(99, 99, 198));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Ngày Trả ");
        jLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(99, 99, 198));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Tên NV");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        txt_Phieudk_SoPhong.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cbb_Phieudk_TenKH.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nguyễn Văn A", "Nguyễn Thị B", "Item 3", "Item 4" }));

        txt_Phieudk_TenNV.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_PhieuDK_xacnhan.setBackground(new java.awt.Color(99, 99, 198));
        btn_PhieuDK_xacnhan.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_PhieuDK_xacnhan.setForeground(new java.awt.Color(255, 255, 255));
        btn_PhieuDK_xacnhan.setText("XÁC NHẬN");
        btn_PhieuDK_xacnhan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_PhieuDK_xacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PhieuDK_xacnhanActionPerformed(evt);
            }
        });

        btn_Phieudk_huybo.setBackground(new java.awt.Color(249, 32, 1));
        btn_Phieudk_huybo.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_Phieudk_huybo.setForeground(new java.awt.Color(255, 255, 255));
        btn_Phieudk_huybo.setText("HỦY BỎ");
        btn_Phieudk_huybo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_Phieudk_huybo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Phieudk_huyboActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(99, 99, 198));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Loại Phòng");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        txt_Phieudk_LoaiPhong.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_PhieuDK_DatPhong.setBackground(new java.awt.Color(99, 99, 198));
        btn_PhieuDK_DatPhong.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_PhieuDK_DatPhong.setForeground(new java.awt.Color(255, 255, 255));
        btn_PhieuDK_DatPhong.setText("ĐẶT PHÒNG");
        btn_PhieuDK_DatPhong.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_PhieuDK_DatPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PhieuDK_DatPhongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_PhieuDK_DatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_PhieuDK_xacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btn_Phieudk_huybo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Phieudk_SoPhong)
                            .addComponent(cbb_Phieudk_TenKH, 0, 246, Short.MAX_VALUE)
                            .addComponent(txt_Phieudk_Ngayvao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Phieudk_Ngayra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_Phieudk_TenNV)
                            .addComponent(txt_Phieudk_LoaiPhong))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_GioDK, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(txt_GioTra))
                        .addGap(0, 123, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Phieudk_SoPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Phieudk_LoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_Phieudk_Ngayvao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbb_Phieudk_TenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_GioDK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Phieudk_Ngayra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_GioTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_Phieudk_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_PhieuDK_xacnhan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Phieudk_huybo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_PhieuDK_DatPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PhieuDK_xacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PhieuDK_xacnhanActionPerformed
        // TODO add your handling code here:
        if(kiemTra()){
            XacNhan();
        }
    }//GEN-LAST:event_btn_PhieuDK_xacnhanActionPerformed

    private void btn_Phieudk_huyboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Phieudk_huyboActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btn_Phieudk_huyboActionPerformed

    private void btn_PhieuDK_DatPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PhieuDK_DatPhongActionPerformed
         frm_DatPhong npl = new frm_DatPhong();
         Phong p = new Phong();
         p = phdao1.selectebyID(txt_Phieudk_SoPhong.getText());
         npl.setVisible(true);
         npl.setForm(p);
         dispose();
    }//GEN-LAST:event_btn_PhieuDK_DatPhongActionPerformed

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
            java.util.logging.Logger.getLogger(frm_PhieuDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_PhieuDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_PhieuDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_PhieuDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_PhieuDangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_PhieuDK_DatPhong;
    private javax.swing.JButton btn_PhieuDK_xacnhan;
    private javax.swing.JButton btn_Phieudk_huybo;
    private javax.swing.JComboBox<String> cbb_Phieudk_TenKH;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_GioDK;
    private javax.swing.JTextField txt_GioTra;
    private javax.swing.JTextField txt_Phieudk_LoaiPhong;
    private com.toedter.calendar.JDateChooser txt_Phieudk_Ngayra;
    private com.toedter.calendar.JDateChooser txt_Phieudk_Ngayvao;
    private javax.swing.JTextField txt_Phieudk_SoPhong;
    private javax.swing.JTextField txt_Phieudk_TenNV;
    // End of variables declaration//GEN-END:variables
void init() {
        this.setLocationRelativeTo(null);

    }
    KhachHangDAO khDAO = new KhachHangDAO();
    PhieuDangKiDAO pdkDAO = new PhieuDangKiDAO();
    PhongDAO phdao1 = new PhongDAO();

    void fillComboBoxKhachHang() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cbb_Phieudk_TenKH.getModel();
        model.removeAllElements();

        List<String> list = khDAO.layKH();
        for (String khachHang : list) {
            model.addElement(khachHang);
        }
    } 
    SimpleDateFormat dateNow = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat hourNow = new SimpleDateFormat("HH:mm");
    public static DateFormat dateAHour = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    public static DateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    public static DateFormat hour = new SimpleDateFormat("HH:mm");
    void setForm(Phong nv) {
        Date date1 = new Date();
        String a = dateNow.format(date1);
        String b = hourNow.format(date1);
        try {
            date1 = dateAHour.parse(a);
        } catch (ParseException ex) {           
        }
        txt_Phieudk_SoPhong.setText(nv.getSoPhong());
        txt_Phieudk_TenNV.setText(DangNhap.Tenhienthi);
        txt_Phieudk_Ngayvao.setDate(date1);
        txt_GioDK.setText(b);
        txt_Phieudk_LoaiPhong.setText(nv.getMaLoaiPhong());
        setlocktypedata();

        //                
    }

    void setForm1(PhieuDangKi pdk1) {
        
        cbb_Phieudk_TenKH.setSelectedIndex(0);
        txt_Phieudk_Ngayvao.setDate(pdk1.getNgayDK());
        txt_Phieudk_Ngayra.setDate(pdk1.getNgayTra());
        txt_Phieudk_Ngayra.setDate(pdk1.getNgayTra());
    }

    PhieuDangKi getForm() {
        PhieuDangKi nv = new PhieuDangKi();
        nv.setSoPhong(txt_Phieudk_SoPhong.getText());
        nv.setLoaiPhong(txt_Phieudk_LoaiPhong.getText());
        nv.setTenKH((String) cbb_Phieudk_TenKH.getSelectedItem());
        nv.setGioVao(txt_GioDK.getText());
        nv.setGioRa(txt_GioTra.getText());
        
        nv.setNgayDK(txt_Phieudk_Ngayvao.getDate());
        nv.setNgayTra(txt_Phieudk_Ngayra.getDate());
        nv.setMaNV((DangNhap.maNVlayhienthi));
        //  System.out.println(nv.getMaNV());
        //  System.out.println("1"+ DangNhap.maNVlayhienthi);
        return nv;
    }
//                Date now = new Date();
//                SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
//                String timenow = formater.format(now);
    Date datenow = java.util.Calendar.getInstance().getTime();

    public void setlocktypedata() {
        // set type data
        txt_Phieudk_LoaiPhong.setBackground(new Color(99, 99, 198));
        txt_Phieudk_LoaiPhong.setFont(new Font("SansSe rif", Font.BOLD, 14));

        txt_Phieudk_SoPhong.setBackground(new Color(99, 99, 198));
        txt_Phieudk_SoPhong.setFont(new Font("SansSe rif", Font.BOLD, 14));

        txt_Phieudk_TenNV.setBackground(new Color(99, 99, 198));
        txt_Phieudk_TenNV.setFont(new Font("SansSe rif", Font.BOLD, 14));

        txt_Phieudk_SoPhong.setEnabled(false);
        txt_Phieudk_LoaiPhong.setEnabled(false);
        txt_Phieudk_TenNV.setEnabled(false);
    }

    void XacNhan() {

        PhieuDangKi nv = getForm();
        //    System.out.println(nv);

        try {
            pdkDAO.insert(nv);

            MsgBox.alert(this, "Đã Mở Phòng");
            Phong ph1 = new Phong();
            ph1 = phdao1.selectebyID(nv.getSoPhong());
            ph1.setTrangthai("inUSE");
            phdao1.update(ph1);

           // System.out.println(nv + "Đã add vào ở đâu đó không biết");

            this.dispose();
        } catch (Exception e) {
            MsgBox.alert(this, "Mở Phòng thất bại");
            e.printStackTrace();
            this.dispose();
        }

    }
    
    boolean kiemTra(){
        /*String b = hourNow.format(txt_Phieudk_Ngayra.getDate());
        Date date1 = new Date();          
        }
        String a2 = date.format(txt_Phieudk_Ngayra.getDate());
        String b2 = hour.format(txt_Phieudk_Ngayra.getDate());
        String c2 = a2+" 14:00";
        Date date2 = new Date();
        try {
            date2 = dateAHour.parse(c2);
        } catch (ParseException ex) {           
        }
        float t1 = (date1.getTime()-date2.getTime())%(24*60*60*1000);
        double t2 = t1/(60*60*1000);
        System.out.println(a2);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date1.getTime());
        System.out.println(date2.getTime());
        System.out.println((date1.getTime()-date2.getTime())/(24*60*60*1000));
        System.out.println(Math.ceil(t2));*/
        Date dateVao = txt_Phieudk_Ngayvao.getDate(); 
        Date dateRa = txt_Phieudk_Ngayra.getDate(); 
        if(dateRa == null){
            return true;
        } else if(dateRa.getTime() < dateVao.getTime()){
            MsgBox.alert(this, "Ngày trả phòng phải sau ngày nhận phòng");
            return false;
        }
        return true;
    }

}
