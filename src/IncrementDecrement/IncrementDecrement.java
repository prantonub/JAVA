package IncrementDecrement;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 10;
        int y;
        //post increment
        y = x++;
        System.out.println("y = "+y);
        //pre increment
        y = ++x;
        System.out.println("y = "+y);

    }
}
/*

package IncrementDecrement;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 10;
        int y;

        // Post-increment: value of x is assigned first, then x increases
        y = x++;
        System.out.println("After post-increment:");
        System.out.println("y = " + y); // 10
        System.out.println("x = " + x); // 11

        // Pre-increment: x increases first, then assigned to y
        y = ++x;
        System.out.println("\nAfter pre-increment:");
        System.out.println("y = " + y); // 12
        System.out.println("x = " + x); // 12
    }
}

 */