/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mypackage.UI;

import com.qlks3tl.DAO.PhieuDangKiDAO;
import com.qlks3tl.DAO.PhongDAO;
import com.qlks3tl.Model.PhieuDangKi;
import com.qlks3tl.utils.MsgBox;
import com.qlks3tl.utils.getinfo;

/**
 *
 * @author Acer
 */
public class CheckinDatTruocbangdulieu extends javax.swing.JFrame {

    /**
     * Creates new form CheckinDatTruocbangdulieu
     */
    public CheckinDatTruocbangdulieu() {
        initComponents();
        this.setLocationRelativeTo(null);
        
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
        jLabel13 = new javax.swing.JLabel();
        txt_XacnhanDatPhong_mapdk = new javax.swing.JTextField();
        btn_XacNhanDatPhongbangdulieu_DongY = new javax.swing.JButton();
        btn_XacNhanDatPhong_huybo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(99, 99, 198));
        jLabel7.setText("XÁC NHẬN ĐẶT PHÒNG");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel7);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(99, 99, 198));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Mã Phiếu Đặt Phòng");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 0, 255)));

        btn_XacNhanDatPhongbangdulieu_DongY.setBackground(new java.awt.Color(99, 99, 198));
        btn_XacNhanDatPhongbangdulieu_DongY.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btn_XacNhanDatPhongbangdulieu_DongY.setForeground(new java.awt.Color(255, 255, 255));
        btn_XacNhanDatPhongbangdulieu_DongY.setText("XÁC NHẬN");
        btn_XacNhanDatPhongbangdulieu_DongY.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        btn_XacNhanDatPhongbangdulieu_DongY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XacNhanDatPhongbangdulieu_DongYActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_XacnhanDatPhong_mapdk, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_XacNhanDatPhongbangdulieu_DongY, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_XacNhanDatPhong_huybo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_XacnhanDatPhong_mapdk, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_XacNhanDatPhong_huybo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_XacNhanDatPhongbangdulieu_DongY, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_XacNhanDatPhongbangdulieu_DongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XacNhanDatPhongbangdulieu_DongYActionPerformed
        // TODO add your handling code here:
        PhieuDangKi pdk = new PhieuDangKi();
        PhieuDangKiDAO pdkdao = new PhieuDangKiDAO();
        PhongDAO phdao = new PhongDAO();
        if(kiemtra()){
        try {

            int mapdk = Integer.parseInt(txt_XacnhanDatPhong_mapdk.getText());
            frm_XacNhanDangKyPhong xacnhandkp = new frm_XacNhanDangKyPhong();
            xacnhandkp.setVisible(true);
            pdk = pdkdao.selectbyMAPDK(mapdk);
            xacnhandkp.setForm(phdao.selectebyID(pdk.getSoPhong()), pdk);
            MsgBox.alert(this, "Kiểm tra Thành Công");
            this.dispose();
        } catch (Exception e) {
            e.printStackTrace();
            MsgBox.alert(this, "Lỗi dữ liệu");
        }
        }

    }//GEN-LAST:event_btn_XacNhanDatPhongbangdulieu_DongYActionPerformed

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
            java.util.logging.Logger.getLogger(CheckinDatTruocbangdulieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckinDatTruocbangdulieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckinDatTruocbangdulieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckinDatTruocbangdulieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckinDatTruocbangdulieu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_XacNhanDatPhong_huybo;
    private javax.swing.JButton btn_XacNhanDatPhongbangdulieu_DongY;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_XacnhanDatPhong_mapdk;
    // End of variables declaration//GEN-END:variables
boolean kiemtra(){
    
    String a =txt_XacnhanDatPhong_mapdk.getText();
    if (a.equalsIgnoreCase("")==true){
        MsgBox.alert(this, "Không được bỏ trống ");
        return false;
    }
    if (!a.matches("[0-9]{2,10}")) {
            MsgBox.alert(this, "Mã số Đặt phòng của bạn không đúng");
            return false;
        }
    return true;
}
}
