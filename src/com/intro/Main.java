package com.intro;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        byte myAge = 23;
//        when number is too big to store in int, store it in long. Throw an L at the end of the number
        long viewsCount = 3_123_456_789L;
//        using F at the end of the float number so compiler can understand.
        float price = 10.99F;
//        single characters get single quotes, strings get double!
        char letter = 'A';
//        boolean values
        boolean isEligible = true;
//        Reference types, importing from java.util pacakge
        Date now =  new Date();
        now.getTime();
        System.out.println(now);
    }
}
