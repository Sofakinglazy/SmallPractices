package polymorphismzoo;

public abstract class Omnivore extends Animal {
	
	public Omnivore(){
		super();
	}

	public Omnivore(String name, int age) {
		super(name, age);
	}

	@Override
	public abstract void makeNoise();

	@Override
	public void eat(Food food) {
		System.out.println("eating anything.");
	}

	
}
