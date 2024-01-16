package com.company.buoi8_btvn;

import java.util.*;

public class StudentArrayList extends StudentArray {

    public StudentArrayList(Student[] data) {
        super(data);
    }

    public List<Student> getList() {
        List<Student> StudentArrayList = new ArrayList<>(Arrays.asList(super.getData()));
        return StudentArrayList;
    }

    public void add(Student student) {
        List<Student> StudentArrayList = new ArrayList<>(Arrays.asList(getData()));
        StudentArrayList.add(student);
    }

    public void delete(int index) {
        List<Student> StudentArrayList = new ArrayList<>(Arrays.asList(super.getData()));
        StudentArrayList.removeIf(o -> o.getId() == index);
        StudentArrayList.forEach(o -> o.display());
    }

    public void sort(StudentComparator comparator) {
        List<Student> StudentArrayList = new ArrayList<>(Arrays.asList(super.getData()));
        StudentArrayList.stream().sorted(comparator);
    }
}
