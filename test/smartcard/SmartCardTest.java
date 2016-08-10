package smartcard;

import junit.framework.TestCase;

public class SmartCardTest extends TestCase {
	
	public void testGetOwner(){
		SmartCard smartCard = new SmartCard("Lewis");
		
		assertEquals("Lewis", smartCard.getOwner());
	}
}
