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
