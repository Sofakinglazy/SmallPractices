package ecszoo;

import java.util.Hashtable;

public class Foodstore {

	private Hashtable<Food, Integer> storage;
	
	public Foodstore(){
		storage = new Hashtable<>();
		storage.put(Food.celery, 0);
		storage.put(Food.fish, 0);
		storage.put(Food.fruit, 0);
		storage.put(Food.hey, 0);
		storage.put(Food.ice_cream, 0);
		storage.put(Food.steak, 0);
	}
	
	public void addFood(Food food, int amount){
		Integer original = storage.get(food);
		storage.put(food, original + amount);
	}
	
	public void takeFood(Food food, int amount){
		Integer original = storage.get(food);
		if (original >= amount)
			storage.put(food, original - amount);
		else 
			throw new IllegalArgumentException("No much food in the storage.");
	}
}
