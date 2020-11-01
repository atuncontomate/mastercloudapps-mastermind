package mastermind.distributed.dispatchers.action;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.ProposalController;
import mastermind.distributed.dispatchers.Dispatcher;

public class EndedGameDispatcher extends Dispatcher {

    public EndedGameDispatcher(AcceptorController acceptorController) {
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        tcpip.send(((ProposalController)this.acceptorController).isEndedGame());
    }
}
