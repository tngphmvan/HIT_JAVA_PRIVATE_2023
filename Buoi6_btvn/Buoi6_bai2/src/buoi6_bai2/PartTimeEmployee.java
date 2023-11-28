/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6_bai2;

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
}
