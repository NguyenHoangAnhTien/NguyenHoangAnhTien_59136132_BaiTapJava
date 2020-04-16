/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;
import BaiTap1.NhanVien;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ltpnt
 */
public class QuanLyNhanVien implements IQuanLy{
    List<NhanVien> ListNhanVien = new ArrayList<>();

    @Override
    public void them(NhanVien nv) {
       ListNhanVien.add(nv);
    }

    @Override
    public void inDS() {
        for(NhanVien nhanVien: ListNhanVien) {
            System.out.println(nhanVien.getThongTin());
        }
    }
}
