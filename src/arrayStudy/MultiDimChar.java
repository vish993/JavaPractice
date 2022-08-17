package arrayStudy;

public class MultiDimChar 
{

	public static void main(String[] args) 
	{
		String Name[][]= {{"Rahul","Rutuja","Mayur","Shrutika","Vishal"},
				{"velocity", "speed","pressure", "force","area"}};
		for (int S=0;S<=1;S++)
		{
			for (int P=0;P<=4;P++)
			{
				System.out.print(Name[S][P]+" , ");
			}
			System.out.println();
			
		}
		System.out.println("====================================");
		String str="Rahul";
		
		char[] a = str.toCharArray();//char[] a={'R', 'a', 'h', 'u', 'l'}
	
		System.out.println("============");

		int length = str.length();
		//Input String
		System.out.println("Given String is "+str);
		for(int i=length-1;i>=0;i--)
		{
		System.out.print(a[i]);
		}
	
	}

}
