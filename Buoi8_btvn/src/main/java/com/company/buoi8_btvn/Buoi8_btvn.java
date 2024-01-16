/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.buoi8_btvn;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.*;

/**
 *
 * @author 84393
 */
public class Buoi8_btvn {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        Student them = new Student("Irfan fandi", 18, "Singapore", 2.12);
        Student xoa = new Student("Kiatisuk", 25, "ThaiLand", 3.5);
        StudentArray Array = new StudentArray();
        Student[] sArray = {
            new Student("Witan Sualeman", 20, "Indonesia", 3.93),
            new Student("Safawi Rashid", 18, "Malaysia", 3.12),
            new Student("Haris Harul", 19, "Singapore", 2.5),
            new Student("Supachai Chaied", 21, "ThaiLand", 2.8),
            new Student("Sihanouk", 22, "Cambodia", 3.86),
            new Student("Fandi Ahmad ", 22, "Singapore", 3.85),};
        Array.setData(sArray);
        StudentArrayList sList = new StudentArrayList(sArray);
        sList.getList().add(xoa);
        System.out.println("List before: ");
        System.out.printf("%-5s %-30s %-5s %-10s %-5s", "ID", "NAME", "AGE", "ADDRESS", "GPA");
        System.out.println("");
        sList.getList().forEach(o -> o.display());
        while (true) {
            System.out.println("MENU:");
            System.out.println("1: Thêm 1 sinh viên mới (Id tự động tăng)");
            System.out.println("2: Xóa 1 sinh viên khỏi danh sách");
            System.out.println("3: Hiển thị danh sách sinh viên theo định dạng");
            System.out.println("4: Tìm kiếm sinh viên theo tên");
            System.out.println("5: Sắp xếp sinh viên theo thứ tự");
            System.out.println("6: Thoát chương trình");
            System.out.println("----------------------");
            System.out.print("Choose: ");
            int choice = s.nextInt();
            s.nextLine();
            switch (choice) {
                case 1: {
                    sList.getList().add(them);
                    break;
                }
                case 2: {
                    System.out.print("Enter student ID to delete: ");
                    int index = s.nextInt();
                    s.nextLine();
                    sList.delete(index);
                    break;
                }
                case 3: {
                    System.out.printf("%-5s %-30s %-5s %-10s %-5s\n", "ID", "NAME", "AGE", "ADDRESS", "GPA");
                    sList.getList().forEach(o -> o.display());
                    break;
                }
                case 4: {
                    System.out.print("Enter student name: ");
                    String name = s.nextLine();
                    System.out.printf("%-5s %-30s %-5s %-10s %-5s\n", "ID", "NAME", "AGE", "ADDRESS", "GPA");
                    sList.getList().stream().filter(o -> o.getName().equals(name)).forEach(o -> o.display());
                    break;
                }
                case 6: {
                    System.out.println("Goodbye");
                    return;
                }
                case 5: {
                    List<Student> oddAge = sList.getList().stream()
                            .filter(o -> o.getAge() % 2 != 0)
                            .sorted(Comparator.comparing(Student::getAge).reversed().thenComparing(Student::getGpa))
                            .collect(Collectors.toList());
                    List<Student> evenAge = sList.getList().stream()
                            .filter(o -> o.getAge() % 2 == 0)
                            .sorted(Comparator.comparing(Student::getAge).thenComparing(Student::getGpa))
                            .collect(Collectors.toList());
                    Stream<Student> oddStream = oddAge.stream();
                    Stream<Student> evenStream = evenAge.stream();
                    List<Student> finalList = Stream.concat(evenStream, oddStream).collect(Collectors.toList());
                    System.out.printf("%-5s %-30s %-5s %-10s %-5s\n", "ID", "NAME", "AGE", "ADDRESS", "GPA");
                    finalList.forEach(o->o.display());
                }
            }
        }
    }
}
