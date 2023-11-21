/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.btvn_buoi1_java_private_2023;

import java.util.Scanner;

/**
 *
 * @author 84393
 */
public class Btvn2_buoi1_java_private_2023 {

    public static void main(String[] args) {
        int a = 0, b = 0, c = 0, gcd_temp = 0, temp = 0, gcd = 0;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        int tmp_a = a, tmp_b = b, tmp_c = c, lcm_tmp, lcm = 0,k=a*b*c;
        while (b != 0) {
            temp = a % b;
            a = b;
            b = temp;
            gcd_temp = a;
        }
        while (c != 0) {
            temp = gcd_temp % c;
            gcd_temp = c;
            c = temp;
            gcd = gcd_temp;
        }
        //tinh ucln = giai thuat euclid
        System.out.println(gcd);
        lcm_tmp = (tmp_a * tmp_b) / a;
        //ta co a*b=ucln*bcnn nên ta ghép từng căp 1 trong 3 so a,b,c
        System.out.println(lcm_tmp);
        int tmp_c1=tmp_c;
        int lcm_tmp1=lcm_tmp;
        while (tmp_c1 != 0) {
            
            temp = lcm_tmp1 % tmp_c1;
            lcm_tmp1 = tmp_c1;
            tmp_c1 = temp;
            gcd = lcm_tmp1;
        }
        System.out.println(k/gcd);
     }
}
