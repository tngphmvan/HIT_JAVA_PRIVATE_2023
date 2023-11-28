/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6_bai2;

/**
 *
 * @author 84393
 */
public class FullTimeEmployee extends Employee {

    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }
    @Override
    public int calculateSalary(){
        return 8*super.getPaymentPerHour();
    }
}
