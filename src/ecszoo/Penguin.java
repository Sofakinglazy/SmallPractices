package ecszoo;

public class Penguin extends Animal {

	public Penguin(int age, char gender) {
		super(age, gender);
		lifeExoectancy = 15;
		eats.add(Food.fish);
		eats.add(Food.ice_cream);
		decreasePoint = 2;
		treatPoint = 2;
	}

	@Override
	public boolean canTreat(Treat action) {
		return action.equals(Treat.watch_a_film);
	}

}
