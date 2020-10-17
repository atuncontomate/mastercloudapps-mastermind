package mastermind;

import mastermind.models.Board;
import mastermind.views.MainView;

public class MasterMind {

    private Board board;

    private MainView view;

    private MasterMind() {
        this.board = new Board();
        this.view = new MainView(this.board);
    }

    private void play() {
        this.view.interact();
    }

    public static void main(String[] args) {
        new MasterMind().play();
    }

}
