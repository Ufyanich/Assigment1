package com.UserNumber;

import java.util.Scanner;

public class Problem8 {
    public static boolean checkDigit(String s){
        if(s.isEmpty())
        {return true;}

        char j = s.charAt(0);
        if(!Character.isDigit(j))
        {
            return false;
        }

        return checkDigit(s.substring(1));
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

    }
}
