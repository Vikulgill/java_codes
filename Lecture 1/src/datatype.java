
public class datatype {

	public static void main(String[] args) {
		
		int i=100;
	//System.out.println(i);
		
		char c='a';
		System.out.println(c+2);
		
		//c=i;
        i=c;
        long l=12345679999999999L;
        i=(int)l;
        System.out.println(i);
        System.out.println(l);
        
        
       // float  f=1.23;
        float   f=1.23f;
        System.out.println(f)	;
        double d=f;
        //f=d;
        f=(float)d;
        System.out.println(d);
	}
}
