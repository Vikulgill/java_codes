package ForLoop;

import java.util.Scanner;

public class SumOfNNumbers {
	
	public static void main(String[] args) {
    
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int sum=0;
		/*
		int i=0;
		while (i<=n)  {
			sum=sum+i;
			i++;
		}
		*/
		int i;
		for (i=0;i<=n;i++)  {
			sum=sum+i;
		}
		System.out.println(sum);
}
}