package OOP.Inheritance;

class Animal {
    String name;

    public void eat() {
        System.out.println(name + " is eating...");
    }

    public void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

class Dog extends Animal {

    public void bark() {
        System.out.println(name + " is barking!");
    }
}

public class Main {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.name = "Buddy";
        d.eat();     // Animal method
        d.sleep();   // Animal method
        d.bark();    // Dog method
    }
}
