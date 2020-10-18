package mastermind.controller;

import mastermind.models.Board;
import mastermind.models.ProposedCombination;
import mastermind.models.Result;

public class ProposalController extends Controller {

    public ProposalController(Board board) {
        super(board);
    }

    public void add(ProposedCombination proposedCombination) {
        this.board.add(proposedCombination);
    }

    public boolean isEndedGame() {
        return this.board.isEndedGame();
    }

    public int getAttempts() {
        return this.board.getAttempts();
    }

    public boolean isBreakerWinner() {
        return this.board.isBreakerWinner();
    }

    public ProposedCombination getAttemptProposedCombination(int attempt){
        return this.board.getAttemptProposedCombination(attempt);
    }

    public Result getAttemptResult(int attempt){
        return this.board.getAttemptResult(attempt);
    }

}
