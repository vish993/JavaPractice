package interfaceStudy;

public interface Father 
{
	void money();
	void attitude();
	default void love()
	{
		System.out.println("Fathers love");
	}
	static void anger()
	{
		System.out.println("Fathers Anger");
	}

}
