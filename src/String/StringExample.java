//slide code:
package String;
import javax.swing.JOptionPane;

public class StringExample {
    public static void main(String[] args) {

        String output;

        // Create a String
        String s1 = new String("hello there");

        // Create a character array of size 5
        char charArray[] = new char[5];

        // Add details about the string
        output = "s1: " + s1;
        output += "\nLength of s1: " + s1.length();

        // Reverse the string
        output += "\nThe string reversed is: ";
        for (int count = s1.length() - 1; count >= 0; count--) {
            output += s1.charAt(count) + " ";
        }

        // Copy first 5 characters from s1 into charArray
        s1.getChars(0, 5, charArray, 0);

        // Display the copied character array
        output += "\nThe character array is: ";
        for (int count = 0; count < charArray.length; count++) {
            output += charArray[count];
        }

        // Show output in a dialog box
        JOptionPane.showMessageDialog(null, output);

        System.exit(0);
    }
}
