package mastermind.distributed.dispatchers.action;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.ProposalController;
import mastermind.distributed.dispatchers.Dispatcher;
import mastermind.models.Color;
import mastermind.models.ProposedCombination;

public class AttemptProposedCombinationDispatcher extends Dispatcher {

    public AttemptProposedCombinationDispatcher(AcceptorController acceptorController) {
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        int attempt = this.tcpip.receiveInt();
        ProposedCombination proposedCombination = ((ProposalController)this.acceptorController).getAttemptProposedCombination(attempt);
        for(Color color : proposedCombination.getColors()){
            this.tcpip.send(color);
        }
    }
}
