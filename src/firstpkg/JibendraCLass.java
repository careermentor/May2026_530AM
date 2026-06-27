package firstpkg;

public class JibendraCLass 
{

	public void isEven(int num1)
	{

		if(num1 % 2 == 0)
		{

		System.out.println(num1+ " The number is even.");
		}
		else 
		{
		System.out.println(num1+" The number is odd");
		}
	}

	public int cubes(int a)
	{
		int b = a*a*a;
		return b;
	}
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			JibendraCLass jc= new JibendraCLass();

		jc.isEven(2);
		
		int x = jc.cubes(5);
		System.out.println(x);
		
		FirstProgram.print_data();


		}

		}
	
	

