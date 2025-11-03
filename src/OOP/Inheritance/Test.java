package OOP.Inheritance;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Pranto";
        t1.age = 20;
        t1.address = "Dhaka\n";
        t1.displayinformation2();

        Teacher t2 = new Teacher();
        t2.name = "Shakil";
        t2.age = 22;
        t2.address = "Gazipur";
        t2.displayinformation2();
    }
}
