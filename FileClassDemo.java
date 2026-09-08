import java.io.File;
import java.io.IOException;

public class FileClassDemo {

    public static void main(String[] args) {

        // Create a File object representing test.txt
        File file = new File("test.txt");

        try {

            // Create the actual file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Display file information
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("Size: " + file.length() + " bytes");

            // Delete the file (optional)
            // if (file.delete()) {
            //     System.out.println("File deleted.");
            // }

        } catch (IOException e) {

            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}