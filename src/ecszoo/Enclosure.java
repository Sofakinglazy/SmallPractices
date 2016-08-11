package ecszoo;

import java.util.ArrayList;

public class Enclosure {

	public static final int CAPACITY = 20;

	private ArrayList<Animal> animals;
	private int waste;
	private Foodstore foodstore;
	private boolean isFull;

	public Enclosure() {
		animals = new ArrayList<>();
		foodstore = new Foodstore();
		waste = 0;
		isFull = false;
	}

	public void addAnimal(Animal animal) {
		if (animals.size() == CAPACITY)
			throw new IllegalArgumentException("Excess the capacity of enclosure.");
		animals.add(animal);
	}
	
	public void removeAnimal(Animal animal){
		animals.remove(animal);
	}
	
	public void removeWaste(int amount){
		if (waste < amount)
			throw new IllegalArgumentException("No enough waste to remove..");
		waste -= amount;
	}
	
	public void addWaste(int amount){
		waste += amount;
	}
	
	public int getWasteSize(){
		return waste;
	}
	
	public Foodstore getFoodstore(){
		return foodstore;
	}
	
	public int getAnimalSize(){
		return animals.size();
	}
	
	public void aMonthPasses(){
		for (Animal a : animals){
			a.aMonthPasses();
		}
	}
}
