package smartcard;

public class CardLock {
	private SmartCard lastCard;
	private boolean unlocked;
	private boolean studentAccess;

	public CardLock() {
		unlocked = false;
		studentAccess = false;
	}

	public void swipeCard(SmartCard smartCard) {
		lastCard = smartCard;
	}

	public SmartCard getLastCardSeen() {
		return lastCard;
	}

	public void toggleStudent() {
		studentAccess = !studentAccess;
	}

	public boolean isUnlocked() {
		if (lastCard == null)
			return unlocked;

		if (studentAccess)
			unlocked = true;
		else {
			if (lastCard.isStaff())
				unlocked = true;
			else
				unlocked = false;
		}

		return unlocked;
	}

}
