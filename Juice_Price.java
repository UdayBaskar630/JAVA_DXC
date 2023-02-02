package DXC;

import java.util.Scanner;

class FruitJuice
{
	int product_code, pack_size, product_price;
	String flavour, pack_type;
	
	

	public FruitJuice(int product_code, int pack_size, int product_price, String flavour, String pack_type) {
		super();
		this.product_code = product_code;
		this.pack_size = pack_size;
		this.product_price = product_price;
		this.flavour = flavour;
		this.pack_type = pack_type;
	}
	
	void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Product Code");
		int product_code= sc.nextInt();
		System.out.println("Enter the flavour");
		String flavour = sc.next();
		System.out.println("Enter the pack_type");
		String pack_type= sc.next();
		System.out.println("Enter the pack_size");
		int pack_size = sc.nextInt();
		System.out.println("Enter the product_price");
		int product_price  = sc.nextInt();
		
		
	}
	
	void discount()
	{
		int final_price = product_price - 10;
		System.out.println(final_price);
	}
	
	void display()
	{
		
		System.out.println("Product Code"+ product_code);
		
		System.out.println("flavour"+ flavour);
		
		System.out.println("pack_type"+pack_type);
		
		System.out.println("pack_size"+ pack_size);
		
		System.out.println("product_price"+ product_price);
		
	}
	
	
}
public class Juice_Price {

	public static void main(String[] args) {
		
	FruitJuice P1 = new FruitJuice(1, 200, 25, "Mango", "TetraPack");
	FruitJuice P2 = new FruitJuice(2, 200, 25, "Orange", "Pet Bottle");
	P1.input();
	P1.display();
	P1.discount();
	
	
	
	
	}

}
