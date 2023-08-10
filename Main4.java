class Parent {
    void printMessage() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void printMessage() {
        System.out.println("This is child class");
    }
}

public class Main4 {
    public static void main(String[] args) {
        // Creating objects
        Parent parentObj = new Parent();
        Child childObj = new Child();

        // Calling methods
        parentObj.printMessage();         // Calls method of parent class
        childObj.printMessage();          // Calls method of child class
        ((Parent) childObj).printMessage();// Calls method of parent class using child class object
    }
}
