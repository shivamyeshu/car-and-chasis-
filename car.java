import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Car class
class Car {
    private String model;
    private String chassisNumber;

    public Car(String model, String chassisNumber) {
        this.model = model;
        this.chassisNumber = chassisNumber;
    }

    public String getModel() {
        return model;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Chassis Number: " + chassisNumber;
    }
}

// CarManager class
class CarManager {
    private List<Car> carList;

    public CarManager() {
        carList = new ArrayList<>();
    }

    public void addCar(Car car) {
        carList.add(car);
        System.out.println("Car added successfully.");
    }

    public void removeCar(String chassisNumber) {
        for (Car car : carList) {
            if (car.getChassisNumber().equals(chassisNumber)) {
                carList.remove(car);
                System.out.println("Car removed successfully.");
                return;
            }
        }
        System.out.println("Car with chassis number " + chassisNumber + " not found.");
    }

    public void displayCars() {
        if (carList.isEmpty()) {
            System.out.println("No cars in the list.");
        } else {
            for (Car car : carList) {
                System.out.println(car);
            }
        }
    }
}

// Main class
public class car {
    public static void main(String[] args) {
        CarManager carManager = new CarManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Car System Menu:");
            System.out.println("1. Add Car");
            System.out.println("2. Remove Car");
            System.out.println("3. Display Cars");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter car model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter chassis number: ");
                    String chassisNumber = scanner.nextLine();
                    Car car = new Car(model, chassisNumber);
                    carManager.addCar(car);
                    break;
                case 2:
                    System.out.print("Enter chassis number of the car to remove: ");
                    String chassisToRemove = scanner.nextLine();
                    carManager.removeCar(chassisToRemove);
                    break;
                case 3:
                    carManager.displayCars();
                    break;
                case 4:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}