package oopsconcept;

public class JibendraCode 
{

	
		public void area(int r)
		{

		double a= 3.14*r*r;
		System.out.println("The area of the circle is: " + a +"cm\u00B2");
		}
		public void area (int l, int b)
		{
		int a= l*b;
		System.out.println("The area of the rectangle is: " +a +"cm\u00B2");
		}

		public static void main(String[] args) {
		// TODO Auto-generated method stub
			JibendraCode s=new JibendraCode();
		s.area(3);
		s.area(2,3);

		}
	
}
