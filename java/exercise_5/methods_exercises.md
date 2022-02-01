# Exercises - Methods

In each of these exercises you need to write a method which will either **print** to the terminal or **return** a value. You can test your code by calling the method from within `main`. If it returns a value you can store it in a variable and then print that.

### Example

Write a method which takes a number as an argument, multiplies it by two and prints the result to the terminal.

```java
    public static void multiplyNumberByTwo(int number){
    	int product = number * 2;
    	System.out.println(number + " multiplied by 2 is " + product);
    }
    
    public static void main(String[] args) {
    	multiplyNumberByTwo(2);	    
    }
    
    // Prints "2 multiplied by 2 is 4" to the terminal
```

### Exercise 1

Write a method which takes two numbers as arguments and prints their sum to the terminal.

### Exercise 2

Write a method which takes a number as an argument and returns that number negated, e.g. passing `5` as an argument should return `-5`; passing `-10` should return `10`.

### Exercise 3

Write a method which takes two numbers as arguments, checks if they are the same and returns the appropriate boolean value.

You should check *both* possible outcomes here, i.e. that it returns `true` when it is supposed to and `false` when it is supposed to.

### Exercise 4

Write a method which takes two numbers as arguments and prints one of:

- "The first number is larger"
- "The second number is larger"
- "The numbers are equal"

as appropriate.

### Exercise 5

Write a method which takes a string as an argument, capitalises the **first** letter and returns the capitalised string.

HINT: The `.toUpperCase()` method will capitalise the whole string. Investigate how to split the first letter from the string, capitalise that, then join the pieces back together

### Exercise 6

Write a method which takes an array of strings as an argument and returns the number of items in the array.

### Exercise 7

Write a method which takes a sentence as an argument, counts the number of words in the array and prints "The sentence contains X words".

HINT: Remember what you've done already, you might be able to reuse one of your methods here...