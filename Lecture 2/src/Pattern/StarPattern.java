package Pattern;
//         *
//       * * *
//     * * * * *
//   * * * * * * *
import java.util.Scanner;

public class StarPattern {


	public static void main(String[] args) {
	
      Scanner s=new Scanner(System.in);
      
      int n=s.nextInt();
      int i=1;
      while (i<=n)   {
    int space=1;
        while (space<=n-i)   {
        System.out.print(" ");
        space=space+1;
      }
        int j=1;                    
        while (j<=2*i-1)    {          
        System.out.print("*");
         j=j+1;
        }
//   We can use 29 to 33 also by changing in 24 ( j<=i)        
//        int k=2;
//        while (k<=i)  {
//          System.out.print("*");
//          k=k+1;
//        }
     System.out.println();
        i=i+1;
      }	
}
}