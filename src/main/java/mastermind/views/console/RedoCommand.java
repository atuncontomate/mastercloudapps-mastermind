package mastermind.views.console;

import mastermind.controllers.ProposalController;
import mastermind.views.Message;

public class RedoCommand extends Command{

    public RedoCommand(ProposalController proposalController){
        super(Message.REDO_COMMAND.getContent(), proposalController);
    }

    @Override
    protected void execute() {
        this.proposalController.redo();
    }

    @Override
    protected boolean isActive() {
        return proposalController.redoable();
    }
}
