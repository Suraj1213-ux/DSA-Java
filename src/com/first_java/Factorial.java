package com.first_java;

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

        String choice;
        do {
            System.out.print("Enter a number: ");
            int num = scn.nextInt();

            int original = num;
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum += factorial(digit);
                num /= 10;
            }

            if (sum == original) {
                System.out.println(original + " is a Strong Number ✅");
            } else {
                System.out.println(original + " is NOT a Strong Number ❌");
            }

            System.out.print("Do you want to check another number? (y/n): ");
            choice = scn.next();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("Program ended. 👋");
        scn.close();
    }
}
