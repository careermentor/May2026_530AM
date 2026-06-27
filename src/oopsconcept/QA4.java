package oopsconcept;

public class QA4 extends QA2 implements QA3I
{

	
	public void div(int a, int b)
	{
		int c = a/b;
		System.out.println("division of 2 numbers: " + c);
	}
	
	public static void main(String[] args) 
	{
		
		DemoEncap de = new DemoEncap();
		System.out.println(de.getName());
		System.out.println(de.getAge());
	
		
		QA4 q4 = new QA4();
		q4.div(40, 20);
		
		//q4.mul(20, 30);
		
		q4.subs(20, 30);
		q4.sum(20, 30);
		System.out.println(q4.x);
		
		//QA1 abc = new QA1();
		//abc.sum(20, 30);
		q4.qa3im();
		q4.qa1im();
	}


	public void qa3im() {
		System.out.println("method of QA3I");
		
	}
	
}
