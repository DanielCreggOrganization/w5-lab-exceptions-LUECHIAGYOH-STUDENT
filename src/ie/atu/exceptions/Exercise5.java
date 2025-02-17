package ie.atu.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class Exercise5 {
    public static void main(String[] args) {
        // Checked Exception Example:
        try {
            FileReader reader = new FileReader("nonexistent.txt");
            System.out.println("File opened successfully");
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        // Unchecked Exception Example:
        String text = null;
        try {
            // This will throw a NullPointerException because 'text' is null.
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }
    }
}
