public class Main {

    public static void main(String[] args) {

    }

    /* Write a method that reverses any String and print to console
       Input should be a string
       Output should be reversed input
    */
    public static String reverseString(String word) {
        String reversedString = "";

        for (int i = word.length(); i > 0; i--) {
            reversedString += word.charAt(i-1);
        }

        return reversedString;
    }


    /* Given the following String input
       String input = "   b ri   ght net   work  "
       Write a program that transforms input into: Bright Network
    */
    public static void stringTransformer(String input) {
        // removing all spaces
        input = input.replace(" ", "");

        // There is only one "n" so let's target that to introduce the space (as opposed to 2 "t"s)
        int nIndex = input.indexOf("n");

        // adds in a space before the index that we found previously (note that the substring
        // method excludes the index specified)
        String inputWithSpace = input.substring(0, nIndex) + " "
                + input.substring(nIndex, input.length());

        // creating an array as easiest to iterate over
        String[] wordArray = inputWithSpace.split(" ");

        // initialise a result variable that we can add to
        String result = "";

        for (String word : wordArray) {
            char firstLetter = word.charAt(0);
            // grabs the first letter and then capitalises it
            firstLetter = Character.toUpperCase(firstLetter);
            String capitalisedWord = firstLetter + word.substring(1);

            // adds the words into our result String
            result += capitalisedWord;

            // adds in a space after each word
            result += " ";
        }

        // removes the extra (trailing) space added in the `for` loop (after "Network")
        result = result.trim();

        System.out.println(result);
    }


    /* Write a program that receives numbers as program arguments and prints to console if
    numbers are even or odd.
    You might compile and run the program via command line or by editing configuration and
    pass program arguments
    */
    public static void oddEvenChecker(int number) {

        if (number % 2 == 0) {
            System.out.println("This number is even!");
        } else {
            System.out.println("This number is odd!");
        }
    }



    /* Write a program that takes an input number from the console and prints if number is
        prime.
       Create a method to check if number is prime then use against the input.
    */
    public static boolean primeChecker(double inputNumber) {
        // Parameter needs to be a double. If we pass an int here then the result of any
        // calculation gets rounded to an int

        // Multiplication is commutative, so no need to check factors beyond the square root
        double limit = Math.floor(Math.sqrt(inputNumber));

        // Check each number from 2 up to limit
        for (double i = 2; i<= limit; i++){
            // Divide input by each possible factor. If the result is the same after trimming any
            // trailing decimal then it is a whole number, meaning i is a factor of the input and the
            // input isn't prime
            double quotient = inputNumber / i;
            if (quotient == Math.floor(quotient)){
                return false;
            }
        }
        // If we didn't find any factors the number must be prime
        return true;
    }

    public static void printIfPrime(int number){
        // Prime numbers have to be greater than 1, so check for that first
        if (number <= 1){
            System.out.println("That can't be prime!");
            return;
        }
        // Store the result in a variable
        boolean isPrime = primeChecker(number);
        // Check result and print correct message
        if (isPrime){
            System.out.println(number + " is prime.");
        }
        else {
            System.out.println(number + " isn't prime.");
        }
    }


    /*
        Create a package called email
        Then have a method called validateEmail that return true of false if input is valid email
        Finally invoke validateEmail in main
            i.e. "hello@gmail.com" -> true
            i.e. "hellogmail.com" -> false
    */
    public static boolean validateEmail(String emailAddress){
        return emailAddress.contains("@");
    }



    /*
        Write a method that finds the longest string in any given array.
        i.e. [] -> ""
        i.e. ["hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
    */
    public static String findLongestString(String[] strings){
        // Initialise an empty String
        String longestString = "";

        // loop over Array passed in
        for (String string : strings) {
            // if the next string in the array is longer than the current longestString,
            // replace it
            if (string.length() > longestString.length()){
                longestString = string;
            }
        }

        // return the longest String found
        return longestString;
    }

}
