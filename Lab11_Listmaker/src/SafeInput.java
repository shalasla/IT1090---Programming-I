import java.util.Scanner;

public class SafeInput {
    private static final Scanner in = new Scanner(System.in);

    public static String getNonZeroLenString(String prompt) {
        String input;
        do {
            System.out.print(prompt + " ");
            input = in.nextLine().trim();
        } while (input.length() == 0);
        return input;
    }

    public static int getRangedInt(String prompt, int low, int high) {
        int value;
        while (true) {
            System.out.printf("%s [%d - %d]: ", prompt, low, high);
            if (in.hasNextInt()) {
                value = in.nextInt();
                in.nextLine(); // clear buffer
                if (value >= low && value <= high) {
                    return value;
                } else {
                    System.out.println("Error: Input out of range.");
                }
            } else {
                System.out.println("Error: Invalid input.");
                in.nextLine(); // clear buffer
            }
        }
    }

    public static boolean getYNConfirm(String prompt) {
        String input;
        while (true) {
            System.out.print(prompt + " [Y/N]: ");
            input = in.nextLine().trim().toUpperCase();
            if (input.equals("Y")) return true;
            if (input.equals("N")) return false;
            System.out.println("Error: Please enter Y or N.");
        }
    }

    public static String getRegExString(String prompt, String pattern) {
        String input;
        while (true) {
            System.out.print(prompt + " ");
            input = in.nextLine().trim();
            if (input.matches(pattern)) {
                return input;
            } else {
                System.out.println("Error: Input does not match required pattern.");
            }
        }
    }
}