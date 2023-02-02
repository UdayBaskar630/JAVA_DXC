package DXC;

import java.util.Scanner;  
public class Password_Generation
{
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);
		String input;	


		System.out.print("Please enter your password: ");
		input = keyboard.nextLine();

	
	 	if (authenticate(input))
	 		System.out.print("Error: This password is not valid.");
	 		
	 	else
	 		System.out.print("Thank you for entering your password.");

	 	System.out.println();
	}

	
	private static boolean authenticate(String password)
	{

		return ( (password.length() == 6) &&
				 (password.matches("[A-Z]")) &&
				 (password.matches("[a-z]")) &&
				 (password.matches("[0-9]") )&&
				 (password.matches("[@]"))
			   );
	}
}