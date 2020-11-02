package mastermind.controller;

import mastermind.models.*;
import mastermind.views.BoardView;
import mastermind.views.ProposedCombinationView;

public class ProposalController extends Controller {

    public ProposalController(Board board, State state) {
        super(board, state);
    }

    @Override
    public void control() {
        ProposedCombination proposedCombination = new ProposedCombination();
        new ProposedCombinationView(proposedCombination).read();
        this.add(proposedCombination);

        BoardView boardView = new BoardView(this.board);
        boardView.write();
        if(this.isEndedGame()){
            boardView.writeWinner();
        }
    }

    private void add(ProposedCombination proposedCombination) {
        this.board.add(proposedCombination);
    }

    private boolean isEndedGame() {
        boolean isEndedGame = this.board.isEndedGame();
        if(isEndedGame){
            this.state.next();
        }
        return isEndedGame;
    }

}
