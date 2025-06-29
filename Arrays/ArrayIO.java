// Array Input/Output Example

import java.util.Scanner;
public class ArrayIO {
    public static void main(String[] args) {
        Scanner array_taker = new Scanner(System.in);

        // Initializing an array of size 5
        int[] marks = new int[5];

        // Taking input into the array using For loop
        System.out.println("Enter your marks one by one. Start: ");
        for(int i = 0; i < marks.length; i++) {
            marks[i] = array_taker.nextInt();
        }
        // Output: Printing the marks
        for(int i = 0; i < marks.length; i++) {
            System.out.println("Marks of Subject " + i + ": " + marks[i]);
        }
        array_taker.close();
    }
}