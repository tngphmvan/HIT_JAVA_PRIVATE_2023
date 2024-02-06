package QLSV;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {

    static ArrayList<Double> list = new ArrayList<>();
    static Scanner s = new Scanner(System.in);
    static FileOutputStream fos;
    static ObjectOutputStream oos;
    static FileInputStream fis;
    static ObjectInputStream ois;
    static ArrayList<SV> lst = new ArrayList<>();

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

    static void readFile(String filepath) throws FileNotFoundException, IOException, ClassNotFoundException {
        fis = new FileInputStream(filepath);
        ois = new ObjectInputStream(fis);

    }

    public static void main(String[] args) throws IOException {

        SV sv = new SV();
        FileService fs = new FileService();
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
        fs.createFile("students.txt", lst);
        fs.readFile("students..txt");
        createFile("grades.txt");
        for (int i = 0; i < lst.size(); i++) {
            list.add(lst.get(i).getGrade());
        }

        oos.writeObject(list);
        oos.close();
        fos.close();
        try {
            readFile("grades.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            ArrayList<Double> result = (ArrayList<Double>) ois.readObject();
            result.forEach(o -> System.out.println(o));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        ois.close();
        fis.close();
    }

}
