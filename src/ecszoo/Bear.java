package ecszoo;

public class Bear extends Animal {

	public Bear(int age, char gender) {
		super(age, gender);
		lifeExoectancy = 18;
		eats.add(Food.fish);
		eats.add(Food.steak);
		decreasePoint = 2;
		treatPoint = 3;
	}

}
