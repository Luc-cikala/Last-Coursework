public class Truck extends Car {
    private double payloadCapacity;

    public Truck(String make, String model, int year, double price, double fuelConsumption, double payloadCapacity) {
        super(make, model, year, price, fuelConsumption);
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String displaySpecifications() {
        return "Truck: " + make + " " + model + ", Year: " + year +
                ", Price: $" + price + ", Payload Capacity: " + payloadCapacity +
                " tons, Fuel Consumption: " + fuelConsumption + " L/100km";
    }

    @Override
    public double calculateImportTax() {
        return price * 0.2;
    }
}