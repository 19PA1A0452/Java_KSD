public class PrintNumber {

    public void printn(int number) {
        System.out.println("Printing an int: " + number);
    }

    public void printn(double number) {
        System.out.println("Printing a double: " + number);
    }

    public void printn(float number) {
        System.out.println("Printing a float: " + number);
    }

    public void printn(long number) {
        System.out.println("Printing a long: " + number);
    }

    public void printn(short number) {
        System.out.println("Printing a short: " + number);
    }

    public void printn(byte number) {
        System.out.println("Printing a byte: " + number);
    }

    public void printn(char character) {
        System.out.println("Printing a char: " + character);
    }

    public void printn(boolean bool) {
        System.out.println("Printing a boolean: " + bool);
    }

    public static void main(String[] args) {
        PrintNumber printer = new PrintNumber();

        printer.printn(42);
        printer.printn(3.14);
        printer.printn(123.45f);
        printer.printn(10000000000L);
        printer.printn((short) 5);
        printer.printn((byte) 7);
        printer.printn('A');
        printer.printn(true);
    }
}
