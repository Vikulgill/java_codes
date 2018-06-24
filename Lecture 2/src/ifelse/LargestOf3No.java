package ifelse;

import java.util.Scanner;

public class LargestOf3No {

	public static void main(String[] args) {
		
       Scanner s=new Scanner(System.in);
       
       int a=s.nextInt();
       int b=s.nextInt();
       int c=s.nextInt();
       
       if (a>=b && a>=c)  {
    	   System.out.println(a+" is greatest");
    	  return; 
       }
       //we can also use else if in place of if in line no. 20 after removing return from above line
         if (b>=c && b>=a) {
    		   System.out.println(b+" is greatest");
    	    }
    		   else {
    			   System.out.println(c+" is greatest");
    		   }
    	   }
       }
	


