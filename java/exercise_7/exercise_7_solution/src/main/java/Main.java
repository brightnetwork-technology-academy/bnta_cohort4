public class Main {

    public static void main(String[] args) {

        // QUESTION 1

        int firstQ1Int = 5;
        int secondQ1Int = 7;

        if (secondQ1Int > firstQ1Int) {
            System.out.println("The second is larger than the first!");
        }


        // QUESTION 2

        String firstQ2Str = "Hello!";
        String secondQ2Str = "Hello!";

        if (firstQ2Str == secondQ2Str) {
            System.out.println("The strings match!");
        }


        // QUESTION 3

        String firstQ3Str = new String("Hello!");
        String secondQ3Str = new String("Hello!");

        // this `if` statement is not satisfied so nothing prints
        if (firstQ3Str == secondQ3Str) {
            System.out.println("The strings match!");
        }

        if (firstQ3Str.equals(secondQ3Str)) {
            System.out.println("The strings match if we use the .equals() method!");
        }


        // QUESTION 4

        int firstQ4Int = 15;
        int secondQ4Int = 7;

        if (secondQ4Int > firstQ4Int) {
            System.out.println("The second is larger than the first!");
        } else {
            System.out.println("The first is larger than the second!");
        }


        // QUESTION 5

        int firstQ5Int = 15;
        int secondQ5Int = 7;
        int thirdQ5Int = 30;

        if (firstQ5Int > secondQ5Int && firstQ5Int < thirdQ5Int) {
            System.out.println("The first value sits between the second and third!");
        } else {
            System.out.println(firstQ5Int + " is not between " + secondQ5Int + " and "
                    + thirdQ5Int);
        }


        // QUESTION 6 EXAMPLE SOLUTION

        int firstQ6Int = 15;
        int secondQ6Int = 7;
        int thirdQ6Int = 30;

        if (firstQ6Int > secondQ6Int || firstQ6Int < thirdQ6Int) {
            System.out.println("The first value sits between the second and third!");
        } else {
            System.out.println(firstQ6Int + " is not between " + secondQ6Int + " and "
                    + thirdQ6Int);
        }



        // QUESTION 7

        String q7String = "Elephant";

        if (Character.toLowerCase(q7String.charAt(0)) == 'e') {
            System.out.println("The first letter is E!");
        }



        // QUESTION 8

        String q8String = "Elephant";
        char charCheck = 'e';

        for (int i = 0; i < q8String.length(); i++) {
            if (Character.toLowerCase(q8String.charAt(i)) == charCheck) {
                System.out.println("The letter was found! Index: " + i);
            }
        }


    }
}
