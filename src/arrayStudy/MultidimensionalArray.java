package arrayStudy;

public class MultidimensionalArray 
{

	public static void main(String[] args) 
	{
		System.out.println("===========================");
		System.out.println("With New Keyword");
		System.out.println("===========================");
		int matrix[][]=new int[2][2];
		
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[1][0]=3;
		matrix[1][1]=4;
		System.out.println("===========================");
		System.out.println("Without for Loop");
		System.out.println("===========================");
		System.out.print(matrix[0][0]+" ");
		System.out.println(matrix[0][1]);
		System.out.print(matrix[1][0]+" ");
		System.out.println(matrix[1][1]);
		System.out.println("===========================");
		System.out.println("With for Loop");
		System.out.println("===========================");
		for (int i=0;i<=1;i++)
		{
			for (int j=0;j<=1;j++)
			{
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("===========================");
		System.out.println("Without New Keyword");
		System.out.println("===========================");
		int matrix1[][]= {{1,2},{3,4}};
		for (int i=0;i<=1;i++)
		{
			for (int j=0;j<=1;j++)
			{
				System.out.print(matrix1[i][j]+" ");
			}
			System.out.println();
		}
		
		for (int i=1; i<=5;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		



		

	}

}
