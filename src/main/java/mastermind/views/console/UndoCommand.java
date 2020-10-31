package mastermind.views.console;

import mastermind.controllers.ProposalController;
import mastermind.views.Message;

public class UndoCommand extends Command{

    public UndoCommand(ProposalController proposalController){
        super(Message.UNDO_COMMAND.getContent(), proposalController);
    }

    @Override
    protected void execute() {
        this.proposalController.undo();
    }

    @Override
    protected boolean isActive() {
        return proposalController.undoable();
    }
}
