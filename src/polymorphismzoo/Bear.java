package polymorphismzoo;

public class Bear extends Omnivore {

	public Bear() {
		super();
	}

	public Bear(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeNoise() {
		System.out.println("Growl.");
	}

}
