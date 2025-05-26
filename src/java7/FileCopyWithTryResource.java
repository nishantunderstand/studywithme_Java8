package java7;

import java.io.*;

public class FileCopyWithTryResource {

    public static void main(String[] args) {
        //String sourcePath1 = "C:\\Users\\User\\Desktop\\input.txt";
        String sourcePath = "C:/Users/User/Desktop/input.txt";

        String destinationPath = "C:\\Users\\User\\Desktop\\output.txt";

        // Create the source file and write initial content
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(sourcePath))) {
            writer.write("This is a sample file.");
            writer.newLine();
            
            writer.write("We are demonstrating try-with-resources in Java.");
            writer.newLine();
            
            writer.write("The content of this file will be copied.");
            System.out.println("Source file written successfully.");
            
        } catch (IOException e) {
            System.err.println("Error writing to source file: " + e.getMessage());
        }

        System.out.println("------------------------------------------------");

        // Read from source and write to destination using try-with-resources
        try (
            BufferedReader reader = new BufferedReader(new FileReader(sourcePath));
            BufferedWriter writer = new BufferedWriter(new FileWriter(destinationPath))
        ) {
            String line;
            System.out.println("Copying contents from source to destination...");
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully to: " + destinationPath);
        } catch (IOException e) {
            System.err.println("Error copying file: " + e.getMessage());
        }

        System.out.println("------------------------------------------------");
        System.out.println("Try-with-resources block completed.");
    }
}
