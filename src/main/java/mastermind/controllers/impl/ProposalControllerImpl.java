package mastermind.controllers.impl;

import mastermind.controllers.*;
import mastermind.models.ProposedCombination;
import mastermind.models.Result;
import mastermind.models.Session;

public class ProposalControllerImpl extends ProposalController {

    private ActionController actionController;
    private UndoController undoController;
    private RedoController redoController;

    public ProposalControllerImpl(Session session){
        super(session);
        this.actionController = new ActionController(session);
        this.undoController = new UndoController(session);
        this.redoController = new RedoController(session);
    }

    @Override
    public void add(ProposedCombination proposedCombination) {
        this.actionController.add(proposedCombination);
    }

    @Override
    public boolean isEndedGame() {
        return this.actionController.isEndedGame();
    }

    @Override
    public int getAttempts() {
        return this.actionController.getAttempts();
    }

    @Override
    public boolean isBreakerWinner() {
        return this.actionController.isBreakerWinner();
    }

    @Override
    public ProposedCombination getAttemptProposedCombination(int attempt){
        return this.actionController.getAttemptProposedCombination(attempt);
    }

    @Override
    public Result getAttemptResult(int attempt){
        return this.actionController.getAttemptResult(attempt);
    }

    @Override
    public void undo() {
        this.undoController.undo();
    }

    @Override
    public boolean undoable() {
        return this.undoController.undoable();
    }

    @Override
    public void redo() {
        this.redoController.redo();
    }

    @Override
    public boolean redoable() {
        return this.redoController.redoable();
    }

}
