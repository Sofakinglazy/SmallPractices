package flashcard;

import java.io.FileNotFoundException;
import java.util.*;

public class Quiz {

	private List<FlashCard> flashCards;
	private List<String> userAnswers;

	private Scanner sc;

	public Quiz()  {
		try {
			flashCards = FlashCardIO.loadQuiz();
		} catch (FileNotFoundException e) {
			System.err.println("Can't load the quiz.");
			e.printStackTrace();
		}
		userAnswers = new ArrayList<>();
		sc = new Scanner(System.in);
	}

	// display questions one by one
	// wait for user input
	// check if the answer correct then print "right" or "wrong"
	// if wrong, then print out the right answer after "wrong "
	public void play() {
		for (FlashCard fc : flashCards) {
			String question = fc.getQuestion();
			System.out.println(question);
			String user = "";
			while (user.equals(""))
				user = sc.nextLine();
			userAnswers.add(user);
			String answer = fc.getAnswer();
			if (!answer.equals(user)) {
				System.out.println("Wrong! Right answer is: " + answer);
			} else {
				System.out.println("Congrat! You get the right answer.");
			}
		}
		System.out.println("The quiz are completed. Do you want to save the result. (Y/N)");
		boolean isQuit = false;
		while (!isQuit) {
			String response = sc.nextLine();
			switch (response.toUpperCase()) {
			case "Y":
				try {
					save();
				} catch (FileNotFoundException e) {
					System.err.println("Fail to save the file.");
					e.printStackTrace();
				}
				System.out.println("Save Successfully.");
				isQuit = true;
				break;
			case "N":
				isQuit = true;
				break;
			}
		}
	}

	public void save() throws FileNotFoundException {
		FlashCardIO.saveQuiz(formatAnswers());
	}

	private String formatAnswers() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < flashCards.size(); i++) {
			FlashCard fc = flashCards.get(i);
			sb.append(fc.getQuestion());
			String user = userAnswers.get(i);
			sb.append(user);
			sb.append(", ");
			String answer = fc.getAnswer();
			if (answer.equals(user)) {
				sb.append("Right");
			} else {
				sb.append("Wrong");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}
