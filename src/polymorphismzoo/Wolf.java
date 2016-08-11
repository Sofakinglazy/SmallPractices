package polymorphismzoo;

public class Wolf extends Carnivore {
	
	public Wolf(){
		super();
	}

	public Wolf(String name, int age){
		super(name, age);
	}
	
	@Override
	public void makeNoise() {
		System.out.println("hooooooooh!");
	}

}
