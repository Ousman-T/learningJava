package com.intro;

import java.awt.*;

public class DataTypes {
    public static void main(String[] args){
/*       two different variables, stored at two different locations in memory, with the same value, that are completely independent of one another */
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);
//        importing Point from java.awt, setting variable point1 to an instance of the Point class.
/*       When JRE executes line 14, it will allocate memory to store the Point Object. If the address of the location is 100, it will allocate a SEPARATE  part of memory, and attach the label of point1 to the new location. */
        Point point1 = new Point(1, 1);
//        point 2 does not have the same value as point 1, it simply REFERENCES the object point
        Point point2 = point1;
/*        we changed the value of x within POINT 1, then printed out POINT 2, and point 2 has the same value as point 1, although we did not reassign point 2, they are both REFERENCING the same object */
        point1.x = 2;
        System.out.println(point2);
    }
}
