package mastermind.views.console;

import mastermind.controller.ProposalController;
import mastermind.models.ProposedCombination;
import utils.WithConsoleView;

public class ProposalView extends WithConsoleView {

    private ProposalController proposalController;

    private BoardView boardView;

    public ProposalView(ProposalController proposalController) {
        this.proposalController = proposalController;
        this.boardView = new BoardView(proposalController);
    }

    public boolean interact() {
        ProposedCombination proposedCombination = new ProposedCombination();
        new ProposedCombinationView(proposedCombination).read();
        this.proposalController.add(proposedCombination);
        this.boardView.write();
        boolean isEndedGame = this.proposalController.isEndedGame();

        if(isEndedGame){
            this.boardView.writeWinner();
        }
        return isEndedGame;
    }
}
