package mastermind.models;

public enum Error {

	WRONG_LENGTH("Wrong proposed combination length"),
	WRONG_COLORS("Wrong colors, they must be: rbygop"),
	DUPLICATED("Repeated colors"),
	NULL_ERROR;

	private String message;

	Error(){
	}

	Error(String message){
		this.message = message;
	}

	public boolean notNull() {
		return Error.NULL_ERROR != this;
	}

	public String getMessage(){
		return message;
	}
}
