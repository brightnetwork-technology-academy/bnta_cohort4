# Java Loops Examples

## 1. Create a loop that prints all numbers from 0-10

Within your `Main` class, create some functionality which uses a `for` loop to print the numbers from 0 to 10.

```
// EXAMPLE SOLUTION

for (int i = 0; i <= 10; i++) {
    System.out.println(i);
}
```

```
// QUESTION 1

public static void main(String[] args) {
	// create a for loop which goes from 0 to 10
	// print each value
}
```



## 2. Create a loop that prints all numbers from 10-0

Within your `Main` class, create some functionality which uses a `for` loop to print the numbers from 10 to 0 (inclusive).

```
// EXAMPLE SOLUTION

for (int i = 10; i >= 0; i--) {
    System.out.println(i);
}
```

```
// QUESTION 2

public static void main(String[] args) {
	// create a for loop which goes from 10 down to 10
	// print each value
}
```

Could you use a previously declared `int` as your initial value? Try it out!



## 3. Create a loop that prints all even numbers from 0-20

Within your `Main` class, create some functionality which uses a `for` loop to print the **even** numbers from 0 to 20 (inclusive).

```
// EXAMPLE SOLUTION


for (int i = 0; i <= 20; i += 2) {
    System.out.println(i);
}
        
// OR

for (int i = 0; i <= 20; i++) {
    if (i%2 == 0) {System.out.println(i);}
}
```

```
// QUESTION 3

public static void main(String[] args) {
	// create a for loop which goes from 0 to 20
	// print each even value
}
```

How can you make it exclude `0`? There are a couple ways you could go about this, can you find both?



## 4. Create a loop that adds all numbers 0-10 to an array then prints the array

Within your `Main` class, create some functionality which uses a `for` loop which adds all numbers from 0 to 10 (inclusive) to an array.
Print this array in the console.

```
// EXAMPLE SOLUTION

int[] ourArray = new int[11];

for (int i = 0; i <= 10; i++) {
    ourArray[i] = i;
}

String output = Arrays.toString(ourArray);
System.out.println(output);

```

```
// QUESTION 4

public static void main(String[] args) {
	// create an array. Remember to manually set the size
	// create a for loop which goes from 0 to 10, adding each value to an array
	// print our array
}
```

When we create our array, we set a size. Why is this integer different from our max value of `10`?



## 5. Create a loop that prints each item in an array

Using your answer to the previous question, use a second `for` loop which prints each item in your array to the terminal individually.

```
// EXAMPLE SOLUTION


int[] ourArray = new int[11];

for (int i = 0; i <= 10; i++) {
    ourArray[i] = i;
}

for (int item : ourArray) {
    System.out.println(item);
}

```

```
// QUESTION 5

public static void main(String[] args) {
	// using your answer from Question 4, create a for loop that goes through the values
	// print each value individually
}
```



## 6. Create a loop that adds to a sum. Prints the sum

Using your answer from the question two above, use a `for` loop to add each number to a sum value.
Print the sum value.

```
// EXAMPLE SOLUTION


int[] ourArray = new int[11];

for (int i = 0; i <= 10; i++) {
    ourArray[i] = i;
}

int sum = 0;

for (int number : ourArray) {
    sum += number;
}

System.out.println(sum);
```

```
// QUESTION 6

public static void main(String[] args) {
	// create a sum variable
	// using your answer from Question 4, create a for loop that goes through the values
	// add each item to the sum value
	// print the total sum
}
```


## 7. Create a loop that makes all words in an array uppercase, print the array

Start with the array: `["i", "sure", "do", "love", "bees"]`. 
Create a `for` loop which makes each word uppercase in the array.
Print the contents of the array in the terminal.

Hint: You could achieve this by either creating a second array which you add to, or by reassigning the values in the initial array.

```
// EXAMPLE SOLUTION


String[] ourArray = new String[]{"i", "sure", "do", "love", "bees"};

for (int i = 0; i < ourArray.length; i++) {
    ourArray[i] = ourArray[i].toUpperCase();
}

System.out.println(Arrays.toString(ourArray));
```

```
// QUESTION 7

public static void main(String[] args) {
	// create a for loop which goes through each string in our array
	// make each word uppercase
	// assign the value in the array to the uppercase string
	// print our resulting array
}
```


## 8. Create a loop that capitalises each word in an array, prints the new array

Start with the array: `["i", "sure", "do", "love", "bees"]`. 
Create a `for` loop which makes each word uppercase in the array.
Print the contents of the array in the terminal.

Hint: You could make use of the `.charAt()` method to grab a specific character (letter) at the specified index
Hint: You could make use of the `.substring()` method which works on strings to grab the part of a given string forward from the specied index

```
// EXAMPLE SOLUTION

String[] ourArray = new String[]{"i", "sure", "do", "love", "bees"};

for (int i = 0; i < ourArray.length; i++) {
    char firstLetter = ourArray[i].charAt(0);
    char capLetter = Character.toUpperCase(firstLetter);
    String capWord = capLetter + ourArray[i].substring(1);
    ourArray[i] = capWord;
}

System.out.println(Arrays.toString(ourArray));
```

```
// QUESTION 8

public static void main(String[] args) {
	// create a for loop which goes through each string in our array
	// grab the first letter of our word
	// capitalise the first letter
	// add the capitalised letter to the rest of the provided word
	// assign the value to an array
	// print our resulting array
}
```



## 9. Create a loop that finds the greatest number in an array of numbers, prints the number (+ prints the index)

Start with the array of numbers: `[1, 6, 17, 9, 20, 5]`
Using a `for` loop to go through the array to find the greatest value
Print the greatest number in the array

Hint: create a `maxNum` value which you check each item against and then reassign if the number is exceeded.

```
// EXAMPLE SOLUTION

int[] numArray = new int[]{1, 6, 17, 9, 20, 5};

int maxNum = 0;

for (int number : numArray) {
    if (number > maxNum) {maxNum = number;}
}

System.out.println(maxNum);
```

```
// QUESTION 9

public static void main(String[] args) {
	// create a for loop which goes through number in our array
	// check whether the value is greater than the current greatest value
	// reassign the current greatest value if true
	// print the greatest value
}
```
