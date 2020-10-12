package mastermind;

import utils.Console;

public class Combination {

    public static final int COMBINATION_LENGTH = 4;

    private static final String EMPTY_COMBINATION = "";
    private static final String PROPOSE_COMBINATION = "Propose a combination: ";

    private String content;

    public Combination(){
        content = EMPTY_COMBINATION;
    }

    public Combination(String content){
        this.content = content;
    }

    public Success[] getCombinationHits(Combination proposedCombination){
        Success[] hits = new Success[COMBINATION_LENGTH];

        if(proposedCombination.content.length() == COMBINATION_LENGTH){
            char[] proposedColors = proposedCombination.content.toCharArray();
            char[] secretColors = this.content.toCharArray();

            for(int i=0; i<COMBINATION_LENGTH; i++){
                int proposedColorIndex = content.indexOf(proposedColors[i]);
                if (proposedColorIndex == -1){
                    hits[i] = Success.NULL_SUCCESS;
                } else if (proposedColors[i] == secretColors[i]){
                    hits[i] = Success.BLACK;
                } else {
                    hits[i] = Success.WHITE;
                }
            }
        }

        return hits;
    }

    public static Combination random(){
        return new Combination("rgrg"); //TODO: BUILD A RANDOM COMBINATION AND RETURN IT
    }

    public boolean isEmpty(){
        return EMPTY_COMBINATION.equals(content);
    }

    public boolean isValid(){
        if(content.length() != COMBINATION_LENGTH) return false;
        char[] colors = content.toCharArray();
        if(colors.length != COMBINATION_LENGTH) return false;
        for(int i=0; i<COMBINATION_LENGTH; i++){
            if (Color.valueOfColorSymbol(colors[i]).equals(Color.NULL_COLOR)) return false;
        }
        return true;
    }

    public void read(){
        Console console = Console.instance();
        String inputContent = console.readString(PROPOSE_COMBINATION);

        if(inputContent.length() != COMBINATION_LENGTH) {
            Error.WRONG_LENGTH.writeln();

        } else if(!new Combination(inputContent).isValid()){
            Error.WRONG_COLORS.writeln();

        }
        this.content = inputContent;
    }

    public void write() {
        Console.instance().write(this.content);
    }
}
