package logicalProgrammes;

import java.util.Scanner;

public class EvenOddNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the Number-");
		int num = sc.nextInt();
		if(num%2==0)
		{
			System.out.println("The given number is even number");
			
		}
		else
		{
			System.out.println("The given number is odd number");
		}
		sc.close();
	}

}
