package starProgrammes;

import java.util.Scanner;

public class TimeSandPattern 
{

	public static void main(String[] args) 
	{
		//*******
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//*******
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please enter ODD no of Rows-");
		
		int row=sc.nextInt();
		int star1 = row;
		int space = 0;
		System.out.println("The Time Sand pattern for "+row+ " is -");
		
		for (int i=1; i<=row;i++)
		{
			for (int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=star1;k++)
			{
				System.out.print("*");
				
			}
			
			
			if (i<((row-1)/2)+1)
			{
				star1=star1-2;
				space++;
			}
			else
			{
				star1=star1+2;
				space--;
			}
			System.out.println();
		}
		sc.close();
		
		
		
	}

}
