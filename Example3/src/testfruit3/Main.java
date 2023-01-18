package testfruit3;

public class Main {
	public static void main(String[] args) {
		//add banana
		Basket test1 = new Basket();
		test1.add(new Banana(1));
		test1.add(new Banana(2));
		test1.add(new Banana(3));
		test1.add(new Banana(2));
		test1.add(new Banana(1));
		test1.add(new Banana(2));
		
		//add orange
		test1.add(new Orange(1));
		test1.add(new Orange(2));
		test1.add(new Orange(3));
		test1.add(new Orange(2));
		test1.add(new Orange(1));
		
		//add Card
		
		test1.add(new Card(2));
		test1.add(new Card(3));
		test1.add(new Card(2));
		test1.add(new Card(1));
		
		
		//print weight all
		System.out.println("sum weight all = "+test1.sumWeight());
		
		//test print toString
		Banana banana = new Banana(10);
		System.out.println(banana);
		
		// note be careful  > It's not  string a being equal to string b. 
		//                  > it is reference a equal to reference b        // reference keep address
//		String a = "test";
//		String b = new String("test");
//		if(a==b)System.out.println(true);
//		else System.out.println(false);
		
		// subbanana is extended by banana, but object subbanana can use refernce banana
//		Banana testba = new Banana(10);
//		Banana testsub = new subbanana(10,10);
		
		
		System.out.println("sum weight is Edibleis " + test1.sumWeightEdiable());
		
		for(TasteWeight run : test1.findTasteWeight()) {
			System.out.println(run);
		}
		System.out.println(test1.findTasteWeightByMap());
		
	}
}
