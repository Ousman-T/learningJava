package com.intro;

public class Strings {
    public static void main(String[] args) {
//        No need to import String package
/*        String is a reference type, so you technically should instantiate it, however, in Java that isn't necessary */
        String message = "   Hello World!" + " Hello IntelliJ!!!   ";
//        String is a CLASS, so we can access its internals using dot notation!
        message.endsWith("!!!");
/*        instead of printing out message, we used dot notation in order to  check what character it ends in. we are printing out message.endsWith("!!!"), which will return a boolean*/
        System.out.println(message.endsWith("!!!"));
        System.out.println(message.startsWith("H"));
        System.out.println(message.length());
        System.out.println(message.indexOf("d"));
//        this method does not modify the original message string, returns a new one
        System.out.println(message.replace("!", "*"));
        System.out.println(message);
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
//        trim removes white space
        System.out.println(message.trim());

    }
}
