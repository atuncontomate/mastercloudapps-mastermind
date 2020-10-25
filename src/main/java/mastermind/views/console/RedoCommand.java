package mastermind.views.console;

import mastermind.controllers.ProposalController;

public class RedoCommand extends Command{

    public RedoCommand(ProposalController proposalController){
        super("", proposalController);  //TODO: Título
    }

    @Override
    protected void execute() {
        this.proposalController.redo();
        new BoardView(this.proposalController).write();
    }

    @Override
    protected boolean isActive() {
        return proposalController.redoable();
    }
}
