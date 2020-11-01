package mastermind.distributed.dispatchers;

import mastermind.controllers.AcceptorController;
import mastermind.controllers.ResumeController;

public class ResumeDispatcher extends Dispatcher {

    public ResumeDispatcher(AcceptorController acceptorController) {
        super(acceptorController);
    }

    @Override
    public void dispatch() {
        ((ResumeController)this.acceptorController).resume(this.tcpip.receiveBoolean());
    }
}
