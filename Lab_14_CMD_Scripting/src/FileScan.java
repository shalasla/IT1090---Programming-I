import javax.swing.*;
import java.io.*;

public class FileScan {
    public static void main(String[] args) {
        File selectedFile = null;

        // 1. Check if a command-line argument was provided
        if (args.length > 0) {
            selectedFile = new File(args[0]);
            System.out.println("Looking for file at: " + selectedFile.getAbsolutePath());
            if (!selectedFile.exists()) {
                System.out.println("File not found: " + args[0]);
                return;
            }
        }
            }
        } else {
            // 2. If no argument, launch JFileChooser (works in IntelliJ)
            JFileChooser chooser = new JFileChooser("src");
            int result = chooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                selectedFile = chooser.getSelectedFile();
            } else {
                System.out.println("No file selected.");
                return;
            }
        }

        // 3. Scan the file
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        System.out.println("Reading file: " + selectedFile.getName());

        try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                lineCount++;
                wordCount += line.trim().split("\\s+").length;
                charCount += line.length();
            }

            // 4. Print summary
            System.out.println("\n--- Summary Report ---");
            System.out.println("File Name: " + selectedFile.getName());
            System.out.println("Number of Lines: " + lineCount);
            System.out.println("Number of Words: " + wordCount);
            System.out.println("Number of Characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}