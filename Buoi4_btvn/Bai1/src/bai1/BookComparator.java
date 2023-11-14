/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;

import java.util.*;
import java.lang.String;

/**
 *
 * @author 84393
 */
public class BookComparator implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getAuthor().getName().compareToIgnoreCase(book2.getAuthor().getName());
    }
}
