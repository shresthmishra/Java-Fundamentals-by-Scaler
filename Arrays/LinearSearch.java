// Linear Search Algorithm

/*
 * Given an array and a key value as input, find the index of the key in the array.
 * Return -1 if it is not present.
 */


import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int answer = -1;

        // Input loop
        for(int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
        }

        int key = sc.nextInt();

        for(int i = 0; i < n; i++){
            if (key == arr[i]){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
        sc.close();
    }
}