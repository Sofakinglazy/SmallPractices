package polymorphismzoo;

public abstract class Carnivore extends Animal {
	
	public Carnivore(){
		super();
	}

	public Carnivore(String name, int age) {
		super(name, age);
	}

	@Override
	public abstract void makeNoise();

	@Override
	public void eat(Food food) throws WrongFoodException {
		if (food instanceof Meat){
			System.out.println("eating meat.");
		} else if (food instanceof Plant){
			throw new WrongFoodException("Carnivore don't eat meat.");
		}
	}
	
	
}
