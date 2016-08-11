package ecszoo;

public enum Food {

	hey(1, 4), steak(3, 4), fruit(2, 3), celery(0, 1), fish(3, 2), ice_cream(1, 3);
	
	private final int health;
	private final int waste;
	
	Food(int health, int waste){
		this.health = health;
		this.waste = waste;
	}
	
	int getHealth(){
		return health;
	}
	
	int getWaste(){
		return waste;
	}
}
