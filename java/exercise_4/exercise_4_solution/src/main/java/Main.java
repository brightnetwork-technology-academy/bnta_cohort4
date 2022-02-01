import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // QUESTION 1

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }


        // QUESTION 2

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }


        // QUESTION 3

        for (int i = 0; i <= 20; i += 2) {
            System.out.println(i);
        }


        // QUESTION 4

        int[] q4Array = new int[11];

        for (int i = 0; i <= 10; i++) {
            q4Array[i] = i;
        }

        System.out.println(Arrays.toString(q4Array));


        // QUESTION 5

        int[] q5Array = new int[11];

        for (int i = 0; i <= 10; i++) {
            q5Array[i] = i;
        }

        for (int item : q5Array) {
            System.out.println(item);
        }


        // QUESTION 6

        int[] q6Array = new int[11];

        for (int i = 0; i <= 10; i++) {
            q6Array[i] = i;
        }

        int sum = 0;

        for (int number : q6Array) {
            sum += number;
        }

        System.out.println(sum);


        // QUESTION 7

        String[] q7Array = new String[]{"i", "sure", "do", "love", "bees"};

        for (int i = 0; i < q7Array.length; i++) {
            q7Array[i] = q7Array[i].toUpperCase();
        }

        System.out.println(Arrays.toString(q7Array));


        // QUESTION 8

        String[] q8Array = new String[]{"i", "sure", "do", "love", "bees"};

        for (int i = 0; i < q8Array.length; i++) {
            char firstLetter = q8Array[i].charAt(0);
            char capLetter = Character.toUpperCase(firstLetter);
            String capWord = capLetter + q8Array[i].substring(1);
            q8Array[i] = capWord;
        }

        System.out.println(Arrays.toString(q8Array));


        // QUESTION 9

        int[] q9Array = new int[]{1, 6, 17, 9, 20, 5};

        int maxNum = 0;

        for (int number : q9Array) {
            if (number > maxNum) {maxNum = number;}
        }

        System.out.println(maxNum);


    }

}
