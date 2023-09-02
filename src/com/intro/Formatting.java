package com.intro;

import java.text.NumberFormat;

public class Formatting {
    public static void main(String[] args) {
//        NumberFormat is an abstract class, can not create instance of by calling new.
        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        all objects created by NumberFormat have access to the format method in order
        String res = currency.format(1234567.891);
        System.out.println(res);

//        percentage example
//        using method chaining to create an instance of the getPercent method from NumberFormat class
        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}
