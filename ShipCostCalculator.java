import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the item: ");
        double price = input.nextDouble();

        double shippingCost;
        if (price >= 100) {
            shippingCost = 0.0;
        } else {
            shippingCost = price * 0.02;
        }

        double totalPrice = price + shippingCost;

        System.out.println("Shipping cost: $" + shippingCost);
        System.out.println("Total price: $" + totalPrice);
    }
}