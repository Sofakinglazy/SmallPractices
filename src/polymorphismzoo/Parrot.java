package polymorphismzoo;

public class Parrot extends Herbivore {
	
	public Parrot(){
		super();
	}
	
	public Parrot(int age){
		super();
		this.name = "Polly";
		this.age = age;
	}
	
	public Parrot(String name, int age) {
		super(name, age);
	}

	@Override
	public void makeNoise() {
		System.out.println("GuGu..");
	}


}
