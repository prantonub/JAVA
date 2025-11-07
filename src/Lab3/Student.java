package Lab3;

class Student {
    int rollNo;
    String name;
    String department;
    double cgpa;

    Student(int rollNo, String name, String department, double cgpa) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
        this.cgpa = cgpa;
    }

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = "Unknown";
        this.cgpa = 0.0;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("CGPA: " + cgpa);
        System.out.println();
}

    public static void main(String[] args) {
        Student s1 = new Student(1217, "PRANTO", "CSE", 3.82);
        Student s2 = new Student(1227, "Minhaz");

        System.out.println("Student Information:");
        s1.display();
        s2.display();
    }
}
