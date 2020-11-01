package mastermind.distributed.dispatchers.undo;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.ProposalController;
import mastermind.distributed.dispatchers.Dispatcher;

public class UndoableDispatcher extends Dispatcher {

    public UndoableDispatcher(AcceptorController acceptorController) {
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(((ProposalController)this.acceptorController).undoable());
    }
}
