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
        int a, b, tmp;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();
        while (a / b != 0) {
            tmp = a % b;
            a = a / b;
            System.out.println(tmp);
        }
    }
}
