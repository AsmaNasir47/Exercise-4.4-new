package Fruit;

public class localApple {
	
    private String taste;
    
	public localApple(String name, int q, double p, String t) {
		super();
		this.taste = t;
	}
	public String tasteLocalApple() {
		return this.taste;
	}
	
	public double calprice() {
		return super.price * super.quantity;
	}
}
