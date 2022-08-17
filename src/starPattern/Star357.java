package starPattern;

public class Star357 
{

	public static void main(String[] args) 
	{
		for (int i=1;i<=3;i++)
		{
		for (int m=0; m<i; m++) 
           {
                System.out.print(" ");
            }
			for (int j=5;j>(i*2)-2;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			
			System.out.println("==================================");
			
			{
				for (int p=1;p<=3;p++)
				{
				for (int q=3; q>p; q--) 
		           {
		                System.out.print(" ");
		            }
					for (int r=1;r<(p*2);r++)
					{
						System.out.print("*");
					}
					System.out.println();
				}		
		}		
	}
}

