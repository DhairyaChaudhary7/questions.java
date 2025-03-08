// armstrome number by user inpur
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int result = 0;

        // Calculate the sum of the cubes of its digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get the last digit
            result += Math.pow(digit, 3);    // Add the cube of the digit to the result
            originalNumber /= 10;           // Remove the last digit
        }

        // Check if the number is an Armstrong number
        if (result == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
