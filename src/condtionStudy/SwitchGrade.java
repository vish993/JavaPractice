package condtionStudy;

public class SwitchGrade {

	public static void main(String[] args) {
		char grade='X';
		switch (grade) {
		case 'A':System.out.println("The marks are >=90%");
		break;
		case 'B':System.out.println("The marks are >=60% & <90%" );
		break;
		case 'C':System.out.println("The marks are >=40% & <60%" );
		break;
		case 'D':System.out.println("The marks are <40%" );
		break;
		default:System.out.println("Please enter valid grade");
		}
	}

}
