import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
            Write a program that compares two numbers. i.e x > y
            Create 3 variables.
            2 to store both numbers and 1 to store the result
            Print the result
        */

        int number1 = 3;
        int number2 = 5;

        boolean numberCheck = number1 > number2;

        System.out.println(numberCheck);


        /*
            Write a program that compares two String contents.
            Create 3 variables.
            2 to store both strings and 1 to store the result
            Print the result
        */

        String string1 = "Hello!";
        String string2 = "Hello!";

        boolean stringCheck = string1.equals(string2);

        System.out.println(stringCheck);


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
        String[] numbers = input.split(", ");

        double total = 0;

        for (String numString : numbers) {
            double numDouble = Double.parseDouble(numString);
            total += numDouble;
        }

        System.out.println(total);


        /*
           Write a program that takes arguments from the program args and loops through args and prints each item in args
           Compile using: javac and run using: java
           i.e. javac Exercise5.java | java Exercise5 foo bar baz
        */

        for (String arg : args) {
            System.out.println(arg);
        }
    }

}
