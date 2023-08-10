interface Shape {
    String getColor();
}

class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

class Sign {
    private Shape shape;
    private String text;

    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void display() {
        System.out.println("Sign Background Color: " + shape.getColor());
        System.out.println("Sign Text: " + text);
    }
}

public class Demo {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Blue");
        Rectangle rectangle = new Rectangle(10.0, 7.0, "Red");

        Sign sign1 = new Sign(circle, "Welcome to the Campus!");
        Sign sign2 = new Sign(rectangle, "Important Announcement");

        sign1.display();
        System.out.println();
        sign2.display();
    }
}
