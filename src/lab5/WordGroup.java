package lab5;

import java.util.*;

public class WordGroup {

	private String words;
	
	public WordGroup(String words){
		this.words = words.trim().toLowerCase();
	}
	
	public String[] getWordArray(){
		return words.split(" ");
	}
	
}
