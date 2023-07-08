package com.UserNumber;

import java.util.Scanner;

public class Problem10 {
    public static int calc_GCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return calc_GCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;

        System.out.println("Write 1st");
        a = scan.nextInt();
        System.out.println("Write 2nd");
        b = scan.nextInt();

        int j = calc_GCD(a, b);
        System.out.println("GCD equals " + j);
    }
}
