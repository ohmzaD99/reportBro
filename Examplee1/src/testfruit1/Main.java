package testfruit1;

public class Main {
	public static void main(String[] args) {
		//add banana
		Basket test1 = new Basket();
		test1.addBanana(new Banana(1));
		test1.addBanana(new Banana(2));
		test1.addBanana(new Banana(3));
		test1.addBanana(new Banana(2));
		test1.addBanana(new Banana(1));
		test1.addBanana(new Banana(2));
		
		//add orange
		test1.addOrange(new Orange(1));
		test1.addOrange(new Orange(2));
		test1.addOrange(new Orange(3));
		test1.addOrange(new Orange(2));
		test1.addOrange(new Orange(1));
		
		
		//print weight all
		System.out.println(test1.sumWeight());
		
		//test print toString
		Banana banana = new Banana(10);
		System.out.println(banana);
		
		// note be careful   > It's not  string a being equal to string b.      / test
		//                  > it is reference a equal to reference b        // reference keep address
//		String a = "test";
//		String b = new String("test");
//		if(a==b)System.out.println(true);
//		else System.out.println(false);
		
		// subbanana is extended by banana, but object subbanana can use refernce banana
//		Banana testba = new Banana(10);
//		Banana testsub = new subbanana(10,10);
	}
}
