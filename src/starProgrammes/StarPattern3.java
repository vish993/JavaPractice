package starProgrammes;

public class StarPattern3 
{

	public static void main(String[] args) 
	{
		//    *
		//   **
		//  ***
		// ****
		//*****
		
		int space = 4 ;
		int star=1;
		
		for(int i=1;i<=5;i++)
		{
			
			for (int k=1;k<=space;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			star++;
			space--;
			System.out.println();
		}
	}

}
