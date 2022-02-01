import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }


    // QUESTION 1

    public static void takeAndPrintInput(){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(input);
    }



    // QUESTION 2
    public static void getInputUpperCaseAndPrint(){
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        input = input.toUpperCase();

        System.out.println(input);
    }


    // QUESTION 3
    public static void printLinesFromInputFile(){
        File file = new File("/path/to/your/file.txt");

        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException exception){
            exception.printStackTrace();
        }

        while(scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(input);
        }
    }
}
