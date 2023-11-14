/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.buoi4_hit_java_private;

public class Buoi4_hit_java_private {
    //Khối static được dùng để khởi tạo hoặc thay đổi giá trị của các biến static.
    //Nó được thực thi trước phương thức main tại thời gian tải lớp.
    //Một class có thể có nhiều static blocks.

    static {
        System.out.println("test");
    }

    //Dng khoi static them gia tri mac dinh cho mang (generate testcase).
    private static SinhVien[] lst = new SinhVien[2];

    static {
        lst[0] = new SinhVien("Tung");
        lst[2] = new SinhVien("Bang");
    }

    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Tung");
        SinhVien sv2 = new SinhVien("bang");
        System.out.println(sv1);
        System.out.println(sv2);

        //lop Math la 1 vi du cua static
        System.out.println(Math.max(1, 2));
    }
    
    //napchongphuongthuc
}
