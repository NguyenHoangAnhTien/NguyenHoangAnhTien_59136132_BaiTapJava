/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3;

/**
 *
 * @author PC
 */
public class Bt3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinhVienPoly SVPoly = new SinhVienIT(8, 7, 6,"Lê Thành Phương");
        SinhVienIT  SVIT = new SinhVienIT(5, 10, 7, "Nguyễn Hoàng Anh Tiến");
        SinhVienBiz SVBiz = new SinhVienBiz(9, 9.3, "Nguyễn Tấn Vĩnh");
        SVPoly.xuat();SVIT.xuat();SVBiz.xuat();
    }
    
}
