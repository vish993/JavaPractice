package logicalProgrammes;

import java.util.Scanner;

public class PrimeNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number-");
		int number =sc.nextInt();
		int counter=0;
		
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				counter++;
				break;
			}
		}
		if(counter==1)
		{
			System.out.println("The given number is not a prime number");
		}
		else
		{
			System.out.println("The given number is a prime number");

		}
		sc.close();
			
			
	}

}
