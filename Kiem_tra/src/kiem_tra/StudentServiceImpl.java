/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiem_tra;

import java.util.*;

public class StudentServiceImpl implements StudentService {

    List<Student> SList;
    Scanner s = new Scanner(System.in);

    public StudentServiceImpl(List<Student> SList) {
        this.SList = SList;
    }
    
    @Override
    public void addStudent(Student t) {
        
        System.out.print("Nhap so sv: ");
        int n = s.nextInt();
        s.nextLine();
        for(int i= 0;i<n;i++){
            System.out.println("Nhap thong tin sv thu "+(i+1)+": ");
            System.out.print("Ten: "); t.setName(s.nextLine());
            System.out.print("Tuoi: "); t.setAge(s.nextShort());
            s.nextLine();
            System.out.println("Thanh pho: "); t.getAddress().setCity(s.nextLine());
            System.out.println("Huyen: "); t.getAddress().setDistrict(s.nextLine());
            System.out.println("Diem: "); t.setScore(s.nextDouble());
            SList.add(t);
        }
        
    }

    @Override
    public void deleteStudent(int id) {
        List<Student> n_List = null;
        
        for(Student i:SList){
            System.out.println("Danh sach sau khi xoa: ");
            if(i.getId() != id){
                System.out.println(i.toString());
            }
        }
    }

    @Override
    public void searchStudent(String name) {
        for (Student i : SList) {
            if (i.getName().equals(name)) {
                System.out.println(i.toString());
            }
        }
    }

    @Override
    public void sortedStudent() {
        SList.sort(new scoreComparator());
        for (Student i : SList) {
            System.out.println(i.toString());
        }
    }

    @Override
    public void showAllStudent() {
        for (Student i : SList) {
            System.out.println(i.toString());
        }
    }
    
}
