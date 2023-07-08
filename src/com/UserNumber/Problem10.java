package com.UserNumber;

public class Problem10 {
    public static int calc_GCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return calc_GCD(b, a % b);
    }

    public static void main(String[] args)
}
