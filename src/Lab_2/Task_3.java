/*
3. Write a program to multiply two matrices.
*/

package Lab_2;
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter rows and columns of first matrix: ");
        int r1 = input.nextInt();
        int c1 = input.nextInt();
        int[][] mat1 = new int[r1][c1];
        System.out.println("Enter elements of first matrix:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                mat1[i][j] = input.nextInt();

        System.out.print("Enter rows and columns of second matrix: ");
        int r2 = input.nextInt();
        int c2 = input.nextInt();

        if (c1 != r2) {
            System.out.println("Multiplication not possible!");
            return;
        }

        int[][] mat2 = new int[r2][c2];
        System.out.println("Enter elements of second matrix:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                mat2[i][j] = input.nextInt();

        int[][] result = new int[r1][c2];
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    result[i][j] += mat1[i][k] * mat2[k][j];


        System.out.println("Product of the matrices:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }

    }
}
