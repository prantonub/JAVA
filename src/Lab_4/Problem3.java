package Lab_4;

class Shape {
    void area() {
        System.out.println("Area of shape is not defined.");
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double l, double w) {
        length = l;
        width = w;
    }

    @Override
    void area() {
        double rectArea = length * width;
        System.out.println("Area of Rectangle: " + rectArea);
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    void area() {
        double circleArea = 3.1416 * radius * radius;
        System.out.println("Area of Circle: " + circleArea);
    }
}

public class Problem3 {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10, 5);
        rect.area();

        Circle circ = new Circle(7);
        circ.area();
    }
}
