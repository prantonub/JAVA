package Lab_4;

// Superclass Person
class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Student extending Person
class Student extends Person {
    int rollNumber;
    String department;

    void displayStudentInfo() {
        displayInfo();  // calling parent method
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
    }
}

public class Problem1 {
    public static void main(String[] args) {

        Student s = new Student();

        // Assign values
        s.name = "Md Tauhidul Islam Pranto";
        s.age = 22;
        s.rollNumber = 1217;
        s.department = "CSE";

        // Display all info
        s.displayStudentInfo();
    }
}
