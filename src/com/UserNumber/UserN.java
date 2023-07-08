package com.UserNumber;


import java.util.Scanner;



public class UserN {
    public static int getMinN(int n, Integer[] numListMin) {

        int min = numListMin[0];

        for (int i = 1; i < n; i++) {
            if (numListMin[i] < min) {
                min = numListMin[i];
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
            int j = i + 1;
            System.out.println("Write an Array element " + j);
            numList[i] = scan.nextInt();
        }

        int minVal = getMinN(n, numList);
        System.out.println("Minimum value " + minVal);
    }
}