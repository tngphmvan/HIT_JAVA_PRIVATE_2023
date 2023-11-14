package bai1;

import java.util.*;

public class Running {

    static{
        Author author1 = new Author("Vo Nguyen Giap", "1910");
        Author author2 = new Author("Dang Thuy Tram", "1905");
        Author author3 = new Author("Vo Nguyen Giap", "1910");
        Author author4 = new Author("Ho Chi Minh", "1890");

        Book book1 = new Book("Tong hanh dinh trong mua xuan dai thang", "2004", "Hoi ky", author1);
        Book book2 = new Book("Nhat ky Dang Thuy Tram", "2013", "Tu truyen", author2);
        Book book3 = new Book("Duong toi Dien Bien Phu", "1999", "Hoi ky", author3);
        Book book4 = new Book("Nhat ky trong tu", "1925", "Nhat ky", author4);
    }
    public static void main(String[] args) {

        List<Book> book = new ArrayList<>();
        List<Author> author = new ArrayList<>();
        
        
//        book.add(book1);
//        book.add(book2);
//        book.add(book3);
//        book.add(book4);
        
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("");
            System.out.println("MENU");
            System.out.println("1: Enter Book infor");
            System.out.println("2: Display Book infor");
            System.out.println("3: Find by book's name");
            System.out.println("4: Group by Author's name");
            System.out.println("0: Exit menu");
            System.out.println("");
            System.out.print("Your choice: ");
            int choice = s.nextInt();
            s.nextLine();
            System.out.println("");
            switch (choice) {
                case 1: {
                    System.out.print("Enter n: ");
                    int n = s.nextInt();
                    s.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Sach thu 0" + (i + 1));
                        Author aut = new Author();
                        Book bok = new Book();
                        bok.setAuthor(aut);
                        bok.input();
                        book.add(bok);
                    }
                    break;
                }
                case 2: {
                    System.out.println("");
                    for (Book bok : book) {
                        bok.output();
                    }
                    break;
                }
                case 3: {
                    System.out.println("Enter book's name to find book: ");
                    String autname = s.nextLine();
                    for (Book bok : book) {
                        if (autname.equals(bok.getName())) {
                            System.out.println("");
                            bok.output();
                        }
                    }
                    break;
                }
                case 4: {
                    Collections.sort(book, new BookComparator());
                    for (Book bok : book) {
                        System.out.println("");
                        bok.output();
                    }
                    break;
                }
                case 0: {
                    System.out.println("");
                    System.out.println("Goodbyte !!!!");
                    return;
                }
                default:
                    break;

            }
        }
    }
}
