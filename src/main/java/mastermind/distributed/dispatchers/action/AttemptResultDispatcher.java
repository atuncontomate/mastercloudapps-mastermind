package mastermind.distributed.dispatchers.action;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.ProposalController;
import mastermind.distributed.dispatchers.Dispatcher;
import mastermind.models.Result;

public class AttemptResultDispatcher extends Dispatcher {

    public AttemptResultDispatcher(AcceptorController acceptorController) {
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        Result result = ((ProposalController)this.acceptorController).getAttemptResult(tcpip.receiveInt());
        this.tcpip.send(result.getBlacks());
        this.tcpip.send(result.getWhites());
    }
}
