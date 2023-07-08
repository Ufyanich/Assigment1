package com.UserNumber;

import java.util.Scanner;

public class Problem2 {

    public static double getAverage(int n, Integer[] numListAv){
        int j = numListAv[0];

        for (int i = 1; i < n; i++) {
            j = j + numListAv[i];
        }

        return (double) j/n;
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

        double avVal = getAverage(n, numList);
        System.out.println("Average value " + avVal);
    }
}
