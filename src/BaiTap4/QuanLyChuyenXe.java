/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap4;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author PC 
 */
public class QuanLyChuyenXe {
    List<ChuyenXe> DSChuyenXe = new ArrayList<>();
    void ThemChuyenXe(ChuyenXe chuyenXe) {
        DSChuyenXe.add(chuyenXe);
    }
    void xuatDS() {       
        for(ChuyenXe chuyenXe: DSChuyenXe) {
        chuyenXe.Xuat();
        }
    }
    double TinhDoanhThuNoiThanh() {
        double t = 0;
        for(ChuyenXe chuyenXe: DSChuyenXe) {
        if(chuyenXe instanceof XeNoiThanh) {
        t = t + chuyenXe.getDoanhThu();
            }
        }
        return t;
    }
    double TinhDoanhThuNgoaiThanh() {
        double t = 0;
        for(ChuyenXe chuyenXe: DSChuyenXe) {
        if(chuyenXe instanceof XeNgoaiThanh) {
        t = t + chuyenXe.getDoanhThu();
           
            }
        }
        return t;
    }
}
