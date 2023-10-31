/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.company.btvn3_buoi2;

import java.util.Scanner;

/**
 *
 * @author 84393
 */
public class Btvn3_buoi2 {

    public static void main(String[] args) {
        int kiTu = 0 ;
        int so = 0 ;
        int chu = 0  ;
        Scanner s =new Scanner(System.in) ;
        String str = s.nextLine() ;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) >= 'a' && str.charAt(i)  <= 'z' || str.charAt(i) >='A' && str.charAt(i) <= 'Z'){
                chu++;
            }
            else{
                if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                    so++;
                }
                else{
                    kiTu++;
                }
            }
        }
        System.out.println(chu + " " + so + " " + kiTu);
    }
}
