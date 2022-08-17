package loopStudy;

public class StarPattern 
{

	public static void main(String[] args) 
	{
		for(int i=1; i<=6; i++)
		{
			for (int j=6; j<i; j--)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=i -1; k++)
            {
                System.out.print("*");
            }    
			System.out.println();
		}
		System.out.println();
		System.out.println("======================================");
		for (int l=1; l<=5; l++) 
        { 
            // Print space in decreasing order 
            for (int m=5; m>l; m--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int n=1; n<=(l*1); n++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
	}
	  	
}
