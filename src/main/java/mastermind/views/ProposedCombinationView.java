package mastermind.views;

import mastermind.models.*;
import mastermind.models.Error;
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
            new MessageView(Message.PROPOSE_COMBINATION).write();
            error = this.checkError(Console.instance().readString());
            new ErrorView(error).writeln();
            if (!error.isNull()) {
                proposedCombination = new ProposedCombination();
            }
        } while (!error.isNull());
    }

    private Error checkError(String characters){
        if (characters.length() != Combination.COMBINATION_LENGTH) {
            return mastermind.models.Error.WRONG_LENGTH;
        }
        for (int i = 0; i < characters.length(); i++) {
            Color color = Color.getInstance(characters.charAt(i));
            if (color.isNull()) {
                return mastermind.models.Error.WRONG_COLORS;
            }
            for(int j=0; j<i; j++){
                if (proposedCombination.getColors().get(j) == color) {
                    return mastermind.models.Error.DUPLICATED;
                }
            }
            proposedCombination.add(color);
        }
        return mastermind.models.Error.NULL_ERROR;
    }
}
