import java.util.Scanner;

public class Shoes {		//parent Class
	
	Scanner s = new Scanner(System.in);
	private int quantity;
	private double size, weight, totalPrice;
	
	Shoes(){
		
		System.out.println("Enter Size : ");
		this.size = s.nextDouble();
		System.out.println("Enter Weight : ");
		this.weight = s.nextDouble();
		System.out.println("Enter Quantity : ");
		this.quantity = s.nextInt();
		System.out.println(" Please Enter The Price And Quantity : ");
		int p = s.nextInt(); 
		int q = s.nextInt();
		this.totalPrice = p*q;

	}
	
	public double getsize() {
		return size;
	}

	public double getweight() {
		return weight;
	}

	public int getquantity() {
		return quantity;
	}

	public double gettotalPrice() {
		return totalPrice;
	}
}
