/*
 Write a Java program to print the Fibonacci series up to n terms.
 */
package Lab_1;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //taking user input
        System.out.print("Enter the number of terms (n): ");
        int n = input.nextInt();

        int first = 0, second = 1;

        System.out.println("Fibonacci series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            //update the next term
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
