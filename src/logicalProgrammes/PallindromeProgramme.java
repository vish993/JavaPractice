package logicalProgrammes;

import java.util.Scanner;

public class PallindromeProgramme 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word-");
		String s = sc.next();
		String r="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			r=r+s.charAt(i);
		}
		if (s.equals(r))
		{
			System.out.println("The given word is Pallindrome");
		}
		else
		{
			System.out.println("The given word is not Pallindrome");

		}
		sc.close();
	

	}

}
