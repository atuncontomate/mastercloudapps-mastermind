package mastermind.views.console;

import mastermind.views.Message;
import mastermind.models.SecretCombination;
import utils.Console;

class SecretCombinationView {

    void writeln() {
        for (int i = 0; i < SecretCombination.getWidth(); i++) {
            Message.SECRET.write();
        }
        Console.instance().writeln();
    }

}
