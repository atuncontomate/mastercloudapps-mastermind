package mastermind.views.graphics;

import mastermind.controllers.ProposalController;
import mastermind.models.ProposalMenu;
import mastermind.views.console.BoardView;

public class ProposalView {

    public void interact(ProposalController proposalController) {
        new BoardView().write(proposalController);
        new ProposalMenu(proposalController).execute();
    }
}
