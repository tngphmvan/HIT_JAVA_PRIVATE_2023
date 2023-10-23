/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.btvn2_buoi1_java_private_2023;

import java.util.Scanner;

/**
 *
 * @author 84393
 */
public class Btvn2_buoi1_java_private_2023 {

    public static void main(String[] args) {
        int a, b,tmp=0;
        String kq="";
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        int i = 0;
        while (a > 0) {
            tmp = a % b;
            a = a / b;
            kq=tmp+kq;
        }
        System.out.println(kq);
    }
}
