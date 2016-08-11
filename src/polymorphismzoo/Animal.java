package polymorphismzoo;

public abstract class Animal implements Comparable<Animal>{
	
	protected String name;
	protected int age; 
	
	public Animal(){
		name = "newborn";
		age = 0;
	}
	
	public Animal(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public abstract void makeNoise();
	public abstract void eat(Food food) throws WrongFoodException;
	
	public void eat(Food food, int times) throws WrongFoodException{
		for (int i = 0; i < times; i++){
			eat(food);
		}
	}
	
	public String toString(){
		// cannot override getClass method since its a final method
		return String.format("<%s, %s>", name, age);
	}
	
	@Override
	public int compareTo(Animal other) {
		// Ascending order
//		return age - other.getAge();
		
		// Descending order
		return other.getAge() - age;
	}
}
