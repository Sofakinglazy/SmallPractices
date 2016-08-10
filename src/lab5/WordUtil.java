package lab5;

import java.util.*;

public class WordUtil {

	public static HashSet<String> getWordSet(WordGroup words){
		HashSet<String> wordSet = new HashSet<>();
		String[] wordArray = words.getWordArray();
		for (int i = 0; i < wordArray.length; i++){
			wordSet.add(wordArray[i]);
		}
		return wordSet;
	}
	
	public static HashMap<String, Integer> getWordCount(WordGroup words){
		HashMap<String, Integer> wordMap = new HashMap<>();
		HashSet<String> wordSet = getWordSet(words);
		for (String s : wordSet){
			wordMap.put(s, count(s));
		}
		return wordMap;
	}
	
	private static int count(String s){
		char[] charArray = s.toCharArray();
		return charArray.length;
	}
}
