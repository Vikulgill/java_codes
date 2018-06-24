package ForLoop;

import java.util.Scanner;

public class AllPrimeNo {

	public static void main(String[] args) {
		   Scanner s=new Scanner(System.in);
		      
		      int n=s.nextInt();
		      int d=2;
		      int i;
		      
		      for (i=2;i<=n;i++)   {
		        boolean IsPrime=true;
		       for (d=2;d<i;d++)  {
		         if (i%d==0) {
		           IsPrime=false;
		           break;
		        }
		       }
		        if (IsPrime) {
		        System.out.println(i);
		        }
		      }

	}

}
