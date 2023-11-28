/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi6_bai1;

/**
 *
 * @author 84393
 */
public class Square extends Rectangle {

    private double side;

    public Square() {
        super();
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side,String color, boolean filled) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public double getArea(){
        return side*side;
    }
    
    @Override
    public double getPerimeter(){
        return 4*side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + ", " + "Area = "+this.getArea()+ ", Perimeter = "+this.getPerimeter() +'}';
    }
    
}
