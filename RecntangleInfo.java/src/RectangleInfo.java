import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double width = 0, height = 0;

        // Get valid width
        do {
            System.out.print("Enter width: ");
            if (input.hasNextDouble()) {
                width = input.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // clear bad input
            }
        } while (true);

        // Get valid height
        do {
            System.out.print("Enter height: ");
            if (input.hasNextDouble()) {
                height = input.nextDouble();
                break;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // clear bad input
            }
        } while (true);

        // Calculations
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        // Output
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}