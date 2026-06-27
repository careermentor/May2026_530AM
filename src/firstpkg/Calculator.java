package firstpkg;

public class Calculator
{

	//global variable
	final int a =70;
	
	int b=80;
	
	
	public void addition(int a, int b)  //local a and b   //method is called- with arguments
	{
		int c=a+b;
		System.out.println("Addition of 2 numbers:" + c);
		
	}
	
	public void sum()
	{
		//a=90;
		
		//local variable
		final int a =20;
		//a=40;
		int b=30;
		
		
		int c =a+b;  //50
		System.out.println("sum of 2 numbers: " + c);
		
		System.out.println(a + b);  //50
		
		System.out.println("a" + b); //a30
		
		System.out.println("a" + "b"); //ab
		
	}
	
	public void mul()
	{
		int c = a*b;
		System.out.println("multiplication between 2 numbers: " + c);
	}
	
	public static void main(String[] args)  //array
	{
	
		Calculator cal = new Calculator();   //cal is called object of the class
		
		cal.mul();
		
		cal.sum();  //a=90
		
		cal.mul();
		
		cal.addition(15, 25);
		
		cal.addition(35, 45);
		
	}
	
}
