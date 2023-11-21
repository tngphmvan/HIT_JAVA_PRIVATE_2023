/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.*;

/**
 *
 * @author 84393
 */
public class Goods {
    private int mahang,soluong,dongia;
    private String ten,dvt;
    private static int nextid=1;
    public Goods() {
        this.mahang = nextid++;
    }

    public Goods(String ten, String dvt, int soluong,int dongia) {
        this.mahang = nextid++;
        this.soluong = soluong;
        this.dongia = dongia;
        this.ten = ten;
        this.dvt = dvt;
    }

    public int getMahang() {
        return mahang;
    }

    public void setMahang(int mahang) {
        this.mahang = mahang;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }
    
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter ten: ");
        this.ten = s.nextLine();
        System.out.print("Enter don vi tinh: ");
        this.dvt = s.nextLine();
        System.out.print("Enter so luong: ");
        this.soluong = s.nextInt();
        System.out.print("Enter Don Gia: ");
        dongia = s.nextInt();
    }
    
    public void output(){
        System.out.printf("%-10d %-20s %-15s %-10d %-10d %-10d\n", getMahang(), getTen(), dvt, soluong, dongia,thanhTien());
    }
    
    public int thanhTien(){
        return dongia*soluong;
    }
}
