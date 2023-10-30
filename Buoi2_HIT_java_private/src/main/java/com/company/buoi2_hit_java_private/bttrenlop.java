/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.buoi2_hit_java_private;

/**
 *
 * @author 84393
 */
public class bttrenlop {
//    tim va in ra so lan phan tu xuat hien nh nhat trong mang

    public static int soxhnn(int a[]){
        int i = 0;
        int j = 0, cnt = 0;
        while (i < 100) {
            int x = a[i];
            while (j < 100) {
                if (a[j] == x) {
                    cnt++;
                }
            j++;
            }
            i++;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,5,5,5,1,1,1,1,1};
        System.out.println();
    }
}
