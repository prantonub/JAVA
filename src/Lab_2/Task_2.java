/*
2. Write a program to merge two arrays to a third array.
*/

package Lab_2;
import java.util.Arrays;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }

        int[] merged = new int[n1 + n2];
        System.arraycopy(arr1, 0, merged, 0, n1);
        System.arraycopy(arr2, 0, merged, n1, n2);

        System.out.println("Merged array: " + Arrays.toString(merged));
    }
}
