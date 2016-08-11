package polymorphismzoo;

import junit.framework.TestCase;

public class WrongFoodExceptionTest extends TestCase {

	public void testWrongFoodException(){
		Animal wolf = new Wolf("Peter", 3);
		Meat beef = new Meat("Beef");
		Plant leaf = new Plant("Leaf");
		
		try {
			wolf.eat(beef);
		} catch (WrongFoodException e) {
			e.printStackTrace();
		}
		
		try {
			wolf.eat(leaf);
		} catch (WrongFoodException e) {
			e.printStackTrace();
		}
	}
}
