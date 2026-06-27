package firstpkg;

import oopsconcept.SecondProgram;

public class FirstProgram 
{
	
	//global variable
	static float b = 10.5f;
	static char c = 'X';
	static String d = "java";
	static boolean e = true;
	
	public static String loc = "India";
	
	
	  public static void print_data()
	{
		int a =10;  //local variable
		a=20;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	public void meth2()
	{
		int x = 100;
		System.out.println(x);
	}

	public static void main(String[] args) 
	{
		print_data();
		System.out.println(b);
		System.out.println(loc);
		
		
		FirstProgram abc = new FirstProgram();  //instance of the object 'FirstProgram'
		//abc.print_data();
		//System.out.println(abc.loc);
		abc.meth2();
		
		
		SecondProgram sc = new SecondProgram();
		sc.main(args);
		
		
	}

}
