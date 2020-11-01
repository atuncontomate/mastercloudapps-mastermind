package mastermind.distributed.dispatchers.action;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.ProposalController;
import mastermind.distributed.dispatchers.Dispatcher;

public class BreakerWinnerDispatcher extends Dispatcher {

    public BreakerWinnerDispatcher(AcceptorController acceptorController) {
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        tcpip.send(((ProposalController)this.acceptorController).isBreakerWinner());
    }
}
