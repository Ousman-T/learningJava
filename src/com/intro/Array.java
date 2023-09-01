package com.intro;


import java.util.Arrays;

public class Array {
    public static void main(String[] args){
/*        in order to create an array (which is a reference type) we need to make numbersArr a new int, that holds 5 integers */
        int[] numbersArr = new int[5];
        numbersArr[0] = 1;
        numbersArr[1] = 2;
/*        when printing arrays like this, java will print the location in memory of the array, rather than the value */
        System.out.println(numbersArr);
//        METHOD OVERLOADING, this will return the string representation of the numbersArr
        java.util.Arrays.toString(numbersArr);
        System.out.println(java.util.Arrays.toString(numbersArr));

//        different syntax for virtually the same thing
        int[] numbers = {2, 3, 5, 1, 4};
        System.out.println(numbers.length);
//        importing sort from java.util.Arrays in order to sort the numbers array
        java.util.Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
