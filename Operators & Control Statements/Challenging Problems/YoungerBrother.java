/*

Problem With Younger Brother
Problem Description: 
Your younger brother is going to a modern school. In his school, there was a coding competition planned. 
The pannel asked a question "Write a program which can perform the task - Add two numbers and divide them by a third number and print the remainder".
You are a programmer and your brother asks you to write a code that helps him to check his approach.

*/

import java.util.*;
public class YoungerBrother {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int firstNum = sc.nextInt();
    int secondNum = sc.nextInt();
    int additionOfNums = firstNum + secondNum;
    int thirdNum = sc.nextInt();
    int finalNum = additionOfNums / thirdNum;
    System.out.println("The final number is: " + finalNum);
    sc.close()
    }
}
