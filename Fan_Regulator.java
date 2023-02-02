package DXC;

import java.util.Scanner;

class Fan
{
	int Speed;
	Boolean Status;
	String Colour;
	int radius;
	public int getSpeed() {
		return Speed;
	}


	public void setSpeed(int speed) {
		Speed = speed;
	}


	public Boolean getStatus() {
		return Status;
	}


	public void setStatus(Boolean status) {
		Status = status;
	}


	public String getColour() {
		return Colour;
	}


	public void setColour(String colour) {
		Colour = colour;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	
	
	public  void  todisplay()
	 {
		boolean status;
		int speed;
		String colour;
		double radius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fan Status");
		status= sc.nextBoolean();
		System.out.println("Enter the Fan Speed");
		speed= sc.nextInt();
		System.out.println("Enter the Fan colour");
		colour= sc.next();
		System.out.println("Enter the Fan radius");
		radius= sc.nextDouble();
		
		if(status == true)
		{
			System.out.println("Fan is ON"+ "It is at a Speed of "+ speed + " Colour is "+ colour+ "Radius of Fan is "+ radius);
		}
		else
		{
			System.out.println("Fan is Off"+ "Colour of Fan is "+ colour + "Radius is " + radius);
		}
	 }
}

public class Fan_Regulator {

	public static void main(String[] args) {
		
	
	Fan f1 = new Fan();
	
	f1.setStatus(false);
	f1.setColour("Blue");
	f1.setRadius(7);
	f1.setSpeed(2);
	f1.getStatus();
	f1.getColour();
	f1.getRadius();
	f1.getSpeed();
	
	System.out.println("Status of Fan is "+ f1.getStatus()+" , "+" Colour is " + f1.getColour()+" , "+ "Radius is "+ f1.getRadius()+ "  , "+"Speed is "+ f1.getSpeed());
	
	
	
	
	}

	

}
