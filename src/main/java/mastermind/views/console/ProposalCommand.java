package mastermind.views.console;

import mastermind.controllers.ProposalController;

public class ProposalCommand extends Command{

    public ProposalCommand(ProposalController proposalController){
        super("", proposalController); //TODO: Título
    }

    @Override
    protected void execute() {
        // TODO
    }

    @Override
    protected boolean isActive() {
        return true;
    }
}
