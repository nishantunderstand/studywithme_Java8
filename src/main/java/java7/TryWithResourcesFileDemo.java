package java7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Monday, May 26, 2025 9:50:13 PM
 * If we have emoji : we will get Cp1252" character encoding. error 
 */

public class TryWithResourcesFileDemo {

    public static void main(String[] args) {
        String filePath = "C:\\Users\\User\\Desktop\\demo_file.txt";

        // 1. Write content to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello from try-with-resources!");
            writer.newLine();
            writer.write("This file was created and written in Java.");
            writer.newLine();
            writer.write("Now we'll read it back.");
            System.out.println("File written successfully at: " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }

        System.out.println("------------------------------------------------");

        // 2. Read content from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Reading from file: " + filePath);
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        System.out.println("------------------------------------------------");
        System.out.println("try-with-resources block completed.");
    }
}
