package ie.atu.exceptions;

public class Exercise2 {
    public static void main(String[] args) {
        try {
            // This will throw an ArithmeticException because of division by zero.
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
    }
}
