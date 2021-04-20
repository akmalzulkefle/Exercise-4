import java.util.Scanner;

public class Puma extends Shoes {		//sub Class
	
	Scanner s = new Scanner(System.in);
	private String brand, type, colour;
	private double price;
	
	Puma(){
		
		this.brand = "PUMA";
		System.out.println("Enter Type : ");
		this.type = s.nextLine();
		System.out.println("Enter Colour :");
		this.colour = s.nextLine();
		System.out.println("Enter Price : ");
		this.price = s.nextDouble();
				
	}
	
	public String getbrand() {
		return brand;
	}

	public String gettype() {
		return type;
	}

	public String getcolour() {
		return colour;
	}

	public double getprice() {
		return price;
	}
	
}
