package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


    public static void main(String[] args) {

//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);

        //Welcomes user to the calculator and explains how the calculator works. This will contain the keywords that will be used
        Console.println("Welcome to the Europa calculator!");

        //User is prompted for a number
        double firstNumber = Console.getDoubleInput("Enter a number: ");
        Console.println("The user input: %s", firstNumber); //code check

        //prompt user for what to do with the number. ie. add, subtract, divide
        String mathOperation = Console.getStringInput("Enter a math operation: ");
        Console.println("The user input: %s", mathOperation); //code check

        //User is prompted for a second number. "What number do you want to [math function] [first number] by?
        double secondNumber = Console.getDoubleInput("Enter number: ");
        Console.println("The user input: %s", secondNumber); //code check

        //if user input equals add
        if (mathOperation.equals("+")) {
            System.out.println("This is working");
            Console.println("%s", add(firstNumber, secondNumber));
        }

        //if user input equals subtract
        if (mathOperation.equals("-")) {
            System.out.println("This is working");
        }

        //if user input equals multiply
        if (mathOperation.equals("*")) {
            System.out.println("This is working");
        }

        //if user input equals divide
        if (mathOperation.equals("/")) {
            System.out.println("This is working");
        }
        //Return answer

        //go through the prompt again with the new firstNumber

        //Give option to clear the console

        //answer is stored into the [first number variable] and can keep being used

        //test add method


    }
    //void = no return statement
    //take out void if you don't use a return and add String
    public static double add(double a, double b) {
        return a + b;
    }
}
