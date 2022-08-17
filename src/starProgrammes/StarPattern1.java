package starProgrammes;

public class StarPattern1 
{

	public static void main(String[] args) 
	{
		int star = 5;
		for(int i=1;i<=5;i++)  //No of rows
		{
			for(int j=1;j<=star;j++)
			{
			System.out.print("*");
			}
			star--;
			System.out.println();
		}			
	}
}
