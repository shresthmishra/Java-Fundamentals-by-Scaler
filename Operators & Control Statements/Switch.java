
import java.util.Scanner;

// Suggestion according to weather

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the weather like? ");
        String weather = sc.nextLine();
        switch (weather) {
            case "rainy":
            System.out.println("Take an umbrella with you!");
            break;
            case "sunny":
            System.out.println("Grab your sunglasses!");
            default:
            System.out.println("Check the weather forecast.");
        }
        sc.close();
    }
}