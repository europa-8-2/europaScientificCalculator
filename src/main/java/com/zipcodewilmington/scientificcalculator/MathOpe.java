package com.zipcodewilmington.scientificcalculator;
// Liu: I import Math lab here to support sqrt() and pow() methods
import java.lang.Math;
// Liu: This class is for all math operations of core features
public class MathOpe {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double square(double num1) { return num1 * num1;}

    public static double root(double num1) { return Math.sqrt(num1);}

    public static double exponentiation(double num1, double num2){return Math.pow(num1, num2);}
    public static double inverse(double num1){ return 1 / num1;}
}
