/*

Which triangle?

Problem Description:

Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.

You have to print if the traingle is "equilateral", "scalene" or "isosceles".

*/

import java.util.Scanner;

public class TypeofTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a == b && b == c && a == c) {
            System.out.println("equilateral");
        }
        else if (a != b && b != c && c != a) {
            System.out.println("scalene");
        }
        else {
            System.out.println("isosceles");
        }
        sc.close();
    }
}