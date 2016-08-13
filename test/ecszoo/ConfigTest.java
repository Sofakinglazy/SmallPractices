package ecszoo;

import java.io.IOException;

import junit.framework.TestCase;

public class ConfigTest extends TestCase {

	public void testConfigIO(){
		try {
			assertEquals("", ConfigIO.getPropValues());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
