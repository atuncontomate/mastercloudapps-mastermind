package mastermind;

enum Color {

	RED('r'),
	BLUE('b'),
	YELLOW('y'),
	GREEN('g'),
	ORANGE('o'),
	PINK('p'),
	NULL_COLOR(' ');

	private char symbol;

	Color(char symbol){
		this.symbol = symbol;
	}

	public static Color valueOfColorSymbol(char colorSymbol) {
		for (Color c : values()) {
			if (c.symbol == colorSymbol) {
				return c;
			}
		}
		return NULL_COLOR;
	}
}
