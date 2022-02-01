public class ArgChecker {

    // Question 6

    public static void main(String[] args) {

        int sum = 0;

        String[] invalidInputs = new String[args.length];

        for (int i = 0; i <args.length; i++) {
            try {
                sum += Integer.parseInt(args[i]);
            } catch (NumberFormatException exception){
                invalidInputs[i] = args[i];
            }
        }

        System.out.println("Sum: " + sum);
        System.out.println("Invalid inputs: ");
        for (String invalidInput : invalidInputs) {
            if (invalidInput != null) {
                System.out.println(invalidInput);
            }
        }
    }

}
