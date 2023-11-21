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
public class Seller {
    private String mst;
    private String ten;
    private String diachi;
    private String stk;
    private String sdt;

    public Seller() {
    }

    public Seller(String mst, String ten, String diachi, String stk, String sdt) {
        this.mst = mst;
        this.ten = ten;
        this.diachi = diachi;
        this.stk = stk;
        this.sdt = sdt;
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

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
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
        System.out.print("Enter sdt: ");
        sdt = s.nextLine();
    }
    public void output(){
        System.out.println("Thong tin nguoi ban");
        System.out.println("- Ten nguoi ban: "+ ten);
        System.out.println("- Ma so thue: "+mst);
        System.out.println("- Dia chi: "+diachi);
        System.out.println("- So tai khoan: "+ stk);
        System.out.println("- Dien thoai: "+sdt);
    }
}
