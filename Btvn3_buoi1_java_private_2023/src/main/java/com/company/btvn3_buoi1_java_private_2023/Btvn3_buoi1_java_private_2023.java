/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.btvn3_buoi1_java_private_2023;

import java.util.Scanner;

/**
 *
 * @author 84393
 */
public class Btvn3_buoi1_java_private_2023 {

    public static void main(String[] args) {
        int a, tmp = 0, result = 1;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();

        while (a > 0) {
            tmp = a % 10; // 
            result *= tmp; 
            a /= 10; 
    }
        System.out.println(result);
}
}
