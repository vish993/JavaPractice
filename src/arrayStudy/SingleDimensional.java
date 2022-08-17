package arrayStudy;

public class SingleDimensional 
{

	public static void main(String[] args) 
	{
		//declaration
		int rollNum[]=new int[5];
		
		//initialization
		
		rollNum [0]=1;
		rollNum [1]=2;
		rollNum [2]=3;
		rollNum [3]=4;
		rollNum [4]=5;
		
		//usage
		System.out.println(rollNum[2]);
		System.out.println("===========================");
		System.out.println("Using for Loop");
		System.out.println("===========================");
		for(int i=0;i<=rollNum.length-1;i++)
		{
			System.out.println(rollNum[i]);
		}
		System.out.println("===========================");
		System.out.println("Without new Keyword");
		System.out.println("===========================");
		
		int rollNum1[]={1,2,3,4};
		
		System.out.println(rollNum1[0]);
		System.out.println("===========================");
		System.out.println("Using for Loop");
		System.out.println("===========================");
		for (int i=0;i<=rollNum1.length-1;i++)//here 'i' represents index of the roll number
		{
			System.out.println(rollNum1[i]);
		}System.out.println("===========================");
		System.out.println("Reverse");
		System.out.println("===========================");
		for (int i=rollNum1.length-1;i>=0;i--)
		{
			System.out.println(rollNum1[i]);
		}

	}

}
