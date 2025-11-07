//Q7. Complex Number Operations
package Lab3;

class ComplexNumber {
    double real;
    double imag;
    // Default constructor
    ComplexNumber() {
        real = 0.0;
        imag = 0.0;
    }
    // Parameterized constructor
    ComplexNumber(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    // Method 1: Add two complex numbers
    ComplexNumber add(ComplexNumber c) {
        ComplexNumber result = new ComplexNumber();
        result.real = this.real + c.real;
        result.imag = this.imag + c.imag;
        return result;
    }

    // Method 2: Add a complex number and an integer (to real part)
    ComplexNumber add(int num) {
        ComplexNumber result = new ComplexNumber();
        result.real = this.real + num;
        result.imag = this.imag;
        return result;  
    }
    // Display method
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
    // Main method
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3.5, 2.5);
        ComplexNumber c2 = new ComplexNumber(1.5, 4.5);

        System.out.print("First Complex Number: ");
        c1.display();

        System.out.print("Second Complex Number: ");
        c2.display();
        // Adding two complex numbers
        ComplexNumber sum1 = c1.add(c2);
        System.out.print("Sum of two complex numbers: ");
        sum1.display();
        // Adding an integer to a complex number
        ComplexNumber sum2 = c1.add(3);
        System.out.print("Sum of complex number and integer: ");
        sum2.display();
    }
}
