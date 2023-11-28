/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6_bai2;

import java.util.Scanner;

/**
 *
 * @author 84393
 */
public abstract class Employee implements IEmployee {
    private String name;
    private int paymentPerHour;

    public Employee() {
    }

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public String getName() {
        return name;
    }

    public abstract int getWorkingHours();
    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
    
    public void display(){
        System.out.print("Name: "+this.getName()+", Payment per hour: "+this.getPaymentPerHour());
    }
    public void enter(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name: ");
        this.name = s.nextLine();
        System.out.print("Enter Payement per hour: ");
        this.paymentPerHour = s.nextInt();
    }
}
