package revisionAutomation;

public class FamilyInformation {
	public void info(String name, String relationship, int age, String mobileNo, float height)
	{
		
		System.out.println("========================================");
		System.out.println("Name 			= "+name);
		System.out.println("Relationship 		= "+relationship);
		System.out.println("Age 			= "+age+" years");
		System.out.println("Contact No.		= "+mobileNo);
		System.out.println("Height 			= "+height+" ft");
		System.out.println("========================================");
		
	}
	public static void main(String[] args) {
		System.out.println("My name is Vishal Date & below is my family details:-");
		FamilyInformation A=new FamilyInformation();
		A.info("Namdeo Date", "Father", 60, "8276567856", 5.8f);
		A.info("Laxmi Date", "Mother", 53, "6589458752", 5.1f);		
		A.info("Mahendra Date", "Brother", 24, "8795854652", 5.7f);		
		A.info("Sweety Date", "Wifey", 27, "9857955585", 5.7f);		

	}

}
