package mastermind.views.console;

import mastermind.controllers.ProposalController;

public abstract class Command extends utils.Command {

    protected ProposalController proposalController;

    public Command(String title, ProposalController proposalController){
        super(title);
        this.proposalController = proposalController;
    }
}
