package mastermind.controllers;

import mastermind.models.*;

public class ProposalController extends Controller implements AcceptorController{

    private ActionController actionController;
    private UndoController undoController;
    private RedoController redoController;

    public ProposalController(Session session){
        super(session);
        this.actionController = new ActionController(session);
        this.undoController = new UndoController(session);
        this.redoController = new RedoController(session);
    }

    public void add(ProposedCombination proposedCombination) {
        this.actionController.add(proposedCombination);
    }

    public boolean isEndedGame() {
        return this.actionController.isEndedGame();
    }

    public int getAttempts() {
        return this.actionController.getAttempts();
    }

    public boolean isBreakerWinner() {
        return this.actionController.isBreakerWinner();
    }

    public ProposedCombination getAttemptProposedCombination(int attempt){
        return this.actionController.getAttemptProposedCombination(attempt);
    }

    public Result getAttemptResult(int attempt){
        return this.actionController.getAttemptResult(attempt);
    }

    public void undo() {
        this.undoController.undo();
    }

    public boolean undoable() {
        return this.undoController.undoable();
    }

    public void redo() {
        this.redoController.redo();
    }

    public boolean redoable() {
        return this.redoController.redoable();
    }

    public void accept(ControllerVisitor controllerVisitor) {
        controllerVisitor.visit(this);
    }

}
