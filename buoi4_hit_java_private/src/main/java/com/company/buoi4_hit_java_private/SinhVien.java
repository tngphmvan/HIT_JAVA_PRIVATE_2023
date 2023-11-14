/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.buoi4_hit_java_private;

/**
 *
 * @author 84393
 */
public class SinhVien {
    private int id;
    private String name;
    //neu khong co static thi khi khoi tao se tao ra o nho khac va count se chuyen ve 0
    private static int count = 1;

    public SinhVien() {
        count++;
        this.id = count;
    }

    public SinhVien(String name) {
        this.id=++count;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "id=" + id + ", name=" + name + '}';
    }
    
    //Một phương thức static chỉ có thể gọi một phương thức static khác, không thể gọi được một phương thức non-static.
//    public static double tong(int a, int b){
//        return a+b;
//    }
//    public static double tong2(int a, int b, int c ){
//        return tong(a,b) + c;
//    }
    public double tong(int a, int b){
        return a+b;
    }
    public static double tong2(int a, int b, int c ){
        SinhVien sv = new SinhVien();
        return sv.tong(a,b) + c;
    }
    
    //Một phương thức static không thể được sử dụng từ khóa this và super.
    public static void main(String[] args) {
        System.out.println(tong2(5,6,7));
    }
    
    //Người dùng không thể override (đè) phương thức static trong Java
    
}
