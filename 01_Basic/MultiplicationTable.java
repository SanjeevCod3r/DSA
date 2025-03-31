import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Read the number from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Read the limit for multiplication table
        System.out.print("Enter the multiplication limit: ");
        int limit = sc.nextInt();

        // Close the scanner to prevent resource leaks
        sc.close();

        // Generate multiplication table
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
