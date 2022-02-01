# BNTA Course Notes - Java

## Scanners - Taking User Input

[Official Oracle Docs - Scanners](https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html)

Whether you're a beginner looking to add a little pizazz to your functionality, checking for edge cases, or building a full CLI project, `java.util.Scanner` provides an easy means for user input from the terminal.



## Creating an instance of a Scanner

To make use of the functionality provided within the `Scanner` class, we first need to create an instance of said class within our application. To do this, we follow the same process for declaring variables as we have seen in our other applications:

```java
Scanner ourScanner = new Scanner(System.in);

// Type, Name, `new` keyword, Type, (what the scanner watches)
```

You will notice that we've passed in an argument when initialising our `Scanner()`, namely `System.in`. This is as the `Scanner` class can be used to read not only from the terminal but from other sources as well, such as from a file or stream. 



## Reading from our Scanner

### Consumption Methods

Scanners are pretty neat, they've got a lot of included functionality which allows you to perform simple filtering on the input as it enters your application. Scanners do as they say on the tin: they *scan* over some input, which allows us to construct these different "filtering" methods. Scanners, hence are built to look at and **define some information** about an input, with adjoined methods for **making use of this input** also provided. This nuance can be difficult to appreciate without having a good play about with Scanners, so to put it a different way: know that Scanners have two rough sets of methods, one that deals with *scanning* (checking the input against some parameter) and *consuming* (actually inputting the value into your application).

Before we look more at these "scanning" methods however, let's look at the basic `.nextLine()` method. This is our most basic **consumption** method. It takes the next line within the input, whether this be from *e.g.* the terminal or a file, skips over it, placing the Scanner's placement (or cursor, as it were) at the beginning of the next line, and then passes the line that it has skipped over into your application. If you're looking simply for a way to **input a string into your application** then the `.nextLine()` method would be a great place to start.

```java
Scanner ourScanner = new Scanner(System.in);

String input = ourScanner.nextLine();

// > user input: "Hello!"

System.out.println(input);
// Hello!
```

The `.nextLine()` method, however, only works for String inputs. There are, of course, equivalent methods for other types such as `.nextInt()`, `.nextBoolean()` and `.nextFloat()`. Later, when you look at input streams (and this is something that some HackerRank exercises make use of), you could make use these methods to "filter" out the input you are looking for, by type.

*NOTE:* If you are using a Scanner for user input from the terminal, anything provided will always be of String type.

### Scanning Methods

When you begin to build larger applications, with varying input and output values, you will begin to encounter the need for validation. Say you want to implement the same behaviour as in the previous example, but that you want it to print each line sequentially for an input with an undetermined number of lines. We've seen `while` loops previously, so we know that we have a means to continue an operation until some condition is met, but currently we don't have a way to check this condition. 

*How do we know that the input still has lines that we haven't printed, and hence that it should continue running?*

This is where **scanning** methods come in. These methods all return a Boolean value and similar to the `.next~` methods above, there are ones for each primitive type. The generic method, which is how we also check for Strings, is the `.hasNextLine()` method. There is also the `.hasNext()` method which checks for another *token* rather than a line.

Let's have a look a multi-line input example which also makes use of simple File input. Note that my text file is situated at `~/Users/iainsandison/input.txt`

```txt
This
Is
Our
Input
File
```

```java
File inputFile = new File("/Users/iainsandison/input.txt");
// Create a File object from our text file

Scanner ourScanner = new Scanner(inputFile);
// Create a Scanner object which takes in our File object

while(ourScanner.hasNext()) {
// A while loop which checks if there is another line in the text file

    System.out.println("There's another line!");
    
    String input = ourScanner.nextLine();
    // Note that we need to include a consumption method still to make use of the input
    
    System.out.println(input);
    
}

// There's another line!
// This
// There's another line!
// Is
// There's another line!
// Our
// There's another line!
// Input
// There's another line!
// File
```


## Exercises

### 1. Take an input string from the user (from the terminal) and print it back out

```java
// QUESTION 1

public static void main(String[] args) {
    // create a Scanner object - remember to import `java.util.Scanner` at the top of your file!
    // create a variable which is assigned to the value passed into the scanner from the terminal
    // print this variable
}
```


### 2. Take an input string from the user, make the word uppercase and then print it back out

```java
// QUESTION 2

public static void main(String[] args) {
    // create a Scanner object - remember to import `java.util.Scanner` at the top of your file!
    // create a variable which is assigned to the value passed into the scanner from the terminal
    // make the input string uppercase
    // print this variable
}
```

### 3. Print each line from an input file

```java
// QUESTION 3

public static void main(String[] args) {
	// create a File object from a text file
	// create a Scanner object from out File object
	// create a loop which checks whether there is still some unused input
	// create a local variable which is assigned to the next line of the input
	// print the line to the console
}
```

## Example Solutions

```java
// QUESTION 1 EXAMPLE SOLUTION

Scanner ourScanner = new Scanner(System.in);

String input = ourScanner.nextLine();

System.out.println(input);

```

```java
// QUESTION 2 EXAMPLE SOLUTION

Scanner ourScanner = new Scanner(System.in);

String input = ourScanner.nextLine();
input = input.toUpperCase();

System.out.println(input);
```

```java
// QUESTION 3 EXAMPLE SOLUTION

File inputFile = new File("/Users/iainsandison/input.txt");

Scanner ourScanner = new Scanner(inputFile);

while(ourScanner.hasNext()) {
    String input = ourScanner.nextLine();
    System.out.println(input);
}
```