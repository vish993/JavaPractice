package interfaceStudy;

public interface Mother 
{
	void look();
	void nature();
	default void love()
	{
		System.out.println("Mother's Love");
	}
	
	static void anger()
	{
		System.out.println("Mothers Anger");
	}
	
	
}
