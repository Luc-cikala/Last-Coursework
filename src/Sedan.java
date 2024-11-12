public class Sedan extends Car {
    private int trunkSpace;
    public Sedan(String make, String model, int year, double price, double fuelConsumption, int trunkSpace) {
        super(make, model, year, price, fuelConsumption);
        this.trunkSpace = trunkSpace;
    }
}