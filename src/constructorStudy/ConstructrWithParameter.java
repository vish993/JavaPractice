package constructorStudy;

public class ConstructrWithParameter {
	int a;
	int b;
	int c;
	int d;
	
	public ConstructrWithParameter()
	
	{
		a=5;
		b=6;
		c=8;
		d=7;
	}
public ConstructrWithParameter(int x)
	
	{
	a=x;
	}
public ConstructrWithParameter(int x, int y)

{
a=x;
b=y;
}
public ConstructrWithParameter(int x, int y, int z)

{
a=x;
b=y;
c=z;
}
public ConstructrWithParameter(int x, int y, int z, int w)

{
a=x;
b=y;
c=z;
d=w; 
}
	public static void main(String[] args) {
		ConstructrWithParameter m= new ConstructrWithParameter();
		m.addition();
		ConstructrWithParameter m1= new ConstructrWithParameter(98);
		m1.addition();
		ConstructrWithParameter m2= new ConstructrWithParameter(100,200);
		m2.addition();
		ConstructrWithParameter m3= new ConstructrWithParameter(78,68,85);
		m3.addition();
		ConstructrWithParameter m4= new ConstructrWithParameter(1,2,3,4);
		m4.addition();
		
		
	}
public void addition()//non-static method
	{
	int sum=a+b+c+d;
	System.out.println("The sum is "+sum);
	}
	
		
		
	}
