package com.first_java;
import java.util.Scanner;

public class palindrome_checker {
	public static boolean isPalindrome(String str) {
        String clean = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int left = 0, right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("'" + input + "' is a Palindrome.");
        } else {
            System.out.println("'" + input + "' is NOT a Palindrome.");
        }

        scanner.close();
    }
}
