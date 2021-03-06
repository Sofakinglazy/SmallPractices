package ecszoo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigIO {

	private static InputStream inputStream;
	private static Properties prop;
	private static String propFilename = "resources/config/config.properties";
	
	public static void importPropValues() throws IOException{
		prop = new Properties();
		
		inputStream = new FileInputStream(propFilename);
		try{
		if (inputStream != null){
			prop.load(inputStream);
		} else {
			throw new FileNotFoundException("Property file '" + propFilename + "' not found in the path.");
		}
		
		configFood();
		
		} catch (FileNotFoundException e ){
			System.err.println("FileNotFoundException: " + e);
		} finally {
			inputStream.close();
		}
	}
	
	private static void configFood() {
		for (Food food : Food.values()){
			String name = food.name();
			String props = prop.getProperty(name);
			if (props != null){
				String[] propsArray = splitProps(props);
				if (verify(propsArray, 2)){
					food.setHealth(Integer.valueOf(propsArray[0].trim()));
					food.setWaste(Integer.valueOf(propsArray[1].trim()));
				} else {
					System.out.printf("Warning: Not enough paras for food %s, default values are taken.\n", name);
				}
			} else {
				System.out.printf("Warning: No key for food %s, default values are taken.\n", name);
			}
			// test 
//			System.out.printf("%s: %s\n", name, food.toString());
		}
	}

	private static String[] splitProps(String props){
		return props.trim().split(",");
	}
	
	private static boolean verify(String[] props, int length){
		return props.length == length;
	}
	
	public static String[] getPropValuesByKey(String key) throws IOException, KeyNotFoundException{
		String[] result = null;
		prop = new Properties();
		
		inputStream = new FileInputStream(propFilename);
		try{
			if (prop != null){
			prop.load(inputStream);
			} else {
				throw new FileNotFoundException(String.format("Property file '%s' cannot be found.\n", propFilename));
			}
			
			String props = prop.getProperty(key);
			if (props != null){
				result = splitProps(props);
			} else {
				throw new KeyNotFoundException("Keyword '" + key + "' cannot be found in the file.");
			}
		} catch (FileNotFoundException e){
			System.err.println("FileNotFoundException: " + e);
		} finally {
			inputStream.close();
		}
		return result;
	}
	
}
