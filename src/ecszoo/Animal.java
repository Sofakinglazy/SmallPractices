package ecszoo;

import java.util.*;

public abstract class Animal {

	protected int age; // Months
	protected char gender; // 'F', 'M'
	protected List<Food> eats;
	protected int health; // 0 ~ 10
	protected int lifeExoectancy;
	protected int treatPoint;
	protected int decreasePoint;
	protected boolean alive;
	protected Enclosure enclosure;

	public Animal(int age, char gender) {
		this.age = age;
		this.gender = gender;
		this.health = 10;
		alive = true;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public boolean isAlive(){
		return alive;
	}

	public boolean canEat(Food food) {
		for (int i = 0; i < eats.size(); i++) {
			if (food.equals(eats.get(i))) {
				return true;
			}
		}
		return false;
	}

	public void eat(Food food) {
		if (alive){
			if (health + food.getHealth() > 10)
				health = 10;
			else 
				health += food.getHealth();
		}
	}

	public void decreaseHealth() {
		if (alive){
			if (health - decreasePoint <= 0){
				health = 0;
				alive = false;
			} else 
				health -= decreasePoint;
		}
	}

	public void treat() {
		if (alive) {
			if (health + treatPoint > 10)
				health = 10;
			else
				health += treatPoint;
		}
	}

	public boolean aMonthPasses(){
		if (enclosure == null){
			System.err.println("The animal is not assigned to any enclosure.");
			return false;
		}
		if (eats.isEmpty()){
			System.err.println("Eats list is empty.");
			return false;
		}
		decreaseHealth();
		Foodstore foodstore = enclosure.getFoodstore();
		for (Food food : eats){
			if (foodstore.isAvailable(food)){
				foodstore.takeFood(food);
				eat(food);
				produceWaste(food);
			}
		}
		return true;
	}
	
	private void produceWaste(Food food) {
		if (enclosure == null){
			System.err.println("The animal is not assigned to any enclosure.");
			return;
		}
		enclosure.addWaste(food.getWaste());
	}

	public void setEnclosure(Enclosure enclosure){
		this.enclosure = enclosure;
	}
}
