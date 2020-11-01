package mastermind.distributed.dispatchers.action;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.ProposalController;
import mastermind.distributed.dispatchers.Dispatcher;
import mastermind.models.ProposedCombination;

public class AddDispatcher extends Dispatcher {

    public AddDispatcher(AcceptorController acceptorController) {
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        ProposedCombination proposedCombination = new ProposedCombination();
        for(int i=0; i<ProposedCombination.COMBINATION_LENGTH; i++){
            proposedCombination.add(this.tcpip.receiveColor());
        }
        ((ProposalController)this.acceptorController).add(proposedCombination);
    }
}
