package com.UserNumber;


import java.util.Scanner;



public class UserN {
    public static int getMinN(int n, int[] numList) {

        int min = numList[0];

        for (int i = 1; i < n; i++) {
            if (numList[i] < min) {
                min = numList[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write number of elements");
        int n = scan.nextInt();

        Integer[] numList = new Integer[n];

        for (int i = 0; i < n; i++){
            System.out.println("Write an Array element" + i);
            numList[i] = scan.nextInt();
        }

        for (int j = 0; j < n; j++){
            System.out.println("Check " + numList[j]);
        }
    }
}