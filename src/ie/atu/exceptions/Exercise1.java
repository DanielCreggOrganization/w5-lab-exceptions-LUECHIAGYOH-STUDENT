package ie.atu.exceptions;

public class Exercise1 {
    public static void main(String[] args) {
        // This code will throw a NullPointerException because 'text' is null.
        String text = null;

        // Check if 'text' is null before attempting to access its length.
        if (text != null) {
            System.out.println(text.length());
        } else {
            System.out.println("The text is null.");
        }
    }
}
