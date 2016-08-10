package lab5;

import java.text.DecimalFormat;

public class Calculator {

	public final static char[] OPERATORS = { '*', '+', '-', '/' };

	private double a;
	private int index;
	private char operator;

	public Calculator(double a) {
		this.a = a;
		index = -1;
	}

	public Double parser(String s) {
		Double result = null;
		char[] wordChars = s.trim().toCharArray();
		if (isOperator(wordChars)) {
			a = getFirstNumber(wordChars);
			double b = getSecondNumber(wordChars);
			switch (operator) {
			case '*':
				result = multiply(b);
				break;
			case '+':
				result = add(b);
				break;
			case '-':
				result = add(-b);
				break;
			case '/':
				result = multiply(1d/b);
				break;
			default: break;
			}
		}
		return result;
	}

	private double getSecondNumber(char[] wordChars) {
		StringBuilder sb = new StringBuilder();
		for (int i = index; i < wordChars.length; i++){
			char c = wordChars[i];
			if(Character.isDigit(c)){
				sb.append(c);
			}
		}
		return Double.valueOf(sb.toString());
	}

	private double getFirstNumber(char[] wordChars) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= index; i++){
			char c = wordChars[i];
			if(Character.isDigit(c)){
				sb.append(c);
			}
		}
		return Double.valueOf(sb.toString());
	}

	private boolean isOperator(char[] wordChars) {
		boolean isOperator = false;
		for (int i = 0; i < wordChars.length; i++) {
			for (int j = 0; j < OPERATORS.length; j++) {
				if (wordChars[i] == OPERATORS[j]) {
					isOperator = true;
					index = i;
					operator = wordChars[i];
					break;
				}
			}
			if (isOperator)
				break;
		}
		return isOperator;
	}

	public double add(double b) {
		return a + b;
	}

	public double multiply(double b) {
		return Double.valueOf(new DecimalFormat("#.0").format(a * b));
	}

	public void setBaseNumber(double a) {
		this.a = a;
	}
}
