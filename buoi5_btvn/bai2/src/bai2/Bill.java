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
public class Bill {

    private String sohd;
    private Seller sel;
    private Customer cus;
    private List<Goods> list = new ArrayList<>();
    private Date ngaylap;

    public Bill() {
        this.ngaylap = new Date();
    }

    public Bill(String sohd, Seller sel, Customer cus, List<Goods> list) {
        Date date = new Date();
        this.sohd = sohd;
        this.sel = sel;
        this.cus = cus;
        this.list = list;
        this.ngaylap = date;
    }

    public Date getNgaylap() {
        return ngaylap;
    }

    public void setNgaylap(Date ngaylap) {
        this.ngaylap = ngaylap;
    }

    public Seller getSel() {
        return sel;
    }

    public void setSel(Seller sel) {
        this.sel = sel;
    }

    public Customer getCus() {
        return cus;
    }

    public void setCus(Customer cus) {
        this.cus = cus;
    }

    public List<Goods> getList() {
        return list;
    }

    public void setList(List<Goods> list) {
        this.list = list;
    }

    public int tongTien() {
        int tongtien = 0;
        for (Goods good : list) {
            tongtien += good.thanhTien();
        }
        return tongtien;
    }

    public void input(int n) {
        Scanner s = new Scanner(System.in);
        System.out.print("So hoa don: ");
        sohd = s.nextLine();

        System.out.println("Nhap vao thong tin nguoi ban: ");
        Seller seller = new Seller();
        seller.input();
        sel = seller;
//        System.out.print("Enter mst: ");
//        sel.setMst(s.nextLine());
//        System.out.print("Enter ten: ");
//        sel.setTen(s.nextLine());
//        System.out.print("Enter diachi: ");
//        sel.setDiachi(s.nextLine());
//        System.out.print("Enter stk: ");
//        sel.setStk(s.nextLine());
//        System.out.print("Enter sdt: ");
//        sel.setSdt(s.nextLine());

        System.out.println("Nhap vao thong tin nguoi mua: ");
        Customer custom = new Customer();
        custom.input();
        cus = custom;
//        System.out.print("Enter mst: ");
//        cus.setMst(s.nextLine());
//        System.out.print("Enter ten: ");
//        cus.setTen(s.nextLine());
//        System.out.print("Enter diachi: ");
//        cus.setDiachi(s.nextLine());
//        System.out.print("Enter stk: ");
//        cus.setStk(s.nextLine());
//        System.out.print("Enter Hinh thuc thanh toan: ");
//        cus.setHttt(s.nextLine());
//        System.out.print("Enter don vi tinh: ");
//        cus.setDvt(s.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao thong tin hang hoa thu " + (i + 1) + ": ");
            Goods goods = new Goods();
            goods.input();
            this.list.add(goods);
        }
    }

    public void output() {
        System.out.println("------------------");
        System.out.println("So hoa don: " + sohd);
        System.out.println("Ngay lap: " + ngaylap.toString());
        System.out.println("------------------");
        sel.output();
        cus.ouput();
        System.out.printf("%-10s %-20s %-15s %-10s %-10s %-10s\n", "MaHang", "Ten", "DVT", "SoLuong", "DonGia", "Thanh Tien");
        for (Goods good : list) {
            good.output();
        }
        System.out.println("");
        System.out.println("\tTong tien: " + this.tongTien());
    }

    public void sortByPrice() {
        list.sort(new priceComparator());
        this.output();
    }

    public void maxQuantity() {
        Goods maxQuantityProduct = Collections.max(list, Comparator.comparing(Goods::getSoluong));
        maxQuantityProduct.output();
    }

}
