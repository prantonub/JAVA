/*
 * 8. Write a program to remove all repeated characters from a given string.
 */
package Lab_2;

import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) { 
                result += ch;
            }
        }
        System.out.println("After removing repeated characters: " + result);
    }
}
