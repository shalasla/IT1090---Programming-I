import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";
        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);
        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int value = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();
                valid = true;
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!valid);
        return value;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double value = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine();
                valid = true;
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!valid);
        return value;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int value = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();
                if (value >= low && value <= high) {
                    valid = true;
                } else {
                    System.out.println("Out of range: " + value);
                }
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!valid);
        return value;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double value = 0;
        boolean valid = false;
        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine();
                if (value >= low && value <= high) {
                    valid = true;
                } else {
                    System.out.println("Out of range: " + value);
                }
            } else {
                String trash = pipe.nextLine();
                System.out.println("Invalid input: " + trash);
            }
        } while (!valid);
        return value;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response = "";
        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine().trim();
            if (response.equalsIgnoreCase("Y")) return true;
            if (response.equalsIgnoreCase("N")) return false;
            System.out.println("Invalid input: " + response);
        } while (true);
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String response = "";
        do {
            System.out.print("\n" + prompt + ": ");
            response = pipe.nextLine();
            if (response.matches(regEx)) return response;
            System.out.println("Does not match pattern.");
        } while (true);
    }

    public static void prettyHeader(String msg) {
        int totalWidth = 60;
        int stars = 3;
        int msgWidth = msg.length();
        int padding = totalWidth - stars * 2 - msgWidth;
        int leftPad = padding / 2;
        int rightPad = padding - leftPad;

        for (int i = 0; i < totalWidth; i++) System.out.print("*");
        System.out.println();

        System.out.print("***");
        for (int i = 0; i < leftPad; i++) System.out.print(" ");
        System.out.print(msg);
        for (int i = 0; i < rightPad; i++) System.out.print(" ");
        System.out.println("***");

        for (int i = 0; i < totalWidth; i++) System.out.print("*");
        System.out.println();
    }
}