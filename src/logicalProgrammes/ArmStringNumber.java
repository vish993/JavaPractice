package logicalProgrammes;

import java.util.Scanner;

public class ArmStringNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a number-");
		int number=sc.nextInt();
		int sum=0;
		
		for (int i=number;i>0;i=i/10)
		{
			int rem=i%10;
			sum=sum+(rem*rem*rem);
		}
		if(number==sum)
		{
			System.out.println("Given number is armstrong number");

		}
		else
		{
			System.out.println("Given number is not armstrong number");

		}
		
		sc.close();
	}

}
