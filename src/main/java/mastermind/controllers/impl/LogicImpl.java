package mastermind.controllers.impl;

import mastermind.controllers.*;
import mastermind.models.Session;
import mastermind.models.StateValue;
import mastermind.models.impl.SessionImpl;

public class LogicImpl extends Logic {

    public LogicImpl() {
        this.session = new SessionImpl();
        this.controllers.put(StateValue.START, new StartControllerImpl(this.session));
        this.controllers.put(StateValue.PROPOSE, new ProposalControllerImpl(this.session));
        this.controllers.put(StateValue.RESUME, new ResumeControllerImpl(this.session));
        this.controllers.put(StateValue.EXIT, null);
    }
}
