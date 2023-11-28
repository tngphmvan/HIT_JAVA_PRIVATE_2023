
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 84393
 */
public class Student extends Person {

    private int id;
    private String nameClass;
    private double gpa;
    final float criteria = 2;

    public Student() {
        super();
    }

    public Student(int id, String nameClass, double gpa, String name, int age, Address address) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public void input() {
        super.input();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter id: ");
        this.id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter nameClass: ");
        this.nameClass = scanner.nextLine();

        System.out.print("Enter gpa: ");
        this.gpa = scanner.nextDouble();

    }

    @Override
    public void output() {
        System.out.printf("%-17s%-23s%-18s%-26s%-26s%-21s%-19s%s\n", getId(), getName(), getAge(), getAddress().getCommune(), getAddress().getDistrict(), getAddress().getCity(), getNameClass(), getGpa());
    }

    public boolean checkFall() {
        boolean check = false;
        if (gpa < criteria) {
            check = true;
        }
        return check;
    }

}
