/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.bai1;

import java.util.*;

public class Bai1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Vegetable> v = new ArrayList<>();
        while (true) {

            System.out.print("\n-------------------------------------\n");
            System.out.println(" (1) Input a new vegetable into list");
            System.out.println(" (2) Show all the list");
            System.out.println(" (3) Sort by revenue");
            System.out.println("(4) Group by Unit");
            System.out.println(" (5) Search a vegetable");
            System.out.print(" (6) EXIT");
            System.out.print("\n-------------------------------------\n");
            System.out.print("Input your choice: ");
            int choice = scan.nextInt();
            System.out.println();

            switch (choice) {
                
                
                case 1: {
                    int n;
                    System.out.println("Input n: ");
                    n = scan.nextInt();

                    for (int i = 0; i < n; i++) {
                        Vegetable vegetable = new Vegetable();
                        vegetable.enter();
                        v.add(vegetable);
                    }
                    break;
                }
                
                
                case 2: {
                    System.out.println("Id\tName\tQuantity sold\tSale\tPrice\tRevenue ");
                    for (Vegetable veget : v) {
                        veget.display();
                    }
                    break;
                }
                
                
                case 3: {
                    Vegetable.sort(v);
                    System.out.println("After sort: ");
                    System.out.println("Id\tName\tQuantity sold\tSale\tPrice\tRevenue ");
                    for (Vegetable veget : v) {
                        veget.display();
                    }
                    break;
                }
                
                case 4:{
                    System.out.println("Idn how 2 du this!!!");
                    break;
                }
                case 5: {
                    scan.nextLine();
                    System.out.print("Input the keyword: ");
                    String word = scan.nextLine();
                    for (Vegetable vegetable : v) {
                        if (vegetable.getName().contains(word)) {
                            vegetable.display();
                        }
                    }
                    break;
                }
                
                
                case 6: {
                    scan.close();
                    return;
                }
                
                
                default:
                    break;
            }

        }
    }
}
