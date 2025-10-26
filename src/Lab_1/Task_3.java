/*
 Write a Java program to enter Principal (P), Time (T) and Rate (R)
 and calculate Simple Interest.
 Formula: Simple Interest = (P * T * R) / 100
 */
package Lab_1;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal amount (P): ");
        double principal = input.nextDouble();

        System.out.print("Enter Time in years (T): ");
        double time = input.nextDouble();

        System.out.print("Enter Rate of interest (R): ");
        double rate = input.nextDouble();

        
        double simpleInterest = (principal * time * rate) / 100;


        System.out.println("\n--- Result ---");
        System.out.println("Simple Interest: " + simpleInterest);
    }
}
