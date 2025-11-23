package series;

import java.util.Scanner;

public class Series1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, sum =0;
        System.out.print("Enter a number: ");
        n = input.nextInt();

        for(int i=0; i<=n; i++){//i++ || i = i+1 (same thing)
//      for(int i=1; i<=n; i = i+2) ==> find the sum of odd number
//      for(int i=2; i<=n; i = i+2) ==> find the sum of odd number
            System.out.print(" "+i);
            sum = sum + i;
        }
System.out.println("\nSum of series: " + sum);
    }
}
