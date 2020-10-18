package mastermind.controller;

import mastermind.models.Board;
import mastermind.models.ProposedCombination;
import mastermind.models.Result;
import mastermind.models.State;

public class ProposalController extends Controller {

    public ProposalController(Board board, State state) {
        super(board, state);
    }

    public void add(ProposedCombination proposedCombination) {
        this.board.add(proposedCombination);
    }

    public boolean isEndedGame() {
        boolean isEndedGame = this.board.isEndedGame();
        if(isEndedGame){
            this.state.next();
        }
        return isEndedGame;
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

    @Override
    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
