// LCM

/*
 * Problem Description
 * 
 * Implement a program that takes two positive integers A and B in the input and prints their LCM.
 * 
 * Definition of LCM : The Least Common Multiple or LCM of two numbers say A and B, is denoted as LCM (A,B).
 * 
 * And the LCM is the smallest or least positive integer that is divisible by both A and B.
 */


import java.util.*;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int A = sc.nextInt();
        int B = sc.nextInt();

        int lcm = calculateLCM(A, B);
        System.out.println(lcm);
        
        sc.close();
    }
    
    public static int calculateLCM(int a, int b) {
        int max = Math.max(a, b);
        int lcm = max;
        
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                return lcm;
            }
            lcm += max;
        }
    }
}