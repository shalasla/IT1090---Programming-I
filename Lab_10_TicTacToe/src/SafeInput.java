import java.util.Scanner;

public class SafeInput {

    /**
     * Prompts the user for an integer within a specific range.
     * Keeps prompting until a valid input is received.
     */
    public static int getRangedInt(Scanner console, String prompt, int low, int high) {
        int input;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            while (!console.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer.");
                console.next(); // discard invalid input
                System.out.print(prompt + " [" + low + " - " + high + "]: ");
            }
            input = console.nextInt();
        } while (input < low || input > high);
        console.nextLine(); // clear newline
        return input;
    }

    /**
     * Prompts the user for a Yes/No confirmation.
     * Returns true for 'Y' and false for 'N'.
     */
    public static boolean getYNConfirm(Scanner console, String prompt) {
        String input;
        do {
            System.out.print(prompt + " [Y/N]: ");
            input = console.nextLine().trim().toUpperCase();
        } while (!input.equals("Y") && !input.equals("N"));
        return input.equals("Y");
    }
}