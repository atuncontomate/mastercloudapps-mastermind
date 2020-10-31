package mastermind.views.console;

import mastermind.controllers.ProposalController;
import mastermind.models.ProposalMenu;

public class ProposalView {

    public void interact(ProposalController proposalController) {
        new ProposalMenu(proposalController).execute();
    }
}
