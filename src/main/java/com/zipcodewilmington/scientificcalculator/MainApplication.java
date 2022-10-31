package com.zipcodewilmington.scientificcalculator;



// Liu: I move all math operations to MathOpe to keep our code clear,
//      and I import them here
import static com.zipcodewilmington.scientificcalculator.MathOpe.*;
// import scientific class here
import static com.zipcodewilmington.scientificcalculator.SciFeatures.*;

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

        //Welcomes user to the calculator and explains how the calculator works.
        // This will contain the keywords that will be used
        Console.println("Welcome to the Europa calculator!");
        Console.println("You may use the following operations +, -,  *, /");
        Console.println("or use (s)quare, (r)oot, (e)xponentiation, (i)verse");
        Console.println("Calculator display: %s", firstNumber);
//        Console.println("Type clear to set the calculator back to zero");

        //User is prompted for a number
        //Liu: try & catch make sure user type in digits.
        try {
            firstNumber = Console.getDoubleInput("Enter number: ");
        }catch(NumberFormatException exc){

            Console.println("Please type in a digit !!!");
            firstNumber = Console.getDoubleInput("Enter number: ");

        }

        //while loop to continue
        while (continuePrompt.equals("y")) {
            Console.println("Calculator display: %s", firstNumber);
            //prompt user for what to do with the number. ie. add, subtract, divide
            mathOperation = Console.getStringInput("Enter a math operation: ");
            // square and root methods don't  need second number
            if(mathOperation.equals("s") || mathOperation.equals("r") || mathOperation.equals("i")) {
                if(mathOperation.equals("s")){
                    answer = square(firstNumber);
                }
                if (mathOperation.equals("r")) {
                    answer = root(firstNumber);
                }
                if(mathOperation.equals("i")){
                    answer = inverse(firstNumber);
                }

                firstNumber = answer; //answer is stored into the [first number variable] and can keep being used

                Console.println("Calculator display: %s", firstNumber);

                continuePrompt = Console.getStringInput("Would you like to continue (y or n)? ");
            }else{
                Console.println("Calculator display: %s", firstNumber);
                //User is prompted for a second number. "What number do you want to [math function] [first number] by?
                //Liu: this try & catch make sure second number won't be 0
                try {
                    secondNumber = Console.getDoubleInput("Enter number: ");
                }catch(NumberFormatException exc){
                    Console.println("Please type in a digit !!!");
                    secondNumber = Console.getDoubleInput("Enter number: ");
                }
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

                //if user input equals "e"
                if (mathOperation.equals("e")){
                    answer = exponentiation(firstNumber, secondNumber);
                }


                firstNumber = answer; //answer is stored into the [first number variable] and can keep being used

                Console.println("Calculator display: %s", firstNumber);

                continuePrompt = Console.getStringInput("Would you like to continue (y or n)? ");
            }

            //            clearPrompt = Console.getStringInput("Would you like to clear the calculator?" );

        }

        //Give option to clear the firstNumber variable

        //go through the prompt again

    }
    //void = no return statement
    //take out void if you don't use a return and add String

}
