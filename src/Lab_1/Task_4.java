/*
 Write a Java program to find the maximum of three numbers without using if-else.
 */
package Lab_1;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //user input
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        // Finding maximum using Math.max
        int max = Math.max(num1, Math.max(num2, num3));

        System.out.println("\nThe maximum number is: " + max);
    }
}
