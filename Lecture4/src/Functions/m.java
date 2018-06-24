package Functions;
import java.util.Scanner;

public class m {

	public static void printFahrenheitTable(int start, int end, int step) {
     
     
      
      for (int fah=start;fah<=end;fah+=step)  {
        
        int cel=5*(fah-32)/9;
        System.out.println(fah+" "+cel);
      }
	}
  public static void main(String[] args) {
    
    Scanner s=new Scanner(System.in); 
    
     int S=s.nextInt();
      int E=s.nextInt();
      int W=s.nextInt();
    printFahrenheitTable(S,E,W);
  }

}

