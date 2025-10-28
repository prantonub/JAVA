/*
5. Write a program to find transpose of a matrix.
*/
package Lab_2;
import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = input.nextInt();

        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                transpose[j][i] = matrix[i][j];

        System.out.println("Transpose of the matrix:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++)
                System.out.print(transpose[i][j] + " ");
            System.out.println();
        }

    }
}
