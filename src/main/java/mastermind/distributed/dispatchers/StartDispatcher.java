package mastermind.distributed.dispatchers;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.StartController;

public class StartDispatcher extends Dispatcher {
    public StartDispatcher(AcceptorController acceptorController) {
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        ((StartController) this.acceptorController).start();
    }
}
