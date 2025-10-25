import java.util.Scanner;

public class Factorial {

    // Method to calculate factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scn.nextInt();

        int original = num;
        int sum = 0;

        // Calculate sum of factorial of digits
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        // Check Strong Number
        if (sum == original) {
            System.out.println(original + " is a Strong Number ✅");
        } else {
            System.out.println(original + " is NOT a Strong Number ❌");
        }

        scn.close();
    }
}
