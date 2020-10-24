package mastermind.views.console;

import mastermind.controllers.StartController;
import mastermind.models.Message;
import utils.WithConsoleView;

public class StartView extends WithConsoleView {

    public void interact(StartController startController) {
        new MessageView(Message.TITLE).writeln();
        new SecretCombinationView().writeln();
        startController.next();
    }
}
