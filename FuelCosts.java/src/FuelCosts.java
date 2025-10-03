import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gallons = 0, mpg = 0, price = 0;

        do {
            System.out.print("Gallons in tank: ");
            if (input.hasNextDouble()) {
                gallons = input.nextDouble();
                break;
            } else {
                System.out.println("Invalid input.");
                input.next();
            }
        } while (true);

        do {
            System.out.print("Fuel efficiency (mpg): ");
            if (input.hasNextDouble()) {
                mpg = input.nextDouble();
                break;
            } else {
                System.out.println("Invalid input.");
                input.next();
            }
        } while (true);

        do {
            System.out.print("Price per gallon: ");
            if (input.hasNextDouble()) {
                price = input.nextDouble();
                break;
            } else {
                System.out.println("Invalid input.");
                input.next();
            }
        } while (true);

        double cost100Miles = (100 / mpg) * price;
        double distance = gallons * mpg;

        System.out.println("Cost to drive 100 miles: $" + cost100Miles);
        System.out.println("Distance with full tank: " + distance + " miles");
    }
}