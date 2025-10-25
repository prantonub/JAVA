package series;

import java.util.Scanner;

public class Series2 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n, sum =0;
        System.out.print("Enter a number: ");
        n = input.nextDouble();

        for(double i=1.5; i<=n; i = i+1){//i++ || i = i+1 (same thing)

            System.out.print(" "+i);
            sum = sum + i;
        }
System.out.println("\nSum of series: " + sum);
    }
}
