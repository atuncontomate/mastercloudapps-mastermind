package mastermind.models;

import mastermind.controllers.ProposalController;
import mastermind.views.console.ProposalCommand;
import mastermind.views.console.RedoCommand;
import mastermind.views.console.UndoCommand;
import utils.Menu;

public class ProposalMenu extends Menu {

    public ProposalMenu(ProposalController proposalController) {
        this.addCommand(new ProposalCommand(proposalController));
        this.addCommand(new UndoCommand(proposalController));
        this.addCommand(new RedoCommand(proposalController));
    }

}
