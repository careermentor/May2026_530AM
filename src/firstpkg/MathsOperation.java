package firstpkg;

public class MathsOperation 
{
	/*
	public MathsOperation()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("sum of 2 numbers using const: " + c);
		
	}
	*/
	
int x=100;

	public int sum()
	{
		int a = 20;
		int b = 30;
		int c = a+b;
		System.out.println("sum of 2 numbers: " + c);
		
		float d = 20.5f;
		
		String e = "Java";
		
		//System.out.println("this is sum method");
		return b;
		
		//return a;
	}

	 public int addition(int a, int b)
	{
		int c = a+b;
		System.out.println("addition of 2 numbers: " + c);
		return c;
	}
	 
	 
	 public MathsOperation(int a, int b)
		{
			int c = a+b;
			System.out.println("addition of 2 numbers using cont: " + c);
			
		}
	 
	 //40,50,60
	 //int y = 40+50
	 //y+60
	
	public void substraction(int a, int b)
	{
		int c = a-b;
		System.out.println("substraction between 2 numbers: " + c);
	}
	
	public static void main(String[] args) 
	{
		MathsOperation mo1 = new MathsOperation(30, 40);
		MathsOperation mo2 = new MathsOperation(40,50);  //instance of the object 'MathsOperation'
		
		mo2.sum();
		mo1.addition(30, 40);
		
		/*
		System.out.println(mo.x);
		
		int y = mo.addition(40, 50);
		System.out.println(y);
		mo.addition(y, 60);
		
		
		
		mo.substraction(y, 30);
		mo.substraction(40, 60);
		
		int z = mo.sum();
		System.out.println(z);  //30
		
		mo.addition(y, z);
		
		*/
		
	}
	
}
