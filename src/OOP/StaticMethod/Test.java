package OOP.StaticMethod;

public class Test {
    public static void main(String[] args) {
        StaticMethod ob1 = new StaticMethod();// in not static method must create object
        ob1.display1();

        StaticMethod.display2();// no need to crete object, direct call
    }
}
