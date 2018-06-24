package Using2Function;

import java.util.Scanner;

public class Prime2toN {
	
	public static boolean isPrime(int n)  {
		for (int d=2;d<n;d++) {
			if (n%d==0) {
				return false;
			}
		}
		return true;	
		}

	public static void printPrimes(int n)  {
	for (int i=2;i<=n;i++)  {
		boolean ans=isPrime(i);
		if (ans)  {
			System.out.println(i);
		}
	}
	}
		public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			
			int n=s.nextInt();
	       printPrimes(n);
		}
}
