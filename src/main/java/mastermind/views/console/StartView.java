package mastermind.views.console;

import mastermind.controllers.StartController;
import mastermind.views.Message;

public class StartView {

    public void interact(StartController startController) {
        Message.TITLE.writeln();
        new SecretCombinationView().writeln();
        startController.start();
    }
}
