package testfruit2;

public class Banana implements Ediable{
	private int weight;
	private String taste;
	
	public  Banana(int weight) {
		this(weight,"sweet");
	}
	public Banana(int weight,String taste) {
		this.weight = weight;
		this.taste = taste;
	}
	public int getWeight() {
		return this.weight;
	}
	public String getTaste() {
		return this.taste;
	}
	
	@Override
	public String toString() {
		return "weight = " + weight +  "  taste = " + taste ;
	}
	public boolean isPoisioned() {
		return true;
	}
}
