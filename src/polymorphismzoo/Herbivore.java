package polymorphismzoo;

public abstract class Herbivore extends Animal {

	public Herbivore(){
		super();
	}
	
	public Herbivore(String name, int age) {
		super(name, age);
	}

	@Override
	public abstract void makeNoise();

	@Override
	public void eat(Food food) throws WrongFoodException {
		if (food instanceof Plant){
			System.out.println("eating plant.");
		} else if (food instanceof Meat){
			throw new WrongFoodException("Herbivore don't eat meat!");
		}
	}


}
