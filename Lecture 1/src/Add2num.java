import java.util.Scanner;
public class Add2num {

	public static void main(String[] args) {
		// int=4 byte , short=2 byte , long=8 byte, float=4 byte, double=8 byte, char=2 byte
		
		Scanner scan=new Scanner(System.in);
  int  i=scan.nextInt();
  int   j=scan.nextInt();
  
  int  s=i+j;
  System.out.println(s);
	}

}
