package whileloop;

import java.util.Scanner;

public class AddDigitOfInteger {
	
	Scanner s=new Scanner(System.in); {
	
	int n=s.nextInt();
	int sum=0;
  int x=n;
   while (x>0)  {
	  int r=x%10 ;
	   sum=sum+r;
	   x=x/10;
   }
   System.out.println(sum);

}
}	
