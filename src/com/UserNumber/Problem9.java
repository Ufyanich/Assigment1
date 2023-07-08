package com.UserNumber;

import java.util.Scanner;

public class Problem9 {
    public static int sumN(int n){
        if (n > 0)
        {
            return n * sumN(n-1);
        }
        else {
            return 1;}
    }

    public static int sumK(int k){
        if (k > 0)
        {
            return k * sumK(k-1);
        }
        else {
            return 1;}
    }

    public static int sumMinus(int n, int k){

        int i = n - k;

        for (int j = i - 1; j > 0; j--)
        {
            i = i * j;
        }

        return i;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, k;

        System.out.println("Write n");
        n = scan.nextInt();
        System.out.println("Write k");
        k = scan.nextInt();

        int j = sumN(n)/(sumK(k) * sumMinus(n, k));

        System.out.println("binomial coefficient = " + j);

    }
}
