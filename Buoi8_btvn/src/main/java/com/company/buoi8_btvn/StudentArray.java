package com.company.buoi8_btvn;

import java.util.*;
import java.util.stream.Stream;

public class StudentArray {

    private Student[] data;

    public StudentArray() {
    }

    
    public StudentArray(Student[] data) {
        this.data = data;
    }

    public Student[] getData() {
        return data;
    }

    public void setData(Student[] data) {
        this.data = data;
    }

    public int size() {
        return data.length;
    }

    public boolean isEmpty() {
        Stream<Student> stream = Arrays.stream(data);
        return stream.anyMatch(o -> true);
    }
}
