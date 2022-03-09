const Dealership = function(name, capacity, cars = []){
    this.name = name
    this.capacity = capacity
    this.cars = cars
}

Dealership.prototype.printCarManufacturers = function(){
    for (const car of this.cars) {
        console.log(car.manufacturer)
    }
}

Dealership.prototype.addCar = function(car){
    this.cars.push(car);
}

module.exports = Dealership