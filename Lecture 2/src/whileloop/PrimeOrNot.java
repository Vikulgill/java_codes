package whileloop;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int i=2;
		while (i<=n-1)   {
	if		(n%i==0)    {
		System.out.println("Non Prime No.");
		return;
	}
	  
	i=i+1;
  
	}
		System.out.println("Prime No.");
		

	}

	}

