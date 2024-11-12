public class SUV extends Car {
    private int seatingCapacity;

    public SUV(String make, String model, int year, double price, double fuelConsumption, int seatingCapacity) {
        super(make, model, year, price, fuelConsumption);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String displaySpecifications() {
        return "SUV: " + make + " " + model + ", Year: " + year +
                ", Price: $" + price + ", Seating Capacity: " + seatingCapacity +
                ", Fuel Consumption: " + fuelConsumption + " L/100km";
    }

    @Override
    public double calculateImportTax() {
        return price * 0.15;
    }
}