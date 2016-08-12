package ecszoo;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {

	public static final int CAPACITY = 20;

	private ArrayList<Animal> animals;
	private int waste;
	private Foodstore foodstore;

	public Enclosure() {
		animals = new ArrayList<>();
		foodstore = new Foodstore();
		waste = 0;
	}

	public void addAnimal(Animal animal) throws NegativeValueException {
		if (animals.size() == CAPACITY)
			throw new NegativeValueException("Excess the capacity of enclosure.");
		animal.setEnclosure(this);
		animals.add(animal);
	}
	
	public void removeAnimal(Animal animal){
		animals.remove(animal);
	}
	
	public void removeWaste(int amount){
		if (waste < amount)
			waste = 0;
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
	
	public List<Animal> getAnimals() {
		return animals;
	}
	
	public void aMonthPasses(){
		for (Animal animal : animals){
			animal.aMonthPasses();
			if (!animal.isAlive()){
				removeAnimal(animal);
			}
		}
	}
}
