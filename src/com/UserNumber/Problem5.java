package com.UserNumber;

import java.util.Scanner;

public class Problem5 {
    public static int sumFib(int n){

        if (n <= 0){
            System.out.println("Error");
            return 0;
        }

        if (n == 1 || n == 2){
            return 1;
        }

        return sumFib(n - 1) + sumFib(n - 2);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Write number");
        int n = scan.nextInt();


        int j = sumFib(n);
        System.out.println(n + "th Fibonacci Number  = " + j);
    }
}
