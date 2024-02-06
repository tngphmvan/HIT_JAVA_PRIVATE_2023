/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLTV;

import java.util.*;
import java.io.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.logging.Level;
import java.util.logging.Logger;

public class main {

    static void createfile(String filepath, List<Sach> list) {
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(filepath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void createfileb(String filepath, List<borrowedBook> list) {
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(filepath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            oos.close();
            fos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static void readfile(String filepath) {
        FileInputStream fis;
        try {
            fis = new FileInputStream(filepath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            var list = (ArrayList) ois.readObject();
            list.forEach(o -> System.out.println(o.toString()));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        try {
            List<Sach> list_of_book = new ArrayList<>();
            list_of_book.add(new Sach("Tung", 15));
            list_of_book.add(new Sach("Son", 14));
            list_of_book.add(new Sach("Hung", 13));
            list_of_book.add(new Sach("Thang", 12));
            List<borrowedBook> list_of_borrow = new ArrayList<>();
            list_of_borrow.add(new borrowedBook(0, LocalDate.of(2020, Month.MARCH, 15), LocalDate.of(2020, Month.MARCH, 15)));
            list_of_borrow.add(new borrowedBook(0, LocalDate.of(2020, Month.MARCH, 13), LocalDate.of(2020, Month.JUNE, 14)));
            list_of_borrow.add(new borrowedBook(0, LocalDate.of(2020, Month.JANUARY, 15),LocalDate.MAX));
            list_of_borrow.add(new borrowedBook(0, LocalDate.of(2020, Month.MARCH, 15),LocalDate.MAX));

            int cnt = 0;
            for (borrowedBook item : list_of_borrow) {
                if (item.getRdate().isBefore(item.getBdate())) {
                    cnt++;
                }
            }
            if (cnt > 0) {
                throw new Exception("invalid date");
            }
            int total_borrowed_book = 0;
            int total_returned_book = 0;
            for(borrowedBook book: list_of_borrow){
                if(book.getRdate()!=LocalDate.MAX){
                    total_returned_book+=1;
                }
                else{
                    total_borrowed_book+=1;
                }
            }
            System.out.println("Tong so luot sach da muon: "+total_borrowed_book);
            System.out.println("Tong so luot sach da tra la: "+total_returned_book);
            createfile("Books.txt", list_of_book);
            readfile("Books.txt");
            int nob = 0;
            for (borrowedBook bitem : list_of_borrow) {
                for (Sach book : list_of_book) {
                    if (book.getId() == bitem.getId() && bitem.getRdate()!=LocalDate.MAX) {
                        book.borrow(book.getQuantity());
                        nob++;
                    }
                }
            }
            Scanner s = new Scanner(System.in);
            System.out.print("Find quantity of book has the id of: ");
            int find = s.nextInt();
            s.close();
            list_of_book.stream().filter(o -> find == o.getId()).forEach(o -> {
                System.out.println("No book left: " + o.getQuantity());
            });
            System.out.println("No book is borrowedÖ "+nob);
            createfileb("borrowedBooks.txt", list_of_borrow);
            readfile("borrowedBooks.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
