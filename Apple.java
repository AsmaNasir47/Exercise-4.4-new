package Fruit;

public class Apple extends Fruit {

	protected int quantity;
	protected double price;
	
	    public Apple (String name, int q, double p) {
	    	
		super(name);
		this.quantity = q;
		this.price = p;
		
		if (this.quantity < 10) {
			totPrice(); //overloading with no arguments sbb harga dan kuantiti sama/tak berubah
			System.out.println(name);
			System.out.println("If quantity LESS than 10, Total price: RM" + totPrice());
		
		}
			else if (this.quantity > 10 && this.quantity < 100) {
			double pp = 1.99; // beli lebi dari 10 tapi kurang dari 100, harga 1.99
			totalPrice(pp); //overloading with 1 argument
			System.out.println(name);
			System.out.println("If quantity MORE than 10, Total price: RM" + totalPrice(pp));
		}
		
			else {
			double pp = 0.99; //beli lebih drp 100, harga menjadi 0.99
			double dd = 0.1; //beli byk lebih daripada 100, ada diskaun 10%
			totalPrice(dd, pp); //overloading with 2 arguments
			System.out.println(name);
			System.out.println("If quantity MORE than 100, Total price: RM" + totalPrice(dd,pp));
		}
		
	}
		
		public double totPrice() {
			return this.quantity * this.price;
		}
		
		public double totalPrice(double pr) {
			return pr * this.quantity;
		}
		
		public double totalPrice(double qq, double pr) {
			return (pr * this.quantity) * qq;
		}	
}

