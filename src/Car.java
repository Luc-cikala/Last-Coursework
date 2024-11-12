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
}
