package logicalProgrammes;

public class RenNumWithoutStringCnvrt 
{

	public static void main(String[] args) 
	{
		int number=243;
		int revNumber = 0;
		
		for(int i=number;i>0;i=i/10)
		{
			int rem = i%10;
			revNumber=revNumber*10+rem;
		}
		System.out.println(revNumber);
	}

}
