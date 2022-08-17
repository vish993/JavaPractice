package interfaceStudy;

public class Son implements Mother,Father
{

	public static void main(String[] args) 
	{
		Son S=new Son();
		S.attitude();
		S.money();
		S.look();
		S.nature();
		S.laptop();
		S.love();// calling default methods from both interfaces
		Mother.anger();//calling static method from mother interface
		Father.anger();//calling static method from father interface
	}
	@Override
	public void money() 
	{
		System.out.println("Fathers money completed in Son' class");		
	}
	@Override
	public void attitude() 
	{
		System.out.println("Fathers attitude completed in Son' class");			
	}
	@Override
	public void look() 
	{
		System.out.println("Mothers look completed in Son' class");		
	}
	@Override
	public void nature() {
		System.out.println("Mothers nature completed in Son' class");			
	}
	public void laptop()
	{
		System.out.println("Sons own laptop");
	}
	@Override
	public void love() 
	{
	Mother.super.love();//calling mothers love method
	Father.super.love();//calling fathers love method
	}

}
