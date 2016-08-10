package smartcard;

import junit.framework.TestCase;

public class DoorTest extends TestCase {

	public void testIsUnlocked(){
		Door door = new Door("Research Lab");
		CardLock cardLock = new CardLock();
		SmartCard lewis = new SmartCard("Lewis");
		lewis.setStaff(false);
		SmartCard joyce = new SmartCard("Joyce");
		joyce.setStaff(true);
		
		// without attaching the lock
		door.swipeCard(joyce);
		assertFalse(door.isUnlocked());
		
		// attach the lock
		door.attachLock(cardLock);
		
		door.swipeCard(lewis);
		assertFalse(door.isUnlocked());
		
		door.swipeCard(joyce);
		assertTrue(door.isUnlocked());
		
		
	}
}
