// Lec 1-9:

class Hello
{
    public static void main(String[]args){
        System.out.print("Hello");
        System.out.println("Hello");
        System.out.print("Hello");
    }
}

// Lec 10(Variables):
public class hello
{

	public static void main(String[] args)
	{
		System.out.print(3+5);
		System.out.print(8+7);
		
		//int num1=3;
		//int num2=5;
		//System.out.println(num1+num2);
		
		int num1=3;
		int num2=5;
		int result=num1+num2;
		System.out.println(result);
	}
}

// Lec 11(Data Types):
public class hello
{

	public static void main(String[] args)
	{
		int num1=9;
		byte by=127;
		short sh=558;
		long l=5854l;
		
		float f=5.8f;
		double d=5.8;
		
		char c='k';
		
		boolean b=true;

	}

}

// Lec 12(Literals):
public class hello
{

	public static void main(String[] args)
	{
	int num1=0b101;
	System.out.println(num1);
	
	int num2=0x7E;
	System.out.println(num2);
	
	int num3=10_00_00_000;
	System.out.println(num3);
	
	float num4=56;
	System.out.println(num4);
	
	double num5=56;
	System.out.println(num5);
	
	double num6=12e10;
	System.out.println(num6);
	
	boolean num7= 1;
	System.out.println(num7);
	
	char c='a';
	System.out.println(c);
	c++;
	
	char c1='a';
	c1++;
	System.out.println(c1);
	}

}

// Lec 13(Type Conversion):
public class hello
{

	public static void main(String[] args)
	{
		byte b=127;
		int a=b;
		System.out.println(b);
		System.out.println(a);
		
		byte b1=125;
		int a0=b1;
		System.out.println(b1);
		System.out.println(a0);
		
		int aa=257;
		byte k=(byte)aa;
		
		float f=5.6f;
		int t=(int)f;
		
		int a2=2567;
		byte b2=(byte)a;
		System.out.println(k);
		
		byte a3=10;
		byte b4=20;
		int t=a*b;
		System.out.println(t);
	
	}

}