package ecszoo;

import java.util.ArrayList;
import java.util.List;

public class ZooKeeper {

	protected List<Treat> treatList;
	protected Zoo zoo;
	protected Enclosure enclosure;
	protected int movingFoodAmount;
	protected int movingWasteAmount;
	protected int monthlyTreatTimes;

	public ZooKeeper(Zoo zoo, Enclosure enclosure) {
		this.zoo = zoo;
		this.enclosure = enclosure;
		movingFoodAmount = 20;
		movingWasteAmount = 20;
		monthlyTreatTimes = 2;
		treatList = new ArrayList<>();
		treatList.add(Treat.stroked);
		treatList.add(Treat.hug);
	}

	public void aMonthPasses() {
		moveFood();
		moveWaste();
		giveTreat();
	}

	private void moveFood() {
		int count = 0;
		while (count < movingFoodAmount) {
			Food food = findUrgentFood();
			zoo.getFoodstore().takeFood(food);
			enclosure.getFoodstore().addFood(food);
			count++;
		}
	}

	private Food findUrgentFood() {
		int min = Integer.MAX_VALUE;
		Food urgentFood = null;
		for (Food food : Food.values()) {
			int amount = enclosure.getFoodstore().getSpecificFood(food);
			if (min > amount) {
				min = amount;
				urgentFood = food;
			}
		}
		return urgentFood;
	}

	private void moveWaste() {
		enclosure.removeWaste(movingWasteAmount);
	}

	private void giveTreat() {
		// select the animal with least health to give treats
		int count = 0;
		while (count < monthlyTreatTimes) {
			Animal unhealthy = getLeastHealthyAnimal();
			unhealthy.treat();
			count++;
		}
	}

	private Animal getLeastHealthyAnimal() {
		List<Animal> animals = enclosure.getAnimals();
		int min = Integer.MAX_VALUE;
		Animal unhealthy = null;
		for (Animal animal : animals) {
			// select the lower health animal
			if (min > animal.getHealth()) {
				// pass this animal if its cannot be treat by keeper
				for (Treat action : treatList){
					if (animal.canTreat(action)){
						min = animal.getHealth();
						unhealthy = animal;
					}
				}
			}
		}
		return unhealthy;
	}

}
