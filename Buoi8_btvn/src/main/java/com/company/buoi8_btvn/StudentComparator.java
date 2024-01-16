package com.company.buoi8_btvn;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getGpa(), o2.getGpa());
    }

}
