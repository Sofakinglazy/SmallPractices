package lab5;

import java.util.*;

import junit.framework.TestCase;

public class WordGroupTest extends TestCase {

	public static final String SENTENCE1 = "You can discover more about a person in an hour of play than in a year of conversation";
	public static final String SENTENCE2 = "When you play play hard when you work dont play at all";
	
	public void testGetwordArray(){
		WordGroup words1 = new WordGroup(SENTENCE1);
		WordGroup words2 = new WordGroup(SENTENCE2);
		
		String[] split1 = words1.getWordArray();
		String[] split2 = words2.getWordArray();
		
		for (int i = 0; i < split1.length; i++){
//			System.out.println(split1[i]);
		}
		
		for (int i = 0; i < split2.length; i++){
//			System.out.println(split2[i]);
		}
	}
	
	public void testGetWordSet(){
		WordGroup words = new WordGroup(SENTENCE1);
		
		Set<String> wordSet = WordUtil.getWordSet(words);
		
		assertTrue(wordSet.size() < words.getWordArray().length);
		
		for (Iterator<String> word = wordSet.iterator(); word.hasNext();){
			System.out.println(word.next());
		}
	}
	
	public void testGetWordCount(){
		WordGroup words = new WordGroup(SENTENCE1);
		
		HashMap<String, Integer> wordMap = WordUtil.getWordCount(words);
		
		Set<String> keySet = wordMap.keySet();
		
		for (String s : keySet){
			System.out.printf("<%s, %d>\n", s, wordMap.get(s));
		}
	}
}
