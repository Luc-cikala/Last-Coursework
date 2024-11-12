public abstract class Car {
    protected String make;
    protected String model;
    protected int year;
    protected double price;
    protected double fuelConsumption;


    public Car(String make, String model, int year, double price, double fuelConsumption) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.fuelConsumption = fuelConsumption;
    }
    public abstract String displaySpecifications();
    public abstract double calculateImportTax();

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
