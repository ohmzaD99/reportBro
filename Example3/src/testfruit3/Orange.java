package testfruit3;

public class Orange extends Fruit {

	public  Orange(int weight) {
		this(weight,"sour");
	}
	public Orange(int weight,String taste) {
		super(weight,taste);
	}
}
