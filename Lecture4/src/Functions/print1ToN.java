package Functions;

import java.util.Scanner;

public class print1ToN {

	public static void print1ToN(int n)  {
		if (n<0)  {
			return;
		}		
		for (int i=1;i<=n;i++)  {
			System.out.print(i+" ");
		}
	}
	
	
public static void main(String[] args)  {
	
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		print1ToN(n);

	}
}
