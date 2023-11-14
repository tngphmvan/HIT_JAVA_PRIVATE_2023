/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.buoi4_hit_java_private;

/**
 *
 * @author 84393
 */
public class Book {
    private String name;
    private Author author;
    private double price;
    private int count;
    private static int nextCount = 0;

    public Book(String name, Author author, double price, int count) {
        nextCount++;
        this.count = nextCount;
        this.name = name;
        this.author = author;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }
    public int count(){
        return count;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", author=" + author + ", price=" + price + ", count=" + count + '}';
    }
    
}
