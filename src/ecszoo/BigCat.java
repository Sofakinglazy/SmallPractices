package ecszoo;

public abstract class BigCat extends Animal {
	
	public BigCat(int age, char gender) {
		super(age, gender);
		lifeExoectancy = 24;
		eats.add(Food.celery);
		eats.add(Food.steak);
	}
}
