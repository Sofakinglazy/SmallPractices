package ecszoo;

public abstract class Animal {

	protected int age;
	protected char gender; // 'F', 'M'
	protected String[] eats;
	protected int health; // 0 ~ 10 
	protected int lifeExoectancy;
	
	public Animal(){
		
	}
	
	public Animal(Animal animal){
		this.age = animal.getAge();
		this.gender = animal.getGender();
		this.health = animal.getHealth();
		this.lifeExoectancy = animal.getLifeExoectancy();
		eats = new String[animal.getEats().length];
		for (int i = 0; i < eats.length; i++){
			eats[i] = animal.getEats()[i];
		}
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public int getLifeExoectancy() {
		return lifeExoectancy;
	}
	
	public String[] getEats() {
		return eats;
	}

	public int getHealth() {
		return health;
	}

	public boolean canEat(String food){
		boolean canEat = false;
		for (int i = 0; i < eats.length; i++){
			if (food.equals(eats[i])){
				canEat = true;
			}
		}
		return canEat;
	}
	
	public void eat(){
		
	}
	
	public void decreaseHealth(){
		
	}
	
	public void treat(){
		
	}
	
	public abstract boolean aMonthPasses();
}
