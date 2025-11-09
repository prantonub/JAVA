//slide code:
package String;

import javax.swing.JOptionPane;

public class StringConstructor {
    public static void main(String[] args) {
        
        // Character and byte arrays
        char charArray[] = {'b', 'i', 'r', 't', 'h', ' ', 'd', 'a', 'y'};
        byte byteArray[] = {(byte) 'n', (byte) 'e', (byte) 'w', (byte) ' ',
                            (byte) 'y', (byte) 'e', (byte) 'a', (byte) 'r'};
        
        // Different ways to create String objects
        String s = new String("hello");
        StringBuffer buffer = new StringBuffer("Welcome");
        
        String s1 = new String();                // Empty string
        String s2 = new String(s);               // Copy of another string
        String s3 = new String(charArray);       // From char array
        String s4 = new String(charArray, 6, 3); // From part of char array ("day")
        String s5 = new String(byteArray, 4, 4); // From part of byte array ("year")
        String s6 = new String(byteArray);       // From byte array ("new year")
        String s7 = new String(buffer);          // From StringBuffer ("Welcome")
        
        // Combine results into one output string
        String output = "s1 = " + s1 + 
                        "\ns2 = " + s2 + 
                        "\ns3 = " + s3 + 
                        "\ns4 = " + s4 + 
                        "\ns5 = " + s5 + 
                        "\ns6 = " + s6 + 
                        "\ns7 = " + s7;
        
        // Display output in a message dialog
        JOptionPane.showMessageDialog(null, output);
        
        // Exit the program
        System.exit(0);
    }
}
