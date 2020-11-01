package mastermind.distributed.dispatchers.action;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.Controller;
import mastermind.distributed.dispatchers.Dispatcher;

public class StateDispatcher extends Dispatcher {

    public StateDispatcher(AcceptorController acceptorController) {
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        this.tcpip.send(
                ((Controller)this.acceptorController).getValueState().ordinal()
        );
    }
}
