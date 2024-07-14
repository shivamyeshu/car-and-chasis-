# car-and-chasis
# Car Management System

This is a simple Car Management System written in Java. It allows you to add, remove, and display cars in a list. Each car has a model and a chassis number.

## Features

- Add a new car with a model and chassis number.
- Remove a car by its chassis number.
- Display the list of all cars.

## Classes

### Car

- **Fields:**
  - `model`: The model of the car.
  - `chassisNumber`: The chassis number of the car.
- **Methods:**
  - `Car(String model, String chassisNumber)`: Constructor to initialize the car's model and chassis number.
  - `String getModel()`: Returns the model of the car.
  - `String getChassisNumber()`: Returns the chassis number of the car.
  - `String toString()`: Returns a string representation of the car.

### CarManager

- **Fields:**
  - `List<Car> carList`: A list to store the cars.
- **Methods:**
  - `CarManager()`: Constructor to initialize the car list.
  - `void addCar(Car car)`: Adds a car to the list.
  - `void removeCar(String chassisNumber)`: Removes a car by its chassis number.
  - `void displayCars()`: Displays all cars in the list.

### CarSystem (Main class)

- **Methods:**
  - `public static void main(String[] args)`: The entry point of the application. It provides a menu to the user to add, remove, and display cars.

## How to Run

1. **Install Java Development Kit (JDK):**
   Ensure that you have the JDK installed on your machine. You can download it from the [Oracle website](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) or use an open-source alternative like OpenJDK.

2. **Clone the Repository:**
   ```sh
   git clone < https://github.com/shivamyeshu/car-and-chasis-.git >
  
