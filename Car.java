public class Car {
    private int year;
    private String make;
    private double speed;

    // Constructor
    public Car(int year, String make, double speed) {
        this.year = year;
        this.make = make;
        this.speed = speed;
    }

    // Other methods can be added here

    // Getter methods
    public int getYear() {
        return year;
    }

    public String getMake() {
        return make;
    }

    public double getSpeed() {
        return speed;
    }

    // Setter methods (if needed)
    public void setYear(int year) {
        this.year = year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public static void main(String[] args) {
        // Example usage
        Car myCar = new Car(2015, "Honda", 85.0);
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Speed: " + myCar.getSpeed());
    }
}
