# BNTA Course Notes - Java

## Working with Arrays


### 1. Declaring an integer array of length 3

```java
// QUESTION 1

public static void main(String[] args) {

	// declare an empty integer array of length = 3

}
```



### 2. Printing an array to the console - `Arrays.toString()`

```java
public static void main(String[] args) {

	// using your array from Q1, print the contents to the console

}
```



### 3. Putting information into our array with `.fill()`

```java
// QUESTION 3

public static void main(String[] args) {

	// using your array from Q1, fill it with the number `4`
	// print the array to the console

}
```



### 4. Assigning a value to an array by index

```java
// QUESTION 4

public static void main(String[] args) {

	// adding onto your code from questions 1-3, reassign the second value in the array to the number `17` 
	// print the array to the console

}
```

What happens if you try to assign a value to an index outwith the bounds of the array?
Also, what happens if you try to put in a floating point number such as `6.7`?



### 5. Declaring and initialising an Array in one

```java
// QUESTION 5

public static void main(String[] args) {

	// declare and initialise a String array which holds the values "a", "b", "c" and "d"
	// print the array to the console

}
```



### 6. Creating an array from another

```java
// QUESTION 6a

public static void main(String[] args) {

	// using your answer to Q5, create a second array which is initialised using your original array
	// hint: instead of using the `new` keyword, try simply giving the name of your original array
	// change the value at index 0 of the new array to "z"
	// print both of your arrays and compare

}
```

Why is this output maybe not what you were expecting?

```java
// QUESTION 6b

public static void main(String[] args) {

	// using your answer to Q5, create another array which is A COPY off of your original array (using the `Arrays.copyOf()` method)
	// NOTE that the `.copyOf()` method accepts two arguments, first being the array that's being copied and second being the length of the new array
	// change the value at index 0 of the new array to "z"
	// print both of the arrays and compare

}
```

Have a play about with the second argument. What happens if it's greater or less than the length of the initial array?



### 7. Looping over an array - print

```java
// QUESTION 7

public static void main(String[] args) {

	// using your array from Q5, create a `for` loop which prints each item in the array

}
```

### 8. Looping over an array - initialisation

```java
// QUESTION 8

public static void main(String[] args) {

	// declare a new array which can hold the numbers from 1-10 (inclusive)
	// create a `for` loop which initialises this array with the numbers 1-10
	// print the array to the console

}
```

### 9. Looping over an array - reassignment

```java
// QUESTION 9

public static void main(String[] args) {

	// adding onto your example from Q9, now create a second `for` loop which reassigns each value in the array to be double the initial value
	// again print the array

}
```

If you used a generic `for` loop in your answer, try implementing your solution using an enhanced `for` loop!

### 10. Looping to check for a specified value

```java
// QUESTION 10

public static void main(String[] args) {

	// start from your solution to Q5
	// create a String variable called `condition` which has the value "c"
	// create a Boolean variable called `hasC` which has the value `false`
	// create a `for` loop which goes through each item in our array, comparing it against our `condition` variable
	// if the two are equal, change the `hasC` value to `true`
	// once the `for` loop concludes, print out a message which tells you if `hasC` is `true` or `false`

}
```

Change the value of your `condition` variable to see how your functionality behaves if the condition is not satisfied.



## Solutions

```java
// QUESTION 1 EXAMPLE SOLUTION

int[] intArray = new int[3];
```



```java
// QUESTION 2 EXAMPLE SOLUTION

int[] intArray = new int[3];

System.out.println(Arrays.toString(intArray));
// [0, 0, 0]
```



```java
// QUESTION 3 EXAMPLE SOLUTION

int[] intArray = new int[3];

System.out.println(Arrays.toString(intArray));
// [0, 0, 0]

Arrays.fill(intArray, 4);

System.out.println(Arrays.toString(intArray));
//  [4, 4, 4]
```



```java
// QUESTION 4 EXAMPLE SOLUTION

int[] intArray = new int[3];

System.out.println(Arrays.toString(intArray));
// [0, 0, 0]

Arrays.fill(intArray, 4);

System.out.println(Arrays.toString(intArray));
//  [4, 4, 4]

intArray[1] = 17;

System.out.println(Arrays.toString(intArray));
// [4, 17, 4]
```



```java
// QUESTION 5 EXAMPLE SOLUTION

String[] strArray = new String[]{"a", "b", "c", "d"};

System.out.println(Arrays.toString(strArray));
// [a, b, c, d]
```



```java
// QUESTION 6a EXAMPLE SOLUTION

String[] strArray = new String[]{"a", "b", "c", "d"};

String[] strArray2 = strArray;
strArray2[0] = "z";

System.out.println(Arrays.toString(strArray));
// [z, b, c, d]
System.out.println(Arrays.toString(strArray2));
// [z, b, c, d]
```

Within Question 6a, we've asked you to create a second array which is initialised using your original array. When you then change the value in the second array and then print both, you should see that the value at index `0` for **both** arrays has been altered. This is because both of our arrays are pointing to the same space in memory, and hence the same exact information. Changing one will thus change the other. This has it's own use-case, but if we were wanting to create a discrete copy of our original array, we should use the `Arrays.copyOf()` method instead.

```java
// QUESTION 6b EXAMPLE SOLUTION

String[] strArray = new String[]{"a", "b", "c", "d"};

String[] strArray2 = Arrays.copyOf(strArray, strArray.length);
strArray2[0] = "z";

System.out.println(Arrays.toString(strArray));
// [a, b, c, d]
System.out.println(Arrays.toString(strArray2));
// [z, b, c, d]
```


```java
// QUESTION 7 EXAMPLE SOLUTION

String[] strArray = new String[]{"a", "b", "c", "d"};
        
for (String item : strArray) {
    System.out.println(item);
}
// a
// b
// c
// d
```


```java
// QUESTION 8 EXAMPLE SOLUTION

int[] intArray = new int[10];

for (int i = 0; i < 10; i++) {
    intArray[i] = i+1;
}

System.out.println(Arrays.toString(intArray));
// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
```


```java
// QUESTION 9 EXAMPLE SOLUTION

int[] intArray = new int[10];

for (int i = 0; i < 10; i++) {
    intArray[i] = i+1;
}

System.out.println(Arrays.toString(intArray));
// [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

for (int i = 0; i < intArray.length; i++) {
    intArray[i] = intArray[i]*2;
}

// OR

for (int item : intArray) {
    intArray[item-1] = item*2;
}

System.out.println(Arrays.toString(intArray));
// [2, 4, 6, 8, 10, 12, 14, 16, 18, 20]

```


```java
// QUESTION 10 EXAMPLE SOLUTION

String[] strArray = new String[]{"a", "b", "c", "d"};

String condition = "c";
Boolean hasC = false;

for (String item: strArray){
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

```


