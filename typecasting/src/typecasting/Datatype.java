package typecasting;

public class Datatype {
	public static void main(String []args) {
	byte a = 80;
	
		byte x = (byte)(a+a);
	   System.out.println(x);
			
	short b = 200;
	
	short y= (short)(b+b);
	System.out.println(y);
	
	short z = (short)(a+b);
	System.out.println(z);
	
	//byte -int//
	int i = a;
	System.out.println(i);
	
	//short-int//
	int n= b;
	System.out.println(n);
	
	
	//char-int //
	
	
	
	//double-long//
	double d = 230.12f;
	long l =(long) d;
	System.out.println(l);
	
	//double- int //
	int m = (int)d;
	System.out.println(m);
	
	
	}
	

}
