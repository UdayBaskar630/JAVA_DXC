package DXC;
import java.util.Scanner;


public class Distance_calculator {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Speed of Vehicle : ");
	int speed = sc.nextInt();
	System.out.println("Enter the Time in Minutes ");
	int time = sc.nextInt();
	Distance(speed, time);
	
	}

	private static void Distance(int speed, int time) {
		
		int Total_Distance= speed * time;
		System.out.println("Total Distance Travelled is "+ Total_Distance);
	}

}
