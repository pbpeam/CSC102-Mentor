public class Car {
    static int carAmount = 0;
    String color;
    String brand;
    String model;

    public Car() {
        
    }

    public Car(String color, String brand, String model) {
        this.color = color;
        this.brand = brand;
        this.model = model;
    }

    public String getColor() {
        return this.color;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }
}