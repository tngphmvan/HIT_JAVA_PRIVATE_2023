package QLSV;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class main {

    static ArrayList<SV> list;
    static Scanner s = new Scanner(System.in);
    static FileOutputStream fos;
    static ObjectOutputStream oos;
    static FileInputStream fis;
    static ObjectInputStream ois;
    static List<SV> lst = new ArrayList<>();

    static void createFile(String filepath) {

        try {
            fos = new FileOutputStream(filepath);
            oos = new ObjectOutputStream(fos);
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
            list = (ArrayList<SV>) ois.readObject();
            ois.close();
            fis.close();
            list.forEach(o -> System.out.print(o.print()));

        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        SV sv = new SV();
        SV sv1 = new SV("Tung", 10.5);
        lst.add(new SV("Tung", 10.5));
        lst.add(new SV("Trong Anh", 15.3));
        lst.add(new SV("Hoang", 3.6));
        lst.add(new SV("Nam", 7.5));
//        sv.setID(lst.size() + 1);
//        System.out.print("Enter Name: ");
//        sv.setName(s.nextLine());
//        sv.enterGrade();
//        lst.add(sv);
        System.out.printf("%-5s %-20s %-5s\n", "ID", "Name", "Grade");
//      lst.forEach(o -> System.out.print(o.print()));
        createFile("students.txt");
        try {
            oos.writeObject(lst);
            oos.close();
            fos.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        readFile("students.txt");
    }
}
