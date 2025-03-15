import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Check if the input is a valid non-negative integer
        if (number < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Calculate the factorial
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Output the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
}