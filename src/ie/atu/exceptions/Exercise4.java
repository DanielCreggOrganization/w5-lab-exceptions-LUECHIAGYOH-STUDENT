package ie.atu.exceptions;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();
            int square = number * number;
            System.out.println("The square of " + number + " is " + square + ".");
        }
    }
}
