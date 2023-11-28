/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6_bai1;

/**
 *
 * @author 84393
 */
public class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        return Math.PI * radius*radius;
    }
    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + ", " + "Area = "+this.getArea()+ ", Perimeter = "+this.getPerimeter() + '}';
    }
    
}
