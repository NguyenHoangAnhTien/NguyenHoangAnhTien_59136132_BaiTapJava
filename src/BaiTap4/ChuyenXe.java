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
public class ChuyenXe {
    private String MaSoChuyen;
    private String HoTenTaiXe;
    private String SoXe;
    double DoanhThu;
  
    public ChuyenXe(String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu) {
        this.MaSoChuyen = MaSoChuyen;
        this.HoTenTaiXe = HoTenTaiXe;
        this.SoXe = SoXe;
        this.DoanhThu = DoanhThu;
    }
    public double getDoanhThu() {
        return DoanhThu;
    }
    public void setDoanhThu(double DoanhThu) {
        this.DoanhThu = DoanhThu;
    }
    public void Xuat() {
        System.out.println("Mã số chuyến:"+MaSoChuyen+"\n"+"Họ tên tài xế:"+HoTenTaiXe
        +"\n"+"Số xe:"+SoXe+"\n"+"Doanh thu:"+DoanhThu);
    }
}

