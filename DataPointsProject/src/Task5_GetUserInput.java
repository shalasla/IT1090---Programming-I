import java.util.Scanner;

public class Task5_GetUserInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value between 1 and 100: ");
        int userVal = in.nextInt();
        System.out.println("You entered: " + userVal);
    }
}
