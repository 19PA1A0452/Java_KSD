package FirstDayJavaHandson;
import java.util.*;
public class cube {
	public static void main(String[] args)

	{
	    System.out.print("Input number of terms : ");
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    for(int i=1;i<=n;i++){
	    	System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));     
	    }
	 }
}
