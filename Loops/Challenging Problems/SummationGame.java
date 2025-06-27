// Summation Game

/*
 * Problem Description
 * Write a program to find sum all Natural numbers from 1 to N where you have to take N as input from user.
 */

import java.util.*;

public class SummationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        do {
            sum += number;
            number--;
        } while (number != 0);
        System.out.println(sum);
    }
}