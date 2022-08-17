package finalKeywordUse;

public final class A 
{

	public static void main(String[] args) 
	{
		int a=27;
		System.out.println(a);
		a=a+25;
		System.out.println(a);
		
		final int b=10;
		System.out.println(b);
		//b=b+12; final variable wont allow us updating in value
		System.out.println(a+b);
		System.out.println(12/b
				);
		

		
	}
}
