package ecszoo;

public class NegativeValueException extends Exception {

	private static final long serialVersionUID = 1L;

	public NegativeValueException() {
		super();
	}

	public NegativeValueException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NegativeValueException(String message, Throwable cause) {
		super(message, cause);
	}

	public NegativeValueException(String message) {
		super(message);
	}

	public NegativeValueException(Throwable cause) {
		super(cause);
	}

	
}
