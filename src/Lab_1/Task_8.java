/*
 Write a Java program to find the sum of all prime numbers between a range m to n.
 (Simpler version)
 */
package Lab_1;
import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking range input
        System.out.print("Enter starting number (m): ");
        int m = input.nextInt();

        System.out.print("Enter ending number (n): ");
        int n = input.nextInt();

        int sum = 0;

        for (int i = m; i <= n; i++) {
            boolean isPrime = true;

            if (i <= 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= i / 2; j++) { // check divisibility up to i/2
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                sum += i;
            }
        }

        System.out.println("Sum of all prime numbers between " + m + " and " + n + " is: " + sum);
    }
}
