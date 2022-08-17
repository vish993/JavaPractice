package controlStatementas;
import java.util.Scanner;
public class NestedIf_String {

	public static void main(String[] args) 
	{
		// if password is correct then enter PWD
				// if PWD is correct then Login successful
				// else PWD is wrong-->> Please enter valid PWD
				// else UN is wrong-->> Please enter valid UN
				Scanner SC=new Scanner(System.in); 
				System.out.println("Enter Username - ");
				String UN=SC.next();
				//String UN="vish1993";
				//String PWD="Vish@993";
				if(UN.equals("vish1993")) 
				{
					System.out.println("Username is correct, Please enter Password - ");
					System.out.println("Enter Password - ");
					String PWD=SC.next();
					if(PWD.equals("Vish@993")) 
					{
						System.out.println("Password Correct, Login Successful");
					}
						else 
						{
							System.out.println("Invalid Password, Login Failed, Please enter valid Password");
						}
				}
				else 
				{
					System.out.println("Invalid Username, Please enter valid Username");
				}
				SC.close();
	}

}
