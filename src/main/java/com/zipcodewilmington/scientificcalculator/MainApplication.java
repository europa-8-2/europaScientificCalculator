package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


    public static void main(String[] args) {
        double firstNumber = 0;
        double secondNumber = 0;
        String mathOperation = "";
        //continue variable
        String continuePrompt = "y";
        double answer = 0;
//        String clearPrompt;


//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
//        Console.println("The user input %s as a d", d);

        //Welcomes user to the calculator and explains how the calculator works. This will contain the keywords that will be used
        Console.println("Welcome to the Europa calculator!");
        Console.println("You may use the following operations +, -,  *, /");
//        Console.println("Type clear to set the calculator back to zero");

        //User is prompted for a number
        firstNumber = Console.getDoubleInput("Enter number: ");


        //while loop to continue
        while (continuePrompt.equals("y")) {
            //prompt user for what to do with the number. ie. add, subtract, divide
            mathOperation = Console.getStringInput("Enter a math operation: ");

            //User is prompted for a second number. "What number do you want to [math function] [first number] by?
            secondNumber = Console.getDoubleInput("Enter number: ");

            //if user input equals add
            if (mathOperation.equals("+")) {
                answer = add(firstNumber, secondNumber);

            }

            //if user input equals subtract
            if (mathOperation.equals("-")) {
                answer = subtract(firstNumber, secondNumber);
            }

            //if user input equals multiply
            if (mathOperation.equals("*")) {
                answer = multiply(firstNumber, secondNumber);
            }

            //if user input equals divide
            if (mathOperation.equals("/")) {
                answer = divide(firstNumber, secondNumber);
            }

            Console.println("%s", answer);

            firstNumber = answer; //answer is stored into the [first number variable] and can keep being used

            continuePrompt = Console.getStringInput("Would you like to continue (y or n)? ");
            Console.println("Your current working number %s", firstNumber);

            //            clearPrompt = Console.getStringInput("Would you like to clear the calculator?" );

        }

        //Give option to clear the firstNumber variable

        //go through the prompt again

    }
    //void = no return statement
    //take out void if you don't use a return and add String
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
}
