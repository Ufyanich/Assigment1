package com.UserNumber;

import java.util.Scanner;

public class UserN {
    public static void main(String[] args) {
        System.out.println("Write number of elements");

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.print("Проверка " + n);
    }
}