package mastermind.distributed.dispatchers.redo;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.ProposalController;
import mastermind.distributed.dispatchers.Dispatcher;

public class RedoableDispatcher extends Dispatcher {

    public RedoableDispatcher(AcceptorController acceptorController) {
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(((ProposalController)this.acceptorController).redoable());
    }
}
