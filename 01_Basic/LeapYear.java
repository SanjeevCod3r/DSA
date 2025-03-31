/*
Validating Leap Years
Difficulty: Easy
Topics: Basic Programming, Date Handling
Description: Write a program to check if a given year is a leap year.
Example:
Input: year = 2020
Output: Leap Year
Explanation: 2020 is divisible by 4 but not by 100, or it is divisible by 400, so it is a leap year.
*/
import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input year
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        // Check leap year condition
        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // Output result
        if (isLeap) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
        
        scanner.close();
    }
}


/*
 Leap Lear:
 1. 400  or
 2. 4 ✅ but 100 ✖️
 */