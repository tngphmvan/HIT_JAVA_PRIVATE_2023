/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.buoi2_hit_java_private;

/**
 *
 * @author 84393
 */
public class Buoi2_HIT_java_private {
    
    private static int[] array2;
    //hằng số đặt ngoài main()
    public static final int SECONDS_IN_MINUTE = 60;
    //hàm trả về giá trị
    public static int factorial(int n) {
       if (n == 0 || n == 1) {
      	       return 1;
       } else {
     		return n * factorial(n - 1);
       }
      }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //khai bao hằng số
        final double pi=3.14;
        int[] array1 = new int[5];

        int[] array2 = {1, 2, 3, 4, 5, 6};
        //chi so: index 0 (n->1)
        //vị trí: 1-n
        int a = array2[0];
//        *mảng có rất it công cụ thao tác trên mảng
//        - mảng là mảng tĩnh nên khó thay đổi phần tử trong mảng
//                (khi thêm, sửa, xóa thì mảng sẽ k còn là mảng ban đầu mằ tạo ra mảng mới)
//        *list có nh phương thức hỗ trợ hơn
        //for thường dùng tính toán logic để tận dụng chỉ số thứ i
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "");
            //sout(array2[array.length-i-1] in ngược
        }
        //for each
        for (int x : array2) {
            System.out.println(x);
        }
        //for each thường dùng in dữ liệu
        System.out.println(SECONDS_IN_MINUTE);
        System.out.println(factorial(4));
        //wraper class thực chất là lớp cho các kiểu dứ liệu nguyên thủy để có thể sd lớp
        int a1=6; 
        Integer b=5;
        a1=b.shortValue();
        System.out.println(a1);
        Integer a2=128;
        Integer b2=128;
        System.out.println(a2==b2);
        System.out.println(a2.equals(b2));
        
    }
}
