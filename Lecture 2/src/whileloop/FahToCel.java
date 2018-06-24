package whileloop;


import java.util.Scanner;

public class FahToCel {


	public static void main(String[] args) {
	
      Scanner s=new Scanner(System.in);
      
      int S,E,W;
        S=s.nextInt();
        E=s.nextInt();
        W=s.nextInt();
      int Fah=S;
      int Cel;
      while (Fah<=E)  {
        Cel=((5*(Fah-32))/9);
        System.out.println(Fah+"\t"+Cel);
        Fah=Fah+W;
      }
	

		
	}

}
