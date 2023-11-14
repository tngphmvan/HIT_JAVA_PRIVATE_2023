/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.*;

public class May {
    private int maMay;
    private String kieuMay;
    private String tinhTrang;

    public May() {
    }

    public May(int maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    
    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Mã máy: ");
        this.maMay = s.nextInt();
        s.nextLine();
        System.out.print("Kieu may: ");
        this.kieuMay = s.nextLine();
        System.out.print("Tinh trang: ");
        this.tinhTrang = s.nextLine();
    }
    public void xuat(){
        System.out.print(" - Ma may: " + this.maMay);
        System.out.print(", Kieu may: "+this.kieuMay);
        System.out.println(", Tinh trang: "+this.tinhTrang);
    }
}
