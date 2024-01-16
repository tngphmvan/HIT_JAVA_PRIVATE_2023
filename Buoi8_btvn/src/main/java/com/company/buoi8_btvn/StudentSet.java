/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.buoi8_btvn;

import java.util.*;

/**
 *
 * @author 84393
 */
public class StudentSet extends StudentArray {

    private StudentComparator comparator;

    public StudentSet(StudentComparator comparator, Student[] data) {
        super(data);
        this.comparator = comparator;
    }

    public StudentComparator getComparator() {
        return comparator;
    }

    public void setComparator(StudentComparator comparator) {
        this.comparator = comparator;
    }

    public void insert(Student student) {
        Set<Student> StudentSet = Set.of(super.getData());
        StudentSet.add(student);
    }

    public void remove(Student student) {
        Set<Student> StudentSet = Set.of(super.getData());
        StudentSet.remove(student);
    }

    public boolean contain(Student student) {
        Set<Student> StudentSet = Set.of(super.getData());
        return StudentSet.stream().anyMatch(o->o.equals(student));
    }
}
