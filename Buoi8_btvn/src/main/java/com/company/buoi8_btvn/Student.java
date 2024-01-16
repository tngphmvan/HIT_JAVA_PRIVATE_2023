/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.buoi8_btvn;

/**
 *
 * @author 84393
 */
public class Student {

    private int id;
    private String name;
    private int age;
    private String address;
    private double gpa;
    private static int nextID = 1;

    public Student(String name, int age, String address, double gpa) {
        this.id = nextID++;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void display(){
        System.out.printf("%-5d %-30s %-5d %-10s %-5f\n", this.id, this.name, this.age, this.address, this.gpa);
    }
}
