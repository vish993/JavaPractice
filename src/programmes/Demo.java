package programmes;

public class Demo {
	public void Plus(int a,int b)
			{
		System.out.println("Berij of 2 Nos. is "+a+b);
	}
	public void minus(int c, int d)
	{
		System.out.println(c-d);
	}
	
	public static void test1(int x, int y)
	{
		System.out.println("The addition fro another package "+x+y);
	}
	public static void main(String[] args) {
		Demo A=new Demo();
		A.Plus(25,26);
		A.minus(80,56);
		NonStatic B=new NonStatic();
		B.multi(12,5);
		test1(12,6);
	}
}
