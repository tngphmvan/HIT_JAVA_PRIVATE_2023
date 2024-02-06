/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTV;

import java.io.*;
import java.util.*;
import java.time.*;
public class borrowedBook implements Serializable{
    private int id;

    @Override
    public String toString() {
        return "borrowedBook{" + "id=" + id + ", bdate=" + bdate + ", rdate=" + rdate + '}';
    }
    private LocalDate bdate;
    private LocalDate rdate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getBdate() {
        return bdate;
    }

    public void setBdate(LocalDate bdate) {
        this.bdate = bdate;
    }

    public LocalDate getRdate() {
        return rdate;
    }

    public void setRdate(LocalDate rdate) {
        this.rdate = rdate;
    }

    public borrowedBook(int id, LocalDate bdate, LocalDate rdate) {
        this.id = id;
        this.bdate = bdate;
        this.rdate = rdate;
    }

    public borrowedBook(int id, LocalDate bdate) {
        this.id = id;
        this.bdate = bdate;
    }

    
}
