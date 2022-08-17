package arrayStudy;

public class SplitStudyArray 
{

	public static void main(String[] args) 
	{
		String S="The World is Beautiful";
		String[] S1=S.split(" ");
		char [] S2=S.toCharArray();
		for (int i=S1.length-1;i>=0;i--)
		{
			System.out.println(S1[i]+" ");
		}
		System.out.println("==========");
		for (int j=S2.length-1;j>=0;j--)
		{
			System.out.print(S2[j]+" ");
		}

	}

}
