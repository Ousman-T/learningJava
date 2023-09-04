package com.intro;

public class Operators {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
//        1 = sign means assignment. 2 means equality operator, returns true
        System.out.println(x == y);
//        ! means reverse, or does not. returns false because x and y are equal
        System.out.println(x != y);

//        logical operator. Both must be equal
        int temp = 22;
        boolean isWarm = temp > 20 && temp < 30;
        System.out.println(isWarm);

        boolean hasHighIncome = true;
        boolean hasGoodCredit = false;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);
    }
}
