/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.btvn2_buoi2;

import java.util.Scanner;

/**
 *
 * @author 84393
 */
public class Btvn2_buoi2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n + 1];
        int Sum[] = new int[n + 2];
        Sum[0] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = s.nextInt();
            Sum[i] = Sum[i - 1] + a[i];
        }
        int t = s.nextInt();
        while (t > 0) {
            int l = s.nextInt();
            int r = s.nextInt();
            System.out.println(Sum[r] - Sum[l - 1]);
            t--;
        }
    }
}
