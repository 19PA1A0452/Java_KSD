package FirstDayJavaHandson;
import java.util.*;
public class pyramid {
	public static void main(String[] args) {
	Scanner  sc = new Scanner(System.in);
	System.out.print("Enter the Integer: ");
	int n = sc.nextInt();
	int k=0;
	for (int i=1;i<=n;++i,k=0){
	      for (int space = 1;space<=(n-i);++space){
	        System.out.print("  ");
	      }
	      while (k != 2 * i - 1) {
	        System.out.print(i+" ");
	        ++k;
	      }
	      System.out.println();
	    }
	}
}
