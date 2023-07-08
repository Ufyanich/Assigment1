package com.UserNumber;

import java.util.Scanner;

public class Problem4 {
    public static int sum(int n){
        if (n > 0)
        {
            return n * sum(n-1);
        }
        else {
            return 1;}
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write number");
        int n = scan.nextInt();


        int j = sum(n);
        System.out.println(n + "! = " + j);
    }
}
