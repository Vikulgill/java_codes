import java.util.Scanner;

public class logical {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int i=s.nextInt();
		int j=s.nextInt();
		int k=s.nextInt();
		
		// and-  ==  ,   or-  ||  Symbols of and n or used  
		
		Boolean a= i>=j && i>=k; 
		Boolean b= j>=k && j>=i;
		Boolean c= k>=i && k>=j;
		System.out.println("Largest no. "+a);
		System.out.println("Largest no."+b);
		System.out.println("Largest no."+c);
        
	}

}
