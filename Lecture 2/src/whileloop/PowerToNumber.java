package whileloop;

import java.util.Scanner;

public class PowerToNumber {
	
	public static void main(String[] args)   {
  Scanner s=new Scanner(System.in);
      
      int n=s.nextInt();
      int x=s.nextInt();
     int i=1;
     int sol=1;
      while (i<=n)  {
    	 sol=sol*x;
        
        i=i+1;
      }
		System.out.println(sol);

	}
}
