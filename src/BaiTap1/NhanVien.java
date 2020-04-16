/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author PC
 */
public class NhanVien {
    private String Ten;
    private int Tuoi;
    private String DiaChi;
    private double TienLuong;
    private int TongSoGioLam;
   //constructor không tham số 
    public NhanVien()
    {}
   
   //Constructor có tham số

    public NhanVien(String Ten, int Tuoi, String DiaChi, double TienLuong, int TongSoGioLam) {
        this.Ten = Ten;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.TienLuong = TienLuong;
        this.TongSoGioLam = TongSoGioLam;
    }
    
    //Getter , setter

    public String getTen() {
        return Ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public double getTienLuong() {
        return TienLuong;
    }

    public int getTongSoGioLam() {
        return TongSoGioLam;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setTienLuong(double TienLuong) {
        this.TienLuong = TienLuong;
    }

    public void setTongSoGioLam(int TongSoGioLam) {
        this.TongSoGioLam = TongSoGioLam;
    }
    
    //  
    public String getThongTin(){
    return
        "Ten:"+ Ten + "\n" +
        "Tuoi:"+ Tuoi +"\n"+
        "Dia Chi:"+ DiaChi + "\n" +
        "Tien Luong:"+ TienLuong + "\n" +
        "Tong Gio Lam:"+ TongSoGioLam + "\n" +
        "Tien Thuong:"+ TinhThuong();
    }
    
    public double TinhThuong()
    {
        double Thuong;
        if(TongSoGioLam>=200) return TienLuong*20/100;
        else
            if (TongSoGioLam<200 &&TongSoGioLam>=100)
                return Thuong=TienLuong*10/100;
            else return Thuong =0;
        
        
    }
}

