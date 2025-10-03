import java.util.Scanner;

public class ShippingCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System..in);

        System.out.print("Enter item price: ");
        double price = input.nextDouble();

        double shippingCost;
        if (price < 100) {
            shippingCost = 0;
        } else {
            shippingCost = price * 0.02;
        }

        System.out.println("Shipping cost: $" + shippingCost);
    }
}
