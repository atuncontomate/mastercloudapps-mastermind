package mastermind.views.console;

import mastermind.models.Message;
import utils.WithConsoleView;

public class StartView extends WithConsoleView {

    public void interact() {
        new MessageView(Message.TITLE).writeln();
        new SecretCombinationView().writeln();
    }
}
