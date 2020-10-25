package mastermind.views.console;

import mastermind.controllers.ProposalController;

public class UndoCommand extends Command{

    public UndoCommand(ProposalController proposalController){
        super("", proposalController); //TODO: Título
    }

    @Override
    protected void execute() {
        this.proposalController.undo();
        new BoardView(this.proposalController).write();
    }

    @Override
    protected boolean isActive() {
        return proposalController.undoable();
    }
}
