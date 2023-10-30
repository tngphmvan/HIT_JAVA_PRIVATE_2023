/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.btvn1_buoi2_java_private_2023;

import java.util.Scanner;

public class Btvn1_buoi2_java_private_2023 {

    public static int max(int[] a, int n) {
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] >= max) {
                max = a[i];
            }
        }
        return max;
    }

    public static void xhnn(int[] a, int n) {
        int[] b = new int[10000];
        for (int i = 0; i < n; i++) {
            b[a[i]]++;
        }
        int mostFrequent = -1;
        int maxCount = -1;
        for (int i = 0; i <= max(a, n); i++) {
            if (maxCount < b[i]) {
                mostFrequent = i;
                maxCount = b[i];
            }
        }
        System.out.print(mostFrequent + " " + maxCount);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] a = new int[10000];
        int n, i = 0;
        n = s.nextInt();
        while (n < 1 || n > 10000) {
            System.out.println("again");
            n = s.nextInt();
        }
        while (i < n) {
            a[i] = s.nextInt();
            i++;
        }
        xhnn(a, n);
    }
}

