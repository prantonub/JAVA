package Lab_4;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Square extends Shape {
    void draw() {
        System.out.println("Drawing a Square");
    }
}

class Triangle extends Shape {
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Problem4 {
    public static void main(String[] args) {

        Shape s;

        s = new Square();
        s.draw();

        s = new Triangle();
        s.draw();

        s = new Circle();
        s.draw();
    }
}
