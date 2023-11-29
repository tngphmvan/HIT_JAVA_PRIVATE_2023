/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiem_tra;

/**
 *
 * @author 84393
 */
public abstract class Person {
    private int id;
    private String name;
    private short age;
    private Address address;
    private static int nextid = 1;

    public Person() {
        this.id = nextid++;
    }

    public Person(String name, short age, Address address) {
        this.id = nextid++;
        this.name = name;
        this.age = age;
        this.address = address;
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

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static int getNextid() {
        return nextid;
    }

    public static void setNextid(int nextid) {
        Person.nextid = nextid;
    }

    
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name=" + name + ", age=" + age + ", Address=" + address.toString()+'}';
    }
    
    public abstract String getCapacity();
}
