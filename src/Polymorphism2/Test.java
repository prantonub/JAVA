package Polymorphism2;

public class Test {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        Rectangle r1 = new Rectangle(10, 20);
        Triangle t1 = new Triangle(2, 6);

        System.out.println(s1.area());
        System.out.println(r1.area());
        System.out.println(t1.area());
    }
}
