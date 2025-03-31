/*
 Calculating Armstrong Numbers
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to check if a number is an Armstrong number.
Example:
Input: number = 153
Output: Armstrong Number
Explanation: 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
*/

import java.util.Scanner;

public class ArmStrongNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if it's an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }

        scanner.close();
    }

    // Method to check if a number is Armstrong
    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, countDigits = 0;

        // Count the number of digits
        int temp = num;
        while (temp > 0) {
            temp /= 10;
            countDigits++;
        }

        // Compute the sum of digits raised to the power of number of digits
        temp = originalNum;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, countDigits);
            temp /= 10;
        }

        return sum == originalNum;
    }
}

