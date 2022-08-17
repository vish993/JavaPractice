package logicalProgrammes;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[]args)
	{
		Scanner SC=new Scanner(System.in);
		System.out.println("Enter the string to be reverse-");
		String s = SC.next();
		String r="";
		for (int i=s.length()-1;i>=0;i--)
		{
			//vishal
			r=r+s.charAt(i);
		}
		System.out.println(r);
		SC.close();
	}

}
