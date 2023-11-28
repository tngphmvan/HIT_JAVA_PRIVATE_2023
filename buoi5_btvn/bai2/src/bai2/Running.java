/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai2;

import java.util.*;

/**
 *
 * @author 84393
 */
public class Running {

    public static List<Goods> goodsList = new ArrayList<>();
    // Tạo một đối tượng Customer
        static Customer customer = new Customer("123456", "Khách hàng A", "Hà Nội", "987654321", "Chuyển khoản", "VND");
    // Tạo một đối tượng Seller
        static Seller seller = new Seller("345678", "Người bán A", "Hà Nội", "543210987", "0901234567");
    static {
        // Tạo một danh sách Goods

        goodsList.add(new Goods("Hàng A", "Cái", 10, 20000));
        goodsList.add(new Goods("Hàng B", "Kg", 5, 50000));
        goodsList.add(new Goods("Hàng C", "Kara", 15, 30000));
        goodsList.add(new Goods("Hàng D", "leed", 7, 70000));

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Goods> GoodList = new ArrayList<>();
        Customer cus = new Customer();
        Seller sel = new Seller();
        // Tạo các đối tượng Bill3
        
        Bill bill1 = new Bill("HD01", seller, customer, goodsList);

        Bill bill2 = new Bill();

//        System.out.print("Nhap vo so luong hang: ");
//        int n = s.nextInt();

//        bill2.input(n);
//
//        bill2.sortByPrice();
        bill1.sortByPrice();
        
        System.out.println("San pham co so luong lớn nhất: ");
        System.out.printf("%-10s %-20s %-15s %-10s %-10s %-10s\n", "MaHang", "Ten", "DVT", "SoLuong", "DonGia", "Thanh Tien");
//        bill2.maxQuantity();
        bill1.maxQuantity();
    }
    

}
