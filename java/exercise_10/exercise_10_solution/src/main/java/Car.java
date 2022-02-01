import java.util.Objects;

public class Car {

    private String manufacturer;
    private int price;
    private EngineType engineType;

    public Car(String manufacturer, int price, EngineType engineType) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engineType = engineType;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price && Objects.equals(manufacturer, car.manufacturer) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, price, engineType);
    }
}
