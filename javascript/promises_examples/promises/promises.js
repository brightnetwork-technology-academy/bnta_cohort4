// setTimeout(() => {
//     return "hello world"
// }, 2000);

const resolveAfter2Seconds = () => {
    return new Promise((resolve) => {
        setTimeout(() => {
            resolve("hello world")
        }, 2000);
    });
}

// const output = resolveAfter2Seconds();
// console.log(output);

// setTimeout(() => {
//     console.log(output);
// }, 3000);

const asyncFunction = async () => {
    console.log("calling asyncFunction");
    const result = await resolveAfter2Seconds();
    console.log(result);
}

// asyncFunction();
// console.log("outside the function call");


const doComplicatedCalculation = (input) => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if (input < 10) {
                resolve(input * 2);
            } else {
                reject("I can't handle numbers that big!");
            }
        }, 2000);
    });
}

const asyncCalculator = async (input) => {
    try {
        const result = await doComplicatedCalculation(input);
        console.log(result);
    } catch (error){
        console.error(error);
    }
}

asyncCalculator(15);