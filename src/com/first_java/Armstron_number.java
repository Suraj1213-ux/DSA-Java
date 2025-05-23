package com.first_java;
import java.util.Scanner;


public class Armstron_number {

    public static boolean isArmstrong(int number) {
        int original = number, sum = 0;
        int digits = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == original;
    }

    public static void findArmstrongBetween(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        boolean found = false;

        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("None found.");
        } else {
            System.out.println(); // line break
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter start number: ");
        int start = sc.nextInt();

        System.out.print("Enter end number: ");
        int end = sc.nextInt();

        if (start > end) {
            System.out.println("Start number must be less than or equal to end number.");
        } else {
            findArmstrongBetween(start, end);
        }

        sc.close();
    }
}