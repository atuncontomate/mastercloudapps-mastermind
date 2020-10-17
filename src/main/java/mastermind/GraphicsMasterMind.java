package mastermind;

import mastermind.models.Board;
import mastermind.views.graphics.MainView;

public class GraphicsMasterMind {

    private Board board;

    private MainView view;

    private GraphicsMasterMind() {
        this.board = new Board();
        this.view = new MainView(this.board);
    }

    private void play() {
        this.view.interact();
    }

    public static void main(String[] args) {
        new GraphicsMasterMind().play();
    }

}
