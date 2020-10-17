package mastermind.views;

import mastermind.models.Board;
import mastermind.models.ProposedCombination;
import utils.WithConsoleView;

public class ProposalView extends WithConsoleView {

    private Board board;

    private BoardView boardView;

    public ProposalView(Board board) {
        this.board = board;
        this.boardView = new BoardView(board);
    }

    public boolean interact() {
        ProposedCombination proposedCombination = new ProposedCombination();
        new ProposedCombinationView(proposedCombination).read();
        this.board.add(proposedCombination);
        this.boardView.write();
        boolean isEndedGame = this.board.isEndedGame();

        if(isEndedGame){
            this.boardView.writeWinner();
        }
        return isEndedGame;
    }
}
