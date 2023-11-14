/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.buoi4_hit_java_private;

//Tao ra kieu du lieu Engine
//public class Engine {
//    
//    private String type;
//    
//    public Engine(String type) {
//        this.type = type;
//    }
//    
//    public void start() {
//        System.out.println("Engine started");
//    }
//}
//
//
//public class Car {
//    private String brand;
//    //Khai bao thuoc tinh engine voi kieu du lieu Engine
//    private Engine engine; // Quan hệ HAS-A với động cơ
//
//    public Car(String brand, String engineType) {
//        this.brand = brand;
//        this.engine = new Engine(engineType);
//    }
//    
//    public void startCar() {
//        System.out.println("Starting the " + brand + " car");
//        engine.start(); // Gọi phương thức của đối tượng động cơ
//    }
//}

public class Main {
    
    static{
        Author author1=new Author("Hoang","dfshjdfshj","GAY",15);
        Book book1= new Book("Toi tai gioi ban cung the ", author1,99.25,1);
    }
    static{
            Author author2=new Author("Hoang","dfshjdfshj","GAY",15);
            Book book2= new Book("Toi tai gioi ban cung the ", author2,99.25,1);
        }
    
    public static void main(String[] args) {
//        Car car = new Car("Toyota", "Gasoline");
//        car.startCar();
    }
}
