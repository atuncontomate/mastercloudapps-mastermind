package mastermind.views;

import mastermind.types.Message;

public class StartView {

    public void write() {
        Message.TITLE.writeln();
        new SecretCombinationView().writeln();
    }
}
