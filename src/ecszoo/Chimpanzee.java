package ecszoo;

public class Chimpanzee extends Ape {

	public Chimpanzee(int age, char gender) {
		super(age, gender);
		lifeExoectancy = 24;
		eats.add(Food.ice_cream);
		eats.add(Food.fruit);
		decreasePoint = 2;
		treatPoint = 4;
	}
}
