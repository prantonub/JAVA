package Lab3;
class Result {
    int rollNo;
    String name;

    Result(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }
    double calculateTotal(double m1, double m2, double m3) {
        return m1 + m2 + m3;
    }

    // Method to display average marks
    void displayGrade(double total) {
        double average = total / 3;
        System.out.println("Average Marks: " + average);

        if (average >= 80)
            System.out.println("Grade: A+");
        else if (average >= 70)
            System.out.println("Grade: A");
        else if (average >= 60)
            System.out.println("Grade: B");
        else if (average >= 50)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: F");
    }
    public static void main(String[] args) {
        // Student 1 (integer marks)
        Result s1 = new Result(1217, "Pranto");
        int total1 = s1.calculateTotal(85, 90, 88);
        System.out.println("Student: " + s1.name + " (Roll: " + s1.rollNo + ")");
        System.out.println("Total Marks: " + total1); 
        s1.displayGrade(total1);
        System.out.println();

        // Student 2 (double marks)
        Result s2 = new Result(1020, "Hasan");
        double total2 = s2.calculateTotal(72.5, 68.0, 75.5);
        System.out.println("Student: " + s2.name + " (Roll: " + s2.rollNo + ")");
        System.out.println("Total Marks: " + total2);
        s2.displayGrade(total2);
    }
}
