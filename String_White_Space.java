package DXC;

import java.util.Scanner;

public class String_White_Space
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.nextLine();
		str=str.replaceAll("\\s","");
		System.out.println(str);

	}

}
