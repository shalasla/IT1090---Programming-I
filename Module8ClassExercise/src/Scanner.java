import java.util.Scanner;

public class RectangleAreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = validateInput(scanner, "Enter the length: ");
        double width = validateInput(scanner, "Enter the width: ");

        double area = calculateArea(length, width);

        System.out.println("The area of the rectangle is: " + area);
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }
    public static double validateInput(Scanner scanner, String displayText) {
        double value;
        while (true) {
            System.out.print(displayText);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next();
            }
        }
        return value;
    }
}