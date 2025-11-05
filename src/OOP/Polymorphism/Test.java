package OOP.Polymorphism;

import Method_Overloading.Teacher;

public class Test {
public static void main(String[] args) {
    Person p = new Person();
    p.display();

    p = new Student();
    p.display();
}
}
