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
public class PartTimeEmployee extends Employee {
    private int workingHours;

    public PartTimeEmployee() {
        super();
    }

    public PartTimeEmployee(int workingHours, String name, int paymentPerHour) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }
    
    @Override
    public int calculateSalary(){
        return workingHours*super.getPaymentPerHour();
    }
    
    @Override
    public void display(){
        System.out.println("Name: "+this.getName()+", Payment per hour: "+super.getPaymentPerHour()+", working hours: "+this.workingHours);
    }
    
    
    @Override
    public void enter(){
        Scanner s = new Scanner(System.in);
        super.enter();
        System.out.print("Working hours: ");
        this.workingHours = s.nextInt();
    }

    @Override
    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }
}
