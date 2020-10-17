package mastermind;

import mastermind.models.Board;
import mastermind.views.MainView;

public abstract class MasterMind {

    private Board board;

    private MainView view;

    protected MasterMind() {
        this.board = new Board();
        this.view = this.createView(board);
    }

    protected abstract MainView createView(Board game);

    protected void play() {
        this.view.interact();
    }
}
