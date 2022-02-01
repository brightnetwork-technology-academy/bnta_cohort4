```java
package com.bnta.exercises.week_two_wed.exercises;

public class Exercise1 {

    enum ThirstSize {

    }

    public static void main(String[] args) {
        // create enum to represent t-shirt sizes
    }
}
```

```java
package com.bnta.exercises.week_two_wed.exercises;

public class Exercise2 {

    enum ThirstSize {
        S,
        L,
        M,
        XL,
        XXL
    }

    public static void main(String[] args) {
        // remove the above enum from this class and put it as separate file.
        // you should create a separate class of type enum
        // run this code and should print M
        System.out.println("T Shirt Size: " + ThirstSize.M);
    }
}
```


```java
package com.bnta.exercises.week_two_wed.exercises;

public class Exercise3 {

    public static void main(String[] args) {
        // invoke .values() method on ThirstSize enum and loop through its values and while looping lowercase each value
        // hint: while you loop through enums invoke .name() to convert enum to string. without it, you can't lowercase
    }
}
```


```java
package com.bnta.exercises.week_two_wed.exercises;

public class Exercise4 {

    public static void main(String[] args) {
        // 1 - Print todays Date and Time using LocalDate
        // 2 - Represent your date of birth using LocalDate
        // 3 - Add 100 days to your dob and print it
    }
}
```


```java
package com.bnta.exercises.week_two_wed.exercises;

import java.time.LocalDate;

public class Exercise5 {

    public static void main(String[] args) {
        // write a method that calculate age on any given date
    }

    private int calculateAge(LocalDate date) {
        // hint: subtract todays date[year] - date[year]
        return -1;
    }
}
```


```java
package com.bnta.exercises.week_two_wed.exercises;

public class Exercise6 {

    public static void main(String[] args) {
        // try catch
        // write a program that converts program arguments to an integer
        // if value cannot be converted to int store them somewhere
        // calculate sum for numbers that can be converted to an integer
        // finally print the numbers that cannot be converted to an int
        // example: java com.bnta.exercises.week_two_wed.exercises.Exercise6 1 2 a b foo 3
        // output: Sum: 6 and a, b, foo are not numbers.
    }

}
```

```java
package com.bnta.exercises.week_two_wed.exercises;

public class Exercise7 {
    // create a method that sums days of the month for a given array of LocalDate
}
```

```java
package com.bnta.exercises.week_two_wed.exercises;

public class Exercise8 {

    public static void main(String[] args) {
        int result = 10 / 0;
        // run the above code see what error you get
        // then surround it with try catch block and catch the exception that was thrown. Inside catch the catch block print "cannot divide by 0"
        /*
            try {
            } catch() {
            }
         */
    }
}

```


```java
package com.bnta.exercises.week_two_wed.exercises;

public class Exercise9 {

    public static void main(String[] args) {
        // try catch
        // write a program that converts program arguments to and integer
        // if value cannot be converted to int store them somewhere
        // calculate sum for numbers that can be converted to an integer
        // finally print the numbers that cannot be converted to an int
        // example: java com.bnta.exercises.week_two_wed.exercises.Exercise6 1 2 a b foo 3
        // output: Sum: 5 and a, b, foo are not numbers.
    }

}

```