package FirstDayJavaHandson;
import java.util.*;
public class floatvalues {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    System.out.print("Enter 1st number: ");
    double n1 = input.nextDouble();
    System.out.print("Enter 2nd number: ");
    double n2 = input.nextDouble();
    if (Math.abs(n1-n2)<=0.01) {
        System.out.println("They are the same");
    }
    else {
        System.out.println("They are different");
    }
}
}
