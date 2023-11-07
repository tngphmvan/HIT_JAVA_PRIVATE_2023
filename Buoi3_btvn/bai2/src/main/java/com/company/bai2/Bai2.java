/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.bai2;

import java.util.*;

public class Bai2 {

    public static void main(String[] args) {
        ArrayList<Subject> subject = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("\n----------------------------------------\n");
            System.out.println("1:Input lesson ");
            System.out.println("2: Show all ");
            System.out.println("3: Sort ");
            System.out.println("4: Maximum lessons");
            System.out.println("5: Exit");
            System.out.println("\n----------------------------------------\n");
            System.out.println("Let's chose: ");
            int choice = s.nextInt();
            System.out.println();
            s.nextLine();

            switch (choice) {
                case 1: {
                    int n;
                    System.out.println("Input n: ");
                    n = s.nextInt();

                    for (int i = 0; i < n; i++) {
                        Subject sub = new Subject();
                        sub.enter();
                        subject.add(sub);
                    }
                    break;
                }
                case 2: {
                    System.out.printf("%-3s%-15s%-15s%s\n","Id","Subject name","Student count","Time Start - end");
                    for (Subject sub : subject) {
                        sub.display();
                    }
                    break;
                }
                case 3: {
                    Collections.sort(subject, (s1, s2) -> {
                        String[] timeStart1 = s1.getTimeEnd().split(":");
                        String[] timeStart2 = s2.getTimeEnd().split(":");

                        int hour1 = Integer.parseInt(timeStart1[0]);
                        int minute1 = Integer.parseInt(timeStart1[1]);

                        int hour2 = Integer.parseInt(timeStart2[0]);
                        int minute2 = Integer.parseInt(timeStart2[1]);

                        if (hour1 == hour2) {
                            return minute1 - minute2;
                        } else {
                            return hour1 - hour2;
                        }
                    });
                    System.out.println("after sort: ");
                    System.out.println("Id\tSubject name\tStudent count\tTime start - end ");
                    for (Subject sub : subject) {
                        sub.display();
                    }
                    break;
                }
                
                case 4: {
                    System.out.println("I don't know how to do this !!");
                    break;
                }
                case 5: {
                    s.close();
                    return;
                }

                default:
                    break;
            }
        }
    }
}
