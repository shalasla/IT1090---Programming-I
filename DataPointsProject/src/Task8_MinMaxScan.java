import java.util.Random;

public class Task8_MinMaxScan {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int val : dataPoints) {
            if (val < min) min = val;
            if (val > max) max = val;
        }

        System.out.println("Minimum value in dataPoints is: " + min);
        System.out.println("Maximum value in dataPoints is: " + max);
    }
}
