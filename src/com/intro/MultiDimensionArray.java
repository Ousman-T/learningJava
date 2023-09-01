package com.intro;

import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {
//        created an instance of a 2D array two rows, three columns
        int[][] numbers = new int[2][3];
//        setting the value of the first row and first column to one.
        numbers[0][0] = 1;
/*        printing out the 2D array returns also the location in memory, not the value of string, remedy this by using the method deepToString() from the Arrays class*/
        System.out.println(Arrays.deepToString(numbers));

//        using curly brackets instead of creating a new instance
        int[][] numbers2 = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(numbers2));
    }
}
