package testfruit3;

public class TasteWeight {
	private int weight;
	private String taste;
	public TasteWeight(int weight,String taste) {
		this.weight = weight;
		this.taste = taste;
	}
	public int getWeight() {
		return this.weight;
	}
	public String getTaste() {
		return this.taste;
	}
	public void plusWeight(int plus) {
		this.weight+= plus;
	}
	@Override
	public String toString() {
		return "weight = " + weight + " taste = " + taste ;
	}
}
