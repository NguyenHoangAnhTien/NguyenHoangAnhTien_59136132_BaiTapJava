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
public class XeNgoaiThanh extends ChuyenXe{
    private String NoiDen;
    private int SNDD;
   
    public XeNgoaiThanh(String NoiDen, int SoNgayDiDuoc, String MaSoChuyen, String HoTenTaiXe, String SoXe, double DoanhThu) {
        super(MaSoChuyen, HoTenTaiXe, SoXe, DoanhThu);
        this.NoiDen = NoiDen;
        this.SNDD = SoNgayDiDuoc;
    }
    @Override
    public void Xuat() {
        super.Xuat(); 
        System.out.println("Nơi đến "+NoiDen+"\n"+"Số ngày đi được "+SNDD+"\n");
    }   
}
