/*
4. Write a program to interchange diagonals of a matrix.
*/

package Lab_2;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = input.nextInt();

        for (int i = 0; i < n; i++) {
            int temp = matrix[i][i];  
            matrix[i][i] = matrix[i][n - 1 - i]; 
            matrix[i][n - 1 - i] = temp;
        }

        System.out.println("Matrix after interchanging diagonals:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

    }
}
