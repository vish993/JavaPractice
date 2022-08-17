package starProgrammes;

public class StarPattern11 
{

	public static void main(String[] args) 
	{
				//*        *
				//**      **
				//***    ***
				//****  ****
				//**********
				//****  ****		
				//***    ***
				//**      **
				//*        *
		
		int star = 1;
		int space = 4;
		
		for (int i=1;i<=9;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
								
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			if(i<5)
			{
				star++;
				space--;
			}
			else
			{
				star--;
				space++;
			}
			System.out.println();
				
		}
		
		

	}

}
