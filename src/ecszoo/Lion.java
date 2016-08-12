package ecszoo;

public class Lion extends BigCat {

	public Lion(int age, char gender) {
		super(age, gender);
		lifeExoectancy = 24;
		eats.add(Food.celery);
		eats.add(Food.steak);
		treatPoint = 2;
		decreasePoint = 3;
	}

}
