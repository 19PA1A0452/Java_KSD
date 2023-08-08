public class SumCalculator {

    // Method to calculate the sum of two integers
    public static int getTotal(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Call the getTotal method and print the result
        int sum = getTotal(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}
