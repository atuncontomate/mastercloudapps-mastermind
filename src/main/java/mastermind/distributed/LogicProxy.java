package mastermind.distributed;

import mastermind.controllers.Logic;
import mastermind.distributed.dispatchers.ProposalControllerProxy;
import mastermind.distributed.dispatchers.TCPIP;
import mastermind.types.StateValue;

public class LogicProxy extends Logic {

    private TCPIP tcpip;

    public LogicProxy() {
        this.tcpip = TCPIP.createClientSocket();
        this.session = new SessionProxy(this.tcpip);
        this.controllers.put(StateValue.START, new StartControllerProxy(this.session,this.tcpip));
        this.controllers.put(StateValue.PROPOSE, new ProposalControllerProxy(this.session,this.tcpip));
        this.controllers.put(StateValue.RESUME, new ResumeControllerProxy(this.session,this.tcpip));
        this.controllers.put(StateValue.EXIT, null);
    }

    public void close() {
        this.tcpip.close();
    }
}
