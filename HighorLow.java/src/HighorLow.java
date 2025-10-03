import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(10) + 1; // random number between 1–10
        int guess;

        // Loop until valid guess
        do {
            System.out.print("Guess a number (1–10): ");
            if (input.hasNextInt()) {
                guess = input.nextInt();
                if (guess >= 1 && guess <= 10) {
                    break;
                } else {
                    System.out.println("Number must be between 1 and 10.");
                }
            } else {
                System.out.println("Invalid input.");
                input.next(); // clear bad input
            }
        } while (true);

        // Reveal and compare
        System.out.println("The number was: " + number);
        if (guess < number) {
            System.out.println("Too low!");
        } else if (guess > number) {
            System.out.println("Too high!");
        } else {
            System.out.println("On the money!");
        }
    }
}