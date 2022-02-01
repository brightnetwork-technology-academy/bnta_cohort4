import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Main {

    public static void main(String[] args) {

        // Question 2

        System.out.println("T-Shirt size: " + TShirtSize.M);


        // Question 3

        TShirtSize[] sizes =  TShirtSize.values();

        for (TShirtSize size : sizes) {
            System.out.println(size.name().toLowerCase());
        }


        // Question 4

        System.out.println("Today's date: " + LocalDate.now());
        System.out.println("Current time: " + LocalTime.now());

        LocalDate myBirthday = LocalDate.of(1987, Month.JUNE, 12);

        System.out.println("My birthday is " + myBirthday.toString());
        System.out.println("100 days later it was be " + myBirthday.plusDays(100).toString());



        // Question 8

        try{
            int result = 10 / 0;
        } catch (ArithmeticException exception){
            System.out.println("Can't divide by zero!");
        }

    }


    // Question 5

    public static int calculateAge(LocalDate date){
        int thisYear = LocalDate.now().getYear();
        int birthYear = date.getYear();

        int age = thisYear - birthYear;

        if (LocalDate.now().getMonthValue() < date.getMonthValue()){
            return age - 1;
        }
        else if (LocalDate.now().getMonthValue() == date.getMonthValue() &&
                    LocalDate.now().getDayOfMonth() < date.getDayOfMonth()){
            return age - 1;
        }
        else{
            return age;
        }
    }


    // Question 7
    public static int sumDaysOfMonths(LocalDate[] dates){
        int total = 0;

        for (LocalDate date : dates) {
            total += date.getDayOfMonth();
        }

        return total;
    }


}
