package oopsconcept;

public class QA2 extends QA1
{
	
	final int x = 100;  //global variable/constant
	
	
	
	public void printvalues_X()
	{
		//x=400;
		//x=600;
		
		System.out.println(super.x);  //1000
		
		final int x = 200;  //local variable/constant
		//x=300;
		System.out.println(x);  //300
		//x=700;
		System.out.println(x); //700
		System.out.println(this.x); //600
		//x=900;
		System.out.println(x); //900
		
		super.sum(20, 30);
		
	}

	public void sum(int a, int b)
	{
		//int x = 900;
		//System.out.println(x);//900
		//System.out.println(this.x);
		int c = a*a+b*b;
		System.out.println("sum of sq 2 numbers: " + c);
	}

	public void subs(int a, int b)
	{
		int c = a-b;
		System.out.println("subs of 2 numbers: " + c);
	}
	
	public static void main(String[] args) 
	{
	
		QA2 q2 = new QA2();
		
		//System.out.println(q2.x);  //100
		
		q2.printvalues_X();  //200
		
		System.out.println("-------------------------");
		
		q2.sum(20, 30);  //x=400
		//q2.this.x;
		//q2.super.x;
			
		final int y = 100;
		//y=200;
		
		
		System.out.println(q2.x); //200
		
		//q2.subs(20, 30);
	
		
		
		//QA1 abc = new QA1();
		//abc.sum(20, 30);
		
		q2.qa1im();
		
		
		
	}

	
	public void qa1im() {
		System.out.println("method of QA1I");
		
	}
	
}
