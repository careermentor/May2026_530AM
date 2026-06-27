package oopsconcept;

import firstpkg.FirstProgram;
import firstpkg.MathsOperation;

public class SecondProgram
{

	public static void main(String[] args) 
	{
		int a =10;
		float b = 10.5f;
		char c = 'X';
		//String d = "java";  //single line commeting
		boolean e = true;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//System.out.println(d);
		System.out.println(e);
		
		//  multiline commeting
		FirstProgram fp = new FirstProgram();  //instance of the object 'FirstProgram'
		fp.print_data();
		System.out.println(fp.loc);
		

		//MathsOperation obj = new MathsOperation();
		//obj.addition(20, 30);
		
	}

}
