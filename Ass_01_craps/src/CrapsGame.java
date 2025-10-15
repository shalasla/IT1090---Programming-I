import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;

        while (playAgain) {
            int die1 = rand.nextInt(6) + 1;
            int die2 = rand.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("You rolled: " + die1 + " + " + die2 + " = " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lose.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You win.");
            } else {
                int point = sum;
                System.out.println("Point is set to: " + point);
                boolean rolling = true;

                while (rolling) {
                    die1 = rand.nextInt(6) + 1;
                    die2 = rand.nextInt(6) + 1;
                    sum = die1 + die2;
                    System.out.println("You rolled: " + die1 + " + " + die2 + " = " + sum);

                    if (sum == point) {
                        System.out.println("You made your point! You win.");
                        rolling = false;
                    } else if (sum == 7) {
                        System.out.println("You rolled a 7. You lose.");
                        rolling = false;
                    } else {
                        System.out.println("Trying for point...");
                    }
                }
            }

            System.out.print("Play again? (yes/no): ");
            String response = input.nextLine();
            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
    }
}
