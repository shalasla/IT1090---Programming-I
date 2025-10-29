import java.util.Random;

public class Task3_DisplayArray {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        for (int val : dataPoints) {
            System.out.print(val + " | ");
        }
        System.out.println();
    }
}