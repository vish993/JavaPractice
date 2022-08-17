package controlStatementas;
import java.util.Scanner;
public class IfStudy_integer 
{

	public static void main(String[] args) 
	{
		Scanner wt=new Scanner(System.in);
		System.out.println("Please enter a weight:-");
		int weight=wt.nextInt();

		if (weight>=85)
		{
			System.out.println("The person is overweight.");
		}
		else
		{
			System.out.println("The person is having normal weight.");
			
		}
		wt.close();

	}

}
