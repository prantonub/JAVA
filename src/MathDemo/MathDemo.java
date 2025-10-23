package MathDemo;

public class MathDemo {
public static void main(String[] args) {
    int x = 20;
    int y = 10;

    int max = Math.max(x, y);
    System.out.println("Maximum = "+max);

    int min = Math.min(x, y);
    System.out.println("Maximum = "+min);

    int absolute = Math.abs(x);
    System.out.println("Maximum = "+absolute);

    double power = Math.pow(x, y);
    System.out.println("x to the power y: "+power);

    int round = Math.round(8.4f);
    System.out.println("Round of 8.4 = "+round);

    double pi = Math.PI;
    System.out.println("PI = "+pi);
}
}
