/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mypackage.UI;

import com.qlks3tl.DAO.PhieuDangKiDAO;
import com.qlks3tl.Model.PhieuDangKi;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class DanhSachPhongCho extends javax.swing.JFrame {

    /**
     * Creates new form DanhSachPhongCho
     */
    public DanhSachPhongCho() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_CNGP_DsdatPhong = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(150, 196, 200));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(99, 99, 198));
        jLabel7.setText("DANH SÁCH PHÒNG CHỜ");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel7);

        tbl_CNGP_DsdatPhong.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(168, 222, 247), 4, true));
        tbl_CNGP_DsdatPhong.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tbl_CNGP_DsdatPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã PDK", "Tên KH", "SĐT", "CMND", "Số Phòng", "Loại Phòng", "Ngày vào", "Ngày ra", "Giờ vào", "Giờ ra"
            }
        ));
        tbl_CNGP_DsdatPhong.setGridColor(new java.awt.Color(150, 196, 200));
        tbl_CNGP_DsdatPhong.setRowHeight(27);
        tbl_CNGP_DsdatPhong.setRowMargin(3);
        tbl_CNGP_DsdatPhong.setSelectionBackground(new java.awt.Color(150, 196, 200));
        jScrollPane1.setViewportView(tbl_CNGP_DsdatPhong);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(DanhSachPhongCho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DanhSachPhongCho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DanhSachPhongCho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DanhSachPhongCho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DanhSachPhongCho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_CNGP_DsdatPhong;
    // End of variables declaration//GEN-END:variables
void init(){
    this.setLocationRelativeTo(null);
    fillTable();
    designTable();
}
void designTable() {
        tbl_CNGP_DsdatPhong.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 18));
        tbl_CNGP_DsdatPhong.getTableHeader().setForeground(Color.BLACK);
     }
PhieuDangKiDAO pdkdao = new PhieuDangKiDAO();
 void fillTable() {
       DefaultTableModel model = (DefaultTableModel) tbl_CNGP_DsdatPhong.getModel();
        model.setRowCount(0);
        try {

          
            List<Object[]> list = pdkdao.getDSPcho();
            try {
                
           
            for (Object[] row : list) {
                Object[] r = {
                    (int)row[0],
                    row[1], row[2], row[3], row[4],row[5],
                    (Date) row[6], (Date) row[7],
                    row[8],row[9]
                };

                model.addRow(r);

            }
             } catch (Exception e) {
                 e.printStackTrace();
            }
           
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
