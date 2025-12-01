package Lab_4;

class Person {
    String name;
    int age;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNumber;
    String department;

    void displayStudentInfo() {
        displayInfo(); 
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
    }
}

public class Problem1 {
    public static void main(String[] args) {

        Student s = new Student();

        s.name = "Md Tauhidul Islam Pranto";
        s.age = 22;
        s.rollNumber = 1217;
        s.department = "CSE";

        s.displayStudentInfo();
    }
}
