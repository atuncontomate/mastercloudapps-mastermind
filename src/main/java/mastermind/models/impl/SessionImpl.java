package mastermind.models.impl;

import mastermind.models.*;
import mastermind.types.StateValue;

public class SessionImpl implements Session {

    private Board board;
    private BoardRegistry boardRegistry;
    private State state;

    public SessionImpl(){
        this.board = new Board();
        this.boardRegistry = new BoardRegistry(board);
        this.state = new State();
    }

    public StateValue getValueState() {
        return this.state.getValueState();
    }

    public int getAttempts() {
        return this.board.getAttempts();
    }

    public ProposedCombination getAttemptProposedCombination(int attempt){
        return this.board.getAttemptProposedCombination(attempt);
    }

    public Result getAttemptResult(int attempt){
        return this.board.getAttemptResult(attempt);
    }

    public void add(ProposedCombination proposedCombination) {
        this.board.add(proposedCombination);
        this.boardRegistry.registry();
    }

    public boolean isEndedGame() {
        return this.board.isEndedGame();
    }

    public boolean isBreakerWinner() {
        return this.board.isBreakerWinner();
    }

    public void next() {
        this.state.next();
    }

    public void reset(){
        this.board.reset();
        this.boardRegistry.reset();
        this.state.reset();
    }

    public void undo() {
        this.boardRegistry.undo();
    }

    public boolean undoable() {
        return this.boardRegistry.undoable();
    }

    public void redo() {
        this.boardRegistry.redo();
    }

    public boolean redoable() {
        return this.boardRegistry.redoable();
    }
}
