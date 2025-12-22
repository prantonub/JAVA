
import java.util.Scanner;

public class IncreasingOddNumbers1 {

    static boolean isStrictlyIncreasing(int num) {
        int prev = 10; 
        while (num > 0) {
            int digit = num % 10;
            if (digit >= prev) {
                return false;
            }
            prev = digit;
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 && isStrictlyIncreasing(i)) {
                System.out.println(i);
            }
        }
    }
}
