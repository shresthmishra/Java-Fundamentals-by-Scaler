import java.util.Scanner;

public class ForeachLoop {
    public static void main(String[] args) {

        int[] arr = {7,6,5,4,3,2,1};

        // Printing numbers from 7 to 1

        for (int num  : arr) {
            System.out.println(num);
        }


        // If the provided Key is present in the array or not

        Scanner sc = new Scanner(System.in);
        int Key = sc.nextInt();
        boolean Found = false;
        for (int num : arr) {
            if (num == Key) {
                Found = true;
                break;
            }
        }

        System.out.println(Found);

        sc.close();
    }
}
