package mastermind.views.console;

import mastermind.controllers.ProposalController;

public class ProposalCommand extends Command{

    public ProposalCommand(ProposalController proposalController){
        super("", proposalController); //TODO: Título
    }

    @Override
    protected void execute() {
        ProposedCombination proposedCombination = new ProposedCombination();
        new ProposedCombinationView(proposedCombination).read();
        this.proposalController.add(proposedCombination);
        new BoardView().write(proposalController);
        boolean isEndedGame = proposalController.isEndedGame();

        if(isEndedGame){
            this.boardView.writeWinner(proposalController);
        }
    }

    @Override
    protected boolean isActive() {
        return true;
    }
}
