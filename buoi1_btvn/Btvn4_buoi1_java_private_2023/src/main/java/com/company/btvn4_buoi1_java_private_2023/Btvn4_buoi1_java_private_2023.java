/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.btvn4_buoi1_java_private_2023;

import java.util.Scanner;

/**
 *
 * @author 84393
 */
public class Btvn4_buoi1_java_private_2023 {

    public static void main(String[] args) {
        int a, b;
        String k;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        k = s.next();
        b = s.nextInt();
        switch (k) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                System.out.println(a / b);
                break;
        }
    }
}
