import java.util.Scanner;
public class celciustofahrenhiet {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		int fah;
		fah=s.nextInt();
	//int cel=(5/9)(fah-32);	                 not correct
	//int	cel=(int)((fah-32)*(5.0/9));            it is also right
	int cel=(5*(fah-32))/9;
		System.out.println(cel);
		
		
		
		
		

	}

}
