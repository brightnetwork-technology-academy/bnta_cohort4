# BNTA Course Notes - Java

## Conditionals Questions

## The `if` statement

The first few examples are going to be running through the same exercise but with us using different comparison operators.

### A Boolean

Before we jump into the `if` statements proper, let's have a quick look at how we can create a conditional check which returns a boolean value. Booleans can only be `true` or `false`:

```java
// Boolean variableName = {conditional check}

Boolean numberCheck = 5 > 4;

System.out.println(numberCheck);
// true


int ourNumber = 5;

Boolean numberCheck2 = ourNumber > 4;

System.out.println(numberCheck2);
// true
```

These types of conditional checks are what we use within out `if` statements.

### Comparison Operators

There are a few different comparison operators which are outlined in the table below:

| Operator                 | Sign | Example |
|--------------------------|------|---------|
| Equal to                 | ==   | a==b    |
| Not equal to             | !=   | a!=b    |
| Less than                | <    | a<b     |
| Greater than             | >    | a>b     |
| Less than or equal to    | <=   | a<=b    |
| Greater than or equal to | >=   | a>=b    |

Have a go creating different Boolean-type variables, each time printing the output of the check. Move onto the next section once you're happy with these operators and how we can create different conditional checks.

### Logical Operators

Logical operators are used to combine **2 more or more** comparison operators. The logical AND and OR operator are shown below:

| Operator | Sign | Example |
|----------|------|---------|
| AND      | &&   | a==b    |
| OR       | \|\| | a!=b    |

One thing to note here is that when you are chaining these conditions together, you need to be explicit about the whole comparison for each step. For instance, you may be wanting to check the value of a variable called `ourNumber`, checking if it is above `3` but less than `7`. In English, we would say *"Is ourNumber greater than 3 and less than 7"* whereas when writing this out, you need to respecify what you are comparing against, *e.g.*:

*"Is ourNumber greater than 3? Additionally, is ourNumber less than 7?"*

Putting this into code, we would get:

```java
int ourNumber = 5;

Boolean numberCheck = (ourNumber > 3 && ourNumber < 7);

System.out.println(numberCheck);
// true

```
Again, spend a little time with the logical AND and OR operators. Move on when you are comfortable with how they work.

### Creating an `if` statement

An `if` statement simply takes one of our Boolean checks above and makes it into a kind of "gate" within our application. This allows us to create a coding application which has a varying "route" throughout it—allowing us to provide it with different inputs which yield different results.

The form of an `if` statement is hence:

```java
if (condition) {exprIfTrue}
```

And a basic example could be:

```java
int ourNumber = 5;

if (ourNumber > 4) {
	System.out.println(ourNumber + " is greater than 4!");
	// 5 is greater than 4!
}
```

### The `else` keyword

We use the `else` keyword in conjunction with an `if` statement to optionally provide some alternative functionality for if the condition within our statement isn't satisfied. This is use as shown below:

```java
int ourNumber = 3;

if (ourNumber > 4) {
	System.out.println(ourNumber + " is greater than 4!");
} else {
	System.out.println(ourNumber + " is NOT greater than 4!");
}
```
Note that in the example above, we've changed `ourNumber` to be `3` and so if we were to run this code, our condition would not be satisfied and hence the functionality within out `else` statement would run. *"3 is NOT greater than 4!"*



## `if` Statement Exercises

### 1. An `if` statement

Simply create an `if` statement which checks if an Integer-type variable is equal to another

```java
// QUESTION 1

public static void main(String[] args) {
	// create an integer variable
	// create a second integer variable
	// create an `if` statement which compares the two variables and prints to the console if they are equal
}
```

### 2. Comparison of Strings Part I

In this exercise, please use the shortened form of declaring a String-type variable (*e.g.* `String myString = "Hello!"`)

```java
// Question 2

public static void main(String[] args) {
	// create a string variable
	// create a second string variable which has the same value as the first
	// create an `if` statement which compares the two variables and prints to the console if they are equal
}

```

### 3. Comparison of String Part II

Repeat the same exercise as above, but this time ensure that you are creating a `new` string object for both variables (*e.g.* `String myString = new String("Hello!")`)

```java
// QUESTION 3

public static void main(String[] args) {
	// create an string variable using the `new` keyword
	// create a second string variable which has the same value as the first, again using the `new` keyword
	// create an `if` statement which compares the two variables and prints to the console if they are equal
}
```

How strange. We have two variables that are being assigned the same String value but they aren't equal? Why is this?

Try changing your answer to instead use the `.equals()` method. Does this change how your code behaves at all?

### 4. Greater than `>`

Similar to Question 1, now create an `if` statement which checks if one Integer value is greater than the other. Include an `else` statement here for if the condition is not satisfied.

```java
// QUESTION 4

public static void main(String[] args) {
	// create two `int` variables. Assign them values
	// create an `if` statement which compares whether one value is greater than the other
	// print something to the console if the condition is met
	// create an `else` statement which prints to the console if the above condition is NOT met
}
```

### 5. Logical AND `&&`

Expanding on your answer to Question 4, create a third Integer value and modify your `if` statement to check if the first value is greater than the second **and** less than the third.

```java
// QUESTION 5

public static void main(String[] args) {
	// create three `int` variables. Assign them values with the first value sitting between the other two
	// create an `if` statement which compares whether the first value is greater than the second AND less than the third
	// print something to the console if the condition is met
	// create an `else` statement which prints to the console if the above condition is NOT met
}
```

### 6. Logical OR `||`

Modify your answer to Question 5 to instead use an OR operator. Play about with the values assigned to your three variables, noting how the behaviour changes.



### 7. Checking the first letter of a string

In this example, we're going to try something a tad more involved. Let's make an `if` statement which checks if a String starts with a specified character. In this example, try using the `.charAt()` method which can be applied to strings within your `if` statement. Bear in mind that this method will yield a Character-type value, which will need to be compared against another Character within the condition. To create an inline variable of Character type, try using single quotes `'` instead of double quotes `"`.

```java
// QUESTION 7

public static void main(String[] args) {
	// create a String variable and assign it a value
	// create an `if` statement which grabs the first letter of your word and compares it against a Character value
	// print something to the console if the condition is met
}
```

Can you think of a way to make this check case insensitive?



### 8. An `if` within a `for` loop

In this final example, let's go one more step further and introduce a `for` loop to our previous answer. The idea is to use a `for` loop to check if the provided character is present at **any** point within our word.

```java
// QUESTION 8

public static void main(String[] args) {
	// create a String variable and assign it a value
	// create a `for` loop which wraps around your answer from Question 7
	// modify your `if` statement to check the character at each index
	// Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
	// print something to the console if the condition is met
}
```

Once you get this working, try replacing using a word which contains your provided character multiple times (if you haven't already). How does your application behave? Do you have any unintended behaviour?

If you do have some unintended behaviours, such as additional printed statements, how could you fix them?

Hint: The `break` keyword


## Solutions 

```java
// QUESTION 1 EXAMPLE SOLUTION

int firstInt = 5;
int secondInt = 7;

if (secondInt > firstInt) {
    System.out.println("The second is larger than the first!");
}
```

```java
// QUESTION 2 EXAMPLE SOLUTION

String firstStr = "Hello!";
String secondStr = "Hello!";

if (firstStr == secondStr) {
    System.out.println("The strings match!");
}

```

```java
// QUESTION 3 EXAMPLE SOLUTION

String firstStr = new String("Hello!");
String secondStr = new String ("Hello!");

if (firstStr == secondStr) {
    System.out.println("The strings match!");
}
// this `if` statement is not satisfied so nothing prints


if (firstStr.equals(secondStr)) {
	System.out.println("The strings match if we use the equals method!");
}
// The strings match if we use the equals method!
```

When creating String values using the `new` keyword, we create new areas within memory which our values sit within. The **reference address** is what the double equals `==` compares, and since we are creating both our variables in the above example with the `new` keyword, they are not equal.

We can take a look at the reference address of items by using the `System` class. Note that this is for illustrative purposes only and that these values will likely vary between this example and your system.

```java

System.out.println(System.identityHashCode(firstStr));
// 1523554304

System.out.println(System.identityHashCode(secondStr));
// 1175962212
 
```

This Baeldung article goes through some additional examples of how this all works:

[Baeldung - Comparing Strings in Java](https://www.baeldung.com/java-compare-strings)

```java
// QUESTION 4 EXAMPLE SOLUTION

int firstInt = 15;
int secondInt = 7;

if (secondInt > firstInt) {
    System.out.println("The second is larger than the first!");
} else {
    System.out.println("The first is larger than the second!");
}
```

Note that in the above example, we have based it directly off of our answer to Q1 but that `firstInt` is now `15` not `5`

```java
// QUESTION 5 EXAMPLE SOLUTION

int firstInt = 15;
int secondInt = 7;
int thirdInt = 30;

if (firstInt > secondInt && firstInt < thirdInt) {
    System.out.println("The first value sits between the second and third!");
} else {
    System.out.println(firstInt + " is not between " + secondInt + " and " + thirdInt);
}
```

```java
// QUESTION 6 EXAMPLE SOLUTION

// same as above but with:
...

if (firstInt > secondInt || firstInt < thirdInt_ { ...

```

```java
// QUESTION 7 EXAMPLE SOLUTION

String ourString = "Elephant";

if (Character.toLowerCase(ourString.charAt(0)) == 'e') {
    System.out.println("The first letter is E!");
}

```

To make the solution case-insensitive, wrap your gained character within the `Character.toLowerCase()` method.

```java
// QUESTION 8 EXAMPLE SOLUTION

String ourString = "Elephant";
Character charCheck = 'e';

for (int i = 0; i < ourString.length(); i++) {
    if (Character.toLowerCase(ourString.charAt(i)) == charCheck) {
        System.out.println("The letter was found! Index: " + i);
    }
}
```

This solution prints out two lines, as there as two `e`s in `Elephant`.

```java

The letter was found! Index: 0
The letter was found! Index: 2
 
```

If we were wanting our functionality to check through a provided value for a specified value and to **stop** upon finding one, we could introduce a `break` value as so:

```java

String ourString = "Elephant";
Character charCheck = 'e';

for (int i = 0; i < ourString.length(); i++) {
    if (Character.toLowerCase(ourString.charAt(i)) == charCheck) {
        System.out.println("The letter was found! Index: " + i);
        break;
    }
}
    
```

When executed, the `break` keyword ends the current `for` loop or `switch` statement that it is in.
