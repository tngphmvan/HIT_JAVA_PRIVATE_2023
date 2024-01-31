/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLSV;

import java.io.Serializable;
import java.util.*;

public class SV implements Serializable {

    private int ID;
    private String name;
    private double grade;
    private static int nextID = 0;
    Scanner s = new Scanner(System.in);

    public SV(String name, double grade) {
        this.ID = nextID++;
        this.name = name;
        this.grade = grade;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void enterGrade() {
        try {
            System.out.print("Enter grade: ");
            this.grade = s.nextDouble();
            if (this.grade > 10 || this.grade < 0) {
                throw new Exception("invalid input, enter again");
            }
        } catch (Exception e) {
            while (this.grade > 10 || this.grade < 0) {
                e.printStackTrace();
                this.grade = s.nextDouble();
            }
        }
    }

    public String print() {
        return String.format("%-5d %-20s %-5f\n", this.ID, this.name, this.grade);
    }

    public SV() {
    }
}
