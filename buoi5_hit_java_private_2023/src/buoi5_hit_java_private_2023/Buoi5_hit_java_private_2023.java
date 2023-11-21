/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi5_hit_java_private_2023;

import java.util.*;

public class Buoi5_hit_java_private_2023 {

    public static void main(String[] args) {
        
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(5);
        //index out of bound
//        khong them dc chi so am
//        phuong thuc array.contain(item)
        integers.add(2,1);
        System.out.println(integers.toString());
        integers.forEach(i->System.out.println(i));
        
//        ke thua vs ket tap: 
//        kethua chi co 1 trong khi ket tap dc nhieu
//        gia su 1 sinh vien co ngay ra truong va ngay sinh thi phai dung ket tap ngay_thang
    }
    
}
