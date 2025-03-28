/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package org.example.GUI.Panels.SanPham;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import org.example.BUS.SanPhamBUS;
import org.example.DAO.SanPhamDAO;
import org.example.DTO.SanPhamDTO;

/**
 *
 * @author dtoan
 */
public class SanPham_Them_Dialog extends javax.swing.JDialog {

    private JTable tbSanPham;
    private SanPhamDAO loaiSanPhamDAO;
    private SanPhamDAO nhaSanXuatDAO;
    private SanPhamBUS sanPhamBUS;

    /**
     * Creates new form SanPham_Them_Dialog
     */
    public SanPham_Them_Dialog(java.awt.Frame parent, boolean modal,SanPhamBUS sanPhamBUS, JTable tbSanPham) {
        loaiSanPhamDAO = new SanPhamDAO();
        nhaSanXuatDAO = new SanPhamDAO();
        this.sanPhamBUS = sanPhamBUS;
        this.tbSanPham = tbSanPham;
        initComponents();
        // Tải dữ liệu cho JComboBox
        taiDuLieuLoaiSanPham();
        taiDuLieuNhaSanXuat();
        // Đặt dialog vào giữa màn hình
        setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        SanPham_txt_MaSanPham = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SanPham_cbo_LoaiSanPham = new javax.swing.JComboBox<>();
        SanPham_txt_AnhSanPham = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        SanPham_txt_TenSanPham = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SanPham_cbo_NhaSanXuat = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        SanPham_txt_SoLuong = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        SanPham_txt_GiaVon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        SanPham_txt_GiaLoi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setModal(true);
        setResizable(false);

        jPanel1.setMinimumSize(new java.awt.Dimension(32767, 32767));
        jPanel1.setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Mã sản phẩm");

        SanPham_txt_MaSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SanPham_txt_MaSanPham.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Loại sản phẩm");

        SanPham_cbo_LoaiSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        SanPham_txt_AnhSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SanPham_txt_AnhSanPham.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Ảnh sản phẩm URL");

        SanPham_txt_TenSanPham.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SanPham_txt_TenSanPham.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Tên sản phẩm");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Nhà sản xuất");

        SanPham_cbo_NhaSanXuat.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Số lượng");

        SanPham_txt_SoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SanPham_txt_SoLuong.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Giá vốn");

        SanPham_txt_GiaVon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SanPham_txt_GiaVon.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Giá lời");

        SanPham_txt_GiaLoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SanPham_txt_GiaLoi.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Xác nhận");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setText("Hủy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(242, 242, 242));
        jButton4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/159061.png"))
            .getImage().getScaledInstance(30, 30, java.awt.Image.SCALE_SMOOTH)));
    jButton4.setBorder(null);

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(SanPham_txt_GiaVon, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SanPham_txt_MaSanPham, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SanPham_cbo_LoaiSanPham, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SanPham_txt_AnhSanPham, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SanPham_txt_TenSanPham, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SanPham_cbo_NhaSanXuat, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SanPham_txt_SoLuong, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(SanPham_txt_GiaLoi, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(115, 115, 115))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(47, 47, 47)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1)
                .addComponent(SanPham_txt_MaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(SanPham_cbo_LoaiSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(SanPham_txt_AnhSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(SanPham_txt_TenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel5)
                .addComponent(SanPham_cbo_NhaSanXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(SanPham_txt_SoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel6))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(SanPham_txt_GiaVon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel7))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(SanPham_txt_GiaLoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel8))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton2)
                .addComponent(jButton1))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // Kiểm tra các trường không được để trống
            if (SanPham_txt_MaSanPham.getText().trim().isEmpty()
                    || SanPham_txt_SoLuong.getText().trim().isEmpty()
                    || SanPham_txt_GiaVon.getText().trim().isEmpty()
                    || SanPham_txt_GiaLoi.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ các trường số!",
                        "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            SanPhamDTO sanPham = new SanPhamDTO();

            sanPham.setMaSanPham(Integer.parseInt(SanPham_txt_MaSanPham.getText().trim()));
            int maLoaiSanPham = layMaLoaiSanPhamTuTen(SanPham_cbo_LoaiSanPham.getSelectedItem().toString());
            if (maLoaiSanPham == -1) {
                JOptionPane.showMessageDialog(this, "Loại sản phẩm không hợp lệ!",
                        "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }
            sanPham.setMaLoaiSanPham(maLoaiSanPham);
            sanPham.setAnhSanPhamURL(SanPham_txt_AnhSanPham.getText().trim());
            sanPham.setTenSanPham(SanPham_txt_TenSanPham.getText().trim());
            sanPham.setNhaSanXuat(SanPham_cbo_NhaSanXuat.getSelectedItem().toString());
            sanPham.setSoLuong(Integer.parseInt(SanPham_txt_SoLuong.getText().trim()));
            sanPham.setGiaVon(Double.parseDouble(SanPham_txt_GiaVon.getText().trim()));
            sanPham.setGiaLoi(Double.parseDouble(SanPham_txt_GiaLoi.getText().trim()));

            if (sanPhamBUS == null) {
                JOptionPane.showMessageDialog(this, "Lỗi: sanPhamBUS chưa được khởi tạo!",
                        "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Thử thêm sản phẩm
            if (sanPhamBUS.themSanPham(sanPham)) {
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công!",
                        "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm thất bại!",
                        "Lỗi", JOptionPane.ERROR_MESSAGE);
            }

            // Luôn tải lại bảng, bất kể thành công hay thất bại
            hienThiDanhSachSanPham();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đúng định dạng số cho các trường số!",
                    "Lỗi", JOptionPane.ERROR_MESSAGE);
            hienThiDanhSachSanPham(); // Tải lại bảng ngay cả khi có lỗi nhập liệu
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Có lỗi xảy ra: " + e.getMessage(),
                    "Lỗi", JOptionPane.ERROR_MESSAGE);
            hienThiDanhSachSanPham(); // Tải lại bảng ngay cả khi có lỗi khác
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    private int layMaLoaiSanPhamTuTen(String tenLoaiSanPham) {
        List<SanPhamDTO> danhSachLoai = loaiSanPhamDAO.layDanhSachLoaiSanPham();
        for (SanPhamDTO loai : danhSachLoai) {
            if (loai.getTenLoaiSanPham().equals(tenLoaiSanPham)) {
                return loai.getMaLoaiSanPham();
            }
        }
        return -1; // Trả về -1 nếu không tìm thấy
    }

    private void hienThiDanhSachSanPham() {
        if (sanPhamBUS != null && tbSanPham != null) {
            sanPhamBUS.hienThiSanPhamLenTable(tbSanPham);
        } else {
            JOptionPane.showMessageDialog(this, "Lỗi: Không thể cập nhật danh sách sản phẩm!",
                    "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void taiDuLieuNhaSanXuat() {
        List<SanPhamDTO> danhSachNhaSanXuat = nhaSanXuatDAO.layDanhSachNhaSanXuat();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        for (SanPhamDTO nhaSX : danhSachNhaSanXuat) {
            model.addElement(nhaSX.getTenNhaCungCap()); // Thêm tên nhà sản xuất vào model
        }

        SanPham_cbo_NhaSanXuat.setModel(model); // Gán model vào JComboBox
    }

    private void taiDuLieuLoaiSanPham() {
        List<SanPhamDTO> danhSachLoaiSanPham = loaiSanPhamDAO.layDanhSachLoaiSanPham();
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();

        for (SanPhamDTO loai : danhSachLoaiSanPham) {
            model.addElement(loai.getTenLoaiSanPham()); // Thêm tên loại sản phẩm vào model
        }

        SanPham_cbo_LoaiSanPham.setModel(model); // Gán model vào JComboBox
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(SanPham_Them_Dialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }

    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            // Tạo sanPhamBUS và một JTable giả để chạy thử
            SanPhamBUS sanPhamBUS = new SanPhamBUS();
            JTable tbSanPham = new JTable();
            SanPham_Them_Dialog dialog = new SanPham_Them_Dialog(new javax.swing.JFrame(), true, sanPhamBUS, tbSanPham);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> SanPham_cbo_LoaiSanPham;
    private javax.swing.JComboBox<String> SanPham_cbo_NhaSanXuat;
    private javax.swing.JTextField SanPham_txt_AnhSanPham;
    private javax.swing.JTextField SanPham_txt_GiaLoi;
    private javax.swing.JTextField SanPham_txt_GiaVon;
    private javax.swing.JTextField SanPham_txt_MaSanPham;
    private javax.swing.JTextField SanPham_txt_SoLuong;
    private javax.swing.JTextField SanPham_txt_TenSanPham;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
