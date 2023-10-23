/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.btvn5_buoi1_java_private_2023;

import java.util.Scanner;

/**
 *
 * @author 84393
 */
public class Btvn5_buoi1_java_private_2023 {

    public static void main(String[] args) {
        int a, b, c, d, e, tmp1 = 0, tmp2, tmp3, tmp4;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();
        e = s.nextInt();
        int tmp;
        for (int i = 0; i < 4; i++) {
            if (a > b) {
                tmp1 = a;
                a = b;
                b = tmp1;
            }
            if (b > c) {
                tmp2 = b;
                b = c;
                c = tmp2;
            }
            if (c > d) {
                tmp3 = c;
                c = d;
                d = tmp3;
            }
            if (d > e) {
                tmp4 = d;
                d = e;
                e = tmp4;
            }
        }
        System.out.println(d + " " + e);
    }
}
