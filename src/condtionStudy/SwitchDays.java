package condtionStudy;

public class SwitchDays {

	public static void main(String[] args) {
		String Day="xyz";
		
switch (Day) {
case "Monday": 
	System.out.println("This is is 2nd day of the week.");
	break;
case "Tuesday": 
	System.out.println("This is is 3rd day of the week.");
	break;
case "Wednesday": 
	System.out.println("This is is 4th day of the week.");
	break;
case "Thursday": 
	System.out.println("This is is 5th day of the week.");
	break;
case "Friday": 
	System.out.println("This is is 6th day of the week.");
	break;
case "Saturday": 
	System.out.println("This is is 7th day of the week.");
	break;
case "Sunday": 
	System.out.println("This is is 1st day of the week.");
	break;
default:System.out.println("Please enter valid Input");
}
	}

}
