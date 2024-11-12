public class Sedan extends Car {
    private int trunkSpace;

    public Sedan(String make, String model, int year, double price, double fuelConsumption, int trunkSpace) {
        super(make, model, year, price, fuelConsumption);
        this.trunkSpace = trunkSpace;
    }

    @Override
    public String displaySpecifications() {
        return "Sedan: " + make + " " + model + ", Year: " + year +
                ", Price: $" + price + ", Trunk Space: " + trunkSpace +
                " liters, Fuel Consumption: " + fuelConsumption + " L/100km";
    }

    @Override
    public double calculateImportTax() {
        return price * 0.1;
    }
}