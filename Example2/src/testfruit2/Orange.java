package testfruit2;

public class Orange {
	private int weight;
	private String taste;
	
	public  Orange(int weight) {
		this(weight,"sour");
	}
	public Orange(int weight,String taste) {
		this.weight = weight;
		this.taste = taste;
	}
	public int getWeight() {
		return this.weight;
	}
	public String getTaste() {
		return this.taste;
	}
	public String toString() {
		return "weight = " + weight +  "  taste = " + taste ;
	}
}
