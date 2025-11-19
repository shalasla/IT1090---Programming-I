import java.util.ArrayList;
import java.util.Scanner;

public class GradeList {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        // Step 1: Request a score between 50 and 100
        int score1 = SafeInput.getRangedInt(in, "Enter a score between 50 and 100:", 50, 100);
        grades.add(score1);
        display(grades);

        int score2 = SafeInput.getRangedInt(in, "Enter another score:", 50, 100);
        grades.add(score2);
        int score3 = SafeInput.getRangedInt(in, "Enter one more score:", 50, 100);
        grades.add(score3);
        display(grades);

        // Optional Step 2: Update one of the scores
        int indexToUpdate = SafeInput.getRangedInt(in, "Enter the index (0 to " + (grades.size() - 1) + ") of the score to update:", 0, grades.size() - 1);
        int newScore = SafeInput.getRangedInt(in, "Enter the new score:", 50, 100);
        grades.set(indexToUpdate, newScore);
        display(grades);
    }

    public static void display(ArrayList<Integer> items) {
        System.out.println("There are currently " + items.size() + " grades in the list");
        for (int i = 0; i < items.size(); i++) {
            System.out.println("Grade " + i + ": " + items.get(i));
        }
    }
}