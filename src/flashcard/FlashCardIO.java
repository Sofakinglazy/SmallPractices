package flashcard;

import java.io.*;
import java.util.*;

public class FlashCardIO {
	
	private static final String LOAD_PATH = "./src/flashcard/Questions.txt";
	private static final String SAVE_PATH = "./src/flashcard/CompletedForm.txt";

	public static List<FlashCard> loadQuiz() throws FileNotFoundException {
		File f = new File(LOAD_PATH);
		Scanner sc = new Scanner(f);
		List<FlashCard> flashCards = new ArrayList<>();
		while (sc.hasNextLine()){
			String line = sc.nextLine();
			FlashCard flashCard = findQuestionAndAnswer(line);
			flashCards.add(flashCard);
		}
		return flashCards;
	}

	private static FlashCard findQuestionAndAnswer(String line) {
		String[] s = line.trim().split(":");
		return new FlashCard(s[0], s[1]);
	}

	public static void saveQuiz(String s) throws FileNotFoundException {
		File f = new File(SAVE_PATH);
		PrintStream ps = new PrintStream(f);
		ps.println(s);
	}

}
