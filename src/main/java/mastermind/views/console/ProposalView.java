package mastermind.views.console;

import mastermind.controller.ProposalController;
import mastermind.models.ProposedCombination;
import utils.WithConsoleView;

public class ProposalView extends WithConsoleView {

    private BoardView boardView;

    public ProposalView() {
        this.boardView = new BoardView();
    }

    public boolean interact(ProposalController proposalController) {
        ProposedCombination proposedCombination = new ProposedCombination();
        new ProposedCombinationView(proposedCombination).read();
        proposalController.add(proposedCombination);
        this.boardView.write(proposalController);
        boolean isEndedGame = proposalController.isEndedGame();

        if(isEndedGame){
            this.boardView.writeWinner(proposalController);
        }
        return isEndedGame;
    }
}
