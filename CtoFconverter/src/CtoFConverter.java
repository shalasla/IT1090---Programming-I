import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius = 0;
        boolean valid = false;

        do {
            System.out.print("Enter temperature in Celsius: ");
            if (input.hasNextDouble()) {
                celsius = input.nextDouble();
                valid = true;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                input.next(); // clear the bad input
            }
        } while (!valid);

        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}