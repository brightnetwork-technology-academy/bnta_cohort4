public class Methods {

    /**
     *
     * Write the code for each exercise under the numbered comments.
     *
     * To test your code you can call the method from inside the main method. If your method should return something you
     * can store the return value as a variable in main then print the variable.
     *
     */

    /**
     * EXAMPLE: A method which takes a number as an argument and multiplies it by 2. The result is printed to the
     * terminal.
     */

    public static void multiplyNumberByTwo(int number){
        int product = number * 2;
        System.out.println(number + " multiplied by 2 is " + product);
    }

    /**
     * Exercise 1: A method which takes two numbers as arguments and prints their sum to the terminal.
     */

    public static void printSumOfNumbers(int number1, int number2){
        int sum = number1 + number2;
        System.out.println("The sum of the numbers is " + sum);
    }

    /**
     * Exercise 2: A method which takes a number as an argument and returns that number negated, e.g. passing 5 as
     * an argument should return -5; passing -10 should return 10.
     */

    public static int negateNumber(int number){
        return number * -1;
    }

    /**
     * Exercise 3: A method which takes two numbers as arguments, checks if they are the same and returns the appropriate
     * boolean value.
     *
     * You should check *both* possible outcomes here, i.e. that it returns `true` when it is supposed to and `false` when
     * it is supposed to.
     */

    public static boolean checkIfNumbersAreEqual(int number1, int number2){
        boolean result = number1 == number2;
        return result;
    }

    /**
     * Exercise 4: A method which takes two numbers as arguments and *prints* one of:
     * - "The first number is larger"
     * - "The second number is larger"
     * - "The numbers are equal"
     * as appropriate.
     */

    public static void compareNumbers(int number1, int number2){
        if (number1 > number2){
            System.out.println("The first number is larger");
        }
        else if (number1 < number2){
            System.out.println("The second number is larger");
        }
        else {
            System.out.println("The numbers are equal");
        }
    }


    /**
     * Exercise 5: A method which takes a string as an argument, capitalises the *first* letter and returns the
     * capitalised string.
     *
     * HINT: The .toUpperCase() method will capitalise the whole string. Investigate how to split the first letter from
     * the string, capitalise that, then join the pieces back together
     */

    public static String capitaliseFirstLetter(String input){
        String firstLetter = input.substring(0,1).toUpperCase();
        String restOfWord = input.substring(1);
        String fullString = firstLetter + restOfWord;
        return fullString;
    }


    /**
     * Exercise 6: A method which takes an array of strings as an argument and returns the number of items in the array.
     */

    public static int countArrayElements(String[] strings){
        return strings.length;
    }

    /**
     * Exercise 7: A method which takes a sentence as an argument, counts the number of words in it and prints
     * "The sentence contains X words"
     *
     * HINT: Remember what you've done already, you might be able to reuse one of your methods here...
     */

    public static void countWordsInSentence(String sentence){
        String[] words = sentence.split(" ");
        int wordCount = countArrayElements(words);
        System.out.println("The sentence contains " + wordCount + " words");
    }





    public static void main(String[] args) {
        /**
         * Call your methods on the lines below ⬇️
         */
        multiplyNumberByTwo(2);
    }

}
