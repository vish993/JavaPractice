package constructorStudy;
import java.util.Scanner;

public class StudySca {
	public void add(int x, int y)
	
	{
		int add=x+y;
		System.out.println("The addition of x & y is "+add);
		System.out.println("=======================");
	}
	public static void main(String[] args) {
		StudySca S=new StudySca();
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter first number-");
		
		int a=SC.nextInt();
		System.out.println("Enter second number-");
		int b=SC.nextInt();
		SC.close();
		S.add(a,b);
	}
}
