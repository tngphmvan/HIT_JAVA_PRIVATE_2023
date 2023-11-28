/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buoi6_bai1;

import java.util.Scanner;

/**
 *
 * @author 84393
 */
public class Buoi6_Bai1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {

            System.out.print("Enter type of shape: ");
            String choice = s.nextLine();

            if (choice.toLowerCase().equals("circle")) {
                Circle circle = new Circle();
                System.out.print("Enter radius: ");
                circle.setRadius(s.nextDouble());
                circle.getArea();
                circle.getPerimeter();
                System.out.print(circle.toString());
            } else if (choice.toLowerCase().equals("rectangle")) {
                Rectangle rec = new Rectangle();
                System.out.print("Enter width: ");
                rec.width = s.nextDouble();
                System.out.print("Enter length: ");
                rec.length = s.nextDouble();
                rec.getArea();
                rec.getPerimeter();
                System.out.println(rec.toString());
                System.out.print("Is it filled: ");
                rec.filled = s.nextBoolean();
                if (rec.filled == true) {
                    for (int i = 0; i < rec.length; i++) {
                        for (int j = 0; j < rec.width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                } else {
                    for (int i = 0; i < rec.length; i++) {
                        for (int j = 0; j < rec.width; j++) {
                            if (i == 0 || i == (int) rec.length - 1 || j == 0 || j == (int) rec.width - 1) {
                                System.out.print("* ");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                }
            } else if (choice.toLowerCase().equals("square")) {
                Square sqr = new Square();
                System.out.print("Enter side: ");
                sqr.setSide(s.nextDouble());
                sqr.getArea();
                sqr.getPerimeter();
                System.out.println(sqr.toString());
                System.out.print("Is it filled: ");
                sqr.filled = s.nextBoolean();
                if (sqr.filled == true) {
                    for (int i = 0; i < sqr.getSide(); i++) {
                        for (int j = 0; j < sqr.getSide(); j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                } else {
                    for (int i = 0; i < sqr.getSide(); i++) {
                        for (int j = 0; j < sqr.getSide(); j++) {
                            if (i == 0 || i == sqr.getSide()-1 || j == 0 || j == sqr.getSide()-1) {
                                System.out.print("* ");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                }
            }
            if (choice.toLowerCase().equals("out")) {
                break;
            }
        }
    }
}
