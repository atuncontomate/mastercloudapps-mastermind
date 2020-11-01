package mastermind.distributed.dispatchers.action;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.ProposalController;
import mastermind.distributed.dispatchers.Dispatcher;

public class AttemptsDispatcher extends Dispatcher {

    public AttemptsDispatcher(AcceptorController acceptorController) {
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        tcpip.send(((ProposalController)this.acceptorController).getAttempts());
    }
}
