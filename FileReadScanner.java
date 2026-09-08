import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadScanner {

    public static void main(String[] args) {

        // Create a File object for input.txt
        File file = new File("input.txt");

        try (Scanner scanner = new Scanner(file)) {

            // Read the file line by line
            while (scanner.hasNextLine()) {

                String line = scanner.nextLine();

                // Display each line
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {

            // Display error if the file does not exist
            System.out.println("File not found: " + e.getMessage());
        }
    }
}