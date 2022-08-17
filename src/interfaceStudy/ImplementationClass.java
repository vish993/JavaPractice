package interfaceStudy;

public class ImplementationClass implements InterfaceUse
{

	public static void main(String[] args) 
	{
		ImplementationClass IC=new ImplementationClass();
		IC.test1();
		IC.test2();
		IC.test3();

	}

	@Override
	public void test1() 
	{
		System.out.println("This is test 1 method completed in implementation class");
	}

	@Override
	public void test2() 
	{
		System.out.println("This is test 2 method completed in implementation class");

		
	}
	public void test3()
	{
		System.out.println("This is own method from Implementation class");
	}
	

}
