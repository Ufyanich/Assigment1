package com.MyList;

public class MainEx {

    public static int getTenSize(int a) {
        int size = 0;

        do {
            a = a/10;
            size++;
        }while (a > 10);

        return size;
    }

    public static int getPlus(int n){
        int power = getTenSize(n);
        int ten = 1;
        int plus = 0;

        do {
            for (int i = power; i > 0; i--){
                ten = ten * 10;
            }
            plus = n/ten;
        }while (n > 10);

        if (n < 10){
            return n;
        }
        return plus;
    }

    public static void main(String[] args){
        int a = 5;

        System.out.println(getPlus(a));
    }
}
