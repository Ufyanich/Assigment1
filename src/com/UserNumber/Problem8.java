package com.UserNumber;

import java.util.Scanner;

public class Problem8 {
    public static boolean checkDigit(String s){
        if (s.isEmpty()) {
            return true;
        }

        char i = s.charAt(0);
        if (!Character.isDigit(i)) {
            return false;
        }

        return checkDigit(s.substring(1));
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Write a string");
        String s = scan.nextLine();

        boolean i = checkDigit(s);

        if (i){
            System.out.println("Yes");
        }
        else {System.out.println("No");}
    }
}
