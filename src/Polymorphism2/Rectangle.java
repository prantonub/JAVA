package Polymorphism2;

public class Rectangle extends Shape {
    double length , width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    double area(){
        System.out.print("Area for rectangle: ");
        return length * width;
    }
}
