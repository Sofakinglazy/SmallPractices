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
	
	public void addFood(Food food){
		addFood(food, 1);
	}
	
	public boolean takeFood(Food food, int amount){
		Integer original = storage.get(food);
		if (original >= amount){
			storage.put(food, original - amount);
			return true;
		}
		else 
			return false;
	}
	
	public boolean takeFood(Food food){
		return takeFood(food, 1);
	}
	
	public int getSpecificFood(Food food){
		return storage.get(food);
	}
	
	public boolean isAvailable(Food food){
		return getSpecificFood(food) > 0;
	}
}
