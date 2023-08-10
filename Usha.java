class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getFuelType() {
        return fuelType;
    }

    public double calculateFuelEfficiency() {
        // Implementation to calculate fuel efficiency
        return 0.0;
    }

    public double calculateDistanceTraveled(double fuelConsumed) {
        // Implementation to calculate distance traveled based on fuel consumed
        return 0.0;
    }

    public int calculateMaxSpeed() {
    
        return 0;
    }
}

class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 0.0;
    }
}

class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {
        return 0.0;
    }

}

class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }

    @Override
    public double calculateFuelEfficiency() {

        return 0.0;
    }


}

public class Usha {
    public static void main(String[] args) {
        Truck truck = new Truck("Ford", "F-150", 2023, "Diesel");
        Car car = new Car("Toyota", "Camry", 2023, "Gasoline");
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2023, "Gasoline");

        double truckFuelEfficiency = truck.calculateFuelEfficiency();
        double carDistance = car.calculateDistanceTraveled(50.0);
        int motorcycleMaxSpeed = motorcycle.calculateMaxSpeed();

        System.out.println("Truck Fuel Efficiency: " + truckFuelEfficiency);
        System.out.println("Car Distance Traveled: " + carDistance);
        System.out.println("Motorcycle Max Speed: " + motorcycleMaxSpeed);
    }
}
