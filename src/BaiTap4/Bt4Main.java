/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;

/**
 *
 * @author PC
 */
public class Bt4Main{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        ChuyenXe ChuyenXe1 = new XeNoiThanh("1", 20, "1", "Nguyễn Văn", "79-F1111", 45000);
        ChuyenXe ChuyenXe2 = new XeNoiThanh("2", 110, "2", "Lê Phúc", "79-N2123", 420000);
        ChuyenXe ChuyenXe3 = new XeNoiThanh("3", 120, "3", "Nguyễn Văn Bảy", "79-C2222", 240000);
        ChuyenXe ChuyenXe4 = new XeNgoaiThanh("Vạn Ninh", 13, "24", "Hồ Văn Lâm", "A15555", 420000);
        ChuyenXe ChuyenXe5 = new XeNgoaiThanh("Van Giã", 2, "7", "Minh Trí", "TC32333", 28000);
        ChuyenXe ChuyenXe6 = new XeNgoaiThanh("Thanh Hóa",4, "5", "", "Văn Minh", 450000);
       
        QuanLyChuyenXe QLChuyenXe = new QuanLyChuyenXe();
        QLChuyenXe.ThemChuyenXe(ChuyenXe1);
        QLChuyenXe.ThemChuyenXe(ChuyenXe2);
        QLChuyenXe.ThemChuyenXe(ChuyenXe3);
        QLChuyenXe.ThemChuyenXe(ChuyenXe4);
        QLChuyenXe.ThemChuyenXe(ChuyenXe5);
        QLChuyenXe.ThemChuyenXe(ChuyenXe6);
      
        QLChuyenXe.xuatDS();
      
        System.out.println("Tổng doanh thu xe ngoại thành: "+QLChuyenXe.TinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu xe nội thành: "+QLChuyenXe.TinhDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu cả 2 loại xe: "+(QLChuyenXe.TinhDoanhThuNoiThanh()+QLChuyenXe.TinhDoanhThuNgoaiThanh()));
    }
}