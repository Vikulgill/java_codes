package ifelse;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		if (n%2==0)  {
			System.out.println("Even");
			return;
	//  Return terminate the program it dont allow to go downward		
		}  
		
		
	//	else      we can use else also after removing return from above
		 {
			System.out.println("Odd");
		}
		
		
		

	}

}
