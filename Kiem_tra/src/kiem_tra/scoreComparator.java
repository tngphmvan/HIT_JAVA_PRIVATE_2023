/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiem_tra;

import java.util.Comparator;

/**
 *
 * @author 84393
 */
public class scoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1,Student student2){
        return Double.compare(student2.getScore(), student1.getScore());
    }
}
