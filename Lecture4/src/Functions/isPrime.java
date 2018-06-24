package Functions;

import java.util.Scanner;

public class isPrime {
	
	public static boolean isPrime(int n)  {
	for (int d=2;d<n;d++) {
		if (n%d==0) {
			return false;
		}
	}
	return true;	
	}

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
   boolean ansPrime=isPrime(n);
   System.out.println(ansPrime);
	}

}
