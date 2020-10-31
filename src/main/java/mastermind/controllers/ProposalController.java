package mastermind.controllers;

import mastermind.models.*;

public abstract class ProposalController extends Controller implements AcceptorController{

    public ProposalController(Session session){
        super(session);
    }

    public abstract void add(ProposedCombination proposedCombination);

    public abstract boolean isEndedGame();

    public abstract int getAttempts();

    public abstract boolean isBreakerWinner();

    public abstract ProposedCombination getAttemptProposedCombination(int attempt);

    public abstract Result getAttemptResult(int attempt);

    public abstract void undo();

    public abstract boolean undoable();

    public abstract void redo();

    public abstract boolean redoable();

    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
