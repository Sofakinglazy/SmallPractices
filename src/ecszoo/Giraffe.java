package ecszoo;

public class Giraffe extends Animal {

	public Giraffe(int age, char gender) {
		super(age, gender);
		lifeExoectancy = 28;
		eats.add(Food.hey);
		eats.add(Food.fruit);
		decreasePoint = 2;
		treatPoint = 4;
	}

	@Override
	public boolean canTreat(Treat action) {
		return action.equals(Treat.neck_Massage);
	}

}
