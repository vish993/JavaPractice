package inheritance;

public class D extends C
{
	public void test4()
	
	{
		System.out.println("Propert of class 'D'.");
	}
	public static void main(String[] args) 
	{
		
		D b=new D();
		b.test();
		b.test1();
		b.test2();
		b.test4();
	
	}

}
