package Fruit;

public class importApple extends Apple{

	private String colour;
	
	public importApple(String name, int q, double p, String c) {
		super(name, q, p);
		this.colour = c;
	}

	public String colourImportApple() {
		return this.colour;
	}
	
	public double calprice() {
		return super.price * super.quantity;
	}
}
