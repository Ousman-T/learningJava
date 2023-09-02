package com.intro;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
            /* In order to read inputs from the user in Java, we must use the Scanner class which is from the java.util package. We created a new instance of the Scanner, passed in System.in(which stands for inputs coming to the terminal), and stored it in a variable called scanner (lowercase)*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");
        byte age = scanner.nextByte();
/*        concatenating a string with a byte, java will implicitly cast the number into a string so we can concatenate (the byte can only store double-digit numbers) */
        System.out.println("You are " + age);

//        scanning strings
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner1.nextLine().trim();
        System.out.println("You are " + name);
    }
}
