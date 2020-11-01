package mastermind.distributed.dispatchers.undo;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.ProposalController;
import mastermind.distributed.dispatchers.Dispatcher;

public class UndoDispatcher extends Dispatcher {

    public UndoDispatcher(AcceptorController acceptorController) {
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        ((ProposalController)this.acceptorController).redo();
    }
}
