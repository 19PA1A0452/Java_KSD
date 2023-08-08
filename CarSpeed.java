public class CarSpeed {
    private int year;
    private String make;
    private int speed;
    public CarSpeed(int year, String make, int speed) {
        this.year = year;
        this.make = make;
        this.speed = speed;
    }
    public int getYear() {
        return year;
    }
    public String getMake() {
        return make;
    }
    
    // Getter method for speed
    public int getSpeed() {
        return speed;
    }
    public static int findLargest(int x, int y, int z) {
        return Math.max(x, Math.max(y, z));
    }
    
    public static void main(String[] args) {
        CarSpeed myCar = new CarSpeed(2023, "Toyota", 120);
        
        int largestNumber = findLargest(10, 20, 5);
        
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Speed: " + myCar.getSpeed() + " km/h");
        System.out.println("Largest Number: " + largestNumber);
    }
}
