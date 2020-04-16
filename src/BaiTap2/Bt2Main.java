/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

import BaiTap1.NhanVien;

/**
 *
 * @author PC
 */
public class Bt2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IQuanLy QLNV = (IQuanLy) new QuanLyNhanVien();
        NhanVien NV1 = new NhanVien("Tiến Nguyễn", 18, "Nha Trang", 400000, 80);
        NhanVien NV2 = new NhanVien("Nguyễn Biểu", 27, "Nha Trang", 100000, 170);
        NhanVien NV3 = new NhanVien("Lê Minh", 22, "Khánh Hòa", 400000, 250);
        NhanVien NV4 = new NhanVien("Nguyễn Văn Khoa", 21, "Sài Gòn", 300000, 125);
        NhanVien NV5 = new NhanVien("Mạc Văn Khoa", 25, "Thanh Hóa", 4300000, 90);
        QLNV.them(NV1); QLNV.them(NV2);QLNV.them(NV3); QLNV.them(NV4); QLNV.them(NV5);
        QLNV.inDS();
    }
    
}
