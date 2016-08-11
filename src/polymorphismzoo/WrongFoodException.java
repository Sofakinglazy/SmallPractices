package polymorphismzoo;

public class WrongFoodException extends Exception {
	private static final long serialVersionUID = 1L;

	public WrongFoodException() {
	}

	public WrongFoodException(String message) {
		super(message);
	}

	public WrongFoodException(Throwable cause) {
		super(cause);
	}

	public WrongFoodException(String message, Throwable cause) {
		super(message, cause);
	}

	public WrongFoodException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
