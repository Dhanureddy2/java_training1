package lists;

public class LapDetails {
    String brand;
    String Model;
    int price;

    public LapDetails(String brand, String model, int price) {
        this.brand = brand;
        Model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return Model;
    }

    public int getPrice() {
        return price;
    }
}
