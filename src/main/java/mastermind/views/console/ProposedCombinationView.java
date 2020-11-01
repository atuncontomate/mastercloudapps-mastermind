package mastermind.views.console;

import mastermind.models.*;
import mastermind.types.Error;
import mastermind.views.Message;
import utils.Console;

public class ProposedCombinationView {

    private ProposedCombination proposedCombination;

    public ProposedCombinationView(ProposedCombination proposedCombination){
        this.proposedCombination = proposedCombination;
    }

    public void write() {
        for (Color color : proposedCombination.getColors()) {
            new ColorView(color).write();
        }
    }

    public void read(){
        Error error;
        do {
            Message.PROPOSE_COMBINATION.write();
            error = this.checkError(Console.instance().readString());
            error.writeln();
            if (error.notNull()) {
                proposedCombination = new ProposedCombination();
            }
        } while (error.notNull());
    }

    private Error checkError(String characters){
        if (characters.length() != Combination.COMBINATION_LENGTH) {
            return Error.WRONG_LENGTH;
        }
        for (int i = 0; i < characters.length(); i++) {
            Color color = Color.getInstance(characters.charAt(i));
            if (color.isNull()) {
                return Error.WRONG_COLORS;
            }
            for(int j=0; j<i; j++){
                if (proposedCombination.getColors().get(j) == color) {
                    return Error.DUPLICATED;
                }
            }
            proposedCombination.add(color);
        }
        return Error.NULL_ERROR;
    }
}
