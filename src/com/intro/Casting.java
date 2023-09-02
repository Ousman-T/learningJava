package com.intro;

public class Casting {
    public static void main(String[] args) {
/*        adding short to an integer. Usually you would want to be strict with the types you are using. However, short and int are both compatable, and 2 bytes are in a short, 4 in an int. Java will IMPLICITLY CAST the short into an int.  byte -> short -> int -> long -> float -> double*/
        short x = 1;
        int y = x + 2;
        System.out.println(y);

/*        IMPLICITLY CASTING int into double to solve the equation. Instead of 1.1 + 2, java is doing 1.1+ 2.0 under the hood in order to ensure that we are getting back float/double numbers */
        double a = 1.1;
        double b = a + 2;
        System.out.println(b);

/*        EXPLICITLY CASTING the value stored in o to become in integer, so we don't deal with any decimals in this example */
        double o = 1.1;
        int p = (int)o + 2;
        System.out.println(p);

        /* When dealing with data types that are not related (Strings vs Int for example) you must parse the variable in order to convert it to a version we can work with. There are many different methods of parsing belonging to Java.Lang, below we use Integer.parseInt() and pass in are variable storing the string.*/
        String uno = "1";
        int dos = Integer.parseInt(uno) + 2;
        System.out.println(dos);
    }
}
