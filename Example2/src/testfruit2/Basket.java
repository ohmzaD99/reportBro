package testfruit2;

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
	// sum weight all
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
	// sum weight is Edible
	public int sumWeightEdiable() {
		int sum =0;
		
		for(Banana go : bananaList) {
			if(go.isPoisioned())sum+= go.getWeight();
			
		}
		
		
		return sum;
	}
	
}
