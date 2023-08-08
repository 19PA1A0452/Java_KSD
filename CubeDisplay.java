import java.util.Scanner;

public class CubeDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input number of terms: ");
        int numTerms = scanner.nextInt();
        
        for (int i = 1; i <= numTerms; i++) {
            int cube = i * i * i;
            System.out.println("Number is: " + i + " and cube of " + i + " is: " + cube);
        }
        
        scanner.close();
    }
}
