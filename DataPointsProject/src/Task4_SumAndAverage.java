import java.util.Random;

public class Task4_SumAndAverage {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();
        int sum = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
            sum += dataPoints[i];
        }

        double average = (double) sum / dataPoints.length;
        System.out.println("The sum of the dataPoints array is: " + sum);
        System.out.println("The average of the dataPoints array is: " + average);
    }
}
