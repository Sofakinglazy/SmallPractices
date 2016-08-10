package smartcard;

public class Door {

	private String room;
	private CardLock cardLock;
	private boolean unlocked;
	
	public Door(String room) {
		this.room = room;
		unlocked = false;
	}
	
	public void attachLock(CardLock cardLock){
		this.cardLock = cardLock;
	}
	
	public void swipeCard(SmartCard smartCard){
		if (cardLock == null) return;
		
		cardLock.swipeCard(smartCard);
	}
	
	public boolean isUnlocked(){
		if (cardLock == null) return unlocked;
		
		return cardLock.isUnlocked();
	}

}
