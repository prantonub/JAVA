/*
 * 6. Write a program to find frequency of each characters in a string.
 */
package Lab_2;
import java.util.Scanner;
public class Task_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        char[] chars = str.toCharArray();
        boolean[] counted = new boolean[chars.length];
        System.out.println("Character frequencies:");

        for (int i = 0; i < chars.length; i++) {
            if (counted[i]) continue;

            int count = 1; 
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    counted[j] = true;
                }
            }
            System.out.println(chars[i] + " : " + count);
        }
    }
}
