/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6_bai2;

import java.util.Comparator;

/**
 *
 * @author 84393
 */
public class salaryComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee employee1,Employee employee2) {
        return Float.compare(employee2.calculateSalary() , employee1.calculateSalary());
    }
}
