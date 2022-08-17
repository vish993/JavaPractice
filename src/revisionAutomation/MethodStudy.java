package revisionAutomation;
import programmes.Demo;
	
public class MethodStudy {
	public static void addition(int a, int b) 
	{
		int addition;
		a=85;
		b=98;
		addition=a+b;
		System.out.println("a+b="+addition);
	}
	public void multiply(int p, int q)
	{
		System.out.println("The multiplication is "+p*q);
	}
	public void divide(float f, float g ) {
		System.out.println("The division is "+f/g);
	}
	public static void main(String[] args) {
		addition(85,98); //static method call from same class 
		
		NewSM.division(45, 8);// static method call from another class
		
		MethodStudy D=new MethodStudy();//Non static method call from same class
		D.multiply(3,2);
		
		NewNSM S=new NewNSM();//Non static call from another class
		S.test(72,8);
		
		// Non-static method call from another package
		Demo A=new Demo();
		A.Plus(8,9);
		// Static method call from another package
		Demo.test1(89,7);
		D.divide(7,6);
		
	}
}
