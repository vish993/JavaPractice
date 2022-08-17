package condtionStudy;
import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		Scanner A=new Scanner(System.in);
		System.out.println("Enter a Season: ");
		String season=A.next();
		System.out.println("========");
System.out.println("You have entered season "+season);
System.out.println("========");
if (season.equals("summer")) 
{
System.out.println("Its very Hot");

}
else if (season.equals("rainy"))
{
System.out.println("Its raining heavily");

}
else if (season.equals("winter")) {
System.out.println("Its Very Cold");
	
	
}
else {
System.out.println("Invalid Information");
}
A.close();
	}
}
