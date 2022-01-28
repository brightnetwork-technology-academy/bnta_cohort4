import java.util.Arrays;
import java.util.Objects;

public class Dealership {

    private String name;
    private int maxCars;
    private Car[] cars;

    public Dealership(String name, int maxCars) {
        this.name = name;
        this.maxCars = maxCars;
        // We don't have any cars yet, but we know how many we *could* have. We can use that value to create an empty array with maxCars spaces in it.
        this.cars = new Car[maxCars];
    }

    public int countCars(){
        // Start a counter to keep track of how many cars we find
        int totalCars = 0;
        // Loop through our array of cars
        for (int i = 0; i < this.maxCars; i++) {
            // If there is a car in that slot...
            if (this.cars[i] != null){
                // ... add 1 to the counter
                totalCars += 1;
            }
        }
        // Return the number of cars we have found
        return totalCars;
    }

    public void addCar(Car newCar){
        // Loop through our cars array
        for (int i = 0; i < this.maxCars; i++) {
            // Check if there is already a car in that space
            if (this.cars[i] == null){
                // If not, put our new car in that slot
                this.cars[i] = newCar;
                // Once we have placed our new car we can stop the loop
                break;
            }
        }
    }

    public Car findCarByManufacturer(String manufacturerWanted){
        // Loop through the cars array
        for (Car car : this.cars) {
            // Check if a) there is a car in that slot
            // b) if there is, that the car's manufacturer matches the one we want
            if (car != null && car.getManufacturer().equals(manufacturerWanted)){
                // If we find a car, retunr it
                return car;
            }
        }
        // If we don't find a car return null
        return null;
    }

    @Override
    public String toString() {
        return "Dealership{" +
                "name='" + name + '\'' +
                ", maxCars=" + maxCars +
                ", cars=" + Arrays.toString(cars) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dealership that = (Dealership) o;
        return maxCars == that.maxCars && Objects.equals(name, that.name) && Arrays.equals(cars, that.cars);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, maxCars);
        result = 31 * result + Arrays.hashCode(cars);
        return result;
    }
}
