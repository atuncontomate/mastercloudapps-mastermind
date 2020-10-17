package mastermind;

import mastermind.models.Board;
import mastermind.views.console.MainView;

public class ConsoleMasterMind {

    private Board board;

    private MainView view;

    private ConsoleMasterMind() {
        this.board = new Board();
        this.view = new MainView(this.board);
    }

    private void play() {
        this.view.interact();
    }

    public static void main(String[] args) {
        new ConsoleMasterMind().play();
    }

}
