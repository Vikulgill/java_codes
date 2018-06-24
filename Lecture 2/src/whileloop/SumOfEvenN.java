package whileloop;

import java.util.Scanner;

public class SumOfEvenN {


	public static void main(String[] args) {
	
      Scanner s=new Scanner(System.in);
      
      int N=s.nextInt();
      int i=0;
      int sum=0;
      while (i<=N)    {
       if (i%2==0)   {
          sum=sum+i;
       }
        i=i+1;
      }
		System.out.println(sum);

		
	}

}

