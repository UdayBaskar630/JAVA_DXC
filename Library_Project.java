package DXC;

import java.util.Scanner;

class Library
{
	int acc_num;
	String title;
	String author;
	
	

	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the acc_num");
		acc_num = sc.nextInt();
		System.out.print("Enter the author name");
		author= sc.next();
		System.out.println("Enter the title");
		title = sc.next();
		
		
		
		
		
	}
	
	void display()
	{
		
		System.out.println("acc_num  :"+ acc_num);
		
		System.out.println("the title  :"+ title);
		
		System.out.println("author name  :"+ author);
		
		
	}
	
	void compute()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days late");
		int days = sc.nextInt();
		int fine;
		fine = days*2;
		
		System.out.println("Fine to be paid: "+ fine);
		
	}
}
public class Library_Project {

	public static void main(String[] args) {
	
	Library P1 = new Library();
	
	P1.input();
	
	
	
	
	
	P1.display();
	
	P1.compute();

	}

}
