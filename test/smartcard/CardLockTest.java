package smartcard;

import junit.framework.TestCase;

public class CardLockTest extends TestCase {
	
	public void testLastStaffCardAssess(){
		SmartCard joyce = new SmartCard("Joyce");
		joyce.setStaff(true);
		CardLock cardLock = new CardLock();
		
		assertFalse(cardLock.isUnlocked());
		
		cardLock.swipeCard(joyce);
		assertTrue(cardLock.isUnlocked());
		
		SmartCard lewis = new SmartCard("Lewis");
		lewis.setStaff(false);
		
		cardLock.swipeCard(lewis);
		assertFalse(cardLock.isUnlocked());
		
		// turn on student access
		
		cardLock.toggleStudent();
		
		cardLock.swipeCard(lewis);
		assertTrue(cardLock.isUnlocked());
		cardLock.swipeCard(joyce);
		assertTrue(cardLock.isUnlocked());
		
	}
}
