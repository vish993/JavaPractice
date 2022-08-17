package thisSuperUse;

public class ThisStudy extends SupeUse
{
	int a=25;
	static int b=65;
	

	public static void main(String[] args) 
	{
		ThisStudy p=new ThisStudy();
	
		
		p.ThisUse();		
	
		

	}
	public void ThisUse()
	{
		int a=2;
		System.out.println("Local variable from sub class method = "+a);
		System.out.println("Global Non-Static variable from sub class = "+this.a);
		System.out.println("Global Non-Static variable from super class = "+super.a);
		//System.out.println("Global Static variable from sub class = "+this.b);
		//System.out.println("Global Static variable from super class = "+super.b);

	}

}
