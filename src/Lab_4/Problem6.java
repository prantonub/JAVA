package Lab_4;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike is starting");
    }
}

public class Problem6 {
    public static void main(String[] args) {

        Vehicle v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();
    }
}
