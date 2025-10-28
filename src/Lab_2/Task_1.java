/*
ID: 41230201217
Name: Md Tauhidul Islam Pranto
// Write a program to print all unique elements in an array.
*/

package Lab_2;
public class Task_1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count == 1)
                result += arr[i] + " ";
        }
        System.out.println("Unique elements are: " + result);
    }
}
