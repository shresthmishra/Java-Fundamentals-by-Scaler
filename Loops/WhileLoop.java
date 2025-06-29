// Count digits of a number

import java.util.*;

public class WhileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;
        while (number != 0) {
            number = number / 10;
            result++;
        }
        System.out.println("The digit of the number is: " + result);
        sc.close();
    }
}
