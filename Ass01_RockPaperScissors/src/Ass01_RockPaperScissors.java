import java.util.Scanner;

public class Ass01_RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;

        do {
            String playerA = getValidMove(scanner, "Player A");
            String playerB = getValidMove(scanner, "Player B");

            displayResult(playerA, playerB);

            System.out.print("Play again? [Y/N]: ");
            String response = scanner.nextLine().trim().toUpperCase();
            playAgain = response.equals("Y");

        } while (playAgain);

        System.out.println("Thanks for playing!");
    }

    public static String getValidMove(Scanner scanner, String player) {
        String move;
        do {
            System.out.print(player + ", enter your move (R/P/S): ");
            move = scanner.nextLine().trim().toUpperCase();
        } while (!move.equals("R") && !move.equals("P") && !move.equals("S"));
        return move;
    }

    public static void displayResult(String a, String b) {
        System.out.print("Player A chose " + a + ", Player B chose " + b + ". ");

        if (a.equals(b)) {
            System.out.println(a + " vs " + b + " – It's a Tie!");
        } else if ((a.equals("R") && b.equals("S")) || (b.equals("R") && a.equals("S"))) {
            System.out.println("Rock breaks Scissors – " + (a.equals("R") ? "Player A wins!" : "Player B wins!"));
        } else if ((a.equals("P") && b.equals("R")) || (b.equals("P") && a.equals("R"))) {
            System.out.println("Paper covers Rock – " + (a.equals("P") ? "Player A wins!" : "Player B wins!"));
        } else if ((a.equals("S") && b.equals("P")) || (b.equals("S") && a.equals("P"))) {
            System.out.println("Scissors cuts Paper – " + (a.equals("S") ? "Player A wins!" : "Player B wins!"));
        }

    }
}