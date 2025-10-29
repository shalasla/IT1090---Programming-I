import java.util.Random;
import java.util.Scanner;

public class Task6_CountOccurrences {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        System.out.print("Enter a value to search for: ");
        int searchVal = in.nextInt();
        int count = 0;

        for (int val : dataPoints) {
            if (val == searchVal) {
                count++;
            }
        }

        System.out.println("The value " + searchVal + " was found " + count + " time(s) in the array.");
    }
}