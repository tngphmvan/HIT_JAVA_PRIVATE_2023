/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.buoi3_hit_java_private;

import java.util.Scanner;

/**
 *
 * @author 84393
 */
public class SinhVien {

    private final String MSV = "0";
    private final String TEN = "noname";
    private String msv;
    private String ten;

    public SinhVien() {
    }

    public SinhVien(String msv, String ten) {
        this.msv = msv;
        this.ten = ten;
    }

    public SinhVien(SinhVien a) {
        this.msv = msv;
        this.ten = ten;
    }// sẽ copy từ đối tượng a sang các đối tượng khác gọi đến

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
//    
//    public SinhVien setMsv(Sting msv){
//        this.msv=msv;
//    }
//    public SinhVien setMsv(Sting ){
//        this.msv=msv;
//    }

    void dihoc() {
        System.out.println("Sv ís going to school at the moment");
    }

    void input() {
        Scanner s = new Scanner(System.in);
        msv = s.nextLine();
        ten = s.nextLine();
    }

    void display() {
        System.out.println("msv " + msv);
        System.out.println("ten " + ten);
    }
}
