package ecszoo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigIO {

	private static String result = "";
	private static InputStream inputStream;
	private static Properties prop;
	private static String propFilename = "resources/config/config.properties";
	
	public static String getPropValues() throws IOException{
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
		return result;
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
			System.out.printf("%s: %s\n", name, food.toString());
		}
	}

	private static String[] splitProps(String props){
		return props.trim().split(",");
	}
	
	private static boolean verify(String[] props, int length){
		return props.length == length;
	}
	
}
