package ecszoo;

public class BigCat extends Animal {
	
	public BigCat(int age, char gender) {
		super(age, gender);
		lifeExoectancy = 24;
		eats.add(Food.celery);
		eats.add(Food.steak);
	}

	@Override
	public boolean canTreat(Treat action) {
		return action.equals(Treat.stroked);
	}
	
	
}
