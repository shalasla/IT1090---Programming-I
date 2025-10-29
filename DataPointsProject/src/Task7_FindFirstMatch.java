import java.util.Random;
import java.util.Scanner;

public class Task7_FindFirstMatch {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        System.out.print("Enter a value to find: ");
        int searchVal = in.nextInt();
        boolean found = false;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == searchVal) {
                System.out.println("The value " + searchVal + " was found at array index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("The value " + searchVal + " was not found in the array.");
        }
    }
}
