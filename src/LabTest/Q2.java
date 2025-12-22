package LabTest;

import java.util.Scanner;

public class Q2 {

    static boolean isPalindrome(int num) {
        int original = num, rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return original == rev;
    }

    static boolean productDivBy3(int num) {
        int product = 1;
        while (num > 0) {
            product *= (num % 10);
            num /= 10;
        }
        return product % 3 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (isPalindrome(i) && productDivBy3(i)) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
