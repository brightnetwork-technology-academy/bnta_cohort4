const Car = require("./car")
const Dealership = require("./dealership")

const car1 = new Car("Skoda", 10000, "petrol");
const car2 = new Car("Mini", 5000, "diesel");

// const car2 = new Car("Volvo", 500, "petrol");

const cars = [car1, car2];

const dealership1 = new Dealership("filled dealership", 10, cars);

// console.log(dealership1);

const dealership2 = new Dealership("empty dealership", 10);

// console.log(dealership2);

dealership1.printCarManufacturers()
// dealership1.addCar()
// dealership1.printCarManufacturers()