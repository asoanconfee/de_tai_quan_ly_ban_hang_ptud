
package gui;

import ConnectDB.KetNoiSQL;
import dao.ChatLieuDAO;
import dao.KichThuocDAO;
import dao.KieuDangDAO;
import dao.MauSacDAO;
import dao.PhanLoaiDAO;
import dao.XuatXuDAO;
import entity.ChatLieu;
import entity.KichThuoc;
import entity.KieuDang;
import entity.MauSac;
import entity.PhanLoai;
import entity.XuatXu;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20086
 */
public class TabThuocTinhSanPham extends javax.swing.JPanel implements ActionListener{
    private boolean isThemActive = false;
    private boolean isSuaActive = false;
    
    private XuatXuDAO xuatXu_DAO = new XuatXuDAO();
    private MauSacDAO mauSac_DAO = new MauSacDAO();
    private ChatLieuDAO chatLieu_DAO = new ChatLieuDAO();
    private KieuDangDAO kieuDang_DAO = new KieuDangDAO();
    private PhanLoaiDAO phanLoai_DAO = new PhanLoaiDAO();
    private KichThuocDAO kichThuoc_DAO = new KichThuocDAO();
    
    private ButtonGroup rd_group = new ButtonGroup();
    /**
     * Creates new form FormThemSanPham
     */
    public TabThuocTinhSanPham() {
//        KetNoiSQL.getInstance().connect();
        initComponents();
        groupRadioButton();
        tblDanhSachMauSac();
        designTable();
        addEvent();
    }
    
     private void designTable(){
        tbl_danhSachThuocTinh.getTableHeader().setFont(new java.awt.Font("Calibri", 0, 12));
        tbl_danhSachThuocTinh.getTableHeader().setOpaque(false);
        tbl_danhSachThuocTinh.getTableHeader().setBackground(new Color(198, 226, 255));
        tbl_danhSachThuocTinh.getTableHeader().setForeground(new Color(16,54,103));
        tbl_danhSachThuocTinh.setDefaultEditor(Object.class, null); // Không cho phép edit        
    }
    private void groupRadioButton(){
        rd_group.add(rb_mauSac);
        rd_group.add(rb_chatLieu);
        rd_group.add(rb_kichThuoc);
        rd_group.add(rb_loaiSanPham);
        rd_group.add(rb_kieuDang);
        rd_group.add(rb_xuatXu);
        rb_mauSac.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Thuoctinhsanpham = new javax.swing.JPanel();
        lbl_tenThuocTinh = new javax.swing.JLabel();
        txt_tenThuocTinh = new javax.swing.JTextField();
        rb_loaiSanPham = new javax.swing.JRadioButton();
        rb_mauSac = new javax.swing.JRadioButton();
        rb_kichThuoc = new javax.swing.JRadioButton();
        rb_chatLieu = new javax.swing.JRadioButton();
        btn_them = new javax.swing.JButton();
        btn_sua = new javax.swing.JButton();
        rb_xuatXu = new javax.swing.JRadioButton();
        rb_kieuDang = new javax.swing.JRadioButton();
        btn_luu = new javax.swing.JButton();
        Danhsachthuongtinh = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_danhSachThuocTinh = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setMaximumSize(new java.awt.Dimension(1115, 735));
        setMinimumSize(new java.awt.Dimension(1115, 735));
        setPreferredSize(new java.awt.Dimension(1115, 735));

        Thuoctinhsanpham.setBackground(new java.awt.Color(255, 255, 255));
        Thuoctinhsanpham.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thuộc tính sản phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 0, 12))); // NOI18N
        Thuoctinhsanpham.setMaximumSize(new java.awt.Dimension(1130, 756));
        Thuoctinhsanpham.setMinimumSize(new java.awt.Dimension(1115, 735));
        Thuoctinhsanpham.setPreferredSize(new java.awt.Dimension(1115, 735));
        Thuoctinhsanpham.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_tenThuocTinh.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lbl_tenThuocTinh.setText("Tên thuộc tính:");
        Thuoctinhsanpham.add(lbl_tenThuocTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 30));

        txt_tenThuocTinh.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        txt_tenThuocTinh.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txt_tenThuocTinh.setEnabled(false);
        Thuoctinhsanpham.add(txt_tenThuocTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 390, 30));

        rb_loaiSanPham.setBackground(new java.awt.Color(255, 255, 255));
        rb_loaiSanPham.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        rb_loaiSanPham.setText("Loại sản phẩm");
        Thuoctinhsanpham.add(rb_loaiSanPham, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 120, -1, -1));

        rb_mauSac.setBackground(new java.awt.Color(255, 255, 255));
        rb_mauSac.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        rb_mauSac.setText("Màu sắc");
        Thuoctinhsanpham.add(rb_mauSac, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, -1, -1));

        rb_kichThuoc.setBackground(new java.awt.Color(255, 255, 255));
        rb_kichThuoc.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        rb_kichThuoc.setText("Kích thước");
        Thuoctinhsanpham.add(rb_kichThuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, -1, -1));

        rb_chatLieu.setBackground(new java.awt.Color(255, 255, 255));
        rb_chatLieu.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        rb_chatLieu.setText("Chất liệu");
        Thuoctinhsanpham.add(rb_chatLieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 70, -1, -1));

        btn_them.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Approve.png"))); // NOI18N
        btn_them.setText("Thêm");
        btn_them.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_themMouseClicked(evt);
            }
        });
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });
        Thuoctinhsanpham.add(btn_them, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 130, 50));

        btn_sua.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_sua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit.png"))); // NOI18N
        btn_sua.setText("Sửa");
        btn_sua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_suaMouseClicked(evt);
            }
        });
        Thuoctinhsanpham.add(btn_sua, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 130, 50));

        rb_xuatXu.setBackground(new java.awt.Color(255, 255, 255));
        rb_xuatXu.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        rb_xuatXu.setText("Xuất xứ");
        Thuoctinhsanpham.add(rb_xuatXu, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 120, -1, -1));

        rb_kieuDang.setBackground(new java.awt.Color(255, 255, 255));
        rb_kieuDang.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        rb_kieuDang.setText("Kiểu dáng");
        Thuoctinhsanpham.add(rb_kieuDang, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, -1, -1));

        btn_luu.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btn_luu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Upload.png"))); // NOI18N
        btn_luu.setText("Lưu");
        btn_luu.setEnabled(false);
        btn_luu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_luuMouseClicked(evt);
            }
        });
        Thuoctinhsanpham.add(btn_luu, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 130, 50));

        Danhsachthuongtinh.setBackground(new java.awt.Color(255, 255, 255));
        Danhsachthuongtinh.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh sách thuộc tính", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 14))); // NOI18N
        Danhsachthuongtinh.setLayout(new javax.swing.BoxLayout(Danhsachthuongtinh, javax.swing.BoxLayout.LINE_AXIS));

        tbl_danhSachThuocTinh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên thuộc tính"
            }
        ));
        tbl_danhSachThuocTinh.setRowHeight(30);
        tbl_danhSachThuocTinh.setShowHorizontalLines(true);
        tbl_danhSachThuocTinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_danhSachThuocTinhMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_danhSachThuocTinh);

        Danhsachthuongtinh.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Danhsachthuongtinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Thuoctinhsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 1099, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Thuoctinhsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Danhsachthuongtinh, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void isthemThuocTinhClick(boolean check){
        isThemActive = check;
        isSuaActive = !check;
        
        rb_chatLieu.setEnabled(false);
        rb_kichThuoc.setEnabled(false);
        rb_kieuDang.setEnabled(false);
        rb_loaiSanPham.setEnabled(false);
        rb_mauSac.setEnabled(false);
        rb_xuatXu.setEnabled(false);
        
        if(isThemActive){
            btn_them.setText("Huỷ");
            btn_sua.setEnabled(false);
        }
        else if(isSuaActive){
            btn_sua.setText("Huỷ");
            btn_them.setEnabled(false);
        }  
        txt_tenThuocTinh.setEnabled(true);
        btn_luu.setEnabled(true);
    }
    
    private void huyThaoTaoThuocTinh(){
        isThemActive = false;
        isSuaActive = false;
        btn_them.setText("Thêm");
        btn_sua.setText("Sửa");
        
        btn_luu.setEnabled(false);
        btn_them.setEnabled(true);
        btn_sua.setEnabled(true);
        txt_tenThuocTinh.setEnabled(false);
        
        rb_chatLieu.setEnabled(true);
        rb_kichThuoc.setEnabled(true);
        rb_kieuDang.setEnabled(true);
        rb_loaiSanPham.setEnabled(true);
        rb_mauSac.setEnabled(true);
        rb_xuatXu.setEnabled(true);
    }
    
    private void btn_themMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_themMouseClicked
        // TODO add your handling code here:
        if(btn_them.getText().equalsIgnoreCase("Thêm")){
            isthemThuocTinhClick(true);
            clearInput();
        }
        else if(btn_them.getText().equalsIgnoreCase("Huỷ")){
            huyThaoTaoThuocTinh();
            clearInput();
        }
    }//GEN-LAST:event_btn_themMouseClicked

    private void tbl_danhSachThuocTinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_danhSachThuocTinhMouseClicked
        // TODO add your handling code here:
        String id = (String) tbl_danhSachThuocTinh.getValueAt(tbl_danhSachThuocTinh.getSelectedRow(), 0);
        if(rb_xuatXu.isSelected()){
            XuatXu xuatXu = xuatXu_DAO.getXuatXu(id);
            if(xuatXu == null){
                return;
            }
            txt_tenThuocTinh.setText(xuatXu.getNoiXuatXu());
        }
        else if(rb_mauSac.isSelected()){
            MauSac mauSac = mauSac_DAO.getMauSac(id);
            if(mauSac == null){
                return;
            }
            txt_tenThuocTinh.setText(mauSac.getMauSac());
        }
        else if(rb_chatLieu.isSelected()){
            ChatLieu chatLieu = chatLieu_DAO.getChatLieu(id);
            if(chatLieu == null){
                return;
            }
            txt_tenThuocTinh.setText(chatLieu.getChatLieu());
        }
        else if(rb_kieuDang.isSelected()){
            KieuDang kieuDang = kieuDang_DAO.getKieuDang(id);
            if(kieuDang == null){
                return;
            }
            txt_tenThuocTinh.setText(kieuDang.getKieuDang());
        }
        else if(rb_loaiSanPham.isSelected()){
            PhanLoai phanLoai = phanLoai_DAO.getPhanLoai(id);
            if(phanLoai == null){
                return;
            }
            txt_tenThuocTinh.setText(phanLoai.getLoaiSanPham());
        }
        else if(rb_kichThuoc.isSelected()){
            KichThuoc kichThuoc = kichThuoc_DAO.getKichThuoc(id);
            if(kichThuoc == null){
                return;
            }
            txt_tenThuocTinh.setText(kichThuoc.getKichThuoc());
        }
    }//GEN-LAST:event_tbl_danhSachThuocTinhMouseClicked

    private void btn_suaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_suaMouseClicked
        // TODO add your handling code here:
        if(tbl_danhSachThuocTinh.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Vui lòng chọn dữ liệu để sửa");
            return;
        }
        
        if(btn_sua.getText().equalsIgnoreCase("Sửa")){
            isthemThuocTinhClick(false);
        }
        else if(btn_sua.getText().equalsIgnoreCase("Huỷ")){
            huyThaoTaoThuocTinh();
        }
    }//GEN-LAST:event_btn_suaMouseClicked

    private void btn_luuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_luuMouseClicked
        // TODO add your handling code here:
        String thuocTinh = txt_tenThuocTinh.getText();
        if(isThemActive){
            if(rb_xuatXu.isSelected()){
                themXuatXu(thuocTinh);
            }
            else if(rb_mauSac.isSelected()){
                themMauSac(thuocTinh);
            }
            else if(rb_chatLieu.isSelected()){
                themChatLieu(thuocTinh);
            }
            else if(rb_kieuDang.isSelected()){
                themKieuDang(thuocTinh);
            }
            else if(rb_loaiSanPham.isSelected()){
                themPhanLoai(thuocTinh);
            }
            else if(rb_kichThuoc.isSelected()){
                themKichThuoc(thuocTinh);
            }
        }
        else if(isSuaActive){
            if(rb_xuatXu.isSelected()){
                suaXuatXu(thuocTinh);
            } 
            else if(rb_mauSac.isSelected()){
                suaMauSac(thuocTinh);
            }
            else if(rb_chatLieu.isSelected()){
                suaChatLieu(thuocTinh);
            }
            else if(rb_kieuDang.isSelected()){
                suaKieuDang(thuocTinh);
            }
            else if(rb_loaiSanPham.isSelected()){
                suaPhanLoai(thuocTinh);
            }
            else if(rb_kichThuoc.isSelected()){
                suaKichThuoc(thuocTinh);
            }
        }    
        clearInput();
        huyThaoTaoThuocTinh();
    }//GEN-LAST:event_btn_luuMouseClicked

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_themActionPerformed
    
    private void themXuatXu(String thuocTinh){
          XuatXu xuatXu = new XuatXu(thuocTinh);
        if (validData()) {
            if (xuatXu_DAO.addXuatXu(xuatXu) != -1) {
                JOptionPane.showMessageDialog(null, "Thêm thành công");
                tblDanhSachXuatXu();
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Thêm thất bại");
            }
        }
    }
    
    private void themMauSac(String thuocTinh){
        MauSac mauSac = new MauSac(thuocTinh);
        if (validData()) {
            if (mauSac_DAO.addMauSac(mauSac) != -1) {
                JOptionPane.showMessageDialog(null, "Thêm thành công");
                tblDanhSachMauSac();
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Thêm thất bại");
            }
        }
    }
    
    private void themChatLieu(String thuocTinh){
            ChatLieu chatLieu = new ChatLieu(thuocTinh);
        if (validData()) {
            if (chatLieu_DAO.addChatLieu(chatLieu) != -1) {
                JOptionPane.showMessageDialog(null, "Thêm thành công");
                tblDanhSachChatLieu();
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Thêm thất bại");
            }
        }
    }
    
    private void themKieuDang(String thuocTinh){
          KieuDang kieuDang = new KieuDang(thuocTinh);
        if (validData()) {
            if (kieuDang_DAO.addKieuDang(kieuDang) != -1) {
                JOptionPane.showMessageDialog(null, "Thêm thành công");
                tblDanhSachKieuDang();
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Thêm thất bại");
            }
        }

        JOptionPane.showMessageDialog(null, "Thêm thất bại");
    }
    
    private void themPhanLoai(String thuocTinh){
          PhanLoai phanLoai = new PhanLoai(thuocTinh);
        if (validData()) {
            if (phanLoai_DAO.addPhanLoai(phanLoai) != -1) {
                JOptionPane.showMessageDialog(null, "Thêm thành công");
                tblDanhSachPhanLoai();
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Thêm thất bại");
            }
        }
    }
    
    private void themKichThuoc(String thuocTinh){
          KichThuoc kichThuoc = new KichThuoc(thuocTinh);
        if (validData()) {
            if (kichThuoc_DAO.addKichThuoc(kichThuoc) != -1) {
                JOptionPane.showMessageDialog(null, "Thêm thành công");
                tblDanhSachKichThuoc();
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Thêm thất bại");
            }
        }
    }
    
    private void suaXuatXu(String thuocTinh){
        if(txt_tenThuocTinh.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Vui lòng điền dữ liệu.");
            return;
        }
        
         XuatXu xuatXu = xuatXu_DAO.getXuatXu((String) tbl_danhSachThuocTinh.getValueAt(tbl_danhSachThuocTinh.getSelectedRow(), 0));
            xuatXu.setNoiXuatXu(thuocTinh);
            if(xuatXu_DAO.updateXuatXu(xuatXu) != -1){
                JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                tblDanhSachXuatXu();
                return;
            }
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
    }
    
    private void suaMauSac(String thuocTinh){
        if(txt_tenThuocTinh.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Vui lòng điền dữ liệu.");
            return;
        }
        
         MauSac mauSac = mauSac_DAO.getMauSac((String) tbl_danhSachThuocTinh.getValueAt(tbl_danhSachThuocTinh.getSelectedRow(), 0));
            mauSac.setMauSac(thuocTinh);
            if(mauSac_DAO.updateMauSac(mauSac) != -1){
                JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                tblDanhSachMauSac();
                return;
            }
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
    }
    
    private void suaChatLieu(String thuocTinh){
        if(txt_tenThuocTinh.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Vui lòng điền dữ liệu.");
            return;
        }
        
         ChatLieu chatLieu = chatLieu_DAO.getChatLieu((String) tbl_danhSachThuocTinh.getValueAt(tbl_danhSachThuocTinh.getSelectedRow(), 0));
            chatLieu.setChatLieu(thuocTinh);
            if(chatLieu_DAO.updateChatLieu(chatLieu) != -1){
                JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                tblDanhSachChatLieu();
                return;
            }
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
    }
    
    private void suaKieuDang(String thuocTinh){
        if(txt_tenThuocTinh.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Vui lòng điền dữ liệu.");
            return;
        }
        
         KieuDang kieuDang = kieuDang_DAO.getKieuDang((String) tbl_danhSachThuocTinh.getValueAt(tbl_danhSachThuocTinh.getSelectedRow(), 0));
            kieuDang.setKieuDang(thuocTinh);
            if(kieuDang_DAO.updateKieuDang(kieuDang) != -1){
                JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                tblDanhSachKieuDang();
                return;
            }
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
    }
    
    private void suaPhanLoai(String thuocTinh){
        if(txt_tenThuocTinh.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Vui lòng điền dữ liệu.");
            return;
        }
        
         PhanLoai phanLoai = phanLoai_DAO.getPhanLoai((String) tbl_danhSachThuocTinh.getValueAt(tbl_danhSachThuocTinh.getSelectedRow(), 0));
            phanLoai.setLoaiSanPham(thuocTinh);
            if(phanLoai_DAO.updatePhanLoai(phanLoai) != -1){
                JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                tblDanhSachPhanLoai();
                return;
            }
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
    }
    
    private void suaKichThuoc(String thuocTinh){
        if(txt_tenThuocTinh.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, "Vui lòng điền dữ liệu.");
            return;
        }
        
         KichThuoc kichThuoc = kichThuoc_DAO.getKichThuoc((String) tbl_danhSachThuocTinh.getValueAt(tbl_danhSachThuocTinh.getSelectedRow(), 0));
            kichThuoc.setKichThuoc(thuocTinh);
            if(kichThuoc_DAO.updateKichThuoc(kichThuoc) != -1){
                JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                tblDanhSachKichThuoc();
                return;
            }
            JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
    }
    
    private void addEvent(){
        rb_chatLieu.addActionListener(this);
        rb_kichThuoc.addActionListener(this);
        rb_loaiSanPham.addActionListener(this);
        rb_mauSac.addActionListener(this);
        rb_xuatXu.addActionListener(this);
        rb_kieuDang.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String event = e.getActionCommand();
        if(event.equalsIgnoreCase("Kích thước")){
            tblDanhSachKichThuoc();
        }

        else if(event.equalsIgnoreCase("Màu sắc")){
            tblDanhSachMauSac();
        }

        else if(event.equalsIgnoreCase("Chất liệu")){
            tblDanhSachChatLieu();
        }

        else if(event.equalsIgnoreCase("Loại sản phẩm")){
            tblDanhSachPhanLoai();
        }
        else if(event.equalsIgnoreCase("Kiểu dáng")){
            tblDanhSachKieuDang();
        }
        else if(event.equalsIgnoreCase("Xuất xứ")){
            tblDanhSachXuatXu();
        } 
    }

    private void clearInput(){
        txt_tenThuocTinh.setText("");
    }
    
    private void clearTable(){
        DefaultTableModel dtm = (DefaultTableModel) tbl_danhSachThuocTinh.getModel();
        dtm.setRowCount(0);
    }
    
    private void tblDanhSachXuatXu(){     
        ArrayList<XuatXu> listXuatXu = xuatXu_DAO.getAllXuatXu();
        clearTable();
        DefaultTableModel dtm = (DefaultTableModel) tbl_danhSachThuocTinh.getModel();
        for(XuatXu xx : listXuatXu){
            Object[] rowData = {xx.getMaXuatXu(), xx.getNoiXuatXu()};
            dtm.addRow(rowData);
        }
    }
    
    private void tblDanhSachMauSac(){
        ArrayList<MauSac> listMauSac = mauSac_DAO.getAllMauSac();
        clearTable();
        DefaultTableModel dtm = (DefaultTableModel) tbl_danhSachThuocTinh.getModel();
        for(MauSac ms : listMauSac){
            Object[] rowData = {ms.getMaMauSac(), ms.getMauSac()};
            dtm.addRow(rowData);
        }
    }
    
    private void tblDanhSachChatLieu(){
        ArrayList<ChatLieu> listChatLieu = chatLieu_DAO.getAllChatLieu();
        clearTable();
        DefaultTableModel dtm = (DefaultTableModel) tbl_danhSachThuocTinh.getModel();
        for(ChatLieu cl : listChatLieu){
            Object[] rowData = {cl.getMaChatLieu(), cl.getChatLieu()};
            dtm.addRow(rowData);
        }
    }
    
    private void tblDanhSachKieuDang(){
        ArrayList<KieuDang> listKieuDang = kieuDang_DAO.getAllKieuDang();
        clearTable();
        DefaultTableModel dtm = (DefaultTableModel) tbl_danhSachThuocTinh.getModel();
        for(KieuDang kd : listKieuDang){
            Object[] rowData = {kd.getMaKieuDang(), kd.getKieuDang()};
            dtm.addRow(rowData);
        }
    }
    
    private void tblDanhSachPhanLoai(){
        ArrayList<PhanLoai> listPhanLoai = phanLoai_DAO.getAllPhanLoai();
        clearTable();
        DefaultTableModel dtm = (DefaultTableModel) tbl_danhSachThuocTinh.getModel();
        for(PhanLoai pl : listPhanLoai){
            Object[] rowData = {pl.getMaPhanLoai(), pl.getLoaiSanPham()};
            dtm.addRow(rowData);
        }
    }
    
   private void tblDanhSachKichThuoc(){
        ArrayList<KichThuoc> listPhanLoai = kichThuoc_DAO.getAllKichThuoc();
        clearTable();
        DefaultTableModel dtm = (DefaultTableModel) tbl_danhSachThuocTinh.getModel();
        for(KichThuoc kt : listPhanLoai){
            Object[] rowData = {kt.getMaKichThuoc(), kt.getKichThuoc()};
            dtm.addRow(rowData);
        }
    }
     public boolean validData() {
        String tenThuocTinh = txt_tenThuocTinh.getText().trim();

        if (tenThuocTinh.length() == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập tên thuộc tính");
            return false;
        }

        return true;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_sua;
    private javax.swing.JButton btn_them;
    private javax.swing.JPanel Thuoctinhsanpham;
    private javax.swing.JPanel Danhsachthuongtinh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_tenThuocTinh;
    private javax.swing.JRadioButton rb_chatLieu;
    private javax.swing.JRadioButton rb_kichThuoc;
    private javax.swing.JRadioButton rb_kieuDang;
    private javax.swing.JRadioButton rb_loaiSanPham;
    private javax.swing.JRadioButton rb_mauSac;
    private javax.swing.JRadioButton rb_xuatXu;
    private javax.swing.JTable tbl_danhSachThuocTinh;
    private javax.swing.JTextField txt_tenThuocTinh;
    // End of variables declaration//GEN-END:variables

   
}