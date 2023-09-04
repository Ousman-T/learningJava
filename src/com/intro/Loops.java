package com.intro;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
//        for loop
        for (int i = 1; i <= 5; i++){
            System.out.println("Hello World! " + i);
        }

//        while loops
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true){
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("pass"))
                continue;
            if(input.equals("quit"))
                break;
            System.out.println(input);
        }

        String[] fruits = {"apple", "mango", "orange"};

        for (int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
//        forEach loop
        for (String fruit : fruits){
            System.out.println(fruit);
        }

//        do while loop
//        do {
//            System.out.println("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit"));
    }
}
