package com.intro;

public class ExpressionsExample {
    public static void main(String[] args) {
        int res = 10 / 3;
        System.out.println(res);
        /* in java dividing two whole numbers always gives a whole number, in order to get a number with decimals it must be converted. */

        double result = (double) 10 / (double) 3;
        System.out.println(result);

        /* in order to properly increment in java you must prefix incrementation to variables.*/
        int x = 1;
        int y = ++x;
        System.out.println(x);
        System.out.println(y);

    }
}
