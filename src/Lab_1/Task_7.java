/*
 Write a Java program to print all even numbers from 1 to n.
 */
package Lab_1;
import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        System.out.println("Even numbers: ");

        // Loop through 1 to n
        for (int i = 2; i <= n; i = i + 2) {
            System.out.print(i + " ");
        }
    }
}
