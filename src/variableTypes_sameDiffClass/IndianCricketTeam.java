package variableTypes_sameDiffClass;

public class IndianCricketTeam {

	public static void main(String[] args) {
		CricketerInfo Sachin=new CricketerInfo();
		Sachin.name="Sachin Tendulkar";
		Sachin.gender='M';
		Sachin.role="Batsman";
		Sachin.JerseyNo=10;
		Sachin.runs=18426;
		Sachin.wickets=154;
		Sachin.strikeRate=86.24f;
		Sachin.avg=44.83f;
		
		CricketerInfo Dhoni=new CricketerInfo();
		Dhoni.name="Mahendra Singh Dhoni";
		Dhoni.gender='M';
		Dhoni.role="Wicketkeeper Batsman";
		Dhoni.JerseyNo=7;
		Dhoni.runs=107793;
		Dhoni.wickets=1;
		Dhoni.strikeRate=87.66f;
		Dhoni.avg=50.58f;
		Sachin.data();
		Dhoni.data();
	}

}
