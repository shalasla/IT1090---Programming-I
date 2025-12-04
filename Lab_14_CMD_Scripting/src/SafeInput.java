import java.util.Scanner;

public class SafeInput {
    private static Scanner in = new Scanner(System.in);

    public static String getNonZeroLenString(String prompt) {
        String input;
        do {
            System.out.print(prompt + " ");
            input = in.nextLine().trim();
        } while (input.length() == 0);
        return input;
    }

    public static boolean getYNConfirm(String prompt) {
        String input;
        do {
            System.out.print(prompt + " [Y/N]: ");
            input = in.nextLine().trim().toUpperCase();
        } while (!input.equals("Y") && !input.equals("N"));
        return input.equals("Y");
    }

    public static int getRangedInt(String prompt, int low, int high) {
        int value;
        do {
            System.out.print(prompt + " [" + low + "-" + high + "]: ");
            while (!in.hasNextInt()) {
                System.out.print("Invalid input. Try again: ");
                in.next();
            }
            value = in.nextInt();
            in.nextLine(); // clear buffer
        } while (value < low || value > high);
        return value;
    }
}
