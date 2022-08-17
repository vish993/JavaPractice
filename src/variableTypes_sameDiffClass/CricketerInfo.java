package variableTypes_sameDiffClass;

public class CricketerInfo {
//Name ,gender,  Role, Jersey No., Runs, Wickets, strike rate, avg
	
	String name;
	char gender;
	String role;
	int JerseyNo;
	int runs;
	int wickets;
	float strikeRate;
	float avg;
	public void data()
	{
		System.out.println("==============================");
		System.out.println("Cricketer Name 	= "+name);
		System.out.println("Gender 		= "+gender);
		System.out.println("Role=		= "+role);
		System.out.println("Jersey No.	= "+JerseyNo);
		System.out.println("Runs in ODI   	= "+runs);
		System.out.println("Wickets in ODi 	= "+wickets);
		System.out.println("Strike Rate 	= "+strikeRate);
		System.out.println("Batting Average	= "+avg);
		
	}
}
