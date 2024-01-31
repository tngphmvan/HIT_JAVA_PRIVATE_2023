package QLSV;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {

    static Scanner s = new Scanner(System.in);
    static FileOutputStream fos;
    static ObjectOutputStream oos;
    static FileInputStream fis;
    static ObjectInputStream ois;

    static void createFile(String filepath) {

        try {
            fos = new FileOutputStream(filepath);
            oos = new ObjectOutputStream(fos);
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    static void readFile(String filepath) {
        try {
            fis = new FileInputStream(filepath);
            ois = new ObjectInputStream(fis);
            var list = (ArrayList<SV>) ois.readObject();
            list.forEach(o->System.out.print(o.print()));
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<SV> lst = new ArrayList<>();
        SV sv = new SV();
        lst.add(new SV("Tung", 10.5));
        lst.add(new SV("Trong Anh", 15.3));
        lst.add(new SV("Hoang", 3.6));
        lst.add(new SV("Nam", 7.5));
        sv.setID(lst.size() + 1);
        System.out.print("Enter Name: ");
        sv.setName(s.nextLine());
        sv.enterGrade();
        lst.add(sv);
        System.out.printf("%-5s %-20s %-5s\n", "ID", "Name", "Grade");
//        lst.forEach(o -> System.out.print(o.print()));
        createFile("students.txt");
        createFile("grade.txt");
        try {
            oos.writeObject(lst);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        readFile("students.txt");
    }
}
