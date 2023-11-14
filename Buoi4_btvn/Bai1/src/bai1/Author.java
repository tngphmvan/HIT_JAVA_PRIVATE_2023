/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.*;

public class Author {
    private String name;
    private String birth;

    public Author() {
    }

    public Author(String name, String birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }
    
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("ten tac gia: ");
        this.name=s.nextLine();
        System.out.print("Nam sinh tac gia: ");
        this.birth = s.nextLine();
    }
    public void output(){
        System.out.println("Ten tac gia: "+ name);
        System.out.println("Nam sinh: "+birth);
    }
}
