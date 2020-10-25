package mastermind.views.console;

import mastermind.controllers.ProposalController;
import mastermind.models.ProposedCombination;
import utils.WithConsoleView;

public class ProposalView extends WithConsoleView {

    public void interact(ProposalController proposalController) {
        new ProposalMenu(proposalController).execute();
    }
}
