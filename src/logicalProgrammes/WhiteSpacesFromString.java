package logicalProgrammes;

public class WhiteSpacesFromString 
{

	public static void main(String[] args) 
	{
		String s="The World is Beautiful";
		int counter=0;
		
		for (int i=0;i<=s.length()-1;i++)
		{
			char blank = s.charAt(i);
			if (blank == ' ')
			{
				counter++;
			}
			
		}
		System.out.println("The numbber of blank spaces in "+s+" are "+counter);
	}

}
