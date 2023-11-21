/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author 84393
 */
public class Customer {
    private String mst;
    private String ten;
    private String diachi;
    private String stk,httt,dvt;

    public Customer() {
    }

    public Customer(String mst, String ten, String diachi, String stk, String httt, String dvt) {
        this.mst = mst;
        this.ten = ten;
        this.diachi = diachi;
        this.stk = stk;
        this.httt = httt;
        this.dvt = dvt;
    }

    public String getMst() {
        return mst;
    }

    public void setMst(String mst) {
        this.mst = mst;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getStk() {
        return stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    public String getHttt() {
        return httt;
    }

    public void setHttt(String httt) {
        this.httt = httt;
    }

    public String getDvt() {
        return dvt;
    }

    public void setDvt(String dvt) {
        this.dvt = dvt;
    }
    
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter mst: ");
        this.mst = s.nextLine();
        System.out.print("Enter ten: ");
        this.ten = s.nextLine();
        System.out.print("Enter diachi: ");
        this.diachi = s.nextLine();
        System.out.print("Enter stk: ");
        this.stk = s.nextLine();
        System.out.print("Enter Hinh thuc thanh toan: ");
        httt = s.nextLine();
        System.out.print("Enter don vi tinh: ");
        dvt = s.nextLine();
    }
    
    public void ouput(){
        System.out.println("------------------");
        System.out.println("Thong tin nguoi mua");
        System.out.println("- Ten nguoi mua: "+ ten);
        System.out.print("- Dia chi: "+diachi);
        System.out.println(", So tai khoan: "+ stk);
        System.out.println("- Hinh thuc thanh toan: "+ httt+", Ma so thue: "+mst+", Dong tien thanh toan: "+dvt);
    }
}
