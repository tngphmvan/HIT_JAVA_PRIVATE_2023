/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6_bai1;

/**
 *
 * @author 84393
 */
public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        return width*length;
    }
    
    @Override
    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", length=" + length + ", " + "Area = "+this.getArea()+ ", "+ "Perimeter = "+this.getPerimeter() + '}';
    }
    
    
}
