package com.Java.intro;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void ex2_1() {

        /*
            Write a program that compares two numbers. i.e x > y
            Create 3 variables.
            2 to store both numbers and 1 to store the result
            Print the result
        */

        int number1 = 3;
        int number2 = 5;

        Boolean check = number1 > number2;

        System.out.println(check);
    }

    public static void ex2_2() {

        /*
            Write a program that compares two String contents.
            Create 3 variables.
            2 to store both strings and 1 to store the result
            Print the result
        */

        String string1 = "Hello!";
        String string2 = "Hello!";

        Boolean check = string1 == string2;

        System.out.println(check);
    }

    public static void ex2_3() {
        /*
            Write a program that reverses an array of Strings
            String[] content = {"you", "are", "how", "hello"}
            Tip. Use for loop and you to start at highest index.
            Output should be: hello how are you?. Note question mark at the end
        */

        String[] content = {"you", "are", "how", "hello"};
        String[] reverseArray = new String[content.length];

        for (int i = 0; i < content.length; i++) {
            reverseArray[i] = content[content.length-i-1];
        }

        System.out.println(Arrays.toString(reverseArray));
    }

    public static void ex2_4() {
        /*
           Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

           Tip:
            - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
            - create variable to store result. double result = 0;
            - convert string to array.
            - then loop.
            - convert each string to decimal and add to current result
        */

        String input = "0.90, 1.00, 9.00, 8.78, 0.01";
        String[] ourArray = input.split(", ");
        double[] doubleArray = new double[ourArray.length];

        double total = 0;

        for (String numString : ourArray) {
            double numDouble = Double.parseDouble(numString);
            total += numDouble;
        }

        System.out.println(total);

    }

    public static void ex2_5() {
        /*
           Write a program that takes arguments from the program args and loops through args and prints each item in args
           Compile using: javac and run using: java
           i.e. javac Exercise5.java | java Exercise5 foo bar baz
        */


    }

    public static String ex3_1(String word) {
        /*
          Write a method that reverses any String and print to console
          Input should be a string
          Output should be reversed input
        */

        String reveresedString = "";

        for (int i = word.length(); i > 0; i--) {
            reveresedString += word.charAt(i-1);
        }

        return reveresedString;

    }

    public static void ex3_2() {
        /*
          Given the following String input
          String input = "   b ri   ght net   work  "
          Write a program that transforms input into: Bright Network
        */

        String input = "   b ri   ght net   work  ";
        input = input.replace(" ", "");
        // removing all spaces

        int nIndex = input.indexOf("n");
        // There is only one "n" so let's target that to introduce the space (as opposed to 2 "t"s)

        String inputWithSpace = input.substring(0, nIndex) + " " + input.substring(nIndex, input.length());
        // adds in a space before the index that we found previously (note that the substring method excludes the index specified)

        String[] wordArray = inputWithSpace.split(" ");
        // creating an array as easiest to iterate over

        String result = "";
        // initialise a result variable that we can add to

        for (String word : wordArray) {
            char firstLetter = word.charAt(0);
            firstLetter = Character.toUpperCase(firstLetter);
            // grabs the first letter and then capitalises it

            String capitalisedWord = firstLetter + word.substring(1);

            result += capitalisedWord;
            // adds the words into our result String
            result += " ";
            // adds in a space after each word
        }

        result = result.trim();
        // removes the extra (trailing) space added in the `for` loop (after "Network")

        System.out.println(result);
    }

    public static void ex3_3(int number) {
        /*
          Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
          You might compile and run the program via command line or by editing configuration and pass program arguments
        */
        if (number % 2 == 0) {
            System.out.println("This number is even!");
        } else {
            System.out.println("This number is odd!");
        }
    }

    public static void ex3_4(int inputNumber) {
        /*
          Write a program that takes an input number from the console and prints if number is prime
          Create a method to check if number is prime then use against the input
        */
        ArrayList<Integer> primeList = new ArrayList<>(){
            {add(2);}
        };
        /* Since we don't know the size of the input (and hence the number of prime numbers less than that)
        we can't use an Array. This funky syntax is us declaring and initialising our ArrayList */

        for (int i = 3; i <= inputNumber; i++) {
        // Note: starts at 3 as all 2 is the first prime number (number must be divisible by only 1 AND itself)
        // "for every number from 3 up to the value provided..."
        Boolean isPrime = true;
            for (int j = 0; j < primeList.size(); j++) {
                // "... and for every prime number we currently have in our array list"
                // "divide our current number by every prime in the list"
                // "if it is divisible by a number, change the "isPrime" boolean to `false`
                /* nice-to-have: "if it is found to be divisible by a number and is the input number provided, print
                the numbers it is divisible by" */
                if (i % primeList.get(j) == 0) {
                    isPrime = false;
                    if (i == inputNumber) {
                        System.out.println("Divisible by: " + primeList.get(j));
                    }
                }
            }
        if (isPrime) {
            primeList.add(i);
        }
    }

        System.out.println("Your input was: " + inputNumber);
        if (primeList.contains(inputNumber)) {
            System.out.println("This is a prime number");
        } else {
            System.out.println("This is not a prime number");
        }


    }


    public static void main(String[] args) {

        ex2_1();
        ex2_2();
        ex2_3();
        ex2_4();

        String reversed = ex3_1("reversethis");
        System.out.println(reversed);

        ex3_2();

        ex3_3(13);
        ex3_3(8);

        ex3_4(123);
        ex3_4(2047);

    }

}
