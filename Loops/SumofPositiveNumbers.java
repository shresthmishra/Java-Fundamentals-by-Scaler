// Sum of Positive Numbers

/*

Given a stream of numbers, read the numbers till you read a -ve integer.

And then print their sum of numbers read so far.

*/

import java.util.*;

public class SumofPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;
        do {
            number = scanner.nextInt();
            sum += number;
        }
        while (number >= 0);
        System.out.println("The Sum is: " + sum);
    }
}
