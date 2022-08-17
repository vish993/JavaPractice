package condtionStudy;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		
		//Scanner sc=new Scanner(System.in);
       // System.out.println("Enter a number: ");
       // int num=sc.nextInt();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a weight: ");
		float wt=sc.nextFloat();
if (wt>=59.5f) 
{
	System.out.println("I am heavier.");
	if(wt>89.2f) {
		System.out.println("I am too much heavy");
	}
} else {
System.out.println("I am lighter.");
}
sc.close();
	}

}
