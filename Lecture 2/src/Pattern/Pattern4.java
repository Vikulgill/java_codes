package Pattern;

//          1
//          2 3
//          3 4 5
//          4 5 6 7
//          5 6 7 8 9
import java.util.Scanner;

public class Pattern4 {

		public static void main(String[] args) {
	     
	      Scanner s=new Scanner(System.in);
	      
	      int n=s.nextInt();
	      int i=1;
	      while (i<=n) {
	        int val=i;
	        int j=1;
	        while (j<=i) {
	        System.out.print(val);
	        val=val+1;
	        j=j+1;
	      }
	      System.out.println();
	      i=i+1;
	      }

			
		}

	}
