package mastermind.views;

import mastermind.types.Message;
import mastermind.models.SecretCombination;
import utils.Console;

public class SecretCombinationView {

    public void writeln() {
        for (int i = 0; i < SecretCombination.getWidth(); i++) {
            Message.SECRET.write();
        }
        Console.instance().writeln();
    }

}
