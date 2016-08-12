package ecszoo;

public class Elephant extends Animal {

	public Elephant(int age, char gender) {
		super(age, gender);
		lifeExoectancy = 36;
		eats.add(Food.hey);
		eats.add(Food.fruit);
		decreasePoint = 2;
		treatPoint = 5;
	}

}
