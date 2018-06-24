import java.util.Scanner;


public class simpleinterestcalculator {

	public static void main(String[] args) {
		
		Scanner  scan=new Scanner(System.in);
		
		
		int  p=scan.nextInt();
		int  r=scan.nextInt();
		int  t=scan.nextInt();
		int  SI=p*r*t;
		System.out.println(SI);

	}

}
