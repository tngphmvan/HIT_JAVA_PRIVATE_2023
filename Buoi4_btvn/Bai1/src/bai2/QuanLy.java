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
public class QuanLy {
    private String maQL;
    private String tenQL;

    public QuanLy() {
    }

    public QuanLy(String maQL, String tenQL) {
        this.maQL = maQL;
        this.tenQL = tenQL;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getTenQL() {
        return tenQL;
    }

    public void setTenQL(String tenQL) {
        this.tenQL = tenQL;
    }

    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Ma quan ly: ");
        maQL = s.nextLine();
        System.out.print("Ten quan ly: ");
        tenQL = s.nextLine();
    }     
    public void xuat(){
        System.out.println("Ma quan ly: " + this.maQL);
        System.out.println("Ten quan ly: "+this.tenQL);
    }
}
