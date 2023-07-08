package com.UserNumber;

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
            return k * sumN(k-1);
        }
        else {
            return 1;}
    }
}
