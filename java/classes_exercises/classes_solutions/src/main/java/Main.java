public class Main {

    public static void main(String[] args) {

        Car ford = new Car("Ford", 5000, EngineType.PETROL);
        Car mercedes = new Car("Mercedes", 20000, EngineType.PETROL);
        Car honda = new Car("Honda", 10000, EngineType.HYBRID);
        Car tesla = new Car("Tesla", 90000, EngineType.ELECTRIC);

        Dealership dealership = new Dealership("BNTACars", 10);
        dealership.addCar(ford);
        dealership.addCar(mercedes);
        dealership.addCar(honda);
        dealership.addCar(tesla);

        int carCount = dealership.countCars();
        System.out.println("The dealership has " + carCount + " cars");

        Car foundCar = dealership.findCarByManufacturer("Tesla");
        System.out.println("We found this Tesla: " + foundCar);

        Car missingCar = dealership.findCarByManufacturer("BMW");
        System.out.println("We found this BMW: " + missingCar);
    }

}
