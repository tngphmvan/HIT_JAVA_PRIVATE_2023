package bai2;

import java.util.*;

public class PhongMay {

    private String maPhong;
    private String tenPhong;
    private QuanLy x;
    private List<May> y;
    private static int n;

    public PhongMay(String maPhong, String tenPhong, QuanLy x, List<May> y) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.x = x;
        this.y = y;
    }

    public PhongMay() {
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public List<May> getY() {
        return y;
    }

    public void setY(List<May> y) {
        this.y = y;
    }

    public static int getN() {
        return n;
    }

    public static void setN(int n) {
        PhongMay.n = n;
    }

    
    public void nhap(){
        Scanner s = new Scanner(System.in);
        System.out.print("Ma phong: ");
        this.maPhong = s.nextLine();
        System.out.print("Ten Phong: ");
        this.tenPhong = s.nextLine();
    }
    public void xuat(){
        System.out.println("Ma Phong: "+this.maPhong);
        System.out.println("Ten Phong: "+this.tenPhong);
    }
    
    public void timKiem(String kieuMay) {
        for (int i = 0; i < n; i++) {
            if (kieuMay.equals(this.getY().get(i).getKieuMay())) {
                y.get(i).xuat();
            }
        }
    }
    
    public void timKiem(int maMay){
        for (int i = 0;i<n;i++){
            if(maMay == this.getY().get(i).getMaMay()){
                y.get(i).xuat();
            }
        }
    }
}
