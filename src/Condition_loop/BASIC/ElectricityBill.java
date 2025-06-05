package Condition_loop.BASIC;

import java.util.Scanner;

public class ElectricityBill {
    static double calculateBill(int units) {
        double bill = 0;
        if (units <= 100)
            bill = units * 1.5;
        else if (units <= 200)
            bill = 100 * 1.5 + (units - 100) * 2;
        else
            bill = 100 * 1.5 + 100 * 2 + (units - 200) * 3;
        return bill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        System.out.println("Electricity Bill: ₹" + calculateBill(units));
    }
}