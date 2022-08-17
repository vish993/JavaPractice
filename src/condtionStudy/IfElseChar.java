package condtionStudy;

import java.util.Scanner;
public class IfElseChar {


		public static void main(String[] args) {
			
			
			//Scanner sc=new Scanner(System.in);
	       // System.out.println("Enter a number: ");
	       // int num=sc.nextInt();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a grade: ");
			char grade=sc.next().charAt(0);
			
	if (grade=='A' | grade=='B') 
	{
		System.out.println("I got above 95% marks");
		if(grade=='B') {
			System.out.println("I got above 90% & below 95%");
		}
	} else {
	System.out.println("Invalid Input");
	}
	sc.close();
		}

	}
	
	
	

