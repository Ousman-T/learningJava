package com.intro;

public class IfStatements {
    public static void main(String[] args) {
        int temp = 23;
        if (temp > 30) {
            System.out.println("It\'s a hot day ");
            System.out.println("Drink plenty of water");
        } else if (temp >= 20) {
            System.out.println("It\'s a nice day");
        } else {
            System.out.println("It\'s cold");
        }

        int income = 120_000;
        boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome);

//        ternary operator in java. 1 line if else
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);

    }
}
