//named function

function greet() {
    console.log("hello");
}

// greet()

// anonymous functions
const addTwoNumbers = function(num1, num2){
    return num1 + num2;
}

const total = addTwoNumbers(4, 5)

// console.log(total);


// arrow functions
const multiply = (num1, num2) => num1 * num2

const product = multiply(4, 5);

// console.log(product);



// higher-order functions

const someOtherFunction = function(param1, param2){
    // do some stuff
}

const myHigherOrderFunction = function(param1, param2, callback){
    callback(param1, param2);
}

myHigherOrderFunction("hello", "world", someOtherFunction)
// someOtherFunction("hello", "world")


const capitaliseString = inputString => inputString.toUpperCase();

const downcaseString = inputString => inputString.toLowerCase();

const manipulateString = (input, callback) => callback(input);

console.log(manipulateString("Hello World", capitaliseString));
console.log(manipulateString("Hello World", downcaseString));

console.log(manipulateString("Hello World", string => string.split('')));