package mastermind.views.console;

import mastermind.controllers.ProposalController;
import mastermind.models.ProposedCombination;

import static mastermind.views.Message.ACTION_COMMAND;
import static mastermind.views.Message.PROPOSE_COMBINATION;

public class ProposalCommand extends Command{

    public ProposalCommand(ProposalController proposalController){
        super(ACTION_COMMAND.getContent(), proposalController);
    }

    @Override
    protected void execute() {
        ProposedCombination proposedCombination = new ProposedCombination();
        new ProposedCombinationView(proposedCombination).read();
        this.proposalController.add(proposedCombination);

        if(proposalController.isEndedGame()){
            new BoardView().writeWinner(proposalController);
        }
    }

    @Override
    protected boolean isActive() {
        return true;
    }
}
