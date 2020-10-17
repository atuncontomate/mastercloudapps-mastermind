package mastermind.models;

public enum Color {

	RED('r'),
	BLUE('b'),
	YELLOW('y'),
	GREEN('g'),
	ORANGE('o'),
	PURPLE('p'),
	NULL_COLOR;

	private char initial;

	Color(){
	}

	Color(char initial){
		this.initial = initial;
	}

	public static Color getInstance(char character) {
		for(int i=0; i<Color.length(); i++) {
			if (Color.get(i).initial == character) {
				return Color.get(i);
			}
		}
		return Color.NULL_COLOR;
	}

	public boolean isNull(){
		return this == Color.NULL_COLOR;
	}

	static Color get(int index){
		return Color.values()[index];
	}

	static int length() {
		return Color.values().length-1;
	}

	public char getInitial(){
		return initial;
	}
}
