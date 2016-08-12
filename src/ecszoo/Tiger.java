package ecszoo;

public class Tiger extends BigCat {

	public Tiger(int age, char gender) {
		super(age, gender);
		lifeExoectancy = 24;
		eats.add(Food.celery);
		eats.add(Food.steak);
		treatPoint = 3;
		decreasePoint = 2;
	}

}
