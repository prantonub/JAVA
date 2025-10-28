/*
7.Write a program to find reverse order of a string.
*/
package Lab_2;
import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}
