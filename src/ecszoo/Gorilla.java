package ecszoo;

public class Gorilla extends Ape {

	public Gorilla(int age, char gender) {
		super(age, gender);
		lifeExoectancy = 32;
		eats.add(Food.ice_cream);
		eats.add(Food.fruit);
		decreasePoint = 3;
		treatPoint = 4;
	}

}
