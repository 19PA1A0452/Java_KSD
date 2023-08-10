class Shape {
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Rectangle extends Shape {
    void displayShape() {
        System.out.println("This is a rectangular shape.");
    }
}

class Circle extends Shape {
    void displayShape() {
        System.out.println("This is a circular shape.");
    }
}

class Square extends Rectangle {
    void displaySquare() {
        System.out.println("Square is a rectangle.");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Square square = new Square();
        square.displayShape();  // Calls the method from 'Rectangle' class
        square.displaySquare(); // Calls the method from 'Square' class
    }
}
