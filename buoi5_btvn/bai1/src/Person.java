
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 84393
 */
public class Person {

    protected String name;
    protected int age;
    protected Address address;

    public Person() {
    }

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter age: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); 
        
        this.address = new Address();
        this.address.input();
    }

    ;
    public void output() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Address: ");
        this.address.output(); 
    }
;
}
