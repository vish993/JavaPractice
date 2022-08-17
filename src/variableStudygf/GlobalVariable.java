package variableStudygf;

public class GlobalVariable 
{
	int a=5;					// Non-static global variable
	static int b=4;				//Static-global variable
	public static void main(String[] args) {
	GlobalVariable GV=new GlobalVariable();
	System.out.println("Non static global variable is "+GV.a);
		System.out.println(" ========================= ");
		System.out.println("Static Global Variable is "+b);
		System.out.println(" ========================= ");
	int sum=GV.a+b;
	System.out.println("The sum of global variable a & b is "+sum+".");
	GV.Division();  // Non-static method from same class
	Multi();		// Static method call from same class
	}
public void Division(){
	int p;
	p=8;
	int div=64/p;
	System.out.println(" ========================= ");
	System.out.println("The division of 64 by local vairiable a is "+div);
	System.out.println(" ========================= ");
	System.out.println(" Local variable & Global Non static Variable addition In Non Static Method ");
	int sum=a+p;
	System.out.println("The Summation of local varible 'p' & global non static variable 'a' "+sum);
	int sub=p-b;
	System.out.println(" ========================= ");
	System.out.println("The subtraction is "+sub);
}
public static void Multi(){
	System.out.println(" ========================= ");
	int q=9;
	int multi=9*q;
	System.out.println(" Local variable & Global static Variable addition STATIC METHOD ");
	System.out.println(" ========================= ");
	System.out.println("The Multiplication of 9 with local variable is "+multi);
	int sum=b+q;
	System.out.println(" ========================= ");
	System.out.println("The Summation of Static Global Variable b & Nonstatic local variable q is "+sum);
	//int add=a+q;  // Not accepting non static global in static method
}

}
