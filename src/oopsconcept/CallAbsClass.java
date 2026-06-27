package oopsconcept;

public class CallAbsClass extends DemoAbsClass
{

	
	public void meth2() {
		System.out.println("This is credential");
		
	}

	public static void main(String[] args) {
		
		CallAbsClass cac = new CallAbsClass();
		cac.meth1();
		cac.meth2();
	}
	
	//ctrl+s to save
	
}
