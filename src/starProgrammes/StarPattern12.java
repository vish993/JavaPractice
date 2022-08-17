package starProgrammes;

public class StarPattern12 
{

	public static void main(String[] args) 
	{
		//    *
		//   ***
		//  *****
		// *******
		//  *****
		//   ***
		//    *
		
		int star = 1;
		int space =3;
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for (int k=1;k<=star;k++)
			{	
				System.out.print("*");
			
			}
			if(i<4)
			{
				space--;
				star=star+2;
			}
			else
			{
				space++;
				star=star-2;
			}
			System.out.println();
		}
	}

}
