import java.util.Random;

public class Task2_FillArray {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }

        System.out.println("Array filled with random values between 1 and 100.");
    }
}