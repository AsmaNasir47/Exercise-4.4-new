package Fruit;

public class Grape extends Fruit {
	
	protected int quantity;
	protected double weight;
	
	    public Grape (String name, int q, double w) {
	    	
		super(name);
		this.quantity = q;
		this.weight = w;
	    }
	    
		public int quantityGrape() {
			return this.quantity;
		}
		
		public double weightGrape() {
			return this.weight;
		}

		public double totWeight() {
			return this.quantity * this.weight;
		}
}
