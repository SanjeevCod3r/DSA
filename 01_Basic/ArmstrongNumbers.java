/*
Checking for Armstrong Numbers in a Range
Difficulty: Easy
Topics: Basic Programming, Number Theory
Description: Write a program to find all Armstrong numbers within a given range.
Example:
Input: range = [1, 500]
Output: [1, 153, 370, 371, 407]
Explanation: Armstrong numbers between 1 and 500 are 1, 153, 370, 371, and 407. 
*/
import java.util.ArrayList;
import java.util.List;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int start = 1, end = 500;
        List<Integer> armstrongNumbers = findArmstrongNumbers(start, end);

        System.out.println("Armstrong numbers in range [" + start + ", " + end + "]: " + armstrongNumbers);
    }

    public static List<Integer> findArmstrongNumbers(int start, int end) {
        List<Integer> armstrongList = new ArrayList<>();
        
        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                armstrongList.add(num);
            }
        }
        return armstrongList;
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num, sum = 0, digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == originalNum;
    }
}
