package testfruit3;

import java.util.*;

public class Basket {
	private List<Matter> info = new ArrayList<Matter>();
	
	public Basket() {};
	
	public void add(Matter temp) {
		info.add(temp);
	}
	
	// sum weight all
	public int sumWeight() {
		int sum=0;
		for(Matter go : info) {
			sum+= go.getWeight();
		}
		for(Matter go : info) {
			sum+= go.getWeight();
		}
		return sum;
	}
	// sum weight is Edible
	public int sumWeightEdiable() {
		int sum =0;
		
		for(Matter go : info) {
			if(go instanceof Ediable)sum+= go.getWeight();
		}
		
		return sum;
	}
	public List<TasteWeight> findTasteWeight(){
		List<TasteWeight> anser = new ArrayList<TasteWeight>();
		
		for(Matter temp : info) {
			if(temp instanceof Ediable && temp instanceof Fruit) {// (check object temp have Edible)&&(check object temp is fruit)
				int tempWeight = ((Fruit)temp).getWeight(); // use cast change temp is fruit find weight
				String tempTaste = ((Fruit)temp).getTaste();  // use cast change temp is fruit find taste
				
				int i =findPosition(anser,tempTaste); // find taste in temp    have in taste in anser?
				if(i<0) { // if dont have
					anser.add(new TasteWeight(tempWeight,tempTaste)); // add new taste and new weight
				}
				else { // if have
					anser.get(i).plusWeight(tempWeight); // plus another weight in same taste
				}
			}
		}
		
		return anser;
	}
	public int findPosition(List<TasteWeight> anser,String taste) {// check taste have taste in anser? if dont have return -1
		for(int i=0 ; i<anser.size() ; i++) {
			if(taste.equals(anser.get(i).getTaste()))return i;
		}
		return -1;
	}
	public HashMap findTasteWeightByMap() {
		HashMap<String,Integer> anser = new HashMap();
		for(Matter temp : info) {
			if(temp instanceof Ediable && temp instanceof Fruit) {// (check object temp have Edible)&&(check object temp is fruit)
				int tempWeight = ((Fruit)temp).getWeight(); // use cast change temp is fruit find weight
				String tempTaste = ((Fruit)temp).getTaste();  // use cast change temp is fruit find taste
				
				if(anser.containsKey(tempTaste)) { // search temptase in anser
					int debug = tempWeight+anser.get(tempTaste);  
					anser.replace(tempTaste,debug);
				}
				else {
					anser.put(tempTaste, tempWeight);
				}
			}
		}
		return anser;
	}
	
}
