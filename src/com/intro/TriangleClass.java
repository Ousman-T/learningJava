package com.intro;

public class TriangleClass {
//    instance variables, each instance will possess each variable
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;

    public TriangleClass(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree){
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;

    }
    public double findArea(){
       return (this.base * this.height) / 2;
    }


}
