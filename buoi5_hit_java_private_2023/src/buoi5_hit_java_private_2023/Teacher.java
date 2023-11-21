/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi5_hit_java_private_2023;

/**
 *
 * @author 84393
 */
public class Teacher extends Design_Person_and_super{
    private int salary;

    public Teacher(String name, int age, String address,int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    @Override
    public void display(){
        super.display();
        System.out.println("salary: "+salary);
    }
}
