
public class Main {

	public static void main(String[] args) {

		Puma p = new Puma();
		System.out.println();
		System.out.println("Brand : " + p.getbrand());
		System.out.println("Type : " + p.gettype());
		System.out.println("Colour : " + p.getcolour());
		System.out.println("Weight : " + p.getweight() + "g");
		System.out.println("Size : " + p.getsize() + "UK");
		System.out.println("Quantity : " + p.getquantity());
		System.out.println("Price : RM" + p.getprice());
		System.out.println("Total Price = RM" + p.gettotalPrice());
		
		System.out.println();
		
		Asics a = new Asics();
		System.out.println();
		System.out.println("Brand : " + a.getbrand());
		System.out.println("Type : " + a.gettype());
		System.out.println("Colour : " + a.getcolour());
		System.out.println("Weight : " + a.getweight() + "g");
		System.out.println("Size : " + a.getsize() + "UK");
		System.out.println("Quantity : " + a.getquantity());
		System.out.println("Price : RM" + a.getprice());
		System.out.println("Total Price = RM" + a.gettotalPrice());
	}

}
