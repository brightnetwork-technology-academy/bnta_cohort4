import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // Question 1

        int[] intArray = new int[3];


        // Question 2

        System.out.println(Arrays.toString(intArray));


        // Question 3

        Arrays.fill(intArray, 4);

        System.out.println(Arrays.toString(intArray));


        // Question 4

        intArray[1] = 17;

        System.out.println(Arrays.toString(intArray));


        // Question 5

        String[] strArray = new String[]{"a", "b", "c", "d"};

        System.out.println(Arrays.toString(strArray));


        // Question 6

        String[] strArray2 = strArray;
        strArray2[0] = "z";

        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(strArray2));

        /**
         * The value at index `0` for **both** arrays has been altered. This is because both of our
         * arrays are pointing to the same space in memory, and hence the same exact information.
         * Changing one will thus change the other. This has its own use-case, but if we were
         * wanting to create a discrete copy of our original array, we should use a different
         * method...
         */


        // Question 6b

        String[] strArray3 = Arrays.copyOf(strArray, strArray.length);
        strArray3[0] = "z";

        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(strArray3));


        // Question 7

        for (String item : strArray) {
            System.out.println(item);
        }


        // Question 8

        int[] numberArray = new int[10];

        for (int i = 0; i < 10; i++) {
            numberArray[i] = i+1;
        }

        System.out.println(Arrays.toString(numberArray));


        // Question 9

        int[] newNumberArray = new int[10];

        for (int i = 0; i < 10; i++) {
            newNumberArray[i] = i+1;
        }

        System.out.println(Arrays.toString(newNumberArray));

        for (int i = 0; i < newNumberArray.length; i++) {
            newNumberArray[i] = newNumberArray[i]*2;
        }


        // Question 10

        String[] newStringArray = new String[]{"a", "b", "c", "d"};

        String condition = "c";
        boolean hasC = false;

        for (String item: newStringArray){
            if (item == condition) {
                hasC = true;
            }
        }

        if (hasC) {
            System.out.println(condition + " is in the array!");
        }
        else {
            System.out.println("The condition was not met");
        }



    }

}
