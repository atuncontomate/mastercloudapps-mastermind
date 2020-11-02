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
    OPTION("----- Choose one option -----"),
    ACTION_COMMAND("Propose Combination"),
    UNDO_COMMAND("Undo previous Proposal"),
    REDO_COMMAND("Redo previous Proposal");

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
