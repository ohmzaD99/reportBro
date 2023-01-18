package testfruit1;

import java.util.*;

public class Basket {
	List<Banana> bananaList = new ArrayList<Banana>();
	List<Orange> orangeList = new ArrayList<Orange>();
	
	public Basket() {};
	
	public void addBanana(Banana temp) {
		bananaList.add(temp);
	}
	public void addOrange(Orange temp) {
		orangeList.add(temp);
	}
	public int sumWeight() {
		int sum=0;
		for(Banana go : bananaList) {
			sum+= go.getWeight();
		}
		for(Orange go : orangeList) {
			sum+= go.getWeight();
		}
		return sum;
	}
	
}
