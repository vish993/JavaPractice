package polymorphism;

public class C 
{

	public static void main(String[] args) {
		
			B b=new B();
			A a=new A();
			
			//A b;
			//b=new A();
			//b=new B();
			
			b.test();
			a.test();	
	}
}
