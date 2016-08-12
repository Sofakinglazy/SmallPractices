package ecszoo;

import java.util.*;

public class Zoo {
	
	private final int iterations = 20;
	private final int initFoodAmount = 200;
	private final int maxRestoreAmount = 50;
	private List<Enclosure> enclosures;
	private List<ZooKeeper> zooKeepers;
	private Foodstore zooFoodstore;
	
	public Zoo(){
		enclosures = new ArrayList<>();
		zooKeepers = new ArrayList<>();
		zooFoodstore = new Foodstore();
		initZooFoodStore();
	}
	
	private void initZooFoodStore() {
		for (Food food : Food.values()){
			zooFoodstore.addFood(food, initFoodAmount);
		}
	}

	public void aMonthPasses(){
		if (enclosures.isEmpty()){
			System.err.println("No enclosure exsits.");
			return;
		}
		if (zooKeepers.isEmpty()){
			System.err.println("No zookeeper exsits.");
			return;
		}
		for (Enclosure enclosure : enclosures){
			enclosure.aMonthPasses();
		}
		for (ZooKeeper zooKeeper : zooKeepers){
			zooKeeper.aMonthPasses();
			
		}
		restock();
	}
	
	private void restock(){
		int amount = new Random().nextInt(maxRestoreAmount);
		for (Food food : Food.values()){
			zooFoodstore.addFood(food, amount);
		}
	}
	
	public void run(){
		for (int i = 0; i < iterations; i++){
			aMonthPasses();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Foodstore getFoodstore(){
		return zooFoodstore;
	}
}
