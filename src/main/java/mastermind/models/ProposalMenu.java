package mastermind.models;

public class ProposalMenu extends Menu{

    ProposalMenu(ProposalController proposalController) {
        this.addCommand(new ProposalCommand(proposalController));
        this.addCommand(new UndoCommand(proposalController));
        this.addCommand(new RedoCommand(proposalController));
    }

}
