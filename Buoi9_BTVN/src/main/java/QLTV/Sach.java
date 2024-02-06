package QLTV;

import java.util.*;
import java.io.*;

public class Sach implements Serializable {

    private String name;
    private int id;
    private static int nextid = 0;
    private int quantity;

    public Sach(String name, int quantity) {
        this.name = name;
        this.id = nextid++;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Sach{" + "name=" + name + ", id=" + id + ", quantity=" + quantity + '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void borrow(int quantity) {
        this.quantity -= 1;
    }
}
