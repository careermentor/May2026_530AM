package oopsconcept;

public class QA1
{
	
	int x = 1000;
	/*
	public QA1(int a)
	{
		System.out.println("this is QA1 constructor");
		int b=a*a;
		System.out.println("squarte root of a: " + b);
	}
	
	public QA1(int a, int b)
	{
		System.out.println("this is QA1 constructor");
		int c=a*a+b*b;
		System.out.println("sum of squarte root of a&b: " + c);
	}
	*/

	public void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("sum of 2 numbers: " + c);
	}
	
	public void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("sum of 3 numbers: " + d);
	}
	
	public void sum(int a, float b)
	{
		float c = a+b;
		System.out.println("sum of 2 numbers: " + c);
	}
	
	
	public void sum(float a, int b)
	{
		float c = a+b;
		System.out.println("sum of 2 numbers: " + c);
	}
	
	public static void main(String[] args) 
	{
	
		QA1 q1 = new QA1();
		//QA1 q12 = new QA1(5,10);
		
		
		q1.sum(20, 30);
		q1.sum(20, 30.5f);
		q1.main(5);
		
	}
	
	public static void main(int a) {
		int b = a*a*a;
		System.out.println(b);
	}
}
