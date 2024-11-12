import java.util.List;
public class CarInventory {
    public static void displayCarInventory(List<Car> cars) {
        for (Car car : cars) {
            System.out.println(car.displaySpecifications());
            System.out.printf("Import Tax for %s %s: $%.2f%n", car.getMake(), car.getModel(), car.calculateImportTax());
            System.out.println();
        }
    }
}
