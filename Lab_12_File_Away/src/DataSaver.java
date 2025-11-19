import java.io.*;
import java.util.ArrayList;

public class DataSaver {
    public static void main(String[] args) {
        ArrayList<String> records = new ArrayList<>();
        int idCounter = 1;

        while (SafeInput.getYNConfirm("Do you want to enter a new record?")) {
            String firstName = SafeInput.getNonZeroLenString("Enter First Name:");
            String lastName = SafeInput.getNonZeroLenString("Enter Last Name:");
            String id = String.format("%06d", idCounter++);
            String email = SafeInput.getNonZeroLenString("Enter Email:");
            int yearOfBirth = SafeInput.getRangedInt("Enter Year of Birth:", 1900, 2025);

            String record = String.format("%s, %s, %s, %s, %d", firstName, lastName, id, email, yearOfBirth);
            records.add(record);
        }

        String fileName = SafeInput.getNonZeroLenString("Enter filename to save (include .csv):");

        try (PrintWriter writer = new PrintWriter(new FileWriter("src/" + fileName))) {
            for (String record : records) {
                writer.println(record);
            }
            System.out.println("Records saved to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}
