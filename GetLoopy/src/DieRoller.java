import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean keepRolling = true;

        while (keepRolling) {
            int rollCount = 1;
            System.out.printf("%-5s %-5s %-5s %-5s %-5s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------");

            while (true) {
                int die1 = rand.nextInt(6) + 1;
                int die2 = rand.nextInt(6) + 1;
                int die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-5d %-5d %-5d %-5d %-5d%n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) break;
                rollCount++;
            }

            System.out.print("Roll again? (y/n): ");
            String response = input.nextLine();
            keepRolling = response.equalsIgnoreCase("y");
        }

        input.close();
    }
}