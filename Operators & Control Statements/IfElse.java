import java.util.*;
public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You can drive!");
        } else {
            System.out.println("You still have a bit to go to be able to drive.");
        }
        scanner.close();
    }    
}
