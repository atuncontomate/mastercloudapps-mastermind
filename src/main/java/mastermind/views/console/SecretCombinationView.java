package mastermind.views.console;

import mastermind.models.Message;
import mastermind.models.SecretCombination;
import utils.WithConsoleView;

class SecretCombinationView extends WithConsoleView {

    void writeln() {
        for (int i = 0; i < SecretCombination.getWidth(); i++) {
            new MessageView(Message.SECRET).write();
        }
        this.console.writeln();
    }

}
