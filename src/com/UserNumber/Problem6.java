package com.UserNumber;

import java.util.Scanner;

public class Problem6 {

    public static int power(int n, int a) {
        if(n <= 0)
        {return 1;}


        return a * power(n - 1, a);

    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Write numbers for power");
        int a = scan.nextInt();

        System.out.println("Write numbers for ^n");
        int n = scan.nextInt();

        int j = power(n, a);
        System.out.println(a + "^" + n +" = " + j);
    }
}
