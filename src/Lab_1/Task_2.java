/*
 Write a Java program to enter marks of five subjects
 and calculate total, average, and percentage.
 */
package Lab_1;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter marks English: ");
        int sub1 = input.nextInt();

        System.out.print("Enter marks of Math: ");
        int sub2 = input.nextInt();

        System.out.print("Enter marks of Chemistry: ");
        int sub3 = input.nextInt();

        System.out.print("Enter marks of Physics: ");
        int sub4 = input.nextInt();

        System.out.print("Enter marks of Bangla: ");
        int sub5 = input.nextInt();

        // Calculation
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double average = total / 5.0; // use 5.0 to get decimal result
        double percentage = (total / 500.0) * 100;

        // Displaying results
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");
    }
}
