package mastermind.distributed.dispatchers.redo;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.ProposalController;
import mastermind.distributed.dispatchers.Dispatcher;

public class RedoDispatcher extends Dispatcher {

    public RedoDispatcher(AcceptorController acceptorController) {
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        ((ProposalController)this.acceptorController).redo();
    }
}
