package ie.atu.exceptions;

public class Exercise3 {
    public static void main(String[] args) {
        try {
            System.out.println("Opening file...");
            // Simulate file processing
            System.out.println("Processing file...");
            // Simulate an exception
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: Division by zero!");
        } finally {
            System.out.println("File processing complete.");
        }
    }
}
