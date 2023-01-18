package testfruit3;

abstract public class  Fruit implements Ediable,Matter{
	private int weight;
	private String taste;
	
	public Fruit(int weight,String taste) {
		this.weight =weight;
		this.taste = taste;
	}
	public int getWeight() {
		return this.weight;
	}
	public String getTaste() {
		return this.taste;
	}
	public boolean isPoisioned() {
		return true;
	}
}
