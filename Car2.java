public class Car2 {
    static int carAmount = 0;
    String color;
    String brand;
    String model;

    public Car2() {
        
    }

    public Car2(String color, String brand, String model) {
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