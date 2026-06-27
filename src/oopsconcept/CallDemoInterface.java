package oopsconcept;

public class CallDemoInterface implements DemoInterface
{


	public void meth3() {
		
		System.out.println("this is interface's Method3");
	}


	public void meth4() {
		
		System.out.println("this is interface's Method4");
	}

	public static void main(String[] args) {
		
		CallDemoInterface ci = new CallDemoInterface();
		ci.meth3();
		ci.meth4();
	}
	
}
