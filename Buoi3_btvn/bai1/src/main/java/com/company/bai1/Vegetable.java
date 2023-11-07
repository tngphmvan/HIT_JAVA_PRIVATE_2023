/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.bai1;

import java.util.*;

/**
 *
 * @author 84393
 */
public class Vegetable {

    private String id, name, unit;
    private int quantitySold, sale;
    private double price;
    private String unitGroup;

    public Vegetable() {
    }

    public Vegetable(String id, String name, String unit, int quantitySold, int sale, double price) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.quantitySold = quantitySold;
        this.sale = sale;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalRevenue() {
        return this.quantitySold * this.price * (100 - this.sale);
    }

    public void display() {
        System.out.println(this.id + "\t" + this.name + "\t" + this.unit + "\t" + this.quantitySold + "\t" + this.sale + "\t" + this.price + "\t" + this.getTotalRevenue());
    }

    public void enter() {
        Scanner s = new Scanner(System.in);
        System.out.print("Input id: ");
        this.id = s.nextLine();
        System.out.print("Input ten: ");
        this.name = s.nextLine();
        System.out.print("Input unit: ");
        this.unit = s.next();
        System.out.print("Input quantity sold: ");
        this.quantitySold = s.nextInt();
        System.out.print("Input sale rate: ");
        this.sale = s.nextInt();
        System.out.print("Input price: ");
        this.price = s.nextDouble();
    }

    public static void sort(ArrayList<Vegetable> vegetables) {
        vegetables.sort((v1, v2) -> Double.compare(v1.getTotalRevenue(), v2.getTotalRevenue()));
    }
}
