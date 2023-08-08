public class Circle {
    private double radius;

    // No-argument constructor
    public Circle() {
        this.radius = 1.0;
    }

    // Constructor with an argument for radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to get the radius of the Circle
    public double getRadius() {
        return radius;
    }

    // Method to calculate and return the area of the Circle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        // Create instances of Circle
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.5);

        // Display the properties of circles
        System.out.println("Circle 1 - Radius: " + circle1.getRadius() + ", Area: " + circle1.getArea());
        System.out.println("Circle 2 - Radius: " + circle2.getRadius() + ", Area: " + circle2.getArea());
    }
}
