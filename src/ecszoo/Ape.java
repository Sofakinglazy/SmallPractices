package ecszoo;

public abstract class Ape extends Animal {

	public Ape(int age, char gender) {
		super(age, gender);
		eats.add(Food.ice_cream);
		eats.add(Food.fruit);
	}

}
