/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kiem_tra;

import java.util.*;

/**
 *
 * @author 84393
 */
public class Kiem_tra {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        StudentServiceImpl stu = new StudentServiceImpl(list);
        Student t = new Student();
        
        for(int i = 1;i<=9;i++){
            Address address = new Address("Huyen "+i,"Thanh Pho"+i);
            Student student = new Student(i+0.25,"Ten "+(i), (short) (i+10),address);
            list.add(student);
        }
        while (true) {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1: thêm sinh viên vào danh sách");
            System.out.println("2: xóa sinh viên theo id");
            System.out.println("3: tìm sinh viên chứa tên yêu cầu");
            System.out.println("4: sắp xếp danh sách sinh viên theo score giảm dần");
            System.out.println("5: hiển thị danh sách sinh viên có id, name, age, address, score, capacity");
            System.out.println("6: Thoat");
            System.out.println("");
            System.out.print("Lua chon: ");
            int choice = s.nextInt();
            s.nextLine();
            switch(choice){
                case 1:{
                    stu.addStudent(t);
                    break;
                }
                case 2:{
                    System.out.print("Nhap id sv muon xoa: ");
                    stu.deleteStudent(s.nextInt());
                    s.nextLine();
                    break;
                }
                case 3:{
                    System.out.print("Nhap ten sv muon tim: ");
                    stu.searchStudent(s.nextLine());
                    break;
                }
                case 4:{
                    stu.sortedStudent();
                    break;
                }
                case 5:{
                    stu.showAllStudent();
                    break;
                }
                case 6:{
                    System.out.println("GoodByte: ");
                    return;
                }
                default:
                    break;
            }
        }
    }

}
