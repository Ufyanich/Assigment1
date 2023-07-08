package com.UserNumber;

import java.util.Scanner;

public class Problem3 {
    public static String getString(int n) {
        int j;
        String var = "Prime";

        for (int i = 2; i < n; i++)
        {
             j = n % i;

            if (j == 0){
                var = "Composite";
            }
        }

        return var;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write number");
        int n = scan.nextInt();


        String varVal = getString(n);
        System.out.println("number is " + varVal);
    }
}
