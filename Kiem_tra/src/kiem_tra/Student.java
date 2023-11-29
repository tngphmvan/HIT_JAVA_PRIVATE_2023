/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kiem_tra;

/**
 *
 * @author 84393
 */
public class Student extends Person {
    private double score;

    public Student() {
        super();
    }

    public Student(double score, String name, short age, Address address) {
        super(name, age, address);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    @Override
    public String getCapacity(){
        if(score>=9.0) return "Học lực xuất sắc";
        else if(score>=8.0) return "Học lực giỏi";
        else if(score>=6.5) return "Học lực khá";
        return "Học lực trung bình yếu";
    }

    @Override
    public String toString() {
        super.toString();
        return "Student{" + "id=" + super.getId() + ", name=" + super.getName() + ", age=" + super.getAge() + ", City = " + super.getAddress().getCity()+ ", District = "+super.getAddress().getDistrict() + ", score=" + score + ", Capacity: " +this.getCapacity() +'}';
    }
    
}
