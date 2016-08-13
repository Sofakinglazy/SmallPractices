package ecszoo;

public enum Food {

	hey(1, 4), steak(3, 4), fruit(2, 3), celery(0, 1), fish(3, 2), ice_cream(1, 3);
	
	private int health;
	private int waste;
	
	Food(int health, int waste){
		this.health = health;
		this.waste = waste;
	}
	
	public int getHealth(){
		return health;
	}
	
	public int getWaste(){
		return waste;
	}
	
	public void setHealth(int health){
		this.health = health;
	}
	
	public void setWaste(int waste){
		this.waste = waste;
	}
	
	public String toString(){
		return health + "," + waste;
	}
}
