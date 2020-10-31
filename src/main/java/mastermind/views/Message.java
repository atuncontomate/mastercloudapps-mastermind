package mastermind.views;

import utils.Console;

public enum Message {

    TITLE("----- MASTERMIND -----"),
    ATTEMPTS(" attempt(s):"),
    SECRET("x"),
    RESULT(" --> #blacks blacks and #whites whites"),
    BREAKER_WON("You've won!!! ;-)"),
    BREAKER_LOST("You've lost!!! :-("),
    RESUME("RESUME? "),
    PROPOSE_COMBINATION("Propose a combination: "),
    UNDO_COMMAND("Undo previous action"),
    REDO_COMMAND("Redo previous action");

    private String content;

    Message(String content) {
        this.content = content;
    }

    public String getContent(){
        return content;
    }

    public void write() {
        Console.instance().write(this.content);
    }

    public void writeln() {
        Console.instance().writeln(this.content);
    }

    public void writeln(int blacks, int whites) {
        assert Message.RESULT.equals(this);
        Console.instance().writeln(this.content.replaceFirst("#blacks", "" + blacks).replaceFirst("#whites", "" + whites));
    }
}
