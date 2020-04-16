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
public class Bt1Main {
    public static void main(String[]args )
    {
        
        
        NhanVien nv1 = new NhanVien("Tien",20,"QuangTrung",4000,80);        
        NhanVien nv2 = new NhanVien("Anh",20,"QuangTrung",3000,120);
        System.out.println(nv1.getThongTin()); System.out.println();
        System.out.println(nv2.getThongTin());
        
    }
    
}
