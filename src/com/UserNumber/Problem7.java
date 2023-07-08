package com.UserNumber;

import java.util.Scanner;

public class Problem7 {
    public static int arrayRev(int n, Integer[] n_arr)
    {
        if (n <= 1)
        {
            return n_arr[0];
        }

        return n_arr[n-1];
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Write number of elements");
        int n = scan.nextInt();

        Integer[] n_arr = new Integer[n];

        for (int i = 0; i < n; i++){
            int j = i + 1;
            System.out.println("Write Array num " + j);
            n_arr[i] = scan.nextInt();
        }

        int k;
        for (int i = n; i > 0; i--)
        {
            k = arrayRev(i,n_arr);
            System.out.print(k + " ");
        }
    }
}
