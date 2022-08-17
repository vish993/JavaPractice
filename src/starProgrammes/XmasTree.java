package starProgrammes;

public class XmasTree 
{

	public static void main(String[] args) 
	{
		//     *
		//    * *
		//   * * * 
		//  * * * * 
		//    * *
		//   * * * 
		//  * * * * 
		//    ***
		//    ***
		//    ***
		
		int star = 1;
		int space =3;
		
		for(int i=1; i<=10;i++)
		{
			for (int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			
			if(i<=4)
			{
				space--;
				star++;
			
			}
			
			if (i>4&&i<7)
			{
				star=star+1;
				space--;
			}
			System.out.println();
		}
		
	}

}
