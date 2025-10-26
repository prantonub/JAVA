/*
 Write a Java program to input any character 
 and check whether it is an alphabet, digit, or special character.
 */
package Lab_1;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0); 

        // Checking character type
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an Alphabet.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit.");
        } else {
            System.out.println(ch + " is a Special Character.");
        }
    }
}
