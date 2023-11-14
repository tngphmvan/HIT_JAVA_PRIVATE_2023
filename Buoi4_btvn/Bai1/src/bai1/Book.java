/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.*;

/**
 *
 * @author 84393
 */
public class Book {
    private int id;
    private String name;
    private String year;
    private String type;
    private Author author;
    private static int nextid = 1;

    public Book() {
        this.id=nextid++;
    }

    public Book(String name, String year, String type, Author author) {
        this.id=nextid++;
        this.name = name;
        this.year = year;
        this.type = type;
        this.author = author;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public static int getNextid() {
        return nextid;
    }

    public static void setNextid(int nextid) {
        Book.nextid = nextid;
    }
    
    public void input(){
        Scanner s = new Scanner(System.in);
        author.input();
        System.out.print("Ten sach: ");
        name = s.nextLine();
        System.out.print("Nam sang tac: ");
        year = s.nextLine();
        System.out.print("The loai: ");
        type = s.nextLine();
    }
    public void output(){
        System.out.println("ID: 00"+id);
        System.out.println("Ten sach: "+name);
        System.out.println("Nam xuat ban: "+year);
        System.out.println("The loai: "+type);
        author.output();
    }


}
