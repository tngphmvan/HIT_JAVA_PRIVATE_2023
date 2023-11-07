/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.bai2;

import java.util.*;

/**
 *
 * @author 84393
 */
public class Subject {

    private String id;
    private String subjectName;
    private int studentCount;
    private String timeStart;
    private String timeEnd;

    public Subject() {
    }

    public Subject(String id, String subjectName, int studentCount, String timeStart, String timeEnd) {
        this.id = id;
        this.subjectName = subjectName;
        this.studentCount = studentCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectName() {
        return this.subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getStudentCount() {
        return this.studentCount;
    }

    public void setSutdentCount(int sutdentCount) {
        this.studentCount = sutdentCount;
    }

    public String getTimeStart() {
        return this.timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return this.timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public void enter(){
        Scanner s=new Scanner(System.in);
        System.out.print("Input id: ");
        this.id=s.nextLine();
        System.out.print("Input subject name: ");
        this.subjectName=s.nextLine();
        System.out.print("Input student count: ");
        this.studentCount=s.nextInt();
        System.out.print("Input start time: ");
        s.nextLine();
        this.timeStart=s.nextLine();
        System.out.print("Input end time: ");
        this.timeEnd=s.nextLine();
    }
    
    public void display() {
        System.out.printf("%-3s%-15s%-15d%s - %s\n",this.id,this.subjectName,this.studentCount,this.timeStart,this.timeEnd);
    }
}
