package ie.atu.exceptions;

public class Exercise6 {
    public static void main(String[] args) {
        try {
            validateAge(15); // This will throw an exception.
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18.");
        }
        System.out.println("Age is valid.");
    }
}
