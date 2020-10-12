package mastermind;

import utils.Console;

enum Error {

	WRONG_LENGTH("Wrong proposed combination length"),
	WRONG_COLORS("Wrong colors, they must be: rbygop"),
	NULL_ERROR;

	private String message;

	Error(){
	}

	Error(String message){
		this.message = message;
	}

	void writeln() {
		if (this != Error.NULL_ERROR){
			Console.instance().writeln(this.message);
		}
	}

}
