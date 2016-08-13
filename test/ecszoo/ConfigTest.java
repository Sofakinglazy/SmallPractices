package ecszoo;

import java.io.IOException;

import junit.framework.TestCase;

public class ConfigTest extends TestCase {

	public void testConfigIO(){
		try {
			ConfigIO.importPropValues();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void testImportPropValuesByKey(){
		String[] s = {"1", "4"};
		try {
			String[] result = ConfigIO.getPropValuesByKey("hey");
			for (int i = 0; i < result.length; i++){
				assertEquals(s[i], result[i]);
			}
			
			result = ConfigIO.getPropValuesByKey("aaa"); // doesnt exsit
			assertNull(result);
		} catch (IOException | KeyNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
