package mastermind.views.console;

import mastermind.models.Board;
import mastermind.models.Message;
import utils.WithConsoleView;
import utils.YesNoDialog;

public class ResumeView extends WithConsoleView {

    private Board board;

    public ResumeView(Board board) {
        this.board = board;
    }

    public boolean interact() {
        new MessageView(Message.RESUME).write();
        boolean newGame = new YesNoDialog().read(Message.RESUME.toString());
        if (newGame) {
            this.board.clear();
        }
        return newGame;
    }
}
