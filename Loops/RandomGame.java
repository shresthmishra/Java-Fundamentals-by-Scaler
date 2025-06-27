// Random Game

/* 

Write a program to generate random
numbers between [1, 10] and print
them to the output.

Terminate when you get 5.

Skip all multiples of 4. 

 */

public class RandomGame {

    public static void main(String[] args) {
        int number;
        while (true) {
            number = (int) (Math.random() * 10 + 1);
            System.out.println(number);
            if (number == 5) {
                break;
            }
            if (number % 4 == 0) {
                continue;
            }
        }
    }
}